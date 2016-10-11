package test;

import modelo.Producto;
import modelo.Supermercado;
//import java.util.ArrayList;
//import java.util.List;

public class TestSupermercado {

	public static void main(String[] args) {
		Producto produ = new Producto (1, "Papas Fritas", 35);
		Producto produ2 = new Producto (2, "Coca", 40);
		Supermercado supermercado = new Supermercado ();
		try {
			System.out.println(supermercado.agregarProducto(produ.getProducto(), produ.getPrecio()));
		} catch (Exception e){
			System.out.println("Excepcion: " + e.getMessage());
		}
		try {
			System.out.println(supermercado.agregarProducto(produ2.getProducto(), produ2.getPrecio()));
		} catch (Exception e){
			System.out.println("Excepcion: " + e.getMessage());
		}
		
		Producto produ3 = new Producto (3, "Papas Fritas", (float)60.99);
		try {
			System.out.println(supermercado.agregarProducto(produ3.getProducto(), produ3.getPrecio()));
		} catch (Exception e){
			System.out.println("Excepcion: " + e.getMessage());
		}
		System.out.println(supermercado.traerProducto(1).getIdProducto());
		System.out.println(supermercado.traerProducto(1).getProducto());
		System.out.println(supermercado.traerProducto(1).getPrecio());
		
		
	}

}
