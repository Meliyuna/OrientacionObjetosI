package modelo;

import modelo.Genero;

public class Pelicula {
	
	private int idPelicula;
	private String pelicula;
	private Genero genero;
	
	//CONSTRUCTOR
	public Pelicula(int idPelicula, String pelicula, Genero genero) {
		
		this.idPelicula = idPelicula;
		this.pelicula = pelicula;
		this.genero = genero;
	}	

	//GETTERS Y SETTERS
	public int getIdPelicula() {
		return idPelicula;
	}


	public void setIdPelicula(int idPelicula) {
		this.idPelicula = idPelicula;
	}

	public String getPelicula() {
		return pelicula;
	}

	public void setPelicula(String pelicula) {
		this.pelicula = pelicula;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}	

}
