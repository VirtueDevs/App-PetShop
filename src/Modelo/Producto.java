package Modelo;

public abstract class Producto {
	private String nombre;
	private String marca;
	private double precio;
	private int codigo;
	private String tama�o;
	private double peso;
	private int cantidad;
	
	
	public Producto(String nombre, String marca, double precio, int codigo) {
		super();
		this.nombre = nombre;
		this.marca = marca;
		this.precio = precio;
		this.codigo = codigo;
	}	
	public Producto(String nombre, String marca, double precio, int codigo, String tama�o, double peso, int cantidad) {
		super();
		this.nombre = nombre;
		this.marca = marca;
		this.precio = precio;
		this.codigo = codigo;
		this.tama�o = tama�o;
		this.peso = peso;
		this.cantidad = cantidad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getTama�o() {
		return tama�o;
	}
	public void setTama�o(String tama�o) {
		this.tama�o = tama�o;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}	
}
