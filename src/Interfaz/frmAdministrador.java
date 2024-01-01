package Interfaz;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.io.File;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Modelo.Cliente;
import Modelo.Usuario;

import javax.swing.JButton;



public class frmAdministrador extends JFrame {
	
	public static ArrayList<Usuario> listaUsuarios = new ArrayList<Usuario>();
	

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmAdministrador frame = new frmAdministrador();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public frmAdministrador() {
		setTitle("Administrador");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnMostrarUsuarios = new JButton("Mostrar usuarios");
		btnMostrarUsuarios.setBounds(10, 11, 134, 23);
		contentPane.add(btnMostrarUsuarios);
		
		JButton btnNewButton = new JButton("Agregar usuarios");
		btnNewButton.setBounds(10, 45, 134, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Eliminar usuarios");
		btnNewButton_1.setBounds(10, 79, 134, 23);
		contentPane.add(btnNewButton_1);
	}
}
