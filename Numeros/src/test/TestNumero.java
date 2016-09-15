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
	
	/* Ver si el numero es primo*/
	System.out.println(numero.esPrimo());
	
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
