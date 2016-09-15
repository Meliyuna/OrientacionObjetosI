package test;

import java.util.GregorianCalendar;

import modelo.Fechas;

public class TestFechas {

	public static void main(String[] args) {
		
		GregorianCalendar fecha = new GregorianCalendar ();
		GregorianCalendar fecha1 = new GregorianCalendar ();
		
		/* Mostrar Fecha Actual */
		System.out.println(Fechas.traerAnio(fecha));
		System.out.println(Fechas.traerMes(fecha));
		System.out.println(Fechas.traerDia(fecha));
		
		/* Calculo de año bisiesto */
		int anio = 2100;
		System.out.println("Es Bisiesto: "+Fechas.esBisiesto(anio));
		
		/* Verificar fecha ingresada */
		
		System.out.println("Es fecha valida: "+Fechas.esFechaValida(2015, 4, 28));
		
		/* Mostrar Fecha */		
		System.out.println(Fechas.traerFecha(2016, 8, 30));
		
		/* Traer Fecha en ingresando String */
		String fechaS = "10/04/2010";
		System.out.println(Fechas.traerFecha(fechaS));
		
		/* Traer Fecha Corta en formato String */
		System.out.println(Fechas.traerFechaCorta(fecha));
		
		/* Traer Fecha Corta mas Hora en formato String */
		System.out.println(Fechas.traerFechaCortaHora(fecha));
		
		/* Traer Fecha Proxima */
		int cantdias = 10;
		System.out.println(Fechas.traerFechaProximo(fecha, cantdias));
		
		/* Traer dia de la semana en formato String */
		System.out.println(Fechas.traerDiaDeLaSemana(fecha));
		
		/* Ver si es dia habil */
		System.out.print("Es dia habil: ");
		System.out.println(Fechas.esDiaHabil(fecha));
		
		/* Mostrar fecha larga */
		System.out.println(Fechas.traerFechaLarga(fecha));
		
		/* Ver si dos fechas son iguales */
		System.out.println(Fechas.traerFechaCorta(fecha));
		System.out.println(Fechas.traerFechaCorta(fecha1));
		System.out.print("Son fechas iguales: ");
		System.out.println(Fechas.sonFechasIguales(fecha, fecha1));
		
		/* Ver si dos fechas con hora son iguales */
		System.out.print("Son fechasHoras iguales: ");
		System.out.println(Fechas.sonFechasIguales(fecha, fecha1));
		
		/* Calcular cantidad de dias en el mes */
		int mes = 2;
		anio = 2016;
		System.out.print("Cantidad de dias del mes "+mes+": ");
		System.out.println(Fechas.traerCantDiasDeUnMes(anio, mes));
		
		/* Redondeo */
		double numero = 0.013;
		System.out.println("Redondeo de numero: ");
		System.out.println(Fechas.aproximar2Decimal(numero));
		
		/* Ver si es numero */
		char c = '1';
		System.out.print("El caracter "+c+" es numero: ");
		System.out.println(Fechas.esNumero(c));
		
		/* Ver si es caracter */
		c = 'A';
		System.out.print(c+" Es caracter: ");
		System.out.println(Fechas.esCaracter(c));
	
		/* Ver si es cadena de numeros */
		String str = "12B56";
		System.out.print("Es cadena de numeros: ");
		System.out.println(Fechas.esCadenaNumeros(str));
		
		/* Ver si es cadena de letras */
		str = "AAAA";
		System.out.print("Es cadena de letras: ");
		System.out.println(Fechas.esCadenaLetras(str));
		
	
	}
}
