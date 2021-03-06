package modelo;

import java.util.GregorianCalendar;

public class Posicion {

	private int idPosicion;
	private double latitud;
	private double longitud;
	private int estadoCombustible;
	private GregorianCalendar fechaHora;

	// CONSTRUCTOR
	public Posicion(int idPosicion, double latitud, double longitud,
			int estadoCombustible, GregorianCalendar fechaHora) {

		this.idPosicion = idPosicion;
		try {
			this.setLatitud(latitud);
		}
		catch (Exception e){
			System.out.println(e.getMessage());
		}
		try {
			this.setLongitud(longitud);;
		}
		catch (Exception e){
			System.out.println(e.getMessage());
		}
		this.longitud = longitud;
		this.estadoCombustible = estadoCombustible;
		this.fechaHora = fechaHora;
	}

	// GETTERS Y SETTERS

	public int getIdPosicion() {
		return idPosicion;
	}

	public void setIdPosicion(int idPosicion) {
		this.idPosicion = idPosicion;
	}

	public double getLatitud(){
		
		return latitud;
	}

	public void setLatitud(double latitud)  throws Exception{
		if (this.esLatitudValida(latitud))
			this.latitud = latitud;
		else throw new Exception ("Error: La latitud "+latitud+" no es valida" );
	}

	public double getLongitud() {
		return longitud;
	}

	public void setLongitud(double longitud) throws Exception{
		if (this.esLongitudValida(longitud))
			this.longitud = longitud;
		else throw new Exception ("Error: La longitud " +longitud+ " no es valida");
	}

	public int getEstadoCombustible() {
		return estadoCombustible;
	}

	public void setEstadoCombustible(int estadoCombustible) {
		this.estadoCombustible = estadoCombustible;
	}

	public GregorianCalendar getFechaHora() {
		return fechaHora;
	}

	public void setFechaHora(GregorianCalendar fechaHora) {
		this.fechaHora = fechaHora;
	}

	public boolean esLongitudValida(double longitud) {
		boolean valido = true;

		if ((longitud > -(Math.PI)) && (longitud < (Math.PI))) {
			return valido;
		} else
			return !valido;

	}

	public boolean esLatitudValida(double latitud) {
		boolean valido = true;

		if ((latitud > -(Math.PI / 2)) && (latitud < (Math.PI / 2))) {
			return valido;
		} else
			return !valido;
	}

	public float distancia(Posicion posicion) {
		float d;
		float R = 6378;
		double lat1, lat2, long1, long2;
		lat1 = this.getLatitud();
		lat2 = posicion.getLatitud();
		long1 = this.getLongitud();
		long2 = posicion.getLongitud();

		d = (float) (2 * R * Math.asin(Math.sqrt(Math.pow(
				Math.sin(lat2 - lat1) / 2, 2)
				+ Math.cos(lat1)
				* Math.cos(lat2)
				* Math.pow(Math.sin(long2 - long1) / 2, 2))));

		return d;
	}

	public int consumoCombustible(Posicion posicion) {

		int comb1, comb2;

		comb1 = this.getEstadoCombustible();
		comb2 = posicion.getEstadoCombustible();

		return comb2 - comb1;
	}
	
	

}
