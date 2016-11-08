package test;

import java.util.GregorianCalendar;

import modelo.Funciones;

public class TestFunciones {

	public static void main(String[] args) {
		
		GregorianCalendar fecha = new GregorianCalendar ();
		GregorianCalendar fecha1 = new GregorianCalendar ();
		
		/* Calculo de año bisiesto */
		int anio = 2100;
		System.out.println("Es Bisiesto: "+Funciones.esBisiesto(anio));
		
		/* Mostrar Fecha Actual */
		System.out.println(Funciones.traerAnio(fecha));
		System.out.println(Funciones.traerMes(fecha));
		System.out.println(Funciones.traerDia(fecha));
				
		
		/* Verificar fecha ingresada */
		System.out.println("Es fecha valida: "+Funciones.esFechaValida(2015, 4, 28));
		
		/* Traer Fecha */		
		System.out.println(Funciones.traerFecha(2016, 8, 30));
		
		/* Traer Fecha ingresando String */
		String fechaS = "10/04/2010";
		System.out.println(Funciones.traerFecha(fechaS));
		
		/* Traer Fecha Corta en formato String */
		System.out.println(Funciones.traerFechaCorta(fecha));
		
		/* Traer Fecha Corta y Hora en formato String */
		System.out.println(Funciones.traerFechaCortaHora(fecha));
		
		/* Traer Fecha Proximo */
		int cantdias = 10;
		System.out.println(Funciones.traerFechaProximo(fecha, cantdias));
		
		/* Ver si es dia habil */
		System.out.print("Es dia habil: ");
		System.out.println(Funciones.esDiaHabil(fecha));
		
		/* Traer dia de la semana en formato String */
		System.out.println(Funciones.traerDiaDeLaSemana(fecha));
		
		/* Traer mes en letras */
		System.out.println(Funciones.traerMesEnLetras(fecha));
		
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
		
		/* Cargar fecha y hora en GregorianCalendar */
		String fech, hora;
		fech = "18/10/2016";
		hora = "17:40:05";
		
		System.out.println("Traer calendario gregoriano con fecha y hora seteados");
		System.out.print(Funciones.traerFechaHora(fech, hora));
		
		
	
	}
}