package Interfaz;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class frmActualizarDatos extends JFrame {

	private JPanel contentPane;
	private JTextField textNombre;
	private JTextField textTelefono;
	private JTextField textDirrecion;
	private JTextField textemail;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmActualizarDatos frame = new frmActualizarDatos();
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
	public frmActualizarDatos() {
		setTitle("Actualizar Datos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 466, 152);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNom = new JLabel("Nombre :");
		lblNom.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNom.setBounds(10, 11, 67, 14);
		contentPane.add(lblNom);
		
		JLabel lblEm = new JLabel("Email :");
		lblEm.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblEm.setBounds(10, 36, 46, 14);
		contentPane.add(lblEm);
		
		JLabel lblTel = new JLabel("Telefono :");
		lblTel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblTel.setBounds(10, 61, 67, 14);
		contentPane.add(lblTel);
		
		JLabel lblDir = new JLabel("Direcci\u00F3n :");
		lblDir.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDir.setBounds(10, 86, 67, 14);
		contentPane.add(lblDir);
		
		textNombre = new JTextField();
		textNombre.setBounds(87, 8, 243, 20);
		contentPane.add(textNombre);
		textNombre.setColumns(10);
		
		textemail = new JTextField();
		textemail.setBounds(87, 33, 243, 20);
		contentPane.add(textemail);
		textemail.setColumns(10);
		
		textTelefono = new JTextField();
		textTelefono.setBounds(87, 58, 243, 20);
		contentPane.add(textTelefono);
		textTelefono.setColumns(10);
		
		textDirrecion = new JTextField();
		textDirrecion.setBounds(87, 83, 243, 20);
		contentPane.add(textDirrecion);
		textDirrecion.setColumns(10);
		
		JButton btnActualizar = new JButton("Actualizar");
		btnActualizar.setBounds(340, 7, 100, 23);
		contentPane.add(btnActualizar);
		
		JButton btnRegresar = new JButton("Regresar");
		btnRegresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmMenuClientes back = new frmMenuClientes ();
				back.setLocationRelativeTo(null);
				back.setVisible(true);
				frmActualizarDatos.this.dispose();
			}
		});
		btnRegresar.setBounds(340, 82, 100, 23);
		contentPane.add(btnRegresar);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("F:\\TADEO\\Algoritmos de programaci\u00F3n\\AppPetShop\\src\\Imagen\\AD.jpg"));
		label.setBounds(0, 0, 450, 113);
		contentPane.add(label);
	}

}
