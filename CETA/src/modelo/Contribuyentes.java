package modelo;

public class Contribuyentes {
	private int idContribuyente;
	private String apellido;
	private String nombre;
	private long dni;
	private char sexo;
	private String cuil;

	// Constructor
	public Contribuyentes(int idContribuyente, String apellido, String nombre, long dni, char sexo, String cuil) {

		this.idContribuyente = idContribuyente;
		this.apellido = apellido;
		this.nombre = nombre;
		this.dni = dni;
		this.sexo = sexo;
		this.cuil = cuil;
	}

	// Getters y Setters

	public int getIdContribuyente() {
		return idContribuyente;
	}

	public void setIdContribuyente(int idContribuyente) {
		this.idContribuyente = idContribuyente;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public long getDni() {
		return dni;
	}

	public void setDni(long dni) {
		this.dni = dni;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public String getCuil() {
		return cuil;
	}

	public void setCuil(String cuil) {
		this.cuil = cuil;
	}

	public boolean validarSexo(char sexo) throws Exception {
	
		if (sexo != 'M' && sexo != 'F') throw new Exception ("Error: Sexo ingresado no es valido");
		else
			return true;
	}

	public boolean validarCuil (String cuil) throws Exception {
		
		
		int[] array1 = {0,0,0,0,0,0,0,0,0,0,0};
		int[] array2 = {0,0,0,0,0,0,0,0,0,0,0};
		
		
		for (int i=0; i < cuil.length(); i++){
			
			if (cuil.charAt(i)!= '-')
				array1 [i] = Character.getNumericValue(cuil.charAt(i));
			
		}
		
		array2[0] = array1[0]*5;
		array2[1] = array1[1]*4;
		array2[2] = array1[2]*3;
		array2[3] = array1[3]*2;
		array2[4] = array1[4]*7;
		array2[5] = array1[5]*6;
		array2[6] = array1[6]*5;
		array2[7] = array1[7]*4;
		array2[8] = array1[8]*3;
		array2[9] = array1[9]*2;
		
		int i,v1, v2, v3, codigo;
		v1 = 0;
		for (i=0; i < array2.length; i++){
			v1 = v1 + array2[i];
		}
		
		v2 = v1 % 11;
		
		v3 = 11 - v2;
		
		if (v3 == 11) codigo = 0;
		else if (v3 == 10) codigo = 9;
		else	codigo = v3;
		
		boolean valido;
		
		if (codigo == array1[10]) valido = true;
		else throw new Exception ("Error: El cuil ingresado no es valido");
		
		return valido;
		
	}

}
