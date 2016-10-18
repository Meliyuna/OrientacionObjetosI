package modelo;

import java.util.ArrayList;
import java.util.List;


public class AdmCliente {
	
	private List<Cliente> lstCliente;
	
	public AdmCliente (){
		this.lstCliente = new ArrayList<Cliente>();
	}

	public List<Cliente> getLstCliente() {
		return lstCliente;
	}
	
	public Cliente traerCliente (int idCliente){
		Cliente cli = null;
		
		for (Cliente c: lstCliente){
			if (idCliente == c.getIdCliente()) cli = c;
		}
		return cli;
	}
	
	public Cliente traerCliente (long dni){
		Cliente cli = null;
		
		for (Cliente c: lstCliente){
			if (dni == c.getDni()) cli = c;
		}
		return cli;
	}
	
	public boolean eliminarCliente(Cliente cliente) throws Exception {
		boolean borrado = false;
		for (Cliente c: lstCliente){
			if (c == cliente){
				borrado = lstCliente.remove(c);
			}
		}
		if (!borrado) throw new Exception ("Error: el cliente no existe");
		else return borrado;
	}
	
	public boolean agregarCliente (String cliente, long dni, String direccion) throws Exception{
		boolean agregar = true;
		
		Cliente cli = null;

		if (this.traerCliente(dni) != null) agregar = false;
		if (!agregar){
			throw new Exception("Error: El cliente ya existe");
		}
		else{ 
			cli = new Cliente (lstCliente.size()+1, cliente, dni, direccion);
			lstCliente.add(cli);
		}
		return agregar;
	}
	

}
