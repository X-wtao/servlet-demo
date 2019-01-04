package com.rex.controller;

import javax.servlet.*;
import java.io.IOException;

/**
 * Created by wtao on 1/2/2019.
 */
public class RootServlet implements Servlet{

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("Root Servlet: init...");
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Root Servlet: request...");
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {
        System.out.println("Root Servlet: destroy...");
    }
}
