-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema sisagenda
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema sisagenda
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `sisagenda` DEFAULT CHARACTER SET latin1 ;
USE `sisagenda` ;

-- -----------------------------------------------------
-- Table `sisagenda`.`tbl_aluno`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `sisagenda`.`tbl_aluno` (
  `codigo` INT(11) NOT NULL AUTO_INCREMENT,
  `nome_aluno` VARCHAR(100) CHARACTER SET 'latin1' NOT NULL,
  `cpf_aluno` VARCHAR(11) CHARACTER SET 'latin1' NOT NULL,
  `tel_aluno` VARCHAR(15) CHARACTER SET 'latin1' NULL DEFAULT NULL,
  `email_aluno` VARCHAR(50) CHARACTER SET 'latin1' NULL DEFAULT NULL,
  PRIMARY KEY (`codigo`))
ENGINE = InnoDB
AUTO_INCREMENT = 759
DEFAULT CHARACTER SET = latin1
COLLATE = latin1_general_ci;


-- -----------------------------------------------------
-- Table `sisagenda`.`tbl_disponibilidade`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `sisagenda`.`tbl_disponibilidade` (
  `codigo` INT(11) NOT NULL AUTO_INCREMENT,
  `dia` DATE NOT NULL,
  `hora` VARCHAR(15) NOT NULL,
  `status` TINYINT(1) NOT NULL,
  PRIMARY KEY (`codigo`))
ENGINE = InnoDB
AUTO_INCREMENT = 169
DEFAULT CHARACTER SET = latin1
COLLATE = latin1_general_ci;


-- -----------------------------------------------------
-- Table `sisagenda`.`tbl_cat_servico`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `sisagenda`.`tbl_cat_servico` (
  `codigo` INT(11) NOT NULL AUTO_INCREMENT,
  `nome_cat` VARCHAR(45) CHARACTER SET 'latin1' NULL DEFAULT NULL,
  PRIMARY KEY (`codigo`))
ENGINE = InnoDB
AUTO_INCREMENT = 6
DEFAULT CHARACTER SET = latin1
COLLATE = latin1_general_ci;


-- -----------------------------------------------------
-- Table `sisagenda`.`tbl_guiche`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `sisagenda`.`tbl_guiche` (
  `codigo` INT(11) NOT NULL AUTO_INCREMENT,
  `numero` INT(11) NULL DEFAULT NULL,
  `cod_catservico` INT(11) NOT NULL,
  PRIMARY KEY (`codigo`),
  INDEX `fk_tbl_guiche_tbl_cat_servico1_idx` (`cod_catservico` ASC),
  CONSTRAINT `fk_tbl_guiche_tbl_cat_servico1`
    FOREIGN KEY (`cod_catservico`)
    REFERENCES `sisagenda`.`tbl_cat_servico` (`codigo`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1
COLLATE = latin1_general_ci;


-- -----------------------------------------------------
-- Table `sisagenda`.`tbl_usuario`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `sisagenda`.`tbl_usuario` (
  `codigo` INT(11) NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(90) CHARACTER SET 'latin1' NOT NULL,
  `cpf` VARCHAR(11) NOT NULL,
  `data_nascimento` DATE NOT NULL,
  `cod_guiche` INT(11) NOT NULL,
  PRIMARY KEY (`codigo`),
  INDEX `fk_tbl_atendente_tbl_guiche1_idx` (`cod_guiche` ASC),
  CONSTRAINT `fk_tbl_atendente_tbl_guiche1`
    FOREIGN KEY (`cod_guiche`)
    REFERENCES `sisagenda`.`tbl_guiche` (`codigo`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1
COLLATE = latin1_general_ci;


-- -----------------------------------------------------
-- Table `sisagenda`.`tbl_servico`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `sisagenda`.`tbl_servico` (
  `codigo` INT(11) NOT NULL AUTO_INCREMENT,
  `tipo_cat` INT(11) NOT NULL,
  `nome_servico` VARCHAR(120) CHARACTER SET 'latin1' NOT NULL,
  PRIMARY KEY (`codigo`),
  INDEX `fk_tbl_servico_tbl_cat_servico1_idx` (`tipo_cat` ASC),
  CONSTRAINT `fk_tbl_servico_tbl_cat_servico1`
    FOREIGN KEY (`tipo_cat`)
    REFERENCES `sisagenda`.`tbl_cat_servico` (`codigo`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
AUTO_INCREMENT = 17
DEFAULT CHARACTER SET = latin1
COLLATE = latin1_general_ci;


-- -----------------------------------------------------
-- Table `sisagenda`.`tbl_agendamento`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `sisagenda`.`tbl_agendamento` (
  `codigo` INT(11) NOT NULL AUTO_INCREMENT,
  `cod_aluno` INT(11) NULL DEFAULT NULL,
  `cod_dia` INT(11) NULL DEFAULT NULL,
  `cod_atendente` INT(11) NULL DEFAULT NULL,
  `cod_servico` INT(11) NOT NULL,
  `cod_guiche` INT(11) NULL DEFAULT NULL,
  PRIMARY KEY (`codigo`),
  INDEX `fk_aluno_idx` (`cod_aluno` ASC),
  INDEX `fk_dia_marcado_idx` (`cod_dia` ASC),
  INDEX `fk_dia_marcado_aluno_tbl_atendente1_idx` (`cod_atendente` ASC),
  INDEX `fk_dia_marcado_aluno_tbl_servico1_idx` (`cod_servico` ASC),
  INDEX `fk_tbl_agenda_tbl_guiche1_idx` (`cod_guiche` ASC),
  CONSTRAINT `fk_aluno`
    FOREIGN KEY (`cod_aluno`)
    REFERENCES `sisagenda`.`tbl_aluno` (`codigo`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_dia_marcado`
    FOREIGN KEY (`cod_dia`)
    REFERENCES `sisagenda`.`tbl_disponibilidade` (`codigo`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_dia_marcado_aluno_tbl_atendente1`
    FOREIGN KEY (`cod_atendente`)
    REFERENCES `sisagenda`.`tbl_usuario` (`codigo`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_dia_marcado_aluno_tbl_servico1`
    FOREIGN KEY (`cod_servico`)
    REFERENCES `sisagenda`.`tbl_servico` (`codigo`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_tbl_agenda_tbl_guiche1`
    FOREIGN KEY (`cod_guiche`)
    REFERENCES `sisagenda`.`tbl_guiche` (`codigo`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
AUTO_INCREMENT = 39
DEFAULT CHARACTER SET = latin1
COLLATE = latin1_general_ci;


-- -----------------------------------------------------
-- Table `sisagenda`.`tbl_feedback`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `sisagenda`.`tbl_feedback` (
  `codigo` INT(11) NOT NULL AUTO_INCREMENT,
  `cod_agendamento` INT(11) NULL DEFAULT NULL,
  `opiniao` VARCHAR(125) CHARACTER SET 'latin1' NULL DEFAULT NULL,
  `nota` INT(11) NULL DEFAULT NULL,
  `origem` ENUM('user', 'aluno') NULL DEFAULT 'user',
  PRIMARY KEY (`codigo`),
  INDEX `fk_feedback_idx` (`cod_agendamento` ASC),
  CONSTRAINT `fk_feedback`
    FOREIGN KEY (`cod_agendamento`)
    REFERENCES `sisagenda`.`tbl_agendamento` (`codigo`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1
COLLATE = latin1_general_ci;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
