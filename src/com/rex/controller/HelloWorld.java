package com.rex.controller;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by wtao on 1/2/2019.
 */
public class HelloWorld extends HttpServlet {
    private String message;

    public void init() throws ServletException {
        message = "Hello World!";
        System.out.println("HelloWorld Servlet: init...");
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h1>" + message + "</h1>");
    }

    public void destroy() {
        System.out.println("HelloWorld Servlet: destroy...");
    }
}
