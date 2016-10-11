package modelo;

import java.util.ArrayList;
import java.util.List;

import modelo.Producto;
//import modelo.Carrito;
//import modelo.ItemCarrito;
//import modelo.Cliente;

public class Supermercado {
	private List<Producto> gondola;

	public Supermercado() {
		this.gondola = new ArrayList<Producto>();
	}

	public List<Producto> getGondola() {
		return gondola;
	}

	/*public boolean agregarProducto (String producto, float precio) throws Exception{
		if (this.traerProducto(idProducto) == null) return true;
		else throw new Exception ("Error: El producto ya existe");	*/			
	public boolean agregarProducto (String producto, float precio) throws Exception{
		boolean agregar = true;
		Producto produ = null;

		if (this.traerProducto(producto) != null) agregar = false;
		if (!agregar){
			throw new Exception("Error: El producto ya existe");
		}
		else{ 
			produ = new Producto (gondola.size()+1, producto, precio);
			gondola.add(produ);
		}
		return agregar;
	}
	
	/*public boolean agregarProducto (String producto, float precio){
		boolean agregar = true;
		Producto produ = null;
		
		for (Producto p: gondola){
			if (producto.equalsIgnoreCase(p.getProducto())) agregar = false;
		}
		if (agregar){ 
			produ = new Producto (gondola.size()+1, producto, precio);
			gondola.add(produ);
		}
		return agregar;
	}*/
	
	public Producto traerProducto (int idProducto){
		Producto prod = null;
		
		for (Producto p: gondola){
			if (idProducto == p.getIdProducto()) prod = p;
		}
		return prod;
	}
	
	public Producto traerProducto (String producto){
		Producto prod = null;
		
		for (Producto p: gondola){
			if (producto.equalsIgnoreCase(p.getProducto())) prod = p;
		}
		return prod;
	}
	
	public boolean modificarProducto (Producto producto) throws Exception{
		boolean modif = true;
		Producto p = traerProducto(producto.getIdProducto());
		if (p != null){
			p.setProducto(producto.getProducto());
			p.setPrecio(producto.getPrecio());
			return modif;
		}
		else throw new Exception ("Error: no se hallo el producto");
	}
	
	public boolean eliminarProducto(Producto producto){
		boolean borrado = false;
		for (Producto p: gondola){
			if (p == producto){
				borrado = gondola.remove(p);
			}
		}
		return borrado;
	}
}