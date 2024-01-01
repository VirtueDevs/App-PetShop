package Interfaz;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class frmMenuClientes extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmMenuClientes frame = new frmMenuClientes();
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
	public frmMenuClientes() {
		setTitle("Menu Clientes");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 618, 590);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 168, 21);
		contentPane.add(menuBar);
		
		JMenu mnVerMascotas = new JMenu("Ver Mascotas");
		menuBar.add(mnVerMascotas);
		
		JMenuItem mntmPerros = new JMenuItem("Perros");
		mntmPerros.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frmPerros Perros = new frmPerros();
				Perros.setLocationRelativeTo(null);
				Perros.setVisible(true);
				frmMenuClientes.this.dispose();
			}
		});
		
		JMenuItem mntmGatos = new JMenuItem("Gatos");
		mntmGatos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmGatos Gatos = new frmGatos();
				Gatos.setLocationRelativeTo(null);
				Gatos.setVisible(true);
				frmMenuClientes.this.dispose();
			}
		});
		mnVerMascotas.add(mntmGatos);
		
		JSeparator separator = new JSeparator();
		mnVerMascotas.add(separator);
		mnVerMascotas.add(mntmPerros);
		
		JMenu mnVerPrductos = new JMenu("Ver Prductos");
		menuBar.add(mnVerPrductos);
		
		JMenuItem mntmAseo = new JMenuItem("Aseo");
		mntmAseo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmAseo Aseo = new frmAseo();
				Aseo.setLocationRelativeTo(null);
				Aseo.setVisible(true);
				frmMenuClientes.this.dispose();
			}
		});
		
		JMenuItem mntmAlimentos = new JMenuItem("Alimentos");
		mntmAlimentos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmAlimentos Alimentos = new frmAlimentos();
				Alimentos.setLocationRelativeTo(null);
				Alimentos.setVisible(true);
				frmMenuClientes.this.dispose();
			}
		});
		mnVerPrductos.add(mntmAlimentos);
		
		JSeparator separator_2 = new JSeparator();
		mnVerPrductos.add(separator_2);
		mnVerPrductos.add(mntmAseo);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(WIDTH);
			}
		});
		btnSalir.setBounds(503, 517, 89, 23);
		contentPane.add(btnSalir);
		
		JButton btnActualizarDatos = new JButton("Actualizar Datos");
		btnActualizarDatos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frmActualizarDatos Actualizar = new frmActualizarDatos();
				Actualizar.setLocationRelativeTo(null);
				Actualizar.setVisible(true);
				frmMenuClientes.this.dispose();
			}
		});
		btnActualizarDatos.setBounds(10, 517, 158, 23);
		contentPane.add(btnActualizarDatos);
		
		JButton btnCarrito = new JButton("Carrito");
		btnCarrito.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmCarrito Carrito = new frmCarrito();
				Carrito.setLocationRelativeTo(null);
				Carrito.setVisible(true);
				frmMenuClientes.this.dispose();
			}
		});
		btnCarrito.setBounds(503, 11, 89, 23);
		contentPane.add(btnCarrito);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("F:\\TADEO\\Algoritmos de programaci\u00F3n\\AppPetShop\\src\\Imagen\\Portada.jpg"));
		label.setBounds(0, 0, 602, 551);
		contentPane.add(label);
	}
}
