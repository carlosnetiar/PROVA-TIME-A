package br.com.siag.util;

import br.com.siag.dao.AlunoDAO;
import br.com.siag.dao.DisponibilidadeDAO;
import br.com.siag.dao.FeedbackDAO;
import br.com.siag.dao.ServicoDAO;
import br.com.siag.dao.UsuarioDAO;
import br.com.siag.jdbc.AlunoJDBC;
import br.com.siag.jdbc.DisponibilidadeJDBC;
import br.com.siag.jdbc.FeedbackJDBC;
import br.com.siag.jdbc.ServicoJDBC;
import br.com.siag.jdbc.UsuarioJDBC;
import java.sql.Connection;
public class DAOFactory {
    
    
    public static AlunoDAO criarAlunoDAO(Connection conexao) throws ClassNotFoundException{
        return new AlunoJDBC(conexao);
    }
    
    public static UsuarioDAO criarUsuarioDAO(Connection conexao) throws ClassNotFoundException{
        return new UsuarioJDBC(conexao);
    }
    public static DisponibilidadeDAO criarDisponibilidadeDAO(Connection conexao) throws ClassNotFoundException{
        return new DisponibilidadeJDBC(conexao);
    }
    public static FeedbackDAO criarFeedbackDAO(Connection conexao) throws ClassNotFoundException{
        return new FeedbackJDBC(conexao);
    }
    public static ServicoDAO criarServicoDAO(Connection conexao) throws ClassNotFoundException{
        return new ServicoJDBC(conexao);
    }
}
