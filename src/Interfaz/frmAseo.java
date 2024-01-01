package Interfaz;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class frmAseo extends JFrame {

	private JPanel contentPane;
	private JTextField textCantidad;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmAseo frame = new frmAseo();
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
	public frmAseo() {
		setTitle("Aseo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 440, 446);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblP = new JLabel("Producto :");
		lblP.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblP.setBounds(10, 11, 73, 14);
		contentPane.add(lblP);
		
		JLabel lblImagen = new JLabel("");
		lblImagen.setBounds(10, 36, 404, 290);
		contentPane.add(lblImagen);
		
		JLabel lblTama�o1 = new JLabel("Tama\u00F1o :");
		lblTama�o1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblTama�o1.setBounds(10, 337, 73, 14);
		contentPane.add(lblTama�o1);
		
		JLabel lblNewLabelCantidad = new JLabel("Cantidad :");
		lblNewLabelCantidad.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabelCantidad.setBounds(10, 362, 73, 14);
		contentPane.add(lblNewLabelCantidad);
		
		JLabel lblPrecio1 = new JLabel("Precio :");
		lblPrecio1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblPrecio1.setBounds(10, 387, 46, 14);
		contentPane.add(lblPrecio1);
		
		JLabel label = new JLabel("$");
		label.setFont(new Font("Tahoma", Font.BOLD, 11));
		label.setBounds(76, 387, 17, 14);
		contentPane.add(label);
		
		JButton btnA�adir = new JButton("A\u00F1adir");
		btnA�adir.setBounds(325, 7, 89, 23);
		contentPane.add(btnA�adir);
		
		JButton btnRegresar = new JButton("Regresar");
		btnRegresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmMenuClientes back = new frmMenuClientes ();
				back.setLocationRelativeTo(null);
				back.setVisible(true);
				frmAseo.this.dispose();
			}
		});
		btnRegresar.setBounds(325, 378, 89, 23);
		contentPane.add(btnRegresar);
		
		textCantidad = new JTextField();
		textCantidad.setBounds(93, 359, 103, 20);
		contentPane.add(textCantidad);
		textCantidad.setColumns(10);
		
		JLabel lblPrecio = new JLabel("");
		lblPrecio.setBounds(92, 387, 104, 14);
		contentPane.add(lblPrecio);
		
		JComboBox comboBoxTama�o = new JComboBox();		
		comboBoxTama�o.setBounds(93, 334, 103, 20);
		contentPane.add(comboBoxTama�o);
		
		
		JLabel lbltama�o = new JLabel("");
		lbltama�o.setFont(new Font("Tahoma", Font.BOLD, 11));
		lbltama�o.setBounds(206, 337, 46, 14);
		contentPane.add(lbltama�o);
		
		
		JComboBox comboBoxProducto = new JComboBox();
		comboBoxProducto.setModel(new DefaultComboBoxModel(new String[] {"Seleccione", "Shampoo ", "Jabon"}));
		comboBoxProducto.setBounds(93, 8, 103, 20);
		contentPane.add(comboBoxProducto);
		comboBoxProducto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int img = comboBoxProducto.getSelectedIndex();
				switch (img) {
				case 1: 
					ImageIcon imagen = new ImageIcon(this.getClass().getResource("/Imagen/Shampoo1.jpg"));
					lblImagen.setIcon(imagen);
					comboBoxTama�o.setModel(new DefaultComboBoxModel(new String[] {"Seleccione", "250", "500"}));
					lbltama�o.setText("ml.");					
					break;					
				case 2: 
					ImageIcon imagen9 = new ImageIcon(this.getClass().getResource("/Imagen/Jabon1.jpg"));
					lblImagen.setIcon(imagen9);
					comboBoxTama�o.setModel(new DefaultComboBoxModel(new String[] {"Seleccione", "90", "100"}));
					lbltama�o.setText("gr.");
					break;		
				}
			}
		});
		
	
		
		JLabel lblFondo = new JLabel("");
		lblFondo.setIcon(new ImageIcon("F:\\TADEO\\Algoritmos de programaci\u00F3n\\AppPetShop\\src\\Imagen\\Foondo.jpg"));
		lblFondo.setBounds(0, 0, 424, 407);
		contentPane.add(lblFondo);
	}

}
