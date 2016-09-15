package modelo;

public class ArregloMulti {
	
	private double[][] matriz;

	//Constructor
	public ArregloMulti(double[][] matriz) {
		this.matriz = matriz;
	}

	//Getters y Setters	

	public double[][] getMatriz() {
		return matriz;
	}

	public void setMatriz(double[][] matriz) {
		this.matriz = matriz;
	}
	
	
	//Sumar y Restar
	public double [][] sumar(double [][] matrizB){
		double [][] matrizA = this.matriz;
		double [][] matrizC = this.matriz;
		int i, j, filas, columnas;	
		
		
		filas = matrizA.length;
		columnas = matrizA[0].length;
		
		for (i=0; i<filas; i++){
			for (j=0; j<columnas; j++){
					matrizC[i][j] += (double)matrizB[i][j];
			}
		}				
		return matrizC;
	}
}
