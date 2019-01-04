package com.rex.responsestatus;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by wtao on 1/4/2019.
 */
@WebServlet("/demoresponsestatus")
public class HttpResponseStatusDemo extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("INFO: Request URI: " + request.getRequestURI());
        response.setContentType("text/html;charset=UTF-8");
        response.sendError(403, "Need authentication!!!");
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
