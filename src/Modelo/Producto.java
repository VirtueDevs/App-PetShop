package Modelo;

public abstract class Producto {
	private String nombre;
	private String marca;
	private double precio;
	private int codigo;
	private String tamaño;
	private double peso;
	private int cantidad;
	
	
	public Producto(String nombre, String marca, double precio, int codigo) {
		super();
		this.nombre = nombre;
		this.marca = marca;
		this.precio = precio;
		this.codigo = codigo;
	}	
	public Producto(String nombre, String marca, double precio, int codigo, String tamaño, double peso, int cantidad) {
		super();
		this.nombre = nombre;
		this.marca = marca;
		this.precio = precio;
		this.codigo = codigo;
		this.tamaño = tamaño;
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
	public String getTamaño() {
		return tamaño;
	}
	public void setTamaño(String tamaño) {
		this.tamaño = tamaño;
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
