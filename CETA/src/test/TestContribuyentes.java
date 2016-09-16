package test;

/* IMPORT */
import modelo.Contribuyentes;

public class TestContribuyentes {

	public static void main(String[] args) {
		
		String cuil = "27357195921"; //Cuil ingresado sin los guiones
		char sexo = 'F';
		Contribuyentes contri = new Contribuyentes (101, "Romero", "Melisa", 35719592, sexo, cuil);
		
		try {		
				System.out.println("Validar sexo del contribuyente: ");
				System.out.println(contri.validarSexo(sexo));
		}
		catch (Exception e){ 
							System.out.println("Excepcion: " + e.getMessage());
		}
		try{
				System.out.println("Validar cuil del contribuyente: ");
				System.out.println(contri.validarCuil(cuil));
			}
		catch (Exception e){
							System.out.println("Excepcion: " + e.getMessage());
		}
	}
}

