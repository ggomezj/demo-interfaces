package com.qualitas.dao.impl;

import java.util.ArrayList;
import java.util.List;

import com.qualitas.dao.ClienteDAO;
import com.qualitas.dao.PolizaDAO;
import com.qualitas.entities.Cliente;
import com.qualitas.entities.Poliza;

public class ClienteDAOimpl implements ClienteDAO {
	
	private PolizaDAO polizaDAO;	
	
	public ClienteDAOimpl(PolizaDAO polizaDAO) {
		   super();
	       this.polizaDAO=polizaDAO;
	    	//pasar dependencia al constructor
	}
	
	public int insertar(Cliente cliente) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int borrar(Cliente cliente) {
		// TODO Auto-generated method stub
		return 0;
	}

	public Cliente actualizar(Cliente cliente) {
		// TODO Auto-generated method stub
		return null;
	}

	public Cliente consultar(String nombre, String direccion, Poliza poliza) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Cliente> consultar() {
		List<Cliente> lista =new ArrayList<Cliente>();//Creo la lista vacia
	       String[] nombres=dameNombres();
	       
	       
	       List<Poliza> listaCreada=polizaDAO.damePolizas();
	       for (int i=0;i<listaCreada.size();i++){// se cambio for (String nombre:nombres)
	           int valor=(int)(Math.random()*100);
	             //System.out.println(nombre);
	             //System.out.println("Calle "+valor);

	            // Creo una instancia de cliente
	             Cliente instancia = new Cliente (
	                        nombres[i],
	                                  "Calle "+valor,
	                                  listaCreada.get(i));
	             lista.add(instancia);// Agrego la instancia a la lista
	       }      
	       return lista;// Regreso la lista de Clientes          

	}
	
	public String[] dameNombres(){  
    	String[] nombres = new String[]{
        "Victor","Edgar","Griselda","Isora","Eduardo","Gonsalo","Hugo","Irma","Erick","Israel"
        };
    	return nombres;
    } 

}
