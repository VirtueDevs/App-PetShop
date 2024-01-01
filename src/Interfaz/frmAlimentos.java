package Interfaz;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class frmAlimentos extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldCantidad;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmAlimentos frame = new frmAlimentos();
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
	public frmAlimentos() {
		setTitle("Alimentos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 440, 473);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblConcentrado = new JLabel("Concentrado :");
		lblConcentrado.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblConcentrado.setBounds(10, 11, 90, 14);
		contentPane.add(lblConcentrado);	
		
		JLabel lblImagen = new JLabel("");
		lblImagen.setBounds(10, 36, 404, 290);
		contentPane.add(lblImagen);
		
		
		JComboBox comboBoxConcentrado = new JComboBox();		
		comboBoxConcentrado.setModel(new DefaultComboBoxModel(new String[] {"Seleccione", "Gatos", "Perros"}));
		comboBoxConcentrado.setFont(new Font("Tahoma", Font.PLAIN, 11));
		comboBoxConcentrado.setBounds(110, 8, 90, 20);
		contentPane.add(comboBoxConcentrado);
		comboBoxConcentrado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int img = comboBoxConcentrado.getSelectedIndex();
				switch (img) {
				case 1: 
					ImageIcon imagen = new ImageIcon(this.getClass().getResource("/Imagen/CatChow.png"));
					lblImagen.setIcon(imagen);
					break;
				case 2: 
					ImageIcon imagen2 = new ImageIcon(this.getClass().getResource("/Imagen/DogChow.jpg"));
					lblImagen.setIcon(imagen2);
					break;		
				}
			}
		});			
		
		JLabel lblPeso1 = new JLabel("Peso :");
		lblPeso1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblPeso1.setBounds(10, 337, 46, 14);
		contentPane.add(lblPeso1);
		
		JLabel lblSabor = new JLabel("Sabor :");
		lblSabor.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblSabor.setBounds(10, 362, 46, 14);
		contentPane.add(lblSabor);
		
		JLabel lblCantidad1 = new JLabel("Cantidad :");
		lblCantidad1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCantidad1.setBounds(10, 387, 72, 14);
		contentPane.add(lblCantidad1);
		
		JLabel lblPrecio1 = new JLabel("Precio : ");
		lblPrecio1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblPrecio1.setBounds(10, 412, 46, 14);
		contentPane.add(lblPrecio1);
		
		JLabel label_1 = new JLabel("$");
		label_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_1.setBounds(66, 412, 18, 14);
		contentPane.add(label_1);
		
		JLabel lblPrecio = new JLabel("");
		lblPrecio.setBounds(76, 412, 90, 14);
		contentPane.add(lblPrecio);
		
		
		JComboBox comboBoxPeso = new JComboBox();
		comboBoxPeso.setModel(new DefaultComboBoxModel(new String[] {"Seleccione", "1", "8", "17"}));
		comboBoxPeso.setBounds(76, 334, 90, 20);
		contentPane.add(comboBoxPeso);
		comboBoxPeso.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int Prec = comboBoxPeso.getSelectedIndex();
				switch (Prec) {
				case 1: String precio = new String("10.000");
				lblPrecio.setText(precio);
					break;
				case 2: String precio1 = new String("75.000");
				lblPrecio.setText(precio1);
					break;
				case 3: String precio2 = new String("150.000");
				lblPrecio.setText(precio2);
				    break;
				}
			}
		});	
		JComboBox comboBoxSabor = new JComboBox();
		comboBoxSabor.setModel(new DefaultComboBoxModel(new String[] {"Seleccione", "Carne", "Cerdo", "Pavo", "Pollo"}));
		comboBoxSabor.setBounds(76, 359, 90, 20);
		contentPane.add(comboBoxSabor);
		
		textFieldCantidad = new JTextField();
		textFieldCantidad.setBounds(76, 384, 90, 20);
		contentPane.add(textFieldCantidad);
		textFieldCantidad.setColumns(10);
		
		
		JButton btnRegresar = new JButton("Regresar");
		btnRegresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmMenuClientes back = new frmMenuClientes ();
				back.setLocationRelativeTo(null);
				back.setVisible(true);
				frmAlimentos.this.dispose();
			}
		});
		btnRegresar.setBounds(325, 403, 89, 23);
		contentPane.add(btnRegresar);
		
		JButton btnAadir = new JButton("A\u00F1adir");
		btnAadir.setBounds(325, 7, 89, 23);
		contentPane.add(btnAadir);
		
		JLabel lblKg = new JLabel("Kg.");
		lblKg.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblKg.setBounds(176, 337, 46, 14);
		contentPane.add(lblKg);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("F:\\TADEO\\Algoritmos de programaci\u00F3n\\AppPetShop\\src\\Imagen\\Foondo.jpg"));
		label.setBounds(0, 0, 424, 434);
		contentPane.add(label);
	}

}
