package test;

import modelo.Numero;

public class TestNumero {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	int n=1001;
	Numero numero = new Numero(n);
	
	// PRIMO
	System.out.println("El número " + n + " es primo:");
	System.out.println(numero.esPrimo());

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

	
	/* Pasar a base 2 */
	System.out.println(n+"(10 = " +numero.pasarBase2() +"(2 " );
	n=9;
	numero.setN(n);
	
	System.out.println(n+"(10 = " +numero.pasarBase2() +"(2 " );
	
	
	/* Calcular Factorial*/
	n=4;
	numero.setN(n);
	System.out.println(numero.calcularFactorial());
	
	/* Calcular Numero Combinatorio (Formula= n!/k!*(n-k)!)*/
	int n1=2;
	System.out.println(numero.numeroCombinatorio(n1));
	
	}

}
