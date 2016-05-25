package br.com.siag.filters;

import java.io.IOException;
import java.sql.Connection;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SegurancaFilter implements Filter {
    
    private FilterConfig filterConfig = null;
    
    public SegurancaFilter() {
        
    }    
    
public void doFilter(ServletRequest request, ServletResponse response,
            FilterChain chain)
            throws IOException, ServletException {
        Connection connection = (Connection) request.getAttribute("CONEXAO");
        String sistema = "publico";
        boolean autenticado = false;
        boolean autorizado = false;
        HttpServletRequest req = ((HttpServletRequest) request);
        HttpServletResponse res = ((HttpServletResponse) response);
        HttpSession sessao = ((HttpServletRequest)request).getSession();
        
        String SUBDIR = req.getAttribute("SUBDIR").toString();
        String requestURI = req.getAttribute("requestURI").toString();
        String[] uri = (String[]) req.getAttribute("URI");
       
        
        chain.doFilter(request, response);
        
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
