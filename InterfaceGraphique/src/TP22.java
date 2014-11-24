import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
public class TP22 extends JFrame{

	
	public TP22(String nom){
		
		
		setTitle(nom);
		setBounds(100, 100, 300, 350);
		setTitle(nom);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		show();

	}
	public String toString()
	{
		return getTitle();
	}
	
	public void wrapper(Ecouteur e, TP22 f){
		f.addMouseListener(e);
		System.out.println("Nom:"+this.getTitle());
	}
	
	
public static void main(String [] args){
	
		TP22 fen = new TP22("fenetre 1");
		TP22 fen3 = new TP22("fenetre 3");
		Ecouteur e=new Ecouteur();
		
		//fen3.addMouseListener(e);
		//fen.addMouseListener(e);
	}

}
