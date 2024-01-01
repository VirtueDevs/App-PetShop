package Modelo;

public class Concentrado extends Alimento {
	private String tipo;
	private String sabor;

	public Concentrado(String nombre, String marca, double precio, int codigo, String tamaño, double peso,
			int cantidad) {
		super(nombre, marca, precio, codigo, tamaño, peso, cantidad);
		// TODO Auto-generated constructor stub
	}

	public Concentrado(String nombre, String marca, double precio, int codigo, String tamaño, double peso, int cantidad,
			String tipo, String sabor) {
		super(nombre, marca, precio, codigo, tamaño, peso, cantidad);
		this.tipo = tipo;
		this.sabor = sabor;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}
}
