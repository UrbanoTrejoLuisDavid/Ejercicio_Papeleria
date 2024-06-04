package com.tesji.vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.tesji.modelo.PapeleriaModelo;


import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

public class FrmVista extends JFrame {

	private JPanel contentPane;
	private JTextField txtCopias;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmVista frame = new FrmVista();
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
	public FrmVista() {
		setForeground(new Color(205, 133, 63));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 695, 466);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(233, 150, 122));
		contentPane.setForeground(new Color(205, 133, 63));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Papeleria \"El dedin\"");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Century Gothic", Font.ITALIC, 35));
		lblNewLabel.setBounds(164, 26, 359, 44);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Cantidad de copias");
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1.setFont(new Font("Century Gothic", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(163, 102, 166, 20);
		contentPane.add(lblNewLabel_1);
		
		txtCopias = new JTextField();
		txtCopias.setBounds(359, 104, 89, 20);
		contentPane.add(txtCopias);
		txtCopias.setColumns(10);
		
		JTextArea txtResultado = new JTextArea();
		txtResultado.setBounds(158, 157, 290, 170);
		contentPane.add(txtResultado);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setFont(new Font("Candara", Font.BOLD, 15));
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
				        PapeleriaModelo obj = new PapeleriaModelo();
				        obj.copias = Integer.parseInt(txtCopias.getText());
				        txtResultado.setText(obj.totalCompra());
				   }catch(NumberFormatException ex){
				       JOptionPane.showMessageDialog(rootPane,"Error, la cantidad debe ser numerica");
				   }
			}
		});
		btnCalcular.setBounds(483, 176, 101, 32);
		contentPane.add(btnCalcular);
		
		JButton btnNuevo = new JButton("Nuevo");
		btnNuevo.setFont(new Font("Candara", Font.BOLD, 15));
		btnNuevo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResultado.setText(null);
				txtCopias.setText(null);
			}
		});
		btnNuevo.setBounds(483, 219, 101, 32);
		contentPane.add(btnNuevo);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.setFont(new Font("Candara", Font.BOLD, 15));
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSalir.setBounds(483, 267, 101, 32);
		contentPane.add(btnSalir);
	}

}
