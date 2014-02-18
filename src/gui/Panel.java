package gui;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class Panel extends JPanel{
	
	JLabel titulo;
	
	public Panel(String tit){
		super.setLayout(null);
		
		titulo = new JLabel(tit);
		titulo.setBounds(40, 20, 200, 20);
		
		add(titulo);
		
		
		
	}
	
	public void configuracion(){
		super.setLayout(null);
		super.setVisible(true);
		
	}
	
	
	
}
