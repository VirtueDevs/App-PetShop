package Modelo;

public class Pago {
	private int codigo; 
	private int cuenta;
	private double total;
	
	public Pago(int codigo, int cuenta, double total) {
		super();
		this.codigo = codigo;
		this.cuenta = cuenta;
		this.total = total;
	
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public int getCuenta() {
		return cuenta;
	}
	public void setCuenta(int cuenta) {
		this.cuenta = cuenta;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
}
