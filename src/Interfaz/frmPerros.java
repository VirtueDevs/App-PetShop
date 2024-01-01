package Interfaz;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.JFormattedTextField;
import javax.swing.JTable;
import java.awt.Color;
import javax.swing.UIManager;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.Font;

public class frmPerros extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmPerros frame = new frmPerros();
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
	@SuppressWarnings("unchecked")
	public frmPerros() {
		setTitle("Perros");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 452, 478);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblRaza = new JLabel("Raza : ");
		lblRaza.setBounds(10, 11, 46, 14);
		contentPane.add(lblRaza);
		
		JLabel lblEdad = new JLabel("Edad :");
		lblEdad.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblEdad.setBounds(10, 335, 46, 14);
		contentPane.add(lblEdad);
		
		JLabel lblG = new JLabel("Genero :");
		lblG.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblG.setBounds(10, 385, 65, 14);
		contentPane.add(lblG);
		
		JLabel lblll = new JLabel("Precio :");
		lblll.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblll.setBounds(10, 410, 46, 14);
		contentPane.add(lblll);
		
		JRadioButton rdbtnMacho = new JRadioButton("Macho");
		rdbtnMacho.addMouseListener(new MouseAdapter() {
		});
		rdbtnMacho.setBounds(81, 381, 90, 23);
		contentPane.add(rdbtnMacho);
		
		JRadioButton rdbtnHembra = new JRadioButton("Hembra");
		rdbtnHembra.addMouseListener(new MouseAdapter() {
		});
		rdbtnHembra.setBounds(173, 381, 86, 23);
		contentPane.add(rdbtnHembra);
		
		ButtonGroup g1= new ButtonGroup();
		g1.add(rdbtnHembra);
		g1.add(rdbtnMacho);
		
		JLabel lblRazas = new JLabel("");
		lblRazas.setBounds(10, 36, 414, 288);
		contentPane.add(lblRazas);
		JComboBox comboBoxRaza = new JComboBox();	
	    comboBoxRaza.setModel(new DefaultComboBoxModel(new String[] {"Seleccione", "Dalmata", "Doberman", "Golden Retriver", "Pastor Alem\u00E1n"}));		
		comboBoxRaza.setBounds(66, 8, 142, 20);
		contentPane.add(comboBoxRaza);
		
		comboBoxRaza.addItemListener(new ItemListener() {

			public void itemStateChanged(ItemEvent e) {
						int img = comboBoxRaza.getSelectedIndex();
						switch (img) {
						case 1: 
							ImageIcon imagen = new ImageIcon(this.getClass().getResource("/Imagen/Dalmata.jpg"));
							lblRazas.setIcon(imagen);
							break;
						case 2: ImageIcon imagen2 = new ImageIcon(this.getClass().getResource("/Imagen/Doberman.jpg"));
						lblRazas.setIcon(imagen2);
							break;
						case 3: ImageIcon imagen3 = new ImageIcon(this.getClass().getResource("/Imagen/GoldenRetriver.jpg"));
						lblRazas.setIcon(imagen3);
							break;
						case 4: ImageIcon imagen4 = new ImageIcon(this.getClass().getResource("/Imagen/PastorAleman.jpg"));
						lblRazas.setIcon(imagen4);
							break;
						
						}
					}
		});
	
		JLabel lblMeses = new JLabel("meses.");
		lblMeses.setForeground(Color.BLACK);
		lblMeses.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblMeses.setBounds(173, 335, 46, 14);
		contentPane.add(lblMeses);
		
		JLabel label = new JLabel("$");
		label.setFont(new Font("Tahoma", Font.BOLD, 11));
		label.setBounds(66, 410, 9, 14);
		contentPane.add(label);
		
		JButton btnAadir = new JButton("A\u00F1adir");
		btnAadir.setBounds(335, 7, 89, 23);
		contentPane.add(btnAadir);
		
		JButton btnRegresar = new JButton("Regresar");
		btnRegresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmMenuClientes back = new frmMenuClientes ();
				back.setLocationRelativeTo(null);
				back.setVisible(true);
				frmPerros.this.dispose();
			}
		});
		btnRegresar.addMouseListener(new MouseAdapter() {
		
		});
		btnRegresar.setBounds(335, 406, 89, 23);
		contentPane.add(btnRegresar);
		
		JComboBox comboBoxEdad = new JComboBox();
		comboBoxEdad.setModel(new DefaultComboBoxModel(new String[] {"Seleccione", "3-5", "5-7"}));
		comboBoxEdad.setBounds(66, 332, 105, 20);
		contentPane.add(comboBoxEdad);
		
		JLabel lblPrecio = new JLabel("");
		lblPrecio.addComponentListener(new ComponentAdapter() {
		});
		lblPrecio.setBackground(new Color(255, 255, 255));
		lblPrecio.setToolTipText("");
		lblPrecio.setForeground(Color.BLACK);
		lblPrecio.setBounds(78, 410, 74, 14);
		contentPane.add(lblPrecio);
		
		JLabel lblPeso0 = new JLabel("Peso : ");
		lblPeso0.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblPeso0.setBounds(10, 360, 46, 14);
		contentPane.add(lblPeso0);
		
		JLabel lblPeso = new JLabel("");
		lblPeso.setBounds(66, 360, 105, 14);
		contentPane.add(lblPeso);
		
		JLabel lblKgAproximado = new JLabel("Kg. Aproximado");
		lblKgAproximado.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblKgAproximado.setBounds(173, 360, 98, 14);
		contentPane.add(lblKgAproximado);
		
		JLabel lblFondo = new JLabel("");
		lblFondo.setIcon(new ImageIcon("F:\\TADEO\\Algoritmos de programaci\u00F3n\\AppPetShop\\src\\Imagen\\Foondo.jpg"));
		lblFondo.setBounds(0, 0, 436, 439);
		contentPane.add(lblFondo);
		comboBoxEdad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int Prec = comboBoxEdad.getSelectedIndex();
				switch (Prec) {
				case 1: String precio = new String("120.000");
				lblPrecio.setText(precio);
				lblPeso.setText("12 - 18");
					break;
				case 2: String precio1 = new String("200.000");
				lblPrecio.setText(precio1);
				lblPeso.setText("18 - 25");
					break;				
				}
			}
		});
		
		
		
		
		
		
	}
}