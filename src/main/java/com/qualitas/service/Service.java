package com.qualitas.service;

import java.util.ArrayList;
import java.util.List;

import com.qualitas.dao.ClienteDAO;
import com.qualitas.dao.PolizaDAO;
import com.qualitas.dao.impl.ClienteDAOimpl;
import com.qualitas.dao.impl.PolizaDAOimpl;
import com.qualitas.entities.Cliente;

public class Service {
	
	private ClienteDAO clienteDAO;
	private PolizaDAO polizaDAO;
	
	
  public Service() {
		super();
		polizaDAO= new PolizaDAOimpl();
		this.clienteDAO = new ClienteDAOimpl(polizaDAO);
	}



  public List<Cliente> getClientes(){
	  List<Cliente> lista= new ArrayList<Cliente>();
	  lista = clienteDAO.consultar();
	  return lista;
  }
}
