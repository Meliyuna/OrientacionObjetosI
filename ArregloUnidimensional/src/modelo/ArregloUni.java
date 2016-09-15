package modelo;

public class ArregloUni {
	private int[] vector;

	// Constructor
	public ArregloUni(int[] vector) {
		this.vector = vector;
	}

	// Getters y Setters
	public int[] getVector() {
		return vector;
	}

	public void setVector(int[] vector) {
		this.vector = vector;
	}

	// Traer el Menor y el Mayor
	public int traerElMenor() {
		int largo = this.vector.length;
		int num = this.vector[0];

		for (int i = 0; i < largo; i++) {
			if (this.vector[i] < num)
				num = this.vector[i];
		}
		return num;
	}

	public int traerElMayor() {
		int largo = this.vector.length;
		int num = this.vector[0];

		for (int i = 0; i < largo; i++) {
			if (this.vector[i] > num)
				num = this.vector[i];
		}
		return num;
	}

	public double calcularPromedio() {
		int largo = this.vector.length;
		int i, suma = 0;

		for (i = 0; i < largo; i++) {
			suma = suma + this.vector[i];
		}
		return suma / largo;
	}
	
	//Ordenar Ascendente y Descendente
	public int[] ordenarAscendente() {
		int[] vector = this.vector;
		boolean ordenado;
		int largo = this.vector.length;
		int i, j, aux;
		ordenado = false;
		i = 0;
		j = 0;

		while ((i < largo-1) && (ordenado==false)) {
			ordenado = true;
			for (j = 0; j < largo - i; j++) {
				if (vector[j] > vector[j + 1]) {
					ordenado = false;
					aux = vector[j];
					vector[j] = vector[j + 1];
					vector[j + 1] = aux;
				}
			}
			i++;
		}

		return vector;
	}

	public int[] ordenarDescendente() {
		int[] vector = this.vector;
		boolean ordenado;
		int largo = this.vector.length;
		int i, j, aux;
		ordenado = false;
		i = 0;
		j = 0;

		while (i < largo - 1 && !ordenado) {
			ordenado = true;
			for (j = 0; j < largo - i; j++) {
				if (vector[j] < vector[j + 1]) {
					ordenado = false;
					aux = vector[j];
					vector[j] = vector[j + 1];
					vector[j + 1] = aux;
				}
			}
		}

		return vector;
	}
	
	//Traer Frecuencia
	public double traerFrecuencia(int numero) {
		int largo = this.vector.length;
		int i, veces = 0;

		for (i = 0; i < largo; i++) {
			if (this.vector[i] == numero) {
				veces++;
			}
		}
		return (veces / largo);
	}
	
	//Traer Moda
	public int traerModa(){
		int i, j, moda=0;
		int largo = this.vector.length;
		double frecuencia1, frecuencia2;
		
		for (i=0; i<largo; i++){
			frecuencia1 = this.traerFrecuencia(this.vector[i]);
			for (j=0; j<largo; j++){
				frecuencia2 = this.traerFrecuencia(this.vector[j]);
				if (frecuencia2>frecuencia1){
					moda = this.vector[j];
				}
			}
		}
		return moda;
	}
}
