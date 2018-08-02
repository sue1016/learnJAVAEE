package com.sue.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        //请求发过来的URL是什么
        String url = req.getRequestURL().toString();
        System.out.println(url);

        //打印输出流
        PrintWriter out = resp.getWriter();
        out.println("hello servlet!");
    }
}
