package Aplicacion.Ventanas;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import Aplicacion.Conversor;
import Dominio.Constantes.EConstantes;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.util.Locale;

import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import java.awt.Cursor;
import java.awt.Insets;

public class VentanaDivisas extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField textCantidad;
	private JComboBox divisaOrigen;
	private JComboBox divisaDestino;
	private JLabel lblDivOrigen_1;
	private JLabel lblDivResultado;
	private String[] _opcionesDivisas;
	private JLabel lblCantidadOrigen;
	private JLabel lblResultado;
	private Conversor _conversor;
	
	/**
	 * Creación de la ventana.
	 */
	public VentanaDivisas() {

		_conversor = new Conversor();
		_opcionesDivisas = EConstantes.getOpcionesDivisas();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 383, 310);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(243, 245, 252));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		setTitle("Conversor Divisas");
		setLocationRelativeTo(null);
		setResizable(false);
		
		JLabel lblTitulo = new JLabel("Conversor de Divisas");
		lblTitulo.setForeground(new Color(10, 56, 113));
		lblTitulo.setBounds(0, 20, 359, 37);
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setFont(new Font("Tw Cen MT", Font.BOLD, 25));
		contentPane.add(lblTitulo);
		
		JLabel lblOrigen = new JLabel("De");
		lblOrigen.setForeground(new Color(73, 80, 87));
		lblOrigen.setFont(new Font("Tw Cen MT", Font.ITALIC, 20));
		lblOrigen.setHorizontalAlignment(SwingConstants.CENTER);
		lblOrigen.setBounds(0, 146, 62, 37);
		contentPane.add(lblOrigen);
		
		JLabel lblDestino = new JLabel("Hacia");
		lblDestino.setForeground(new Color(73, 80, 87));
		lblDestino.setHorizontalAlignment(SwingConstants.CENTER);
		lblDestino.setFont(new Font("Tw Cen MT", Font.ITALIC, 20));
		lblDestino.setBounds(167, 146, 62, 37);
		contentPane.add(lblDestino);
		
		lblCantidadOrigen = new JLabel("0.00");
		lblCantidadOrigen.setFont(new Font("Tw Cen MT", Font.BOLD | Font.ITALIC, 20));
		lblCantidadOrigen.setHorizontalAlignment(SwingConstants.CENTER);
		lblCantidadOrigen.setBounds(0, 223, 131, 45);
		contentPane.add(lblCantidadOrigen);
		
		JLabel lblCantidadtxt = new JLabel("Cantidad");
		lblCantidadtxt.setForeground(new Color(73, 80, 87));
		lblCantidadtxt.setHorizontalAlignment(SwingConstants.CENTER);
		lblCantidadtxt.setFont(new Font("Tw Cen MT", Font.ITALIC, 20));
		lblCantidadtxt.setBounds(49, 84, 98, 35);
		contentPane.add(lblCantidadtxt);
		
		lblResultado = new JLabel("0.00");
		lblResultado.setHorizontalAlignment(SwingConstants.CENTER);
		lblResultado.setFont(new Font("Tw Cen MT", Font.BOLD | Font.ITALIC, 20));
		lblResultado.setBounds(192, 223, 105, 45);
		contentPane.add(lblResultado);
		
		lblDivOrigen_1 = new JLabel(_opcionesDivisas[0]);
		lblDivOrigen_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblDivOrigen_1.setFont(new Font("Tw Cen MT", Font.BOLD | Font.ITALIC, 20));
		lblDivOrigen_1.setBounds(116, 223, 56, 45);
		contentPane.add(lblDivOrigen_1);
		
		JLabel lblIgual = new JLabel("=");
		lblIgual.setHorizontalAlignment(SwingConstants.CENTER);
		lblIgual.setFont(new Font("Tw Cen MT", Font.BOLD | Font.ITALIC, 20));
		lblIgual.setBounds(159, 213, 48, 64);
		contentPane.add(lblIgual);
		
		lblDivResultado = new JLabel(_opcionesDivisas[0]);
		lblDivResultado.setHorizontalAlignment(SwingConstants.CENTER);
		lblDivResultado.setFont(new Font("Tw Cen MT", Font.BOLD | Font.ITALIC, 20));
		lblDivResultado.setBounds(292, 223, 62, 45);
		contentPane.add(lblDivResultado);
		
		
		divisaOrigen = new JComboBox();
		divisaOrigen.setAutoscrolls(true);
		divisaOrigen.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		divisaOrigen.setBackground(new Color(255, 255, 255));
		divisaOrigen.setBorder(null);
		divisaOrigen.setModel(new DefaultComboBoxModel(_opcionesDivisas));
		divisaOrigen.setSelectedIndex(0);
		divisaOrigen.setFont(new Font("Tw Cen MT", Font.ITALIC, 20));
		divisaOrigen.setBounds(59, 154, 98, 21);
		contentPane.add(divisaOrigen);
		
		divisaDestino = new JComboBox();
		divisaDestino.setBackground(new Color(255, 255, 255));
		divisaDestino.setAutoscrolls(true);
		divisaDestino.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		divisaDestino.setBorder(null);
		divisaDestino.setModel(new DefaultComboBoxModel(_opcionesDivisas));
		divisaDestino.setSelectedIndex(0);
		divisaDestino.setFont(new Font("Tw Cen MT", Font.ITALIC, 20));
		divisaDestino.setBounds(239, 154, 98, 21);
		contentPane.add(divisaDestino);
		
		textCantidad = new JTextField();
		textCantidad.setMargin(new Insets(2, 10, 2, 2));
		textCantidad.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textCantidad.setForeground(new Color(73, 80, 87));
		textCantidad.getDocument().addDocumentListener(new DocumentListener() {
			@Override
			public void removeUpdate(DocumentEvent e) {
				actionPerformed(new ActionEvent(textCantidad, ActionEvent.ACTION_PERFORMED, ""));
				
			}
			@Override
			public void insertUpdate(DocumentEvent e) {
				actionPerformed(new ActionEvent(textCantidad, ActionEvent.ACTION_PERFORMED, ""));
			}
			@Override
			public void changedUpdate(DocumentEvent e) {
				actionPerformed(new ActionEvent(textCantidad, ActionEvent.ACTION_PERFORMED, ""));
			}
		});
		textCantidad.setText("0.00");
		textCantidad.setFont(new Font("Tw Cen MT", Font.ITALIC, 20));
		textCantidad.setBounds(157, 87, 163, 29);
		contentPane.add(textCantidad);
		textCantidad.setColumns(10);
		
		divisaOrigen.addActionListener(this);
		divisaDestino.addActionListener(this);
		textCantidad.addActionListener(this);
	}
	
	/**
	 * Procesar eventos ActionEvent.
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		if(divisaOrigen==e.getSource()) {
			lblDivOrigen_1.setText(_opcionesDivisas[divisaOrigen.getSelectedIndex()]);
			setLabels();
		}
		if(divisaDestino==e.getSource()) {
			lblDivResultado.setText(_opcionesDivisas[divisaDestino.getSelectedIndex()]);
			setLabels();
		}
		if(textCantidad==e.getSource()) {
			if(validarNum(textCantidad.getText())==false) {
				lblCantidadOrigen.setText("NaN");
				lblResultado.setText("NaN");
			}else {
				setLabels();
			}
		}
	}
	
	/**
	 * Procesar eventos de ventana.
	 */
	@Override
	protected void processWindowEvent(WindowEvent e) {
		if (e.getID() == WindowEvent.WINDOW_CLOSING) {
			int confirmación = JOptionPane.showConfirmDialog(this, "¿Desea volver al menú principal?",
            		"Confirmación", JOptionPane.YES_NO_OPTION);
            if(confirmación==0) {
            	new VentanaInicial().setVisible(true);
            }
            dispose(); 
        } else {
            super.processWindowEvent(e);
        }
	}
	
	/**
	 * Valida si la entrada de texto es un número.
	 */
	private boolean validarNum(String entrada) {
		if(entrada=="" || entrada==null) {
			return false;	
		}
		try {
			Float.valueOf(entrada);
		}catch (Exception e) {
			return false;
		}
		return true;
	}
	
	/**
	 * Trunca un float a 2 decimales y los devuelve como String.
	 */
	private String numTruncado(float num) {
		return String.format(Locale.US, "%.2f", num);
	}
	
	/**
	 * Configura los textos de los labels de la ventana.
	 */
	private void setLabels() {
		lblCantidadOrigen.setText(numTruncado(Float.valueOf(textCantidad.getText())));
		lblResultado.setText(numTruncado(_conversor.ConvertirDivisas(Float.valueOf(textCantidad.getText()), 
				EConstantes.getEquivalenciaDivisas()[divisaOrigen.getSelectedIndex()], 
				EConstantes.getEquivalenciaDivisas()[divisaDestino.getSelectedIndex()])));
	}
}
