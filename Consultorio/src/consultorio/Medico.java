package consultorio;
import consultorio.Paciente;

public class Medico {
	private String nombre;
	private String apellido;
	private String especialidad;
	
	public Medico (String nombre, String apellido, String especialidad){
		this.nombre = nombre;
		this.apellido = apellido;
		this.especialidad = especialidad;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getEspecialidad() {
		return especialidad;
	}
	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}
	
	public float calcularIMC(Paciente paciente){
		float estatura = paciente.getEstatura();
		float peso = paciente.getPeso();
		float resultado = peso/(estatura*estatura);
		return resultado;
	}

}
