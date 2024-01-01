package Modelo;

public class Cliente extends Usuario {
	private String direccion;

	public Cliente(String userld, String password, String nombre, String email, String telefono) {
		super(userld, password, nombre, email, telefono);
	}	

	public Cliente(String userld, String password, String nombre, String email, String telefono, String direccion) {
		super(userld, password, nombre, email, telefono);
		this.direccion = direccion;
	}


	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	

}
