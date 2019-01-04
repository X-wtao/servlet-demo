package com.rex.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * Created by wtao on 1/4/2019.
 */
public class LogFilterDemo implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        String site = filterConfig.getInitParameter("Site");
        System.out.println("Website Name: " + site);
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("INFO: Coming into log filter");
        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {
        System.out.println("Log filter destroy!");
    }
}
