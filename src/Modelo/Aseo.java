package Modelo;

public class Aseo extends Producto {
	private String aroma;
	private String tipo;

	public Aseo(String nombre, String marca, double precio, int codigo, String tamaño, double peso, int cantidad) {
		super(nombre, marca, precio, codigo, tamaño, peso, cantidad);
		// TODO Auto-generated constructor stub
	}

	public Aseo(String nombre, String marca, double precio, int codigo, String aroma, String tipo) {
		super(nombre, marca, precio, codigo);
		this.aroma = aroma;
		this.tipo = tipo;
	}

	public String getAroma() {
		return aroma;
	}

	public void setAroma(String aroma) {
		this.aroma = aroma;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
}