package test;

import java.util.GregorianCalendar;

import modelo.Funciones;

public class TestFunciones {

	public static void main(String[] args) {
		
		GregorianCalendar fecha = new GregorianCalendar ();
		GregorianCalendar fecha1 = new GregorianCalendar ();
		
		/* Mostrar Fecha Actual */
		System.out.println(Funciones.traerAnio(fecha));
		System.out.println(Funciones.traerMes(fecha));
		System.out.println(Funciones.traerDia(fecha));
		
		/* Calculo de año bisiesto */
		int anio = 2100;
		System.out.println("Es Bisiesto: "+Funciones.esBisiesto(anio));
		
		/* Verificar fecha ingresada */
		
		System.out.println("Es fecha valida: "+Funciones.esFechaValida(2015, 4, 28));
		
		/* Mostrar Fecha */		
		System.out.println(Funciones.traerFecha(2016, 8, 30));
		
		/* Traer Fecha en ingresando String */
		String fechaS = "10/04/2010";
		System.out.println(Funciones.traerFecha(fechaS));
		
		/* Traer Fecha Corta en formato String */
		System.out.println(Funciones.traerFechaCorta(fecha));
		
		/* Traer Fecha Corta mas Hora en formato String */
		System.out.println(Funciones.traerFechaCortaHora(fecha));
		
		/* Traer Fecha Proxima */
		int cantdias = 10;
		System.out.println(Funciones.traerFechaProximo(fecha, cantdias));
		
		/* Traer dia de la semana en formato String */
		System.out.println(Funciones.traerDiaDeLaSemana(fecha));
		
		/* Ver si es dia habil */
		System.out.print("Es dia habil: ");
		System.out.println(Funciones.esDiaHabil(fecha));
		
		/* Mostrar fecha larga */
		System.out.println(Funciones.traerFechaLarga(fecha));
		
		/* Ver si dos fechas son iguales */
		System.out.println(Funciones.traerFechaCorta(fecha));
		System.out.println(Funciones.traerFechaCorta(fecha1));
		System.out.print("Son fechas iguales: ");
		System.out.println(Funciones.sonFechasIguales(fecha, fecha1));
		
		/* Ver si dos fechas con hora son iguales */
		System.out.print("Son fechasHoras iguales: ");
		System.out.println(Funciones.sonFechasIguales(fecha, fecha1));
		
		/* Calcular cantidad de dias en el mes */
		int mes = 2;
		anio = 2016;
		System.out.print("Cantidad de dias del mes "+mes+": ");
		System.out.println(Funciones.traerCantDiasDeUnMes(anio, mes));
		
		/* Redondeo */
		double numero = 0.013;
		System.out.println("Redondeo de numero: ");
		System.out.println(Funciones.aproximar2Decimal(numero));
		
		/* Ver si es numero */
		char c = '1';
		System.out.print("El caracter "+c+" es numero: ");
		System.out.println(Funciones.esNumero(c));
		
		/* Ver si es caracter */
		c = 'A';
		System.out.print(c+" Es caracter: ");
		System.out.println(Funciones.esCaracter(c));
	
		/* Ver si es cadena de numeros */
		String str = "12B56";
		System.out.print("Es cadena de numeros: ");
		System.out.println(Funciones.esCadenaNumeros(str));
		
		/* Ver si es cadena de letras */
		str = "AAAA";
		System.out.print("Es cadena de letras: ");
		System.out.println(Funciones.esCadenaLetras(str));
		
	
	}
}
