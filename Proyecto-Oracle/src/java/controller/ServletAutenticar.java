package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet (name = "ServletAutenticar", urlPatterns = {"/Ingresar"})
public class ServletAutenticar extends HttpServlet {

    
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("Applications/vnd.ms-excel");
        PrintWriter salida = response.getWriter();
        salida.println("Yo soy tu Anubis U_U");
        }
    }   