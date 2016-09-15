package test;

import consultorio.Paciente;
import consultorio.Medico;

public class TestConsultorio {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Paciente paciente1 = new Paciente("Jose", "Perez", 1.80f, 85);
		Paciente paciente2 = new Paciente("Jorge", "Fernandez", 1.60f, 90);
		Medico medico1 = new Medico ("Pepe", "Grillo", "Clinico");
		
		System.out.println("Pacientes: ");
		System.out.println(paciente1.traerNombreCompleto());
		System.out.println(paciente2.traerNombreCompleto());
		
		System.out.println(medico1.calcularIMC(paciente1));

	}

}
