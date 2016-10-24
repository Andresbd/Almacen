import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Ventana2 extends JFrame
		{

			private JPanel contentPane;


			public Ventana2()
			{
				setTitle("Dar de alta");
				setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				setBounds(300, 300, 300, 300);
				contentPane = new JPanel();
				contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
				setContentPane(contentPane);
				contentPane.setLayout(null);

				JButton button = new JButton("Agregar a la lista");
				button.setBounds(50, 100, 200, 25);
				add(button);
				button.addActionListener(new ButtonListener2());


			}
	}