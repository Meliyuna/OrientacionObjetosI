package modelo;
import java.util.GregorianCalendar;
import modelo.Contribuyentes;


public class Ceta {
	private int idCeta;
	private GregorianCalendar fecha;
	private Contribuyentes vendedor;
	private Contribuyentes comprador;
	private double valorDeTransferencia;
	private boolean firmaComprador;
	
	//Constructor
	public Ceta(int idCeta, GregorianCalendar fecha, Contribuyentes vendedor,
			Contribuyentes comprador, double valorDeTransferencia,
			boolean firmaComprador) {
		
		this.idCeta = idCeta;
		this.fecha = fecha;
		this.vendedor = vendedor;
		this.comprador = comprador;
		this.valorDeTransferencia = valorDeTransferencia;
		this.firmaComprador = firmaComprador;
	}
	
	//Getters y Setters
	public int getIdCeta() {
		return idCeta;
	}

	public void setIdCeta(int idCeta) {
		this.idCeta = idCeta;
	}

	public GregorianCalendar getFecha() {
		return fecha;
	}

	public void setFecha(GregorianCalendar fecha) {
		this.fecha = fecha;
	}

	public Contribuyentes getVendedor() {
		return vendedor;
	}

	public void setVendedor(Contribuyentes vendedor) {
		this.vendedor = vendedor;
	}

	public Contribuyentes getComprador() {
		return comprador;
	}

	public void setComprador(Contribuyentes comprador) {
		this.comprador = comprador;
	}

	public double getValorDeTransferencia() {
		return valorDeTransferencia;
	}

	public void setValorDeTransferencia(double valorDeTransferencia) {
		this.valorDeTransferencia = valorDeTransferencia;
	}

	public boolean isFirmaComprador() {
		return firmaComprador;
	}

	public void setFirmaComprador(boolean firmaComprador) {
		this.firmaComprador = firmaComprador;
	}
	
	
	
	
	
	

}
