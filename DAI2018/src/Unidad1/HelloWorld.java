package Unidad1;


import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class HelloWorld extends JFrame
{
	private JLabel lbl_hello,lbl_hello1,lbl_hello2;
	
	public HelloWorld ()
	{
		super("Hello World !!!!");
		setLayout (new FlowLayout());
		setSize(400,100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		lbl_hello = new JLabel("Hello World !!!!");
		lbl_hello1 = new JLabel("3A TICS");
		lbl_hello2 = new JLabel("Vamos por la acreditacion!!!");
		
		add(lbl_hello);
		add(lbl_hello1);
		add(lbl_hello2);
		//pack();
		
		setVisible(true);
	}
	
	public static void main (String [] JurgenAntoineTF)
	{
		
		HelloWorld ventana = new HelloWorld();
	}
}
