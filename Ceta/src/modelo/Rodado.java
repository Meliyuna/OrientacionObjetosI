package modelo;

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
	
	/*public boolean validarDominio (String dominio){
		
	}*/

}
