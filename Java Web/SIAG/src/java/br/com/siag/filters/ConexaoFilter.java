package br.com.siag.filters;

import br.com.siag.util.ConnectionFactory;
import java.io.IOException;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class ConexaoFilter implements Filter {
    
    private FilterConfig filterConfig = null;
    
    public ConexaoFilter() {
        
    }    
    
    public void doFilter(ServletRequest request, ServletResponse response,
            FilterChain chain)
            throws IOException, ServletException {
        
        Connection conexao = null;
        try {
            conexao = ConnectionFactory.getConnection();
            request.setAttribute("CONEXAO", conexao);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConexaoFilter.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        chain.doFilter(request, response);
        
        try {
            conexao.close();
        } catch (SQLException ex) {
            Logger.getLogger(ConexaoFilter.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }

    public FilterConfig getFilterConfig() {
        return (this.filterConfig);
    }

    public void setFilterConfig(FilterConfig filterConfig) {
        this.filterConfig = filterConfig;
    }

    public void destroy() {        
    }

    public void init(FilterConfig filterConfig) {        
        this.filterConfig = filterConfig;
    }
        
}
