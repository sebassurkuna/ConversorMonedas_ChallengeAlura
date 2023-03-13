package Aplicacion.Ventanas;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.UIManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.Cursor;
import javax.swing.border.LineBorder;
import javax.swing.border.CompoundBorder;

public class VentanaInicial extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JButton btnConvDivisas; 
	private JButton btnConvTemperatura;

	/**
	 * Create the frame.
	 */
	public VentanaInicial() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setBounds(100, 100, 391, 248);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(218, 218, 218));
		contentPane.setBackground(new Color(243, 245, 252));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		setTitle("Conversor");
		setLocationRelativeTo(null);
		setResizable(false);
		
		JLabel lblTitulo = new JLabel("Seleccion el tipo de conversión");
		lblTitulo.setBackground(new Color(10, 56, 113));
		lblTitulo.setForeground(new Color(10, 56, 113));
		lblTitulo.setFont(new Font("Tw Cen MT", Font.BOLD, 25));
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setBounds(0, 30, 377, 28);
		contentPane.add(lblTitulo);
		
		btnConvDivisas = new JButton("Divisas");
		btnConvDivisas.setBorderPainted(false);
		btnConvDivisas.setFocusPainted(false);
		btnConvDivisas.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnConvDivisas.setForeground(new Color(243, 245, 252));
		btnConvDivisas.addActionListener(this);
		btnConvDivisas.setBorder(new LineBorder(new Color(243, 245, 252), 4, true));
		btnConvDivisas.setBackground(new Color(10, 56, 113));
		btnConvDivisas.setFont(new Font("Tw Cen MT", Font.BOLD | Font.ITALIC, 20));
		btnConvDivisas.setBounds(107, 83, 154, 28);
		contentPane.add(btnConvDivisas);
		
		btnConvTemperatura = new JButton("Temperatura\r\n");
		btnConvTemperatura.setFocusPainted(false);
		btnConvTemperatura.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnConvTemperatura.setForeground(new Color(243, 245, 252));
		btnConvTemperatura.addActionListener(this);
		btnConvTemperatura.setFont(new Font("Tw Cen MT", Font.BOLD | Font.ITALIC, 20));
		btnConvTemperatura.setBorderPainted(false);
		btnConvTemperatura.setBorder(null);
		btnConvTemperatura.setBackground(new Color(10, 56, 113));
		btnConvTemperatura.setBounds(107, 135, 154, 28);
		contentPane.add(btnConvTemperatura);
	}

	
	/**
	 * Procesar eventos de Action Event.
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		if(btnConvDivisas==e.getSource()) {
			this.setVisible(false);
			VentanaDivisas ventanaDivisas = new VentanaDivisas();
			ventanaDivisas.setVisible(true);
		}
		if(btnConvTemperatura==e.getSource()) {
			this.setVisible(false);
			VentanaTemperatura ventanaTemp = new VentanaTemperatura();
			ventanaTemp.setVisible(true);
		}
		
	}
	
	/**
	 * Procesar eventos de ventana.
	 */
	@Override
	protected void processWindowEvent(WindowEvent e) {
		if (e.getID() == WindowEvent.WINDOW_CLOSING) {
			int confirmación = JOptionPane.showConfirmDialog(this, "¿Desea salir del conversor?",
            		"Confirmación", JOptionPane.YES_NO_OPTION);
            if(confirmación==0) {
            	dispose();
            } 
        } else {
            super.processWindowEvent(e);
        }
	}
	
	
	
}
