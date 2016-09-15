package modelo;

public class Numero {
	private int n;

	public Numero(int n) {

		this.n = n;
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	@Override
	public String toString() {
		return "Numero [n=" + n + "]";
	}

	public int sumar(int n1) {
		return this.n + n1;
	}

	public int multiplicar(int n1) {
		return this.n * n1;
	}

	public boolean esPar() {
		int resto = this.n % 2;
		if (resto == 0)
			return true;
		else
			return false;
	}

	public boolean esPrimo() {

		int resto2 = this.n % 2;
		int resto3 = this.n % 3;
		int resto5 = this.n % 5;
		int resto7 = this.n % 7;

		if ((resto2 == 0 || resto3 == 0 || resto5 == 0 || resto7 == 0)
				&& (this.n != 2 && this.n != 3 && this.n != 5 && this.n != 7))
			return false;
		else
			return true;
	}

	public String convertirAString() {
		String cadena;
		cadena = String.valueOf(this.n);
		return cadena;
	}

	public double convertirADouble() {
		double numero;
		numero = Double.parseDouble(this.convertirAString());
		return numero;
	}

	public double calcularPotencia(int exp) {
		double potencia;
		potencia = Math.pow(this.n, exp);
		return potencia;
	}

	public String pasarBase2() {
		int resto;
		String numeroBase2 = "";
		int cociente = this.n;
		while (cociente != 0) {
			resto = cociente % 2;
			numeroBase2 = resto + numeroBase2;
			cociente = cociente / 2;
		}
		return numeroBase2;
	}

	public int calcularFactorial() {
		int n, factorial;
		n = this.n;
		factorial = n;

		if (n == 0) {
			factorial = 1;
		} else if (n < 0) {
			factorial = -1;
		} else if (n > 0) {
			while (n > 1) {
				factorial = factorial * (n - 1);
				n--;
			}
		}
		return factorial;
	}
	
	public double numeroCombinatorio(int n1) {
		int n = this.n;
		int k = n1;

		if (n > 0 && k > 0 && n>k) {

			int nFact = this.calcularFactorial();

			this.setN(k);
			int kFact = this.calcularFactorial();

			this.setN(n - k);
			int restaFact = this.calcularFactorial();

			float combinatorio = 0;

			if (n > 0 && k > 0) {
				combinatorio = nFact / (kFact * restaFact);
			}

			return combinatorio;			
		}
		else return -1;
		
	}
}
