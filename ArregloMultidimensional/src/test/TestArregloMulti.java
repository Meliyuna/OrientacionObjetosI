package test;
import modelo.ArregloMulti;

public class TestArregloMulti {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double[][] array1 = new double[2][2];
		double[][] array2 = new double[2][2];
		
		ArregloMulti matriz = new ArregloMulti(array1);
		
		array1[0][0] = 1;
		array1[0][1] = 0;
		array1[1][0] = 2;
		array1[1][1] = 4;
		
		array2[0][0] = 2;
		array2[0][1] = 3;
		array2[1][0] = 3;
		array2[1][1] = 1;
		
		
		matriz.sumar(array2);
		
		int i, j, filas, columnas;
		
		filas = 2;
		columnas = 2;
		
		for(i=0; i<filas ; i++){
			for (j=0; j<columnas; j++){
				System.out.print(array1[i][j]+" ");
			}
			System.out.println();
		}
		
		

	}

}
