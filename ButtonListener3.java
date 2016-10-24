import java.io.*;

import javax.swing.JOptionPane;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


public class  ButtonListener3 implements ActionListener
{

	@Override
	public void actionPerformed(ActionEvent e)
	{
				String articulo = JOptionPane.showInputDialog("¿Qué artículo se va a solicitar?");
				JOptionPane.showMessageDialog(null,"El artículo se ha solicitado al proveedor", "", JOptionPane.INFORMATION_MESSAGE);


	}


}





