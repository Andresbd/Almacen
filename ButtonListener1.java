import java.io.*;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


public class  ButtonListener1 implements ActionListener
			{

				@Override
				public void actionPerformed(ActionEvent e)
				{

//------------------------------------------------------------------------------------------------------------------------

											  File archivo = null;
											  FileReader fr = null;
											  BufferedReader br = null;

										      try
										      {
												  archivo = new File ("C:\\Users\\a0133\\Desktop\\MiPrototipo\\Libro.csv");
												  fr = new FileReader (archivo);
												  br = new BufferedReader(fr);

												  String linea;
												  while((linea=br.readLine())!=null)
												  System.out.println(linea);
									          }

									          catch(Exception e1)
									          {

									          	e1.printStackTrace();

									      	  }
									      	  finally
									      	  {

												  try
												  {
													  if( null != fr )
													  {
													     fr.close();
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



