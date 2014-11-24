import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
public class TP2 extends JFrame implements MouseListener {
	public TP2(){
		JFrame fenetre = new JFrame("Ma Fenetre");
		fenetre.setBounds(100, 100, 300, 350);
		//fenetre.addMouseListener(this);
		//fenetre.addMouseListener(new Ecouteur());
		/*fenetre.addMouseListener(new MouseAdapter(){public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			System.out.println("je presse : x = "+e.getX()+" y = "+e.getY());
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			System.out.println("je relache : x = "+e.getX()+" y = "+e.getY());
		}});*/
		

		fenetre.show();
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String [] args){
		TP2 fen = new TP2();
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
		System.out.println("je presse : x = "+e.getX()+" y = "+e.getY());
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("je relache : x = "+e.getX()+" y = "+e.getY());
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
