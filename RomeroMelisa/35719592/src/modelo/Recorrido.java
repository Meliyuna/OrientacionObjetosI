package modelo;

import java.util.GregorianCalendar;
import java.util.List;
import java.util.ArrayList;
import modelo.Posicion;

public class Recorrido {
	
	private int idRecorrido;
	private String designacion;
	private Conductor conductor;
	private List<Posicion> lstPosiciones;
	
	//CONSTRUCTOR
	public Recorrido(int idRecorrido, String designacion, Conductor conductor) {
		this.idRecorrido = idRecorrido;
		this.designacion = designacion;
		this.conductor = conductor;
		this.lstPosiciones = new ArrayList<Posicion>();
	}
	
	//GETTERS Y SETTERS
	public int getIdRecorrido() {
		return idRecorrido;
	}

	public void setIdRecorrido(int idRecorrido) {
		this.idRecorrido = idRecorrido;
	}

	public String getDesignacion() {
		return designacion;
	}

	public void setDesignacion(String designacion) {
		this.designacion = designacion;
	}

	public Conductor getConductor() {
		return conductor;
	}

	public void setConductor(Conductor conductor) {
		this.conductor = conductor;
	}

	public List<Posicion> getLstPosiciones() {
		return lstPosiciones;
	}
	
	//Traer Posicion por ID
	public Posicion traerPosicion (int idPosicion){
		Posicion pos = null;
		
		for (Posicion p: lstPosiciones){
			if (p.getIdPosicion()== idPosicion) pos = p;
		}
		return pos;
	}
	
	//Devolver posicion con la fecha y hora indicada
	public Posicion traerPosicion (GregorianCalendar fechaHora){
		Posicion pos = null;
		for (Posicion p: lstPosiciones){
				if (p.getFechaHora()==fechaHora){
					pos = p;
				}
		}			
		return pos;
	}
	
	
	public boolean agregarPosicion (Posicion posicion)throws Exception{
		boolean agregar = false;
		boolean lat = posicion.esLatitudValida(posicion.getLatitud());
		boolean lon = posicion.esLongitudValida(posicion.getLongitud());
		
		if ((lat&&lon)){
			lstPosiciones.add(posicion);
			agregar = true;
		}
		else if (!lat) throw new Exception("Error: el valor "+posicion.getLatitud()+" no es valido para la latitud");
		else if (!lon) throw new Exception("Error: el valor "+posicion.getLongitud()+" no es valido para la longitud"); 
		return agregar;
	}
	
	public int consumoCombustible(GregorianCalendar fechaInicio, GregorianCalendar fechaFin){
		return (this.traerPosicion(fechaInicio).consumoCombustible(this.traerPosicion(fechaFin)));
	}
	

}
