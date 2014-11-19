import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class Fenetre extends JFrame {

	public static void main(String[] args) {
		Fenetre fenetre = new Fenetre();
		String title = "a";
		String largeur, longueur;
		int number1, number2;
		while (!title.isEmpty()) {
			largeur = JOptionPane.showInputDialog("Entrer une largueur ");
			longueur = JOptionPane.showInputDialog("Entrer une longueur ");
			title = JOptionPane.showInputDialog("Entrer un titre ");
			number1 = Integer.parseInt(largeur);
			number2 = Integer.parseInt(longueur);

			
			//fenetre.setUndecorated(false);// enleve le contour du JFrame (avec
											// true enleve le contour et les
											// bouton de controle comme une
											// JWindows), a activer avant le
											// setVisible
			fenetre.setVisible(true);
			fenetre.setSize(number1, number2);
			fenetre.setTitle(title);
			fenetre.setLocationRelativeTo(null);// centre au milieu de l'ecran
												// avec parametre null
			fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			fenetre.setResizable(true);// Permet le redimentionnement de l'ecran
										// alors que false l'interdit
			fenetre.setAlwaysOnTop(false);// garde au premier plan avec true
			// fenetre.setBounds(50, 100, 300, 150);//les 2 premiers parametre
			// represente la taille de la fenetre et les autres le
			// positionnement dans lecran
			// JOptionPane p=new JOptionPane("Voici mon message");
			// p.setVisible(true);
			// fenetre.add(p);
			// JOptionPane.showMessageDialog (null, "Messagehere", "Title here",
			// JOptionPane.PLAIN_MESSAGE);
			
			JPanel p = new JPanel();
			p.setBackground(Color.yellow);
			Image i = new ImageIcon("C:\Users\Public\Pictures/Sample Pictures/Hortensias.jpg");
			fenetre.add(p);
			
		}
		System.exit(0);

	}
}
