package test;

import modelo.Ceta;
import modelo.Contribuyentes;
import modelo.Funciones;

import java.util.GregorianCalendar;

public class TestCeta {

	public static void main(String[] args) {

		int id1 = 101;

		GregorianCalendar fecha1 = new GregorianCalendar();
		GregorianCalendar fecha2 = new GregorianCalendar();

		fecha2 = Funciones.traerFechaProximo(fecha2, 2);

		String cuil = "27357195921";
		char sexo = 'F';
		Contribuyentes contri = new Contribuyentes(101, "Romero", "Melisa", 35719592, sexo, cuil);
		Contribuyentes contri1 = contri;

		double valor = 3000;
		boolean firma = true;

		Ceta c1 = new Ceta(id1, fecha1, contri, contri1, valor, firma);

		System.out.println("Validar Comprador y Vendedor: ");
		try {
			System.out.println(c1.compararCompradorVendedor());
		} catch (Exception e) {
			System.out.println("Excepcion: " + e.getMessage());
		}

		System.out.println("Validar fecha: ");
		try {
			System.out.println(c1.validarFecha());
		} catch (Exception e) {
			System.out.println("Excepcion: " + e.getMessage());
		}

	}

}