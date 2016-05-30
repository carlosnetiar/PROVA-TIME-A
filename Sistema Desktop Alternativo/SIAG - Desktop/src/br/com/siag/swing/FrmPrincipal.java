/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.siag.swing;

import br.com.siag.beans.AlunoBean;
import br.com.siag.beans.DisponibilidadeBean;
import br.com.siag.dao.AlunoDAO;
import br.com.siag.dao.DisponibilidadeDAO;
import br.com.siag.dao.FeedbackDAO;
import br.com.siag.dao.UsuarioDAO;
import br.com.siag.tablemodel.AgendamentosTM;
import br.com.siag.util.DAOFactory;
import br.com.siag.util.Horarios;
import br.com.siag.util.ValidarCPF;
import java.awt.CardLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import java.sql.Connection;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author marcus
 */
public class FrmPrincipal extends javax.swing.JFrame {

    private Connection conexao;

    /**
     * Creates new form FrmPrincipal
     */
    public FrmPrincipal() {
        initComponents();

        //SETAR O ÍCONE NO FORMULARIO
        URL url = this.getClass().getResource("ICO.png");
        Image iconeTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(iconeTitulo);

        //INCLUIR OS HORÁRIOS ESTÁTICOS DENTRO DO COMBOBOX DE HORÁRIO
        this.JCBX_HORARIO.addItem(Horarios.hora01);
        this.JCBX_HORARIO.addItem(Horarios.hora02);
        this.JCBX_HORARIO.addItem(Horarios.hora03);
        this.JCBX_HORARIO.addItem(Horarios.hora04);
        this.JCBX_HORARIO.addItem(Horarios.hora05);
        this.JCBX_HORARIO.addItem(Horarios.hora06);
        this.JCBX_HORARIO.addItem(Horarios.hora07);
        this.JCBX_HORARIO.addItem(Horarios.hora08);
        JL_ID_USER.setVisible(false);
        /**
         * TRECHO QUE ADICIONARÁ TODOS OS GUICHÊS DIRETO DO BANCO DE DADOS
         */
        try {
            UsuarioDAO usuarioDAO = DAOFactory.criarUsuarioDAO(conexao);
            for (int i = 0; i < usuarioDAO.carregarGuiches().size(); i++) {
                this.JCBX_GUICHE.addItem(String.valueOf(usuarioDAO.carregarGuiches().get(i).getNum_guiche()));
            }
        } catch (ClassNotFoundException ex) {
            //TRATAMENTO DE EXCESSÃO
            Logger.getLogger(FrmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPN_PRINCIPAL = new javax.swing.JPanel();
        JPN_INFORMATIONS = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        JL_NOME_USER = new javax.swing.JLabel();
        JL_HORA_SISTEMA = new javax.swing.JLabel();
        JL_ID_USER = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        JL_CATEGORIA_RESPONSAVEL = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        JL_GUICHE_ATUAL = new javax.swing.JLabel();
        JPN_CONTAINER = new javax.swing.JPanel();
        JPN_FIRST = new javax.swing.JPanel();
        JPN_LISTAR_HORARIO = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JT_ATENDIMENTOS = new javax.swing.JTable();
        JB_INICIAR_ATENDIMENTO = new javax.swing.JButton();
        JPN_ADICIONAR_ALUNO = new javax.swing.JPanel();
        JPN_DADOS_PESSOAIS = new javax.swing.JPanel();
        JL_NOME = new javax.swing.JLabel();
        JTF_NOME_ALUNO = new javax.swing.JTextField();
        JL_CPF = new javax.swing.JLabel();
        JTF_CPF_ALUNO = new javax.swing.JFormattedTextField();
        JL_EMAIL = new javax.swing.JLabel();
        JTF_EMAIL = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        JTF_TELEFONE = new javax.swing.JFormattedTextField();
        jButton1 = new javax.swing.JButton();
        JPN_ADICIONAR_HORARIO = new javax.swing.JPanel();
        JCBX_HORARIO = new javax.swing.JComboBox<>();
        JL_HORARIOS_DISPONIVEIS = new javax.swing.JLabel();
        JL_DATA = new javax.swing.JLabel();
        JL_GUICHE = new javax.swing.JLabel();
        JCBX_GUICHE = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        JDC_DISP = new com.toedter.calendar.JDateChooser();
        JPN_ALTERAR_ALUNO = new javax.swing.JPanel();
        JPN_PESQUISAR_CPF_ALUNO = new javax.swing.JPanel();
        JTF_PESQUISAR_ALUNO_CPF = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        JPN_CONTAINER_ALTERAR_DADOS = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        JTF_NOME_ALTERAR = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        JTF_CPF_ALTERAR = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        JTF_EMAIL_ALTERAR = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        JTF_TELEFONE_ALTERAR = new javax.swing.JTextField();
        BTN_ALTERAR = new javax.swing.JButton();
        BTN_DELETAR = new javax.swing.JButton();
        ID_ALUNO = new javax.swing.JLabel();
        JMNB = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SIAG - ATENDENTE");
        setResizable(false);

        JPN_PRINCIPAL.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        JPN_INFORMATIONS.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/siag/imagens/siag01.png"))); // NOI18N

        jLabel8.setText("Nome do Usuario:");

        jLabel10.setText("Categoria Responsável:");

        jLabel12.setText("Guichê Atual:");

        javax.swing.GroupLayout JPN_INFORMATIONSLayout = new javax.swing.GroupLayout(JPN_INFORMATIONS);
        JPN_INFORMATIONS.setLayout(JPN_INFORMATIONSLayout);
        JPN_INFORMATIONSLayout.setHorizontalGroup(
            JPN_INFORMATIONSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPN_INFORMATIONSLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPN_INFORMATIONSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(JPN_INFORMATIONSLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JL_NOME_USER, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JL_ID_USER, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPN_INFORMATIONSLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(JL_HORA_SISTEMA, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(JPN_INFORMATIONSLayout.createSequentialGroup()
                        .addGroup(JPN_INFORMATIONSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(JPN_INFORMATIONSLayout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JL_GUICHE_ATUAL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JL_CATEGORIA_RESPONSAVEL, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        JPN_INFORMATIONSLayout.setVerticalGroup(
            JPN_INFORMATIONSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPN_INFORMATIONSLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(JPN_INFORMATIONSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPN_INFORMATIONSLayout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addGroup(JPN_INFORMATIONSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(JL_NOME_USER, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPN_INFORMATIONSLayout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(JL_ID_USER, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JPN_INFORMATIONSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(JL_CATEGORIA_RESPONSAVEL, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JPN_INFORMATIONSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(JL_GUICHE_ATUAL, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JL_HORA_SISTEMA, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        JPN_CONTAINER.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        JPN_CONTAINER.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout JPN_FIRSTLayout = new javax.swing.GroupLayout(JPN_FIRST);
        JPN_FIRST.setLayout(JPN_FIRSTLayout);
        JPN_FIRSTLayout.setHorizontalGroup(
            JPN_FIRSTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 518, Short.MAX_VALUE)
        );
        JPN_FIRSTLayout.setVerticalGroup(
            JPN_FIRSTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 538, Short.MAX_VALUE)
        );

        JPN_CONTAINER.add(JPN_FIRST, "card6");

        jLabel9.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("ATENDIMENTOS PARA HOJE");

        JT_ATENDIMENTOS.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(JT_ATENDIMENTOS);

        JB_INICIAR_ATENDIMENTO.setText("Chamar");
        JB_INICIAR_ATENDIMENTO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_INICIAR_ATENDIMENTOActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JPN_LISTAR_HORARIOLayout = new javax.swing.GroupLayout(JPN_LISTAR_HORARIO);
        JPN_LISTAR_HORARIO.setLayout(JPN_LISTAR_HORARIOLayout);
        JPN_LISTAR_HORARIOLayout.setHorizontalGroup(
            JPN_LISTAR_HORARIOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPN_LISTAR_HORARIOLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPN_LISTAR_HORARIOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 494, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPN_LISTAR_HORARIOLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(JB_INICIAR_ATENDIMENTO, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        JPN_LISTAR_HORARIOLayout.setVerticalGroup(
            JPN_LISTAR_HORARIOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPN_LISTAR_HORARIOLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JB_INICIAR_ATENDIMENTO)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        JPN_CONTAINER.add(JPN_LISTAR_HORARIO, "JC_LISTAR_HORARIO");

        JPN_DADOS_PESSOAIS.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados do aluno"));

        JL_NOME.setText("Nome:");

        JL_CPF.setText("CPF:");

        try {
            JTF_CPF_ALUNO.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        JL_EMAIL.setText("E-Mail:");

        jLabel1.setText("Tel:");

        try {
            JTF_TELEFONE.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jButton1.setText("Salvar Registro");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JPN_DADOS_PESSOAISLayout = new javax.swing.GroupLayout(JPN_DADOS_PESSOAIS);
        JPN_DADOS_PESSOAIS.setLayout(JPN_DADOS_PESSOAISLayout);
        JPN_DADOS_PESSOAISLayout.setHorizontalGroup(
            JPN_DADOS_PESSOAISLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPN_DADOS_PESSOAISLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPN_DADOS_PESSOAISLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPN_DADOS_PESSOAISLayout.createSequentialGroup()
                        .addGroup(JPN_DADOS_PESSOAISLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JL_NOME)
                            .addComponent(JL_CPF))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(JPN_DADOS_PESSOAISLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JTF_NOME_ALUNO)
                            .addComponent(JTF_CPF_ALUNO)))
                    .addGroup(JPN_DADOS_PESSOAISLayout.createSequentialGroup()
                        .addGroup(JPN_DADOS_PESSOAISLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JL_EMAIL)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(JPN_DADOS_PESSOAISLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JTF_EMAIL)
                            .addComponent(JTF_TELEFONE, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPN_DADOS_PESSOAISLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        JPN_DADOS_PESSOAISLayout.setVerticalGroup(
            JPN_DADOS_PESSOAISLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPN_DADOS_PESSOAISLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPN_DADOS_PESSOAISLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JL_NOME)
                    .addComponent(JTF_NOME_ALUNO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(JPN_DADOS_PESSOAISLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTF_CPF_ALUNO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JL_CPF))
                .addGap(18, 18, 18)
                .addGroup(JPN_DADOS_PESSOAISLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JL_EMAIL)
                    .addComponent(JTF_EMAIL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(JPN_DADOS_PESSOAISLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(JTF_TELEFONE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(272, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout JPN_ADICIONAR_ALUNOLayout = new javax.swing.GroupLayout(JPN_ADICIONAR_ALUNO);
        JPN_ADICIONAR_ALUNO.setLayout(JPN_ADICIONAR_ALUNOLayout);
        JPN_ADICIONAR_ALUNOLayout.setHorizontalGroup(
            JPN_ADICIONAR_ALUNOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPN_ADICIONAR_ALUNOLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JPN_DADOS_PESSOAIS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        JPN_ADICIONAR_ALUNOLayout.setVerticalGroup(
            JPN_ADICIONAR_ALUNOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPN_ADICIONAR_ALUNOLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JPN_DADOS_PESSOAIS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        JPN_CONTAINER.add(JPN_ADICIONAR_ALUNO, "CARD_ADD_ALUNO");

        JCBX_HORARIO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCBX_HORARIOActionPerformed(evt);
            }
        });

        JL_HORARIOS_DISPONIVEIS.setText("Horários Disponíveis:");

        JL_DATA.setText("Data:");

        JL_GUICHE.setText("Guichê:");

        jButton2.setText("Salvar Horário");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JPN_ADICIONAR_HORARIOLayout = new javax.swing.GroupLayout(JPN_ADICIONAR_HORARIO);
        JPN_ADICIONAR_HORARIO.setLayout(JPN_ADICIONAR_HORARIOLayout);
        JPN_ADICIONAR_HORARIOLayout.setHorizontalGroup(
            JPN_ADICIONAR_HORARIOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPN_ADICIONAR_HORARIOLayout.createSequentialGroup()
                .addContainerGap(93, Short.MAX_VALUE)
                .addGroup(JPN_ADICIONAR_HORARIOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(JPN_ADICIONAR_HORARIOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(JPN_ADICIONAR_HORARIOLayout.createSequentialGroup()
                            .addGroup(JPN_ADICIONAR_HORARIOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(JL_HORARIOS_DISPONIVEIS)
                                .addComponent(JCBX_HORARIO, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(57, 57, 57)
                            .addGroup(JPN_ADICIONAR_HORARIOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(JL_GUICHE)
                                .addComponent(JCBX_GUICHE, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(JPN_ADICIONAR_HORARIOLayout.createSequentialGroup()
                            .addComponent(JL_DATA)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(JDC_DISP, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(85, 85, 85))
        );
        JPN_ADICIONAR_HORARIOLayout.setVerticalGroup(
            JPN_ADICIONAR_HORARIOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPN_ADICIONAR_HORARIOLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPN_ADICIONAR_HORARIOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JL_HORARIOS_DISPONIVEIS)
                    .addComponent(JL_GUICHE))
                .addGap(9, 9, 9)
                .addGroup(JPN_ADICIONAR_HORARIOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JCBX_HORARIO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JCBX_GUICHE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(JPN_ADICIONAR_HORARIOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(JL_DATA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JDC_DISP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addContainerGap(377, Short.MAX_VALUE))
        );

        JPN_CONTAINER.add(JPN_ADICIONAR_HORARIO, "JC_ADD_HORARIO");

        JPN_PESQUISAR_CPF_ALUNO.setBorder(javax.swing.BorderFactory.createTitledBorder("Pesquisar"));

        try {
            JTF_PESQUISAR_ALUNO_CPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel3.setText("CPF:");

        jButton3.setText("Pesquisar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JPN_PESQUISAR_CPF_ALUNOLayout = new javax.swing.GroupLayout(JPN_PESQUISAR_CPF_ALUNO);
        JPN_PESQUISAR_CPF_ALUNO.setLayout(JPN_PESQUISAR_CPF_ALUNOLayout);
        JPN_PESQUISAR_CPF_ALUNOLayout.setHorizontalGroup(
            JPN_PESQUISAR_CPF_ALUNOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPN_PESQUISAR_CPF_ALUNOLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JTF_PESQUISAR_ALUNO_CPF, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        JPN_PESQUISAR_CPF_ALUNOLayout.setVerticalGroup(
            JPN_PESQUISAR_CPF_ALUNOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPN_PESQUISAR_CPF_ALUNOLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPN_PESQUISAR_CPF_ALUNOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPN_PESQUISAR_CPF_ALUNOLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(JTF_PESQUISAR_ALUNO_CPF))
                    .addGroup(JPN_PESQUISAR_CPF_ALUNOLayout.createSequentialGroup()
                        .addGroup(JPN_PESQUISAR_CPF_ALUNOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jButton3))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        JPN_CONTAINER_ALTERAR_DADOS.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados do Aluno"));

        jLabel4.setText("Nome:");

        JTF_NOME_ALTERAR.setEnabled(false);

        jLabel5.setText("CPF:");

        JTF_CPF_ALTERAR.setEnabled(false);

        jLabel6.setText("E-mail:");

        JTF_EMAIL_ALTERAR.setEnabled(false);

        jLabel7.setText("Tel:");

        JTF_TELEFONE_ALTERAR.setEnabled(false);

        BTN_ALTERAR.setText("Alterar Dados");
        BTN_ALTERAR.setEnabled(false);
        BTN_ALTERAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_ALTERARActionPerformed(evt);
            }
        });

        BTN_DELETAR.setText("Deletar Registro");
        BTN_DELETAR.setEnabled(false);
        BTN_DELETAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_DELETARActionPerformed(evt);
            }
        });

        ID_ALUNO.setText(".");

        javax.swing.GroupLayout JPN_CONTAINER_ALTERAR_DADOSLayout = new javax.swing.GroupLayout(JPN_CONTAINER_ALTERAR_DADOS);
        JPN_CONTAINER_ALTERAR_DADOS.setLayout(JPN_CONTAINER_ALTERAR_DADOSLayout);
        JPN_CONTAINER_ALTERAR_DADOSLayout.setHorizontalGroup(
            JPN_CONTAINER_ALTERAR_DADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPN_CONTAINER_ALTERAR_DADOSLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPN_CONTAINER_ALTERAR_DADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPN_CONTAINER_ALTERAR_DADOSLayout.createSequentialGroup()
                        .addGroup(JPN_CONTAINER_ALTERAR_DADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JPN_CONTAINER_ALTERAR_DADOSLayout.createSequentialGroup()
                                .addGroup(JPN_CONTAINER_ALTERAR_DADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(JPN_CONTAINER_ALTERAR_DADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(JTF_CPF_ALTERAR, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
                                    .addComponent(JTF_EMAIL_ALTERAR)
                                    .addComponent(JTF_TELEFONE_ALTERAR)))
                            .addGroup(JPN_CONTAINER_ALTERAR_DADOSLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JTF_NOME_ALTERAR, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                        .addComponent(ID_ALUNO, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(JPN_CONTAINER_ALTERAR_DADOSLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(BTN_ALTERAR)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BTN_DELETAR)))
                .addContainerGap())
        );
        JPN_CONTAINER_ALTERAR_DADOSLayout.setVerticalGroup(
            JPN_CONTAINER_ALTERAR_DADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPN_CONTAINER_ALTERAR_DADOSLayout.createSequentialGroup()
                .addGroup(JPN_CONTAINER_ALTERAR_DADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPN_CONTAINER_ALTERAR_DADOSLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(JPN_CONTAINER_ALTERAR_DADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(JTF_NOME_ALTERAR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(ID_ALUNO, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(JPN_CONTAINER_ALTERAR_DADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(JTF_CPF_ALTERAR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(JPN_CONTAINER_ALTERAR_DADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(JTF_EMAIL_ALTERAR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(JPN_CONTAINER_ALTERAR_DADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(JTF_TELEFONE_ALTERAR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(JPN_CONTAINER_ALTERAR_DADOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTN_ALTERAR)
                    .addComponent(BTN_DELETAR))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout JPN_ALTERAR_ALUNOLayout = new javax.swing.GroupLayout(JPN_ALTERAR_ALUNO);
        JPN_ALTERAR_ALUNO.setLayout(JPN_ALTERAR_ALUNOLayout);
        JPN_ALTERAR_ALUNOLayout.setHorizontalGroup(
            JPN_ALTERAR_ALUNOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPN_ALTERAR_ALUNOLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPN_ALTERAR_ALUNOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JPN_PESQUISAR_CPF_ALUNO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JPN_CONTAINER_ALTERAR_DADOS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        JPN_ALTERAR_ALUNOLayout.setVerticalGroup(
            JPN_ALTERAR_ALUNOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPN_ALTERAR_ALUNOLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JPN_PESQUISAR_CPF_ALUNO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JPN_CONTAINER_ALTERAR_DADOS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(206, 206, 206))
        );

        JPN_CONTAINER.add(JPN_ALTERAR_ALUNO, "JC_ALTERAR_DADOS");

        javax.swing.GroupLayout JPN_PRINCIPALLayout = new javax.swing.GroupLayout(JPN_PRINCIPAL);
        JPN_PRINCIPAL.setLayout(JPN_PRINCIPALLayout);
        JPN_PRINCIPALLayout.setHorizontalGroup(
            JPN_PRINCIPALLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPN_PRINCIPALLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JPN_CONTAINER, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JPN_INFORMATIONS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        JPN_PRINCIPALLayout.setVerticalGroup(
            JPN_PRINCIPALLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPN_PRINCIPALLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPN_PRINCIPALLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JPN_INFORMATIONS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JPN_CONTAINER, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jMenu1.setText("Novo");

        jMenu3.setText("Pessoa Física");

        jMenuItem3.setText("Aluno");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem3);

        jMenu1.add(jMenu3);

        jMenuItem2.setText("Horário");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        JMNB.add(jMenu1);

        jMenu6.setText("Editar");

        jMenu7.setText("Pessoa Física");

        jMenuItem1.setText("Editar dados do aluno");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem1);

        jMenu6.add(jMenu7);

        JMNB.add(jMenu6);

        jMenu2.setText("Atendimento");

        jMenu4.setText("Meus Atendimentos");

        jMenuItem4.setText("Listar");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem4);

        jMenu2.add(jMenu4);

        JMNB.add(jMenu2);

        jMenu5.setText("Sair");
        jMenu5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu5MouseClicked(evt);
            }
        });
        jMenu5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu5ActionPerformed(evt);
            }
        });
        JMNB.add(jMenu5);

        setJMenuBar(JMNB);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JPN_PRINCIPAL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JPN_PRINCIPAL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        //CHAMAR LAYOUT DE CADASTRO DE ALUNO
        CardLayout cl = (CardLayout) (JPN_CONTAINER.getLayout());
        cl.show(JPN_CONTAINER, "CARD_ADD_ALUNO");
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        //CHAMAR LAYOUT DE CADASTRO DE HORÁRIO
        CardLayout cl = (CardLayout) (JPN_CONTAINER.getLayout());
        cl.show(JPN_CONTAINER, "JC_ADD_HORARIO");
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void JCBX_HORARIOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCBX_HORARIOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JCBX_HORARIOActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        /**
         * EVENTO RESPONSÁVEL POR INSERIR DIA DISPONÍVEL
         */
        try {
            //INSTACIAÇÃO DOS DAOS E BEANS QUE O MÉTODO UTILIZA
            DisponibilidadeDAO disponibilidadeDAO = DAOFactory.criarDisponibilidadeDAO(conexao);
            DisponibilidadeBean disponibilidadeBean = new DisponibilidadeBean();

            //FORMATAÇÃO DA DATA DE dd/MM/yyyy PARA yyyy-MM-dd
            SimpleDateFormat dateF = new SimpleDateFormat("yyyy-MM-dd");
            String data = dateF.format(JDC_DISP.getDate());

            //SETAR OS BEANS
            disponibilidadeBean.setHora(JCBX_HORARIO.getSelectedItem().toString());
            disponibilidadeBean.setCod_guiche(Integer.valueOf(JCBX_GUICHE.getSelectedItem().toString()));
            disponibilidadeBean.setDia(java.sql.Date.valueOf(data));
            disponibilidadeBean.setStatus(0);

            /**
             * TESTA O MÉTODO PARA INSERIR UM HORÁRIO
             */
            if (disponibilidadeDAO.inserirDisponibilidade(disponibilidadeBean)) {
                //SE OCORRER TUDO BEM
                JOptionPane.showMessageDialog(null, "Horário inserido com sucesso !");
            } else {
                //TRATAMENTO DE ERRO
                JOptionPane.showMessageDialog(null, "Já existe horário agendado !");
            }
        } catch (ClassNotFoundException | IllegalArgumentException | NullPointerException ex) {
            //TRATAMENTO DE EXCESSÃO
            JOptionPane.showMessageDialog(null, "Erro ao inserir horário");
        }


    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        /**
         * EVENTO RESPONSÁVEL POR INSERIR ALUNO
         */

        //DAOS QUE O MÉTODO UTILIZA
        AlunoDAO alunoDAO;
        try {
            alunoDAO = DAOFactory.criarAlunoDAO(conexao);
            //BEAN QUE O MÉTODO UTILIZA
            AlunoBean alunoBean = new AlunoBean();

            //SETAR BEANS COM OS VALORES DOS FORMULÁRIOS
            alunoBean.setNome_aluno(JTF_NOME_ALUNO.getText().trim().toUpperCase());
            alunoBean.setCpf_aluno(JTF_CPF_ALUNO.getText().replace(".", "").replace("-", "").trim());
            alunoBean.setEmail_aluno(JTF_EMAIL.getText().trim());
            alunoBean.setTelefone_aluno(JTF_TELEFONE.getText().trim().replace("(", "").replace(")", "").replace("-", ""));

            //VALIDAÇÃO DE FORMULÁRIO PARA VER SE TEM ALGUM CAMPO EM BRANCO
            if (alunoBean.getCpf_aluno().length() < 11 || alunoBean.getNome_aluno().isEmpty() || alunoBean.getEmail_aluno().isEmpty() || alunoBean.getTelefone_aluno().isEmpty()) {
                //SE TIVER ALGUM CAMPO EM BRANCO
                JOptionPane.showMessageDialog(null, "Por favor, digite todos os campos !");
            } else if (!ValidarCPF.isValidCPF(alunoBean.getCpf_aluno())) {
                    //VALIDAÇÃO DE CPF
                    JOptionPane.showMessageDialog(null, "Digite um CPF Válido !");
            } else {
                //SE OCORRER TUDO BEM
                alunoDAO.inserir(alunoBean);
                JTF_NOME_ALUNO.setText("");
                JTF_CPF_ALUNO.setText("");
                JTF_EMAIL.setText("");
                JTF_TELEFONE.setText("");
            }
        } catch (ClassNotFoundException ex) {
            //TRATAMENTO DE EXCESSÃO
            Logger.getLogger(FrmPrincipal.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        //CHAMAR LAYOUT DE ALTERAÇÃO DE DADOS DO ALUNO
        CardLayout cl = (CardLayout) (JPN_CONTAINER.getLayout());
        cl.show(JPN_CONTAINER, "JC_ALTERAR_DADOS");
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        /**
         * EVENTO RESPONSÁVEL POR ALTERAR OS DADOS DE UM ALUNO
         */

        //DAOS E BEANS QUE O MÉTODO UTILIZA
        AlunoBean alunoBean;
        AlunoDAO alunoDAO;
        try {
            alunoDAO = DAOFactory.criarAlunoDAO(conexao);

            //PROCURAR NO BANCO DE DADOS UM ALUNO COM UM CPF ESPECÍFICO
            alunoBean = alunoDAO.procurar(JTF_PESQUISAR_ALUNO_CPF.getText().replace(".", "").replace("-", "").trim());

            //VERIFICA SE EXISTE ALGUM ALUNO COM AQUELE CPF
            if (alunoBean != null) {
                //SE EXISTIR, SETAR OS CAMPOS DO FORMULÁRIO COM OS DADOS DO ALUNO
                JTF_NOME_ALTERAR.setEnabled(true);
                JTF_NOME_ALTERAR.setText(alunoBean.getNome_aluno());

                JTF_CPF_ALTERAR.setText(alunoBean.getCpf_aluno());

                JTF_EMAIL_ALTERAR.setEnabled(true);
                JTF_EMAIL_ALTERAR.setText(alunoBean.getEmail_aluno());

                JTF_TELEFONE_ALTERAR.setEnabled(true);
                JTF_TELEFONE_ALTERAR.setText(alunoBean.getTelefone_aluno());

                ID_ALUNO.setText(String.valueOf(alunoBean.getId_aluno()));
                BTN_ALTERAR.setEnabled(true);
                BTN_DELETAR.setEnabled(true);
            } else if(!ValidarCPF.isValidCPF(JTF_PESQUISAR_ALUNO_CPF.getText().replace(".", "").replace("-", "").trim())){
                JOptionPane.showMessageDialog(null, "Digite um CPF Válido");
            }
            else {
                //SE NÃO EXISTIR, LIMPAR OS CAMPOS E RETORNAR UMA MENSAGEM
                JTF_NOME_ALTERAR.setEnabled(false);
                JTF_EMAIL_ALTERAR.setEnabled(false);
                JTF_TELEFONE_ALTERAR.setEnabled(false);
                JTF_NOME_ALTERAR.setText("");
                JTF_EMAIL_ALTERAR.setText("");
                JTF_TELEFONE_ALTERAR.setText("");
                JTF_CPF_ALTERAR.setText("");
                ID_ALUNO.setText("");
                BTN_ALTERAR.setEnabled(false);
                BTN_DELETAR.setEnabled(false);
                JOptionPane.showMessageDialog(null, "CPF não encontrado !");

            }
        } catch (ClassNotFoundException ex) {
            //TRATAMENTO DE EXCESSÃO
            Logger.getLogger(FrmPrincipal.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void BTN_DELETARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_DELETARActionPerformed
        try {
            /**
             * MÉTODO RESPONSÁVEL POR DELETAR UM ALUNO
             */

            //DAOS NECESSÁRIAS PARA FUNCIONAMENTO DO MÉTODO
            AlunoDAO alunoDAO = DAOFactory.criarAlunoDAO(conexao);

            //VERIFICA SE O MÉTODO PARA DELETAR ALUNO OCORREU NORMALMENTE
            if (alunoDAO.deletar(Integer.valueOf(ID_ALUNO.getText()))) {
                //SE OCORREU
                JTF_NOME_ALTERAR.setEnabled(false);
                JTF_EMAIL_ALTERAR.setEnabled(false);
                JTF_TELEFONE_ALTERAR.setEnabled(false);
                JTF_NOME_ALTERAR.setText("");
                JTF_EMAIL_ALTERAR.setText("");
                JTF_TELEFONE_ALTERAR.setText("");
                JTF_CPF_ALTERAR.setText("");
                ID_ALUNO.setText("");
                BTN_ALTERAR.setEnabled(false);
                BTN_DELETAR.setEnabled(false);
                JOptionPane.showMessageDialog(null, "Aluno deletado com sucesso !");
            } else {
                //TRATAMENTO DE ERRO
                JOptionPane.showMessageDialog(null, "Erro ao deletar aluno");
            }

        } catch (ClassNotFoundException ex) {
            //TRATAMENTO DE EXCESSÃO
            Logger.getLogger(FrmPrincipal.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BTN_DELETARActionPerformed

    private void BTN_ALTERARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_ALTERARActionPerformed
        /**
         * EVENTO RESPONSÁVEL POR ALTERAR UM ALUNO
         */
        try {
            //VARIAVEIS, BEANS E DAOS QUE O MÉTODO UTILIZA
            int cod = Integer.parseInt(ID_ALUNO.getText());
            AlunoBean alunoBean = new AlunoBean();
            AlunoDAO alunoDAO = DAOFactory.criarAlunoDAO(conexao);

            //SETAR BEANS COM VALORES DO FORMULÁRIO
            alunoBean.setNome_aluno(JTF_NOME_ALTERAR.getText().trim().toUpperCase());
            alunoBean.setEmail_aluno(JTF_EMAIL_ALTERAR.getText().trim());
            alunoBean.setTelefone_aluno(JTF_TELEFONE_ALTERAR.getText().trim());

            //TESTA O MÉTODO alterar, SE OCORREU TUDO BEM RETORNA true CASO CONTRÁRIO RETORNA false
            if (alunoDAO.alterar(cod, alunoBean)) {
                JOptionPane.showMessageDialog(null, "Alterado com sucesso !");
                JTF_NOME_ALTERAR.setText("");
                JTF_NOME_ALTERAR.setEnabled(false);
                JTF_EMAIL_ALTERAR.setText("");
                JTF_EMAIL_ALTERAR.setEnabled(false);
                JTF_TELEFONE_ALTERAR.setText("");
                JTF_TELEFONE_ALTERAR.setEnabled(false);
                JTF_CPF_ALTERAR.setText("");
                JTF_CPF_ALTERAR.setEnabled(false);
                ID_ALUNO.setText("");
                BTN_ALTERAR.setEnabled(false);
                BTN_DELETAR.setEnabled(false);
            } else {
                //TRATAMENTO DE ERRO
                JOptionPane.showMessageDialog(null, "Erro ao alterar!");

            }
        } catch (ClassNotFoundException ex) {
            //TRATAMENTO DE EXCESSÃO
            Logger.getLogger(FrmPrincipal.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BTN_ALTERARActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        /**
         * EVENTO RESPONSÁVEL POR CHAMAR O LAYOUT DE LISTAGEM DE AGENDAMENTO NO
         * DIA
         */
        CardLayout cl = (CardLayout) (JPN_CONTAINER.getLayout());
        cl.show(JPN_CONTAINER, "JC_LISTAR_HORARIO");
        try {
            /**
             * SETA O MODELO DA TABELA DE AGENDAMENTO DE ACORDO COM O ABSTRACT
             * TABLE MODEL CRIADO
             */
            AgendamentosTM agendamentosTM = new AgendamentosTM(Integer.valueOf(JL_ID_USER.getText()));
            JT_ATENDIMENTOS.setModel(agendamentosTM);
            if (agendamentosTM.getRowCount() == 0) {
                JB_INICIAR_ATENDIMENTO.setEnabled(false);
            } else {
                JB_INICIAR_ATENDIMENTO.setEnabled(true);

            }

        } catch (ClassNotFoundException ex) {
            //TRATAMENTO DE EXCESSÃO
            Logger.getLogger(FrmPrincipal.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void JB_INICIAR_ATENDIMENTOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_INICIAR_ATENDIMENTOActionPerformed
        /**
         * EVENTO RESPONSÁVEL POR INICIAR UM ATENDIMENTO
         */

        //VARIAVEIS NECESSÁRIAS PARA FUNCIONAMENTO DO MÉTODO
        String codigo = String.valueOf(JT_ATENDIMENTOS.getValueAt(JT_ATENDIMENTOS.getSelectedRow(), 0));
        String nome_aluno = String.valueOf(JT_ATENDIMENTOS.getValueAt(JT_ATENDIMENTOS.getSelectedRow(), 1));
        String cpf_aluno = String.valueOf(JT_ATENDIMENTOS.getValueAt(JT_ATENDIMENTOS.getSelectedRow(), 2));

        try {
            //CRIA UM NOVO FEEDBACKDAO
            FeedbackDAO feedback = DAOFactory.criarFeedbackDAO(conexao);

            //VERIFICA SE O ATENDENTE CLICOU EM ALGUMA LINHA
            if (codigo.isEmpty() || nome_aluno.isEmpty() || cpf_aluno.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Por favor, selecione um atendimento na lista !");
            } //VERIFICA SE EXISTE ALGUM FEEDBACK CADASTRADO NAQUELE ATENDIMENTO
            else if (feedback.verificarFeedback(Integer.valueOf(codigo)) != 0) {
                JOptionPane.showMessageDialog(null, "Atendimento já realizado !");
            } else {
                try {
                    //INICIA PROCESSO DE FEEDBACK
                    //INSTANCIAÇÃO DA CLASSE FrmConcluirAtendimento
                    FrmConcluirAtendimento concluir = new FrmConcluirAtendimento();
                    concluir.setVisible(true);

                    //SETAR OS VALORES NO FORM FrmConcluirAtendimento
                    concluir.JL_NUMERO_ATENDIMENTO.setText(codigo);
                    concluir.JTF_CPF_ALUNO_FEEDBACK.setText(cpf_aluno);
                    concluir.JTF_NOME_ALUNO_FEEDBACK.setText(nome_aluno);
                } catch (ArrayIndexOutOfBoundsException ex) {
                    JOptionPane.showMessageDialog(null, "");
                }
            }
        } catch (ClassNotFoundException ex) {
            //TRATAMENTO DE EXCESSÃO
            JOptionPane.showMessageDialog(null, "Teste");
        }
    }//GEN-LAST:event_JB_INICIAR_ATENDIMENTOActionPerformed

    private void jMenu5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu5ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jMenu5ActionPerformed

    private void jMenu5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu5MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jMenu5MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTN_ALTERAR;
    private javax.swing.JButton BTN_DELETAR;
    private javax.swing.JLabel ID_ALUNO;
    private javax.swing.JButton JB_INICIAR_ATENDIMENTO;
    private javax.swing.JComboBox<String> JCBX_GUICHE;
    private javax.swing.JComboBox<String> JCBX_HORARIO;
    private com.toedter.calendar.JDateChooser JDC_DISP;
    public static javax.swing.JLabel JL_CATEGORIA_RESPONSAVEL;
    private javax.swing.JLabel JL_CPF;
    private javax.swing.JLabel JL_DATA;
    private javax.swing.JLabel JL_EMAIL;
    private javax.swing.JLabel JL_GUICHE;
    public static javax.swing.JLabel JL_GUICHE_ATUAL;
    private javax.swing.JLabel JL_HORARIOS_DISPONIVEIS;
    public static javax.swing.JLabel JL_HORA_SISTEMA;
    public static javax.swing.JLabel JL_ID_USER;
    private javax.swing.JLabel JL_NOME;
    public static javax.swing.JLabel JL_NOME_USER;
    private javax.swing.JMenuBar JMNB;
    private javax.swing.JPanel JPN_ADICIONAR_ALUNO;
    private javax.swing.JPanel JPN_ADICIONAR_HORARIO;
    private javax.swing.JPanel JPN_ALTERAR_ALUNO;
    private javax.swing.JPanel JPN_CONTAINER;
    private javax.swing.JPanel JPN_CONTAINER_ALTERAR_DADOS;
    private javax.swing.JPanel JPN_DADOS_PESSOAIS;
    private javax.swing.JPanel JPN_FIRST;
    private javax.swing.JPanel JPN_INFORMATIONS;
    private javax.swing.JPanel JPN_LISTAR_HORARIO;
    private javax.swing.JPanel JPN_PESQUISAR_CPF_ALUNO;
    private javax.swing.JPanel JPN_PRINCIPAL;
    private javax.swing.JTextField JTF_CPF_ALTERAR;
    private javax.swing.JFormattedTextField JTF_CPF_ALUNO;
    private javax.swing.JTextField JTF_EMAIL;
    private javax.swing.JTextField JTF_EMAIL_ALTERAR;
    private javax.swing.JTextField JTF_NOME_ALTERAR;
    private javax.swing.JTextField JTF_NOME_ALUNO;
    private javax.swing.JFormattedTextField JTF_PESQUISAR_ALUNO_CPF;
    private javax.swing.JFormattedTextField JTF_TELEFONE;
    private javax.swing.JTextField JTF_TELEFONE_ALTERAR;
    private javax.swing.JTable JT_ATENDIMENTOS;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
