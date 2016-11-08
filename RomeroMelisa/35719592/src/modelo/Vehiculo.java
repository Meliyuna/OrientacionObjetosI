package modelo;

import java.util.List;
import java.util.ArrayList;
import modelo.Funciones;
import java.util.GregorianCalendar;
import modelo.Posicion;

public class Vehiculo {
	private int idVehiculo;
	private String dominio;
	private List<Recorrido> lstRecorridos;

	// CONSTRUCTOR
	public Vehiculo(int idVehiculo, String dominio) {

		this.idVehiculo = idVehiculo;
		try{
			this.setDominio(dominio);
		}
		catch (Exception e){
			System.out.println(e.getMessage());
		}
		this.lstRecorridos = new ArrayList<Recorrido>();
	}

	// GETTERS Y SETTERS
	public int getIdVehiculo() {
		return idVehiculo;
	}

	public void setIdVehiculo(int idVehiculo) {
		this.idVehiculo = idVehiculo;
	}

	public String getDominio() {
		return dominio;
	}

	public void setDominio(String dominio) throws Exception {
		if (this.esDominioValido(dominio))
			this.dominio = dominio;
		else
			throw new Exception("Error: El dominio " + dominio + " no es valido");
	}

	public List<Recorrido> getLstRecorridos() {
		return lstRecorridos;
	}

	public void setLstRecorridos(List<Recorrido> lstRecorridos) {
		this.lstRecorridos = lstRecorridos;
	}

	// Validar Dominio del Vehiculo
	public boolean esDominioValido(String dominio) {

		String str1 = dominio.substring(0, 2);
		String str2 = dominio.substring(3, 5);

		if (Funciones.esCadenaLetras(str1) && Funciones.esCadenaNumeros(str2))
			return true;
		else
			return false;
	}

	// Traer Recorrido por el ID
	public Recorrido traerRecorrido(int idRecorrido) {
		Recorrido rec = null;

		for (Recorrido r : lstRecorridos) {
			if (r.getIdRecorrido() == idRecorrido)
				rec = r;
		}
		return rec;
	}

	// Traer Recorrido por fecha ingresada
	public Recorrido traerRecorrido(GregorianCalendar fechaHoraInicio) {
		Recorrido rec = null;
		for (Recorrido r : lstRecorridos) {
			for (Posicion p : r.getLstPosiciones()) {
				if (p.getFechaHora() == fechaHoraInicio) {
					rec = r;
				}
			}
		}
		return rec;
	}

	// Calculo de distancia recorrida en dos fechas ingresadas
	public float distanciaRecorrida(GregorianCalendar fechaHoraInicio, GregorianCalendar fechaHoraFin) {
		Recorrido rec = null;
		Posicion pos1, pos2;

		pos1 = null;
		pos2 = null;

		float dist;

		rec = this.traerRecorrido(fechaHoraInicio);
		pos1 = rec.traerPosicion(fechaHoraInicio);
		pos2 = rec.traerPosicion(fechaHoraFin);

		dist = pos1.distancia(pos2);

		return dist;
	}

	public static double diferenciaFechaEnHoras(GregorianCalendar fIni, GregorianCalendar fFin) {
		return (fFin.getTimeInMillis() - fIni.getTimeInMillis()) / 1000.0 / 3600.0;
	}

	// Calculo de Velocidad Media (Dx/Dt)
	public float velocidadMedia(GregorianCalendar fechaHoraInicio, GregorianCalendar fechaHoraFin) {

		double distancia = this.distanciaRecorrida(fechaHoraInicio, fechaHoraFin);

		double tiempo = diferenciaFechaEnHoras(fechaHoraInicio, fechaHoraFin);

		return (float) (distancia / tiempo);
	}
}
