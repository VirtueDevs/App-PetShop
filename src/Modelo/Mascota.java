package Modelo;

public abstract class Mascota {
	private String raza;
	private int edad;
	private double peso;
	private String genero;
	private int precio;
	
	public Mascota(String raza, int edad, double peso, String genero, int precio) {
		super();
		this.raza = raza;
		this.edad = edad;
		this.peso = peso;
		this.genero = genero;
		this.precio = precio;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public void mostrarDatos() {
		
	}
}
