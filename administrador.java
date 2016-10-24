import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;
import java.awt.*;
import java.io.*;

public class administrador extends JFrame {
	
	private JPanel pBotones, pIntroDatos, pPrimero;
	private JButton bttnConsulta, bttnAlta, bttnSolicitud, bttnOk, bttnCancelar;
	private JTextField txtNombre, txtSerie;
	private JLabel lblNombre, lblSerie;
	
	public administrador() {
		inicializarComponentes();
		//cargarDatos();
	}
	
	private void inicializarComponentes() {
		setSize(200, 200);
		setTitle("Inventario");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		pBotones = new JPanel();
		
		bttnConsulta = new JButton("  Consultar existencia   ");
		bttnConsulta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				bttnConsultaClicked();
			}
		});
		pBotones.add(bttnConsulta);
		
		bttnAlta = new JButton("Dar de alta un producto");
		bttnAlta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				bttnAltaClicked();
			}
		});
		pBotones.add(bttnAlta);
		
		bttnSolicitud = new JButton("  solicitar al proovedor  ");
		bttnSolicitud.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				bttnSolicitudClicked();
			}
		});
		pBotones.add(bttnSolicitud);
		
		pPrimero = new JPanel (new GridLayout(1,3));
		pPrimero.add(pBotones);
		
		add(pPrimero);
		
		setVisible(true);
	}
	
	private void bttnConsultaClicked() {}
	
	private void bttnAltaClicked() {}
	
	private void bttnSolicitudClicked() {}
}
