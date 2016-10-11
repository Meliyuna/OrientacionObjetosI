package modelo;

import java.util.GregorianCalendar;
import modelo.ItemCarrito;
import java.util.ArrayList;
import java.util.List;

public class Carrito {
	private int idCarrito;
	private GregorianCalendar fechaHora;
	private List<ItemCarrito> lstItem;

	public Carrito(int idCarrito, GregorianCalendar fechaHora) {
		this.idCarrito = idCarrito;
		this.fechaHora = fechaHora;
		this.lstItem = new ArrayList<ItemCarrito>();
	}

	public int getIdCarrito() {
		return idCarrito;
	}

	public void setIdCarrito(int idCarrito) {
		this.idCarrito = idCarrito;
	}

	public GregorianCalendar getFechaHora() {
		return fechaHora;
	}

	public void setFechaHora(GregorianCalendar fechaHora) {
		this.fechaHora = fechaHora;
	}

	public List<ItemCarrito> getLstItem() {
		return lstItem;
	}
	
	public ItemCarrito traerItem (int idItem) {
		
		ItemCarrito item = null;
		for (ItemCarrito i: lstItem){
			if (idItem == i.getIdItem()){
				item = i;				
			}
		}
		return item;
	}
	
	public boolean agregarItem (Producto producto, int cantidad){
		boolean agregado = false;
		boolean encontrado = false;
		
		
		for (ItemCarrito i: lstItem){
			if (producto.getIdProducto() == i.getProducto().getIdProducto()){
				i.setCantidad(i.getCantidad()+cantidad);
				encontrado = true;
			}
		}
		if (!encontrado){
			
			ItemCarrito item = new ItemCarrito(lstItem.size()+1, producto, cantidad);
	
			agregado = lstItem.add(item);
		}
		
		return agregado;
	}

}