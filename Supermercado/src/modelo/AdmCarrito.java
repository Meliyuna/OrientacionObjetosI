package modelo;

import java.util.GregorianCalendar;
import java.util.List;
import java.util.ArrayList;

public class AdmCarrito {
	
	private List<Carrito> lstCarrito;
	
	public AdmCarrito(){
		this.lstCarrito = new ArrayList<Carrito>();
	}

	public List<Carrito> getLstCarrito() {
		return lstCarrito;
	}
	
	public Carrito traerCarrito (int idCarrito){
		Carrito car = null;
		
		for (Carrito c: lstCarrito){
			if (idCarrito == c.getIdCarrito()) car = c;
		}
		return car;
	}
	
	public Carrito traerCarrito (Cliente cliente){
		Carrito car = null;
		
		for (Carrito c: lstCarrito){
			if (cliente.equals(c.getCliente())) car = c;
		}
		return car;
	}
	
	public boolean eliminarCarrito (Carrito carrito) throws Exception {
		boolean borrado = false;
		for (Carrito c: lstCarrito){
			if (c == carrito){
				borrado = lstCarrito.remove(c);
			}
		}
		if (!borrado) throw new Exception ("Error: el carrito no existe");
		else return borrado;
	}
	
	
	//Agregar Objeto Carrito
	public boolean agregarCarrito (Carrito carrito) throws Exception{
		boolean agregar = true;
		
		Carrito car = null;

		if (this.traerCarrito(carrito.getIdCarrito())!= null) agregar = false;
		if (!agregar){
			throw new Exception("Error: El carrito ya existe");
		}
		else{ 
			car = new Carrito (carrito.getIdCarrito(), carrito.getFechaHora(), carrito.getCliente());
			lstCarrito.add(car);
		}
		return agregar;
	}
	
	//Agregar Carrito por fecha y cliente
	public boolean agregarCarrito (GregorianCalendar fechaHora, Cliente cliente) throws Exception{
		boolean agregar = true;
		
		Carrito car = null;

		if (this.traerCarrito(cliente)!= null) agregar = false;
		if (!agregar){
			throw new Exception("Error: El carrito ya existe");
		}
		else{ 
			car = new Carrito (lstCarrito.size()+1, fechaHora, cliente);
			lstCarrito.add(car);
		}
		return agregar;
	}
	
	public float calcularTotal (Cliente cliente) throws Exception {
		float total = 0;
		for (Carrito c : lstCarrito){
			if (cliente != c.getCliente()){
			total = c.calcularTotal();
			}
		}
		if (total==0) throw new Exception ("Error: El cliente no existe ");
		return total;
	}

}
