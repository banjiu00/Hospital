package com.web.filer;


import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebFilter("/*")
public class LoginFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest req=(HttpServletRequest) servletRequest;
        HttpServletResponse reqs=(HttpServletResponse) servletResponse;
        reqs.setContentType("text/html;charset=utf-8");

        String requestURI = req.getRequestURI();
        Object user = req.getSession().getAttribute("USER_LOGIN");

        if((requestURI.endsWith("index.html")|| requestURI.equals("/"))&& user==null){
            reqs.sendRedirect("/html/login.html");
        }

        filterChain.doFilter(servletRequest,servletResponse);

    }

    @Override
    public void destroy() {

    }
}
