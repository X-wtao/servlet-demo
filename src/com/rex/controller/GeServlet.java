package com.rex.controller;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;

/**
 * Created by wtao on 1/2/2019.
 */
public class GeServlet extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Generic Servlet: request...");
        System.out.println("Get port: " + servletRequest.getServerPort());
    }
}
