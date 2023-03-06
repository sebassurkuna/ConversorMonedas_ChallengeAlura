package Aplicacion.Ventanas;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.UIManager;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
		contentPane.setBackground(new Color(133, 133, 245));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		setTitle("Conversor");
		setLocationRelativeTo(null);
		setResizable(false);
		
		JLabel lblTitulo = new JLabel("Seleccion el tipo de conversión");
		lblTitulo.setForeground(new Color(191, 191, 191));
		lblTitulo.setFont(new Font("Tw Cen MT", Font.BOLD, 25));
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setBounds(0, 30, 377, 28);
		contentPane.add(lblTitulo);
		
		btnConvDivisas = new JButton("Divisas");
		btnConvDivisas.addActionListener(this);
		btnConvDivisas.setBorderPainted(false);
		btnConvDivisas.setBorder(UIManager.getBorder("Button.border"));
		btnConvDivisas.setBackground(UIManager.getColor("Button.light"));
		btnConvDivisas.setFont(new Font("Tw Cen MT", Font.BOLD | Font.ITALIC, 20));
		btnConvDivisas.setBounds(107, 83, 154, 28);
		contentPane.add(btnConvDivisas);
		
		btnConvTemperatura = new JButton("Temperatura\r\n");
		btnConvTemperatura.addActionListener(this);
		btnConvTemperatura.setFont(new Font("Tw Cen MT", Font.BOLD | Font.ITALIC, 20));
		btnConvTemperatura.setBorderPainted(false);
		btnConvTemperatura.setBorder(UIManager.getBorder("Button.border"));
		btnConvTemperatura.setBackground(UIManager.getColor("Button.light"));
		btnConvTemperatura.setBounds(107, 135, 154, 28);
		contentPane.add(btnConvTemperatura);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(btnConvDivisas==e.getSource()) {
			this.setVisible(false);
			VentanaDivisas ventanaDivisas = new VentanaDivisas();
			ventanaDivisas.setVisible(true);
		}
		if(btnConvTemperatura==e.getSource()) {
			System.out.println("Se presionó Temp");
		}
		
	}
	
}
