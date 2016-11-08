package test;

import modelo.Conductor;
import modelo.Funciones;
import modelo.Posicion;
import modelo.Recorrido;
//import modelo.Vehiculo;

//import java.util.Date;
import java.util.GregorianCalendar;

public class Test1 {

	
	
	public static void main(String[] args) {
		
		GregorianCalendar fecha = new GregorianCalendar();
		String fecha1, hora;
		Conductor chofer = new Conductor (1,"Otto Mann", "20111111112");
		
		  fecha1 ="17/10/2016";
		  
		  hora = "07:00:00";
		  fecha = Funciones.traerFechaHora(fecha1, hora);		  
		  Posicion pos1 = new Posicion (1, -0.603736, -1.0188273, 200, fecha);
		  

		  hora = "07:30:00";
		  fecha = Funciones.traerFechaHora(fecha1, hora);
		  Posicion pos2 = new Posicion (2, -0.6070134, -1.0150271, 189, fecha);
		  

		  hora = "08:00:00";
		  fecha = Funciones.traerFechaHora(fecha1, hora);
		  Posicion pos3 = new Posicion (3, -0.6126519, -1.0134622, 179, fecha);
		  

		  hora = "08:30:00";
		  fecha = Funciones.traerFechaHora(fecha1, hora);
		  Posicion pos4 = new Posicion (4, -0.6213211, -1.0118181, 168, fecha);
		  

		  hora = "09:00:00";
		  fecha = Funciones.traerFechaHora(fecha1, hora);
		  Posicion pos5 = new Posicion (5, -0.6286569, -1.0094455, 158, fecha);


		  hora = "09:30:00";
		  fecha = Funciones.traerFechaHora(fecha1, hora);
		  Posicion pos6 = new Posicion (6, -0.6363466, -1.0074885, 147, fecha);
		  

		  hora = "10:00:00";
		  fecha = Funciones.traerFechaHora(fecha1, hora);
		  Posicion pos7 = new Posicion (7, -0.6418797, -1.0089175, 136, fecha);	 
		  
		  hora = "10:30:00";
		  fecha = Funciones.traerFechaHora(fecha1, hora);
		  Posicion pos8 = new Posicion (8, -0.6503709, -1.0084852, 126, fecha);
		  
		  //Posicion[] arrayPosicion = {pos1, pos2, pos3, pos4, pos5, pos6, pos7, pos8};
		  Recorrido rec1 = new Recorrido (1, "Buenos Aires - Mar del Plata", chofer);
		  
		  //Vehiculo coche1 = new Vehiculo (1, "ABC123");
		  
		  
		  System.out.println ("Crear Posicion con latitud incorrecta:");
		  		  
			  Posicion pos10 = new Posicion (10, -1.9286569, -1.0094455, 158, fecha);
			  rec1.agregarPosicion(pos10);
		  
		  System.out.println ("Crear Posicion con longitud incorrecta:");
		  
			  Posicion pos11 = new Posicion (11, -0.6286569, -4.0094455, 158, fecha);
			  rec1.agregarPosicion(pos11);
	
		  System.out.println ("Crear Posicion con los siguientes datos y mostrarla");
		  
		  
		  fecha1 = "18/10/2016";
		  hora = "20:00:00";
		  fecha = Funciones.traerFechaHora(fecha1, hora);
		  Posicion pos12 = new Posicion (12, -0.2288569, -0.9094485, 200, fecha);
		  rec1.agregarPosicion(pos12);
		  
		  System.out.print (pos12.getIdPosicion());
		  System.out.print(" , ");
		  System.out.print(pos12.getLatitud());
		  System.out.print(" , ");
		  System.out.print (pos12.getLongitud());
		  System.out.print(" , ");
		  System.out.print(pos12.getEstadoCombustible());
		  System.out.print(" , ");
		  System.out.println(pos12.getFechaHora());
		  
		  
		  System.out.println ("Crear Otra Posicion con los siguientes datos y mostrarla");
		  fecha1 = "19/10/2016";
		  hora = "02:30:00";
		  fecha = Funciones.traerFechaHora(fecha1, hora);
		  Posicion pos13 = new Posicion (13, -0.2633202, -0.9043055, 90, fecha);
		  rec1.agregarPosicion(pos13);
		  
		  System.out.print (pos13.getIdPosicion());
		  System.out.print(" , ");
		  System.out.print(pos13.getLatitud());
		  System.out.print(" , ");
		  System.out.print (pos13.getLongitud());
		  System.out.print(" , ");
		  System.out.print(pos13.getEstadoCombustible());
		  System.out.print(" , ");
		  System.out.println(pos13.getFechaHora());
		  
		  
		  float distancia = pos13.distancia(pos12);
		  
		  System.out.println("La distancia recorrida es: "+distancia);
		  
		  System.out.println("Crear y mostrar Recorrido con los siguientes datos: ");
		  System.out.print("Recorrido [");
		  System.out.print("idRecorrido= "+rec1.getIdRecorrido());
		  System.out.print(" , ");
		  System.out.print("designacion= "+rec1.getDesignacion());
		  System.out.println(" , ");
		  System.out.print("Conductor= [idConductor= "+ chofer.getIdConductor());
		  System.out.print(" , ");
		  System.out.print("nombre= "+ chofer.getNombre());
		  System.out.print(" , ");
		  System.out.println("CUIL= "+chofer.getCuil()+"], ");
		  System.out.println("posiciones: [");
		  System.out.println("["+Funciones.traerFechaCortaHora(pos1.getFechaHora())+", lat="+pos1.getLatitud()+", long="+pos1.getLongitud()+", comb="+pos1.getEstadoCombustible()+"],");
		  System.out.println("["+Funciones.traerFechaCortaHora(pos2.getFechaHora())+", lat="+pos2.getLatitud()+", long="+pos2.getLongitud()+", comb="+pos2.getEstadoCombustible()+"],");
		  System.out.println("["+Funciones.traerFechaCortaHora(pos3.getFechaHora())+", lat="+pos3.getLatitud()+", long="+pos3.getLongitud()+", comb="+pos3.getEstadoCombustible()+"],");
		  System.out.println("["+Funciones.traerFechaCortaHora(pos4.getFechaHora())+", lat="+pos4.getLatitud()+", long="+pos4.getLongitud()+", comb="+pos4.getEstadoCombustible()+"],");
		  System.out.println("["+Funciones.traerFechaCortaHora(pos5.getFechaHora())+", lat="+pos5.getLatitud()+", long="+pos5.getLongitud()+", comb="+pos5.getEstadoCombustible()+"],");
		  System.out.println("["+Funciones.traerFechaCortaHora(pos6.getFechaHora())+", lat="+pos6.getLatitud()+", long="+pos6.getLongitud()+", comb="+pos6.getEstadoCombustible()+"],");
		  System.out.println("["+Funciones.traerFechaCortaHora(pos7.getFechaHora())+", lat="+pos7.getLatitud()+", long="+pos7.getLongitud()+", comb="+pos7.getEstadoCombustible()+"],");
		  System.out.println("["+Funciones.traerFechaCortaHora(pos8.getFechaHora())+", lat="+pos8.getLatitud()+", long="+pos8.getLongitud()+", comb="+pos8.getEstadoCombustible()+"],");
		  
	}

}
