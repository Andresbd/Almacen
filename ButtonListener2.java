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


public class  ButtonListener2 implements ActionListener
{

	@Override
	public void actionPerformed(ActionEvent e)
	{

		fileWritter();
		JOptionPane.showMessageDialog(null,"Artículo agregado", "", JOptionPane.INFORMATION_MESSAGE);
	}

	public void fileWritter()
	{
//------------------------------------------------------------------------------------------------------------------------

								String articulo = JOptionPane.showInputDialog("Introduce el artículo");

								FileWriter fichero = null;
								PrintWriter pw = null;
								try
									{
								    	fichero = new FileWriter("C:\\Users\\a0133\\Desktop\\MiPrototipo\\Libro.csv", true);
							            pw = new PrintWriter(fichero);


						                pw.println(articulo);

							        }

							    catch (Exception e1)
							        {
								    	e1.printStackTrace();
								    }

								finally
								    {
								           try
								           {

								           		if (null != fichero)
								           		{
								           	    fichero.close();
												}
								           }

								           catch (Exception e2)
								           {
								              e2.printStackTrace();
								           }

       						 }

//------------------------------------------------------------------------------------------------------------------------
	}


}





