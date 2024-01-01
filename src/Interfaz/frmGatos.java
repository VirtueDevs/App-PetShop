package Interfaz;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;

import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class frmGatos extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmGatos frame = new frmGatos();
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
	public frmGatos() {
		setTitle("Gatos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 444, 483);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel contentPane_1 = new JPanel();
		contentPane_1.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.add(contentPane_1, BorderLayout.CENTER);
		contentPane_1.setLayout(null);
		
		JLabel lblRaza = new JLabel("Raza : ");
		lblRaza.setBounds(10, 3, 46, 14);
		contentPane_1.add(lblRaza);
		
		JLabel lblEdad = new JLabel("Edad :");
		lblEdad.setBounds(10, 335, 46, 14);
		lblEdad.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane_1.add(lblEdad);
		
		JLabel lblP = new JLabel("Peso : ");
		lblP.setBounds(10, 360, 46, 14);
		lblP.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane_1.add(lblP);
		
		JLabel lblGenero = new JLabel("Genero :");
		lblGenero.setBounds(10, 385, 65, 14);
		lblGenero.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane_1.add(lblGenero);
		
		JLabel lblPrec = new JLabel("Precio :");
		lblPrec.setBounds(10, 410, 46, 14);
		lblPrec.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane_1.add(lblPrec);
		
		JRadioButton rdbtnMacho = new JRadioButton("Macho");
		rdbtnMacho.setBounds(66, 381, 86, 23);
		contentPane_1.add(rdbtnMacho);
		
		JRadioButton rdbtnHembra = new JRadioButton("Hembra");
		rdbtnHembra.setBounds(172, 381, 76, 23);
		contentPane_1.add(rdbtnHembra);
		
		ButtonGroup g1= new ButtonGroup();
		g1.add(rdbtnHembra);
		g1.add(rdbtnMacho);
		
		JLabel lblRazas = new JLabel("");
		lblRazas.setBounds(0, 36, 414, 288);
		contentPane_1.add(lblRazas);
		
		
		JComboBox comboBoxRaza = new JComboBox();
		comboBoxRaza.setBounds(66, 0, 142, 20);
		comboBoxRaza.setModel(new DefaultComboBoxModel(new String[] {"Seleccione", "Chartreux", "Gato Siam\u00E9s", "Gato Persa"}));
		contentPane_1.add(comboBoxRaza);
		comboBoxRaza.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				int img = comboBoxRaza.getSelectedIndex();
				switch (img) {
				case 1: 
					ImageIcon imagen = new ImageIcon(this.getClass().getResource("/Imagen/Chartreux.jpg"));
					lblRazas.setIcon(imagen);
					break;
				case 2: 
					ImageIcon imagen2 = new ImageIcon(this.getClass().getResource("/Imagen/GatoSiames.jpg"));
				    lblRazas.setIcon(imagen2);
					break;
				case 3: 
					ImageIcon imagen3 = new ImageIcon(this.getClass().getResource("/Imagen/GatoPersa.jpg"));
				    lblRazas.setIcon(imagen3);
					break;				
				}
			}
		});		
		JLabel lblMeses = new JLabel("meses.");
		lblMeses.setBounds(162, 335, 46, 14);
		lblMeses.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane_1.add(lblMeses);
		
		JLabel lblKg = new JLabel("Kg. Aproximado");
		lblKg.setBounds(162, 360, 121, 14);
		lblKg.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane_1.add(lblKg);
		
		JLabel label = new JLabel("$");
		label.setBounds(66, 410, 9, 14);
		contentPane_1.add(label);
		
		JButton btnAadir = new JButton("A\u00F1adir");
		btnAadir.setBounds(325, 3, 89, 23);
		contentPane_1.add(btnAadir);
		
		JButton btnRegresar = new JButton("Regresar");
		btnRegresar.setBounds(319, 406, 89, 23);
		btnRegresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmMenuClientes back = new frmMenuClientes ();
				back.setLocationRelativeTo(null);
				back.setVisible(true);
				frmGatos.this.dispose();
			}
		});
		contentPane_1.add(btnRegresar);
		
		JLabel lblPrecio = new JLabel("");
		lblPrecio.setBounds(85, 410, 86, 14);
		contentPane_1.add(lblPrecio);
		
		JLabel lblPeso = new JLabel("");
		lblPeso.setBounds(66, 360, 40, 14);
		contentPane_1.add(lblPeso);
		
		JComboBox comboBoxEdad = new JComboBox();
		comboBoxEdad.setBounds(62, 332, 90, 20);
		comboBoxEdad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int Prec = comboBoxEdad.getSelectedIndex();
				switch (Prec) {
				case 1: String precio = new String("100.000");
				lblPrecio.setText(precio);
				lblPeso.setText("0.5 - 1");
					break;
				case 2: String precio1 = new String("150.000");
				lblPrecio.setText(precio1);
				lblPeso.setText("1 - 1.4");
					break;			
				}
			}
		});
		comboBoxEdad.setModel(new DefaultComboBoxModel(new String[] {"Selecione", "3-5", "5-7"}));
		contentPane_1.add(comboBoxEdad);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(316, 335, 65, 14);
		contentPane_1.add(lblNewLabel);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon("F:\\TADEO\\Algoritmos de programaci\u00F3n\\AppPetShop\\src\\Imagen\\Foondo.jpg"));
		label_1.setBounds(-11, -11, 439, 455);
		contentPane_1.add(label_1);
	}

}
