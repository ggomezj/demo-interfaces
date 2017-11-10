<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page import="java.util.List" %>
<%@ page import="com.qualitas.entities.Cliente" %>
<html>
<head>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
  <title>Insert title here</title>

</head>
<body>

<div class="container">
  <h1>Catalogo de Clientes</h1>
  <h2> Clientes encontrados:
     <% 
     //com.qualitas.dao.PolizaDAO polizaDAO = new com.qualitas.dao.impl.PolizaDAOimpl();
     //com.qualitas.dao.ClienteDAO clienteDAO= new com.qualitas.dao.impl.ClienteDAOimpl(polizaDAO);
     List<Cliente> clientes= (List<Cliente>)session.getAttribute("clientes");
     out.println(clientes.size());
     %>
   </h2>
   <table class="table table-hover">
   <%
    out.println("<tr>");
    out.println("<td>Poliza</td>");
    out.println("<td>Cliente</td>");
    out.println("<td>Direccion</td>");
    out.println("</tr>");
    for (Cliente cliente:clientes){
    	out.println("<tr>");
    	  out.println("<td>");
    	  out.println(cliente.getPoliza().getNumero());
    	  out.println("</td>");
    	  out.println("<td>");
    	  out.println(cliente.getNombre());
    	  out.println("</td>");
    	  out.println("<td>");
    	  out.println(cliente.getDireccion());
    	  out.println("</td>");
    	out.println("</tr>");
     }
   
   %>
   
   </table>
  </div>
</body>
</html>