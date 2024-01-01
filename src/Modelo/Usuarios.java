package Modelo;
import java.io.File;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JLabel;
import javax.swing.JOptionPane;


public class Usuarios {
	
	public static ArrayList<Usuario> listaUsuarios = new ArrayList<Usuario>();
	
	
	public  void loadUsers(){
		String archivoEntrada="Data/Users.txt";
		try {
			Scanner entrada=new Scanner(new File(archivoEntrada));
			while (entrada.hasNext()) {
				String registroUsuarios=entrada.nextLine();
				String[] campo=registroUsuarios.split(";");
				Usuario u = new Usuario();
				u.setlogin(campo[0]);
				u.setPassword(campo[1]);
				this.addUser(u);
			}
			entrada.close();
		} catch (Exception e) {
			System.out.println("*** E R R O R   F A T A L ***");
		}
	}
	//metodo para guardar datos en el disco
	public static void grabarInfo() {			
		String archivoSalida="Data/Users.txt";

		try {
			PrintStream salida = new PrintStream (new File(archivoSalida));
			for (Usuario u:listaUsuarios) {
				String guardar = "";
				guardar=u.getlogin()+";"+u.getPassword()+";"+u.getRole()+"\n";
				salida.append(guardar);
			}
			salida.close();

		}catch(Exception e) {
			JOptionPane.showMessageDialog(null, "Error, el programa no pudo abrir los archivos.");
		}
	}
	public static void ingresaUsuario(){
		String mensaje="";
		String tituloVentana="Registro de Usuarios";
		mensaje=" Ingrese el nombre del usuario a añadir ?";
		String login=JOptionPane.showInputDialog(null,mensaje,tituloVentana,JOptionPane.INFORMATION_MESSAGE);		
		mensaje=" Ingrese la contraseña ?";
		String password=JOptionPane.showInputDialog(null,mensaje,tituloVentana,JOptionPane.INFORMATION_MESSAGE);		
		mensaje=" Ingrese el ro del usuario ?";
		String role=JOptionPane.showInputDialog(null,mensaje,tituloVentana,JOptionPane.INFORMATION_MESSAGE);		
		Usuario u = new Usuario();
		u.setlogin(login);
		u.setPassword(password);
		addUser(u);
		JOptionPane.showMessageDialog(null,"Usuario registrado exitosamente !!");
	}
	public void listarUsuarios(){
		for (int i=0;i<listaUsuarios.size();i++) {
			Usuario u=listaUsuarios.get(i);
			u.printData();
		}
	}
	

	public static void consultarUsuario(){
		String mensaje="";
		String tituloVentana="Consulta de Información";
		mensaje="Ingrese el nombre del usuario a consultar ?";
		// ImageIcon icono1=new ImageIcon("imagenes/InfoIcon.png");
		String nombre=JOptionPane.showInputDialog(null,mensaje,tituloVentana,JOptionPane.INFORMATION_MESSAGE);
		Usuario u=buscarUsuario(nombre);
		if (u==null) {
			mensaje="No existe un usuario con el nombre "+nombre;
			JOptionPane.showMessageDialog(null,mensaje);
		} else {
			mensaje=nombre+" Si existe en la lista";
			JOptionPane.showMessageDialog(null,mensaje);
			u.printData();			
		}		
	}

	public static void mostrarUsuarios(){
		// Crear un documento HTML con una tabla de datos
		StringBuilder mensaje=new StringBuilder("<html><table>");
		mensaje.append("<tr><th>Usuario</th><th>Contraseña</th><th>Rol</th></tr>");
		for (Usuario u:listaUsuarios) {
			String registro="<tr><td>"+u.getlogin()+"</td><td>"+u.getPassword()+"</td><td>";
			mensaje.append(registro);
		}
		mensaje.append("</table></html>");
		JOptionPane.showMessageDialog(null,new JLabel(mensaje.toString()));
	}
	public static  void eliminarUnUsuario(){
		String mensaje="";
		String tituloVentana="Eliminar Información";
		mensaje="Ingrese el nombre del usuario a eliminar ?";
		String nombre=JOptionPane.showInputDialog(null,mensaje,tituloVentana,JOptionPane.INFORMATION_MESSAGE);
		Usuario u=buscarUsuario(nombre);
		if (u==null) {
			mensaje="No existe un usuario con el nombre "+nombre;
			JOptionPane.showMessageDialog(null,mensaje);
		} else {
			mensaje=nombre+" Si existe en la lista";
			JOptionPane.showMessageDialog(null,mensaje);
			u.printData();
			int resp=JOptionPane.showConfirmDialog(null,"Está seguro de eliminar ?");
			if (JOptionPane.OK_OPTION == resp){
				System.out.println("Selecciona opción Afirmativa");
				listaUsuarios.remove(u);
				mensaje=nombre+" fue eliminado exitosamente";
				JOptionPane.showMessageDialog(null,mensaje);
			}
			else{
				System.out.println("No selecciona una opción afirmativa");
			}
		}		
	}
	public static Usuario buscarUsuario(String nombre,  String contraseña){
		for (Usuario u:listaUsuarios) {
			if (u.getlogin().equals(nombre) && u.getPassword().equals(contraseña)) {
				return u;
			}
		}
		return null; // No se encontrï¿½
	}
	public static  Usuario buscarUsuario(String nombre){
		for (Usuario u:listaUsuarios) {
			if (u.getlogin().equals(nombre)) {
				return u;
			}
		}
		return null; // No se encontrï¿½
	}
	public static void addUser(Usuario u){
		listaUsuarios.add(u);
}
}

