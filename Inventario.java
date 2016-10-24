import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Inventario
{

	private JFrame frmVentana;


	public static void main(String[] args)
	{

		EventQueue.invokeLater(new Runnable()
		{

			public void run()
			{
					try
					{
						Inventario window = new Inventario();
						window.frmVentana.setVisible(true);
					}
					catch (Exception e)
					{
						e.printStackTrace();
					}
			}

		});
	}


	public Inventario()
	{
		initialize();
	}


	private void initialize()
	{

//--------------------------------------Ventana Menú-------------------------------------------------------------------------------

		frmVentana = new JFrame();
		frmVentana.setTitle("Menú");
		frmVentana.setBounds(300, 300, 300, 300);
		frmVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmVentana.getContentPane().setLayout(null);

//---------------------------------------Boton 1------------------------------------------------------------------------------

		JButton buttonConsultar = new JButton("Consultar Existencias");
		buttonConsultar.setBounds(50, 50, 200, 25);
		frmVentana.getContentPane().add(buttonConsultar);
		buttonConsultar.addActionListener(new ButtonConsultarListener());

//---------------------------------------Boton 2------------------------------------------------------------------------------

		JButton buttonDarAlta = new JButton("Dar de alta un producto");
		buttonDarAlta.setBounds(50, 100, 200, 25);
		frmVentana.getContentPane().add(buttonDarAlta);
		buttonDarAlta.addActionListener(new ButtonDarAltaListener());

//---------------------------------------Boton 3------------------------------------------------------------------------------


		JButton buttonSolicitar = new JButton("Solicitar al proveedor");
		buttonSolicitar.setBounds(50, 150, 200, 25);
		frmVentana.getContentPane().add(buttonSolicitar);
		buttonSolicitar.addActionListener(new ButtonSolicitarListener());



	}

//----------------------------------------Boton 1-----------------------------------------------------------------------------

	class  ButtonConsultarListener implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e)
		{
			Ventana1 v1 = new Ventana1();
			v1.setVisible(true);
			Inventario.this.frmVentana.dispose();
		}

	}


//-----------------------------------------Boton 2----------------------------------------------------------------------------

	class  ButtonDarAltaListener implements ActionListener
		{

			@Override
			public void actionPerformed(ActionEvent e)
			{
				Ventana2 v2 = new Ventana2();
				v2.setVisible(true);
				Inventario.this.frmVentana.dispose();
			}

	}

//------------------------------------------Boton 3---------------------------------------------------------------------------


	class  ButtonSolicitarListener implements ActionListener
		{

			@Override
			public void actionPerformed(ActionEvent e)
			{
				Ventana3 v3 = new Ventana3();
				v3.setVisible(true);
				Inventario.this.frmVentana.dispose();
			}

		}


}