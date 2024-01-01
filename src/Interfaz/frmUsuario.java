package Interfaz;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class frmUsuario extends JFrame {

	private JPanel contentPane;
	private JTextField txtUsername;
	private JButton btnLogin;
	private JButton btnExit;
	private JButton btnReset;
	protected JFrame frmLogin;
	private JPasswordField txtPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmUsuario frame = new frmUsuario();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public frmUsuario() {
		setTitle("PetShop");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 210, 354);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUser = new JLabel("Usuario:");
		lblUser.setHorizontalAlignment(SwingConstants.RIGHT);
		lblUser.setBounds(10, 150, 46, 14);
		contentPane.add(lblUser);
		
		txtUsername = new JTextField();
		txtUsername.setBounds(66, 147, 118, 20);
		contentPane.add(txtUsername);
		txtUsername.setColumns(10);
		
		JLabel lblPassword = new JLabel("Clave:");
		lblPassword.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPassword.setBounds(10, 178, 46, 14);
		contentPane.add(lblPassword);
		
		btnLogin = new JButton("Ingresar");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String password = txtPassword.getText();
				String username = txtUsername.getText();
				
				if(password.contains("animal123") && username.contains("usuario01")) {
					dispose();
					JOptionPane.showMessageDialog(null, "BIENVENIDO", "INGRESO CORRECTO", JOptionPane.INFORMATION_MESSAGE);
					
					frmMenuClientes info = new frmMenuClientes();
					info.setLocationRelativeTo(null);
					info.setVisible(true);
					frmUsuario.this.dispose();
					//pagPrincipal.main(null);					
				}
				else if (password.contains("12345") && username.contains("Cristian")) {
					dispose();
					JOptionPane.showMessageDialog(null, "BIENVENIDO", "INGRESO CORRECTO", JOptionPane.INFORMATION_MESSAGE);
					frmAdministrador info = new frmAdministrador();
					info.setLocationRelativeTo(null);
					info.main(null);
				}
				else {
					JOptionPane.showMessageDialog(null,"Datos Inválidos. Por favor intentelo de nuevo.", "ERROR LOGIN", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btnLogin.setBounds(53, 215, 89, 23);
		contentPane.add(btnLogin);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("F:\\TADEO\\Algoritmos de programaci\u00F3n\\AppPetShop\\Imagenes\\Usuario.png"));
		lblNewLabel.setBounds(39, 0, 118, 125);
		contentPane.add(lblNewLabel);
		
		btnExit = new JButton("Salir");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frmLogin = new JFrame("Exit");
				if (JOptionPane.showConfirmDialog(contentPane, "Por favor confirma si quieres salir", "Login", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION){
					System.exit(0);
				}
			}
		});
		btnExit.setBounds(53, 281, 89, 23);
		contentPane.add(btnExit);
		
		btnReset = new JButton("Resetear");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtUsername.setText(null);
				txtPassword.setText(null);
				
			}
		});
		btnReset.setBounds(53, 249, 89, 23);
		contentPane.add(btnReset);
		
		txtPassword = new JPasswordField();
		txtPassword.setBounds(66, 175, 118, 20);
		contentPane.add(txtPassword);
	}
}
