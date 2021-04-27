package vista;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;

public class VentanaPrincipal extends JFrame {

	private JLabel lblModulo;
	private JLabel lblTurno;
	private JLabel lblCliente;
	private JLabel lblTiempoEstimado;
	private JLabel textModulo;
	private JLabel textTurno;
	private JLabel textCliente;
	private JLabel textTiempoEstimado;
	private JProgressBar barraProgreso;
	
	public VentanaPrincipal( int x, int y){
		setSize(500, 320);
		setLocation(x, y);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(null);
		setResizable(false);
		inicializar();
		agregar();
		estilo();
	}
	
	public void inicializar() {
		lblModulo = new JLabel("Módulo: ");
		lblTurno = new JLabel("turno: ");
		lblCliente = new JLabel("cliente: ");
		lblTiempoEstimado = new JLabel("tiempo estimado: ");
		textModulo = new JLabel("");
		textTurno = new JLabel("");
		textCliente = new JLabel("");
		textTiempoEstimado = new JLabel("");
		barraProgreso = new JProgressBar();
				
	}
	
	public void estilo() {
		lblModulo.setBounds(40, 20, 60, 20);
		textModulo.setBounds(100, 20, 200, 20);
		lblTurno.setBounds(40, 50, 60, 20);
		textTurno.setBounds(80, 50, 130, 20);
		lblCliente.setBounds(40, 80, 60, 20);
		textCliente.setBounds(90, 80, 120, 20);
		lblTiempoEstimado.setBounds(40, 110, 120, 20);
		textTiempoEstimado.setBounds(150, 110, 60, 20);
		barraProgreso.setBounds(30, 140, 200, 30);
		
		textTurno.setBackground(Color.cyan);
		textCliente.setBackground(Color.cyan);
		textTiempoEstimado.setBackground(Color.cyan);
		
		textModulo.setOpaque(true);
		textTurno.setOpaque( true );
		textCliente.setOpaque(true);
		textTiempoEstimado.setOpaque(true);
	}
	
	
	public void agregar() {
		add(lblModulo);
		add(textModulo);
		add(lblTurno);
		add(textTurno);
		add(lblCliente);
		add(textCliente);
		add(lblTiempoEstimado);
		add(textTiempoEstimado);
		add(barraProgreso);
	}
	

	public JLabel getLblModulo() {
		return lblModulo;
	}

	public JLabel getLblTurno() {
		return lblTurno;
	}

	public JLabel getLblCliente() {
		return lblCliente;
	}

	public JLabel getLblTiempoEstimado() {
		return lblTiempoEstimado;
	}

	public JLabel getTextModulo() {
		return textModulo;
	}

	public JLabel getTextTurno() {
		return textTurno;
	}

	public JLabel getTextCliente() {
		return textCliente;
	}

	public JLabel getTextTiempoEstimado() {
		return textTiempoEstimado;
	}

	public JProgressBar getBarraProgreso() {
		return barraProgreso;
	}
	public void setLblModulo(JLabel lblModulo) {
		this.lblModulo = lblModulo;
	}

	public void setLblTurno(JLabel lblTurno) {
		this.lblTurno = lblTurno;
	}

	public void setLblCliente(JLabel lblCliente) {
		this.lblCliente = lblCliente;
	}

	public void setLblTiempoEstimado(JLabel lblTiempoEstimado) {
		this.lblTiempoEstimado = lblTiempoEstimado;
	}

	public void setTextModulo(JLabel textModulo) {
		this.textModulo = textModulo;
	}

	public void setTextTurno(JLabel textTurno) {
		this.textTurno = textTurno;
	}

	public void setTextCliente(JLabel textCliente) {
		this.textCliente = textCliente;
	}

	public void setTextTiempoEstimado(JLabel textTiempoEstimado) {
		this.textTiempoEstimado = textTiempoEstimado;
	}

	public void setBarraProgreso(JProgressBar barraProgreso) {
		this.barraProgreso = barraProgreso;
	}

	
}
