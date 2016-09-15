package test;
import modelo.ArregloUni;
public class TestArreglo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array1 = new int[4];
		
		array1[0] = 2;
		array1[1] = 5;
		array1[2] = 2;
		array1[3] = 1;		
		
		ArregloUni vector = new ArregloUni (array1);		
		
		System.out.println(vector.traerElMayor());		
		System.out.println(vector.calcularPromedio());
		System.out.println(vector.traerFrecuencia(2));
		//vector.ordenarAscendente();
	}

}
