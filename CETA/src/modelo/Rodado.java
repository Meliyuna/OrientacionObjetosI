package modelo;

/* IMPORT */
import modelo.Funciones;

public class Rodado {
	private int idRodado;
	private String dominio;
	private int modelo;
	private String marca;
	
	//Constructor
	public Rodado(int idRodado, String dominio, int modelo, String marca) {
	
		this.idRodado = idRodado;
		this.dominio = dominio;
		this.modelo = modelo;
		this.marca = marca;
	}
	
	//Getters y Setters
	public int getIdRodado() {
		return idRodado;
	}

	public void setIdRodado(int idRodado) {
		this.idRodado = idRodado;
	}

	public String getDominio() {
		return dominio;
	}

	public void setDominio(String dominio) {
		this.dominio = dominio;
	}

	public int getModelo() {
		return modelo;
	}

	public void setModelo(int modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}	
	
	//Formato del dominio = AAA 000
	public boolean validarDominio (String dominio) throws Exception{
		String str1 = dominio.substring(0, 3);
		String str2 = dominio.substring(4,7);
		
		if (Funciones.esCadenaLetras(str1) && Funciones.esCadenaNumeros(str2))
			return true;
		else throw new Exception ("Error: El dominio no es valido");
	}

}
