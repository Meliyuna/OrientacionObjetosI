package test;

import modelo.Conductor;
import modelo.Funciones;
import modelo.Posicion;
import modelo.Recorrido;
import modelo.Vehiculo;

//import java.util.Date;
import java.util.GregorianCalendar;

public class Test2 {

	public static void main(String[] args) {
		
		/**********************************************************************/
		System.out.println("--->Crear Vehiculo con Dominio Incorrecto (DEFG456) :");
		
		Vehiculo coche = new Vehiculo (1, "DEFG456");
		/**********************************************************************/
		
		System.out.println("--->Crear Vehiculo con los siguientes datos y recorridos: ");
		
		Vehiculo coche1 = new Vehiculo (1, "ABC123");
		Conductor chofer = new Conductor (1,"Otto Mann", "20111111112");
		Recorrido rec1 = new Recorrido (1, "Buenos Aires - Mar del Plata", chofer);

		GregorianCalendar fecha = new GregorianCalendar();
		String fecha1, hora;
		
		  fecha1 ="17/10/2016";		
		  hora = "06:00:00";
		  fecha = Funciones.traerFechaHora(fecha1, hora);		  
		  Posicion pos1 = new Posicion (1, -0.603736, -1.0188273, 200, fecha);
		  rec1.agregarPosicion(pos1);

		  hora = "06:30:00";
		  fecha = Funciones.traerFechaHora(fecha1, hora);
		  Posicion pos2 = new Posicion (2, -0.6070134, -1.0150271, 189, fecha);
		  rec1.agregarPosicion(pos2);

		  hora = "07:00:00";
		  fecha = Funciones.traerFechaHora(fecha1, hora);
		  Posicion pos3 = new Posicion (3, -0.6126519, -1.0134622, 179, fecha);
		  rec1.agregarPosicion(pos3);

		  hora = "07:30:00";
		  fecha = Funciones.traerFechaHora(fecha1, hora);
		  Posicion pos4 = new Posicion (4, -0.6213211, -1.0118181, 168, fecha);
		  rec1.agregarPosicion(pos4);

		  hora = "08:01:00";
		  fecha = Funciones.traerFechaHora(fecha1, hora);
		  Posicion pos5 = new Posicion (5, -0.6286569, -1.0094455, 158, fecha);
		  rec1.agregarPosicion(pos5);

		  hora = "08:31:00";
		  fecha = Funciones.traerFechaHora(fecha1, hora);
		  Posicion pos6 = new Posicion (6, -0.6363466, -1.0074885, 147, fecha);
		  rec1.agregarPosicion(pos6);

		  hora = "09:02:00";
		  fecha = Funciones.traerFechaHora(fecha1, hora);
		  Posicion pos7 = new Posicion (7, -0.6418797, -1.0089175, 136, fecha);	 
		  rec1.agregarPosicion(pos7);
		  
		  hora = "09:32:00";
		  fecha = Funciones.traerFechaHora(fecha1, hora);
		  Posicion pos8 = new Posicion (8, -0.6503709, -1.0084852, 126, fecha);
		  rec1.agregarPosicion(pos8);
		  
		  hora = "10:02:00";
		  fecha = Funciones.traerFechaHora(fecha1, hora);
		  Posicion pos9 = new Posicion (9, -0.6588569, -1.0060852, 115, fecha);
		  rec1.agregarPosicion(pos9);
		  
		  hora = "10:32:00";
		  fecha = Funciones.traerFechaHora(fecha1, hora);
		  Posicion pos10 = new Posicion (10, -0.6633202, -1.0043055, 104, fecha);
		  rec1.agregarPosicion(pos10);
		  
		System.out.println("Vehiculo [idVechiculo="+coche1.getIdVehiculo()+", patente="+coche1.getDominio()+", recorridos=[");
		System.out.println("Recorrido [idRecorrido="+rec1.getIdRecorrido()+", designacion="+rec1.getDesignacion()+",");
		System.out.println("conductor=[idConductor="+chofer.getIdConductor()+", nombre="+chofer.getNombre()+", CUIL="+chofer.getCuil()+"],");
		System.out.println("posiciones: [");
		  System.out.println("["+Funciones.traerFechaCortaHora(pos1.getFechaHora())+", lat="+pos1.getLatitud()+", long="+pos1.getLongitud()+", comb="+pos1.getEstadoCombustible()+"],");
		  System.out.println("["+Funciones.traerFechaCortaHora(pos2.getFechaHora())+", lat="+pos2.getLatitud()+", long="+pos2.getLongitud()+", comb="+pos2.getEstadoCombustible()+"],");
		  System.out.println("["+Funciones.traerFechaCortaHora(pos3.getFechaHora())+", lat="+pos3.getLatitud()+", long="+pos3.getLongitud()+", comb="+pos3.getEstadoCombustible()+"],");
		  System.out.println("["+Funciones.traerFechaCortaHora(pos4.getFechaHora())+", lat="+pos4.getLatitud()+", long="+pos4.getLongitud()+", comb="+pos4.getEstadoCombustible()+"],");
		  System.out.println("["+Funciones.traerFechaCortaHora(pos5.getFechaHora())+", lat="+pos5.getLatitud()+", long="+pos5.getLongitud()+", comb="+pos5.getEstadoCombustible()+"],");
		  System.out.println("["+Funciones.traerFechaCortaHora(pos6.getFechaHora())+", lat="+pos6.getLatitud()+", long="+pos6.getLongitud()+", comb="+pos6.getEstadoCombustible()+"],");
		  System.out.println("["+Funciones.traerFechaCortaHora(pos7.getFechaHora())+", lat="+pos7.getLatitud()+", long="+pos7.getLongitud()+", comb="+pos7.getEstadoCombustible()+"],");
		  System.out.println("["+Funciones.traerFechaCortaHora(pos8.getFechaHora())+", lat="+pos8.getLatitud()+", long="+pos8.getLongitud()+", comb="+pos8.getEstadoCombustible()+"],");
		  System.out.println("["+Funciones.traerFechaCortaHora(pos8.getFechaHora())+", lat="+pos9.getLatitud()+", long="+pos9.getLongitud()+", comb="+pos9.getEstadoCombustible()+"],");
		  System.out.println("["+Funciones.traerFechaCortaHora(pos8.getFechaHora())+", lat="+pos10.getLatitud()+", long="+pos10.getLongitud()+", comb="+pos10.getEstadoCombustible()+"],");
		  
		  
		  Conductor chofer2 = new Conductor (2,"Jose Moyano", "20222222223");
			Recorrido rec2 = new Recorrido (2, "Mar del Plata - Bahia Blanca", chofer);
			
			  fecha1 ="17/10/2016";		
			  hora = "12:00:00";
			  fecha = Funciones.traerFechaHora(fecha1, hora);		  
			  pos1.setFechaHora(fecha);
			  try{
				  pos1.setLatitud(0.6633202);			  
			  } catch (Exception e) {System.out.println(e.getMessage());}
			  try{
				  pos1.setLongitud(-1.0043055); 
			  }catch (Exception e) {System.out.println(e.getMessage());}
			  pos1.setEstadoCombustible(200);
			  rec2.agregarPosicion(pos1);

			  hora = "12:34:00";
			  fecha = Funciones.traerFechaHora(fecha1, hora);
			  pos2.setFechaHora(fecha);
			  try{
				  pos2.setLatitud(0.6644374);
			  }catch (Exception e) {System.out.println(e.getMessage());}
			  try{
				  pos2.setLongitud(-1.0094511); 
			  }catch (Exception e) {System.out.println(e.getMessage());}
			  pos2.setEstadoCombustible(187);
			  rec2.agregarPosicion(pos2);

			  hora = "13:08:00";
			  fecha = Funciones.traerFechaHora(fecha1, hora);
			  pos3.setFechaHora(fecha);
			  try{
				  pos3.setLatitud(0.6683623);
			  }catch (Exception e) {System.out.println(e.getMessage());}
			  try{
				  pos3.setLongitud(-1.0163935);
			  }catch (Exception e) {System.out.println(e.getMessage());}
			  pos3.setEstadoCombustible(175);
			  rec2.agregarPosicion(pos3);

			  hora = "13:43:00";
			  fecha = Funciones.traerFechaHora(fecha1, hora);
			  pos4.setFechaHora(fecha);
			  try{
				  pos4.setLatitud(0.672173);
			  }catch (Exception e) {System.out.println(e.getMessage());}
			  try{
				  pos4.setLongitud(-1.0286214);
			  }catch (Exception e) {System.out.println(e.getMessage());}
			  pos4.setEstadoCombustible(163);
			  rec2.agregarPosicion(pos4);

			  hora = "14:17:00";
			  fecha = Funciones.traerFechaHora(fecha1, hora);
			  pos5.setFechaHora(fecha);
			  try{
				  pos5.setLatitud(0.6715007);
			  }catch (Exception e) {System.out.println(e.getMessage());}
			  try{
				  pos5.setLongitud(-1.0458508);
			  }catch (Exception e) {System.out.println(e.getMessage());}
			  pos5.setEstadoCombustible(151);
			  rec2.agregarPosicion(pos5);

			  hora = "14:52:00";
			  fecha = Funciones.traerFechaHora(fecha1, hora);
			  pos6.setFechaHora(fecha);
			  try{
				  pos6.setLatitud(0.670611); 
			  }catch (Exception e) {System.out.println(e.getMessage());}
			  try{
				  pos6.setLongitud(-1.0535433); 
			  }catch (Exception e) {System.out.println(e.getMessage());}
			  pos6.setEstadoCombustible(139);
			  rec2.agregarPosicion(pos6);
			  

			  hora = "15:26:00";
			  fecha = Funciones.traerFechaHora(fecha1, hora);
			  pos7.setFechaHora(fecha);
			  try{
				  pos7.setLatitud(0.6738939); 
			  }catch (Exception e) {System.out.println(e.getMessage());}
			  try{
				  pos7.setLongitud(-1.0603622); 
			  }catch (Exception e) {System.out.println(e.getMessage());}
			  pos7.setEstadoCombustible(127);
			  rec2.agregarPosicion(pos7);	 
			  
			  hora = "16:01:00";
			  fecha = Funciones.traerFechaHora(fecha1, hora);
			  pos8.setFechaHora(fecha);
			  try{
				  pos8.setLatitud(0.6758606); 
			  }catch (Exception e) {System.out.println(e.getMessage());}
			  try{
				  pos8.setLongitud(-1.0688963); 
			  }catch (Exception e) {System.out.println(e.getMessage());}
			  pos8.setEstadoCombustible(115);
			  rec2.agregarPosicion(pos8);
			  
			  hora = "16:35:00";
			  fecha = Funciones.traerFechaHora(fecha1, hora);
			  pos9.setFechaHora(fecha);
			  try{
				  pos9.setLatitud(0.6767912); 
			  }catch (Exception e) {System.out.println(e.getMessage());}
			  try{
				  pos9.setLongitud(-1.0800961); 
			  }catch (Exception e) {System.out.println(e.getMessage());}
			  pos9.setEstadoCombustible(103);
			  rec2.agregarPosicion(pos9);
			
			  hora = "17:09:00";
			  fecha = Funciones.traerFechaHora(fecha1, hora);
			  pos10.setFechaHora(fecha);
			  try{
				  pos10.setLatitud(0.6757621); 
			  }catch (Exception e) {System.out.println(e.getMessage());}
			  try{
				  pos10.setLongitud(-1.0867528); 
			  }catch (Exception e) {System.out.println(e.getMessage());}
			  pos10.setEstadoCombustible(91);
			  rec2.agregarPosicion(pos10);
			  
			System.out.println("Vehiculo [idVechiculo="+coche1.getIdVehiculo()+", patente="+coche1.getDominio()+", recorridos=[");
			System.out.println("Recorrido [idRecorrido="+rec2.getIdRecorrido()+", designacion="+rec2.getDesignacion()+",");
			System.out.println("conductor=[idConductor="+chofer2.getIdConductor()+", nombre="+chofer2.getNombre()+", CUIL="+chofer2.getCuil()+"],");
			System.out.println("posiciones: [");
				  System.out.println("["+Funciones.traerFechaCortaHora(pos1.getFechaHora())+", lat="+pos1.getLatitud()+", long="+pos1.getLongitud()+", comb="+pos1.getEstadoCombustible()+"],");
				  System.out.println("["+Funciones.traerFechaCortaHora(pos2.getFechaHora())+", lat="+pos2.getLatitud()+", long="+pos2.getLongitud()+", comb="+pos2.getEstadoCombustible()+"],");
				  System.out.println("["+Funciones.traerFechaCortaHora(pos3.getFechaHora())+", lat="+pos3.getLatitud()+", long="+pos3.getLongitud()+", comb="+pos3.getEstadoCombustible()+"],");
				  System.out.println("["+Funciones.traerFechaCortaHora(pos4.getFechaHora())+", lat="+pos4.getLatitud()+", long="+pos4.getLongitud()+", comb="+pos4.getEstadoCombustible()+"],");
				  System.out.println("["+Funciones.traerFechaCortaHora(pos5.getFechaHora())+", lat="+pos5.getLatitud()+", long="+pos5.getLongitud()+", comb="+pos5.getEstadoCombustible()+"],");
				  System.out.println("["+Funciones.traerFechaCortaHora(pos6.getFechaHora())+", lat="+pos6.getLatitud()+", long="+pos6.getLongitud()+", comb="+pos6.getEstadoCombustible()+"],");
				  System.out.println("["+Funciones.traerFechaCortaHora(pos7.getFechaHora())+", lat="+pos7.getLatitud()+", long="+pos7.getLongitud()+", comb="+pos7.getEstadoCombustible()+"],");
				  System.out.println("["+Funciones.traerFechaCortaHora(pos8.getFechaHora())+", lat="+pos8.getLatitud()+", long="+pos8.getLongitud()+", comb="+pos8.getEstadoCombustible()+"],");
				  System.out.println("["+Funciones.traerFechaCortaHora(pos8.getFechaHora())+", lat="+pos9.getLatitud()+", long="+pos9.getLongitud()+", comb="+pos9.getEstadoCombustible()+"],");
				  System.out.println("["+Funciones.traerFechaCortaHora(pos8.getFechaHora())+", lat="+pos10.getLatitud()+", long="+pos10.getLongitud()+", comb="+pos10.getEstadoCombustible()+"],");
				  
		  	
			Recorrido rec3 = new Recorrido (3, "Bahia Blanca - Buenos Aires", chofer);
			
			  fecha1 ="17/10/2016";		
			  hora = "20:00:00";
			  fecha = Funciones.traerFechaHora(fecha1, hora);		  
			  pos1.setFechaHora(fecha);
			  try{
				  pos1.setLatitud(0.6633202);			  
			  } catch (Exception e) {System.out.println(e.getMessage());}
			  try{
				  pos1.setLongitud(-1.0043055); 
			  }catch (Exception e) {System.out.println(e.getMessage());}
			  pos1.setEstadoCombustible(200);
			  rec2.agregarPosicion(pos1);

			  hora = "20:47:00";
			  fecha = Funciones.traerFechaHora(fecha1, hora);
			  pos2.setFechaHora(fecha);
			  try{
				  pos2.setLatitud(0.6644374);
			  }catch (Exception e) {System.out.println(e.getMessage());}
			  try{
				  pos2.setLongitud(-1.0094511); 
			  }catch (Exception e) {System.out.println(e.getMessage());}
			  pos2.setEstadoCombustible(183);
			  rec2.agregarPosicion(pos2);

			  hora = "21:34:00";
			  fecha = Funciones.traerFechaHora(fecha1, hora);
			  pos3.setFechaHora(fecha);
			  try{
				  pos3.setLatitud(0.6683623);
			  }catch (Exception e) {System.out.println(e.getMessage());}
			  try{
				  pos3.setLongitud(-1.0163935);
			  }catch (Exception e) {System.out.println(e.getMessage());}
			  pos3.setEstadoCombustible(167);
			  rec2.agregarPosicion(pos3);

			  hora = "22:21:00";
			  fecha = Funciones.traerFechaHora(fecha1, hora);
			  pos4.setFechaHora(fecha);
			  try{
				  pos4.setLatitud(0.672173);
			  }catch (Exception e) {System.out.println(e.getMessage());}
			  try{
				  pos4.setLongitud(-1.0286214);
			  }catch (Exception e) {System.out.println(e.getMessage());}
			  pos4.setEstadoCombustible(150);
			  rec2.agregarPosicion(pos4);

			  hora = "23:08:00";
			  fecha = Funciones.traerFechaHora(fecha1, hora);
			  pos5.setFechaHora(fecha);
			  try{
				  pos5.setLatitud(0.6715007);
			  }catch (Exception e) {System.out.println(e.getMessage());}
			  try{
				  pos5.setLongitud(-1.0458508);
			  }catch (Exception e) {System.out.println(e.getMessage());}
			  pos5.setEstadoCombustible(134);
			  rec2.agregarPosicion(pos5);

			  hora = "23:55:00";
			  fecha = Funciones.traerFechaHora(fecha1, hora);
			  pos6.setFechaHora(fecha);
			  try{
				  pos6.setLatitud(0.670611); 
			  }catch (Exception e) {System.out.println(e.getMessage());}
			  try{
				  pos6.setLongitud(-1.0535433); 
			  }catch (Exception e) {System.out.println(e.getMessage());}
			  pos6.setEstadoCombustible(117);
			  rec2.agregarPosicion(pos6);
			  
			  fecha1 = "18/10/2016";
			  hora = "00:43:00";
			  fecha = Funciones.traerFechaHora(fecha1, hora);
			  pos7.setFechaHora(fecha);
			  try{
				  pos7.setLatitud(0.6738939); 
			  }catch (Exception e) {System.out.println(e.getMessage());}
			  try{
				  pos7.setLongitud(-1.0603622); 
			  }catch (Exception e) {System.out.println(e.getMessage());}
			  pos7.setEstadoCombustible(101);
			  rec2.agregarPosicion(pos7);	 
			  
			  hora = "01:30:00";
			  fecha = Funciones.traerFechaHora(fecha1, hora);
			  pos8.setFechaHora(fecha);
			  try{
				  pos8.setLatitud(0.6758606); 
			  }catch (Exception e) {System.out.println(e.getMessage());}
			  try{
				  pos8.setLongitud(-1.0688963); 
			  }catch (Exception e) {System.out.println(e.getMessage());}
			  pos8.setEstadoCombustible(84);
			  rec2.agregarPosicion(pos8);
			  
			  hora = "02:17:00";
			  fecha = Funciones.traerFechaHora(fecha1, hora);
			  pos9.setFechaHora(fecha);
			  try{
				  pos9.setLatitud(0.6767912); 
			  }catch (Exception e) {System.out.println(e.getMessage());}
			  try{
				  pos9.setLongitud(-1.0800961); 
			  }catch (Exception e) {System.out.println(e.getMessage());}
			  pos9.setEstadoCombustible(68);
			  rec2.agregarPosicion(pos9);
			
			  hora = "03:04:00";
			  fecha = Funciones.traerFechaHora(fecha1, hora);
			  pos10.setFechaHora(fecha);
			  try{
				  pos10.setLatitud(0.6757621); 
			  }catch (Exception e) {System.out.println(e.getMessage());}
			  try{
				  pos10.setLongitud(-1.0867528); 
			  }catch (Exception e) {System.out.println(e.getMessage());}
			  pos10.setEstadoCombustible(51);
			  rec2.agregarPosicion(pos10);
			  
			System.out.println("Vehiculo [idVechiculo="+coche1.getIdVehiculo()+", patente="+coche1.getDominio()+", recorridos=[");
			System.out.println("Recorrido [idRecorrido="+rec2.getIdRecorrido()+", designacion="+rec2.getDesignacion()+",");
			System.out.println("conductor=[idConductor="+chofer2.getIdConductor()+", nombre="+chofer2.getNombre()+", CUIL="+chofer2.getCuil()+"],");
			System.out.println("posiciones: [");
				  System.out.println("["+Funciones.traerFechaCortaHora(pos1.getFechaHora())+", lat="+pos1.getLatitud()+", long="+pos1.getLongitud()+", comb="+pos1.getEstadoCombustible()+"],");
				  System.out.println("["+Funciones.traerFechaCortaHora(pos2.getFechaHora())+", lat="+pos2.getLatitud()+", long="+pos2.getLongitud()+", comb="+pos2.getEstadoCombustible()+"],");
				  System.out.println("["+Funciones.traerFechaCortaHora(pos3.getFechaHora())+", lat="+pos3.getLatitud()+", long="+pos3.getLongitud()+", comb="+pos3.getEstadoCombustible()+"],");
				  System.out.println("["+Funciones.traerFechaCortaHora(pos4.getFechaHora())+", lat="+pos4.getLatitud()+", long="+pos4.getLongitud()+", comb="+pos4.getEstadoCombustible()+"],");
				  System.out.println("["+Funciones.traerFechaCortaHora(pos5.getFechaHora())+", lat="+pos5.getLatitud()+", long="+pos5.getLongitud()+", comb="+pos5.getEstadoCombustible()+"],");
				  System.out.println("["+Funciones.traerFechaCortaHora(pos6.getFechaHora())+", lat="+pos6.getLatitud()+", long="+pos6.getLongitud()+", comb="+pos6.getEstadoCombustible()+"],");
				  System.out.println("["+Funciones.traerFechaCortaHora(pos7.getFechaHora())+", lat="+pos7.getLatitud()+", long="+pos7.getLongitud()+", comb="+pos7.getEstadoCombustible()+"],");
				  System.out.println("["+Funciones.traerFechaCortaHora(pos8.getFechaHora())+", lat="+pos8.getLatitud()+", long="+pos8.getLongitud()+", comb="+pos8.getEstadoCombustible()+"],");
				  System.out.println("["+Funciones.traerFechaCortaHora(pos8.getFechaHora())+", lat="+pos9.getLatitud()+", long="+pos9.getLongitud()+", comb="+pos9.getEstadoCombustible()+"],");
				  System.out.println("["+Funciones.traerFechaCortaHora(pos8.getFechaHora())+", lat="+pos10.getLatitud()+", long="+pos10.getLongitud()+", comb="+pos10.getEstadoCombustible()+"],");
					
				  
			
		/*********************************************************************************************************************************************************************************/
		
		  
	}
}