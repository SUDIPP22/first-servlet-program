package com.bridgelabz;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Purpose : To create first servlet class
 *
 * @author SUDIP PANJA
 * @version 1.0-SNAPSHOT
 * @since 2021-11-23
 */
@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {
    /**
     * Purpose : To allow a servlet to handle a GET request
     *
     * @param request  : is an object representing the request made by the browser
     * @param response : is an object representing the response the servlet is building to send back to the browser
     * @throws IOException : if there is any error with status code either 404 or 403
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h3>Welcome Sudip To First Servlet!</h3>");
        out.close();
    }
}
