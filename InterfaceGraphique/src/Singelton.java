import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class Singelton {
	
	Ecouteur e;
	
	public Singelton(Fenetre f){
		if(e==null){
			Ecouteur e=new Ecouteur();
		}
		else
			f.addMouseListener(e);
		
	}

}
