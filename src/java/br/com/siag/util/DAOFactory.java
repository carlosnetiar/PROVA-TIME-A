package br.com.siag.util;

import br.com.siag.dao.AgendamentoDAO;
import br.com.siag.dao.DataDAO;
import br.com.siag.dao.ServicosDAO;
import br.com.siag.dao.UsuarioDAO;
import br.com.siag.jdbc.AgendamentoJDBC;
import br.com.siag.jdbc.DataJDBC;
import br.com.siag.jdbc.ServicosJDBC;
import br.com.siag.jdbc.UsuarioJDBC;
import java.sql.Connection;
public class DAOFactory {
    
    
    public static DataDAO criarDataDAO(Connection conexao){
        return new DataJDBC(conexao);
    }
    
    public static UsuarioDAO criarUsuarioDAO(Connection conexao){
        return new UsuarioJDBC(conexao);
    }
    
    public static ServicosDAO criarServicosDAO(Connection conexao){
        return new ServicosJDBC(conexao);
    }
    public static AgendamentoDAO criarAgendamentoDAO(Connection conexao){
        return new AgendamentoJDBC(conexao);
    }
    
}
