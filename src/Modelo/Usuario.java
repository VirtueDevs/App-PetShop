package Modelo;

import java.util.ArrayList;

public abstract class Usuario {
	
	public static ArrayList<Usuario> listaUsuarios = new ArrayList<Usuario>();
	private String login;
	private String password;
	private String nombre;
	private String email;
	private String telefono;
	private String direccion;
	
	public Usuario(String userld, String password, String nombre, String email, String telefono, String direccion) {
		super();
		this.login = userld;
		this.password = password;
		this.nombre = nombre;
		this.email = email;
		this.telefono = telefono;
		this.direccion = direccion;
	}
	public Usuario(String userld, String password, String nombre, String email, String telefono) {
		super();
		this.login = userld;
		this.password = password;
		this.nombre = nombre;
		this.email = email;
		this.telefono = telefono;		
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public Usuario(String userld, String password) {
		super();
		this.login = userld;
		this.password = password;
	}
	public String getlogin() {
		return login;
	}
	public void setlogin(String userld) {
		this.login = userld;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public void printData(){
		System.out.println("----------------------------------");
		System.out.println(" U s e r   I n f o r m a t i o n ");
		System.out.println("----------------------------------");
		System.out.println("       User: "+this.getlogin());
		System.out.println("  Password : "+this.getPassword());
		System.out.println("    Nombre : "+this.getNombre());
		System.out.println("     Email : "+this.getEmail());
		System.out.println("  Telefono : "+this.getTelefono());
		System.out.println("Dirrección : "+this.getDireccion());
		System.out.println("----------------------------------");
	}
	
	
}


