package test;

import modelo.Numero;

public class TestNumero {

	public static void main(String[] args) {

		int n = 97;
		int n2 = 13;
		Numero numero = new Numero(n);

		// SUMA
		System.out.println("Suma entre " + n + " y " + n2);
		System.out.println(numero.sumar(n2));

		// MULTIPLICACION
		n = 5;
		numero.setN(n);

		System.out.println("Multiplicación entre " + n + " y " + n2);
		System.out.println(numero.multiplicar(n2));

		n = 97;
		numero.setN(n);

		// PARIDAD
		System.out.println("El número " + n + " es par:");
		System.out.println(numero.esPar());

		// PRIMO
		System.out.println("El número " + n + " es primo:");
		System.out.println(numero.esPrimo());

		// A STRING
		System.out.println("El número " + n + " a String:");
		System.out.println(numero.convertirAString());

		// A DOUBLE
		System.out.println("El número " + n + " a Double:");
		System.out.println(numero.convertirADouble());

		// POTENCIA
		n = 5;
		numero.setN(n);
		int exp = 3;

		System.out.println("El número " + n + " elevado a la " + exp + ":");
		System.out.println(numero.calcularPotencia(exp));

		// A BASE 2
		n = 97;
		numero.setN(n);

		System.out.println("El número " + n + "(10 a base 2:");
		System.out.println(numero.pasarBase2() + "(2 ");

		// FACTORIAL
		n = 5;
		numero.setN(n);

		System.out.println("Factorial de " + n + " (" + n + "!):");
		System.out.println(numero.calcularFactorial());

		// COMBINATORIO
		int n3 = 2;
		System.out.println("Número combinatorio [n!/k!*(n-k)!]:");
		System.out.println(numero.numeroCombinatorio(n3));

		// PRIMOS MELLIZOS
		int primo1 = 17;
		int primo2 = 19;
		Numero numero3 = new Numero(primo1);

		System.out.println("Los números " + primo1 + " y " + primo2 + " son primos mellizos:");
		System.out.println(numero3.esPrimoMellizo(primo2));

		// PRIMOS HASTA n
		n = 97;
		numero.setN(n);
		int i = 1;
		Numero numero2 = new Numero(i);

		System.out.println("Números primos hasta " + n + ":");
		for (i = 1; i <= n; i++) {
			numero2.setN(i);
			if (numero2.esPrimo() == true) {
				System.out.println(i);
			}
		}

		// PRIMOS MELLIZOS HASTA n
		int mellizo1 = 1;
		int mellizo2;
		Numero numero4 = new Numero(mellizo1);

		System.out.println("Numeros primos mellizos hasta" + n + ":");
		for (mellizo1 = 1; mellizo1 < n; mellizo1++) {
			numero4.setN(mellizo1);
			mellizo2 = mellizo1 + 2;
			if (numero4.esPrimoMellizo(mellizo2) == true) {
				System.out.println(mellizo1 + " " + mellizo2);
			}
		}
	}
}