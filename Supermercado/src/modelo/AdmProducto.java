package modelo;

import java.util.List;
import java.util.ArrayList;

public class AdmProducto {
	
	private List<Producto> lstProducto;
	
	public AdmProducto(){
		this.lstProducto = new ArrayList<Producto>();
	}

	public List<Producto> getLstProducto() {
		return lstProducto;
	}
	
}
