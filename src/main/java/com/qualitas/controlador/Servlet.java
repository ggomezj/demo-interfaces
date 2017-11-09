package com.qualitas.controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.qualitas.entities.Cliente;
import com.qualitas.service.Service;
import javax.servlet.RequestDispatcher;
import java.util.List;


public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private Service service;
	
	
    public Servlet() {
        service=new Service(); //se crea instancia al cargar servelt
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		List<Cliente> clientes = service.getClientes();
		HttpSession session = request.getSession(true);
		// almacena clientes en la sesion
		session.setAttribute("clientes", clientes);
		
		
		
		String nextJSP ="/index.jsp";
		RequestDispatcher dispacher = getServletContext().getRequestDispatcher(nextJSP);
		dispacher.forward(request,response);
		
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
