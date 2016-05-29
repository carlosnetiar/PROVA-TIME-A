/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.siag.dao;

import br.com.siag.beans.CategoriaServicoBean;
import br.com.siag.beans.GuicheBean;
import java.util.List;

/**
 *
 * @author marcus
 */
public interface ServicoDAO {
    public List<CategoriaServicoBean>    listarCategorias();
    public List<GuicheBean>              listarGuicheEspecifico(int cod_cat);
}
