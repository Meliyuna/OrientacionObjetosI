package modelo;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Funciones {

	@Override
	public String toString() {
		return "Fechas [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

	// GETTERS
	public static int traerAnio(GregorianCalendar f) {
		return f.get(Calendar.YEAR);
	}

	public static int traerMes(GregorianCalendar m) {
		return m.get(Calendar.MONTH);
	}

	public static int traerDia(GregorianCalendar d) {
		return d.get(Calendar.DAY_OF_MONTH);
	}

	// ------------------------------------

	// BISIESTO
	public static boolean esBisiesto(int anio) {
		int p = anio % 4;
		int q = anio % 100;
		int r = anio % 400;

		if ((p == 0) && (q != 0 || r == 0))
			return true;
		else
			return false;
	}

	// FECHA VALIDA
	public static boolean esFechaValida(int anio, int mes, int dia) {
		boolean valido = false;
		if ((mes >= 1 && mes <= 12) && (dia >= 1 && dia <= 31)) {
			// Si es año bisiesto
			if (mes == 2) {
				if (Funciones.esBisiesto(anio) && dia <= 29) {
					valido = true;
				} else if (dia <= 28)
					valido = true;
			}
			// Para las demas fechas
			else {
				// Meses de 30 dias
				if ((mes == 4 || mes == 6 || mes == 9 || mes == 11)) {
					if (dia <= 30)
						valido = true;
				} else
					valido = true;
			}
		}

		return valido;
	}

	// FECHA
	public static GregorianCalendar traerFecha(int anio, int mes, int dia) {

		GregorianCalendar fecha = null;

		if (esFechaValida(anio, mes, dia))
			fecha = new GregorianCalendar(anio, mes - 1, dia);
		return fecha;
	}
	
	
	// FECHA (STRING)
	public static GregorianCalendar traerFecha(String fecha) {

		GregorianCalendar fecha1 = null;
		int anio, mes, dia;

		dia = Integer.parseInt(fecha.substring(0, 2));

		mes = Integer.parseInt(fecha.substring(3, 5));

		anio = Integer.parseInt(fecha.substring(6, 10));

		if (esFechaValida(anio, mes, dia))
			fecha1 = new GregorianCalendar(anio, mes - 1, dia);

		return fecha1;

	}
	
	//FECHA CORTA Y HORA EN FORMATO GREGORIAN CALENDAR
	public static GregorianCalendar traerFechaHora (String fecha, String hora){
		
		GregorianCalendar fecha1 = new GregorianCalendar();
		int anio, mes, dia, horas, minutos, segundos;
		
		dia = Integer.parseInt(fecha.substring(0, 2));

		mes = Integer.parseInt(fecha.substring(3, 5));

		anio = Integer.parseInt(fecha.substring(6, 10));

		horas = Integer.parseInt(hora.substring(0, 2));
		minutos = Integer.parseInt(hora.substring(3, 5));
		segundos = Integer.parseInt(hora.substring(6, 8));
		
		fecha1.set(anio, mes, dia, horas, minutos, segundos);
		
		return fecha1;	
		
	}


	// FECHA CORTA
	public static String traerFechaCorta(GregorianCalendar fecha) {

		String fecha1, dia, mes, anio;

		dia = String.valueOf(traerDia(fecha));

		mes = String.valueOf(traerMes(fecha) + 1);

		anio = String.valueOf(traerAnio(fecha));

		fecha1 = dia + "/" + mes + "/" + anio;

		return fecha1;
	}

	// FECHA CORTA Y HORA
	public static String traerFechaCortaHora(GregorianCalendar fecha) {

		String fechahora;
		String horas, min, seg;

		horas = String.valueOf(fecha.get(Calendar.HOUR_OF_DAY));
		min = String.valueOf(fecha.get(Calendar.MINUTE));
		seg = String.valueOf(fecha.get(Calendar.SECOND));

		fechahora = traerFechaCorta(fecha) + "-" + horas + ":" + min + ":" + seg;

		return fechahora;

	}

	// FECHA PROXIMO
	public static GregorianCalendar traerFechaProximo(GregorianCalendar fecha, int cantDias) {
		GregorianCalendar fecha2 = null;

		int anio = traerAnio(fecha);
		int mes = traerMes(fecha);
		int dia = traerDia(fecha);

		fecha2 = new GregorianCalendar(anio, mes, dia + cantDias);

		return fecha2;
	}

	// DIA HABIL
	public static boolean esDiaHabil(GregorianCalendar fecha) {

		String dia;

		dia = traerDiaDeLaSemana(fecha);

		if (dia == "Lunes" || dia == "Martes" || dia == "Miercoles" || dia == "Jueves" || dia == "Viernes")
			return true;
		else
			return false;
	}

	// DIA DE LA SEMANA
	public static String traerDiaDeLaSemana(GregorianCalendar fecha) {
		int diaI;
		String diaS;

		diaI = fecha.get(Calendar.DAY_OF_WEEK);

		switch (diaI) {
		case 1:
			diaS = "Domingo";
			break;
		case 2:
			diaS = "Lunes";
			break;
		case 3:
			diaS = "Martes";
			break;
		case 4:
			diaS = "Miercoles";
			break;
		case 5:
			diaS = "Jueves";
			break;
		case 6:
			diaS = "Viernes";
			break;
		case 7:
			diaS = "Sabado";
			break;
		default:
			diaS = "Error";
			break;
		}

		return diaS;
	}

	// MES EN LETRAS
	public static String traerMesEnLetras(GregorianCalendar fecha) {
		String mes;

		String[] meses = { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre",
				"Octubre", "Noviembre", "Diciembre" };

		mes = meses[traerMes(fecha)];

		return mes;
	}

	// FECHA LARGA
	public static String traerFechaLarga(GregorianCalendar fecha) {
		String fechaLarga, diaSemana, dia, mes, anio;

		diaSemana = traerDiaDeLaSemana(fecha);

		dia = String.valueOf(traerDia(fecha));

		mes = traerMesEnLetras(fecha);

		anio = String.valueOf(traerAnio(fecha));

		fechaLarga = diaSemana + " " + dia + " de " + mes + " de " + anio;

		return fechaLarga;
	}

	// IGUALDAD FECHAS
	public static boolean sonFechasIguales(GregorianCalendar fecha, GregorianCalendar fecha1) {

		String fecha2, fecha3;

		fecha2 = traerFechaCorta(fecha);
		fecha3 = traerFechaCorta(fecha1);

		if (fecha2.equals(fecha3)) {
			return true;
		} else
			return false;
	}

	// IGUALDAD FECHAS Y HORA
	public static boolean sonFechasHorasIguales(GregorianCalendar fecha, GregorianCalendar fecha1) {

		String fechaHora1, fechaHora2;

		fechaHora1 = traerFechaCortaHora(fecha);

		fechaHora2 = traerFechaCortaHora(fecha1);

		if (fechaHora1 == fechaHora2)
			return true;
		else
			return false;

	}

	// CANTIDAD DE DIAS DEL MES
	public static int traerCantDiasDeUnMes(int anio, int mes) {

		if (esBisiesto(anio) && mes == 2)
			return 29;
		else if (mes == 4 || mes == 6 || mes == 9 || mes == 11)
			return 30;
		else if (mes != 2)
			return 31;
		else
			return 28;
	}

	// APROXIMAR DECIMAL
	public static double aproximar2Decimal(double valor) {

		return Math.rint(valor * 100 + 0.001) / 100;

	}

	// ES NUMERO
	public static boolean esNumero(char c) {
		return Character.isDigit(c);
	}

	// ES CARACTER
	public static boolean esCaracter(char c) {
		return (!esNumero(c));
	}

	// ES STRING
	public static boolean esCadenaNumeros(String cadena) {

		boolean flag = true;

		for (int i = 0; i < cadena.length() && flag; i++) {

			if (!esNumero(cadena.charAt(i)))
				flag = false;
		}

		return flag;
	}

	// ES BOOLEAN
	public static boolean esCadenaLetras(String cadena) {
		boolean flag = true;

		for (int i = 0; i < cadena.length() && flag; i++) {

			if (!esCaracter(cadena.charAt(i)))
				flag = false;
		}

		return flag;
	}

	// ------------------------------------

	// AGREGADOS
	public static double convertirADouble(int n) {
		return ((double) n);
	}

}