package test;

/* IMPORT */
import modelo.Rodado;

public class TestRodado {

	public static void main(String[] args) {
		String dominio = "ASP 344";

		Rodado auto = new Rodado(121, dominio, 1996, "VW");

		System.out.println("Validar Dominio del rodado: ");

		try {
			System.out.println(auto.validarDominio(dominio));
		} catch (Exception e) {
			System.out.println("Excepcion: " + e.getMessage());
		}
	}

}