package br.com.siag.dao;

import br.com.siag.beans.CatServicoBean;
import br.com.siag.beans.ServicoBean;
import java.util.List;

/**
 *
 * @author marcus
 */
public interface ServicosDAO {
    /**
     * 
     * @param codigoCategoria
     * @return Lista todos os serviços disponíveis
     */
    List<ServicoBean> listarServicosDisponiveis(String codigoCategoria);
    
    /**
     * 
     * @return Lista todos as categorias de serviços disponíveis
     */
    List<CatServicoBean> listarCategoriasDisponiveis();
    
    /**
     * 
     * @param codigo
     * @return Serviço específico através do código
     */
    ServicoBean servicoEspecifico(int codigo);
    
    /**
     * 
     * @param codigo
     * @return Categoria específica através do código
     */
    CatServicoBean categoriaEspecifica(int codigo);
}
