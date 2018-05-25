package Unidad1;

import java.awt.FlowLayout;

import javax.swing.JFrame;

public class Ventana01 extends JFrame
{

	public Ventana01()
	{
		super("Titulo de la Ventana");
		setSize(500,500);
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setVisible(true);
	}
	public static void main(String[] JurgenAntoineTF)
	{
		
		Ventana01 ventana=new Ventana01();
	}

}