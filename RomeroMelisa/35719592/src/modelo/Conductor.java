package modelo;

public class Conductor {
	private int idConductor;
	private String nombre;
	private String cuil;
	
	//CONSTRUCTOR
	public Conductor(int idConductor, String nombre, String cuil) {
		super();
		this.idConductor = idConductor;
		this.nombre = nombre;
		this.cuil = cuil;
	}
	
	//GETTERS Y SETTERS
	public int getIdConductor() {
		return idConductor;
	}

	public void setIdConductor(int idConductor) {
		this.idConductor = idConductor;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCuil() {
		return cuil;
	}

	public void setCuil(String cuil) {
		this.cuil = cuil;
	}

}
