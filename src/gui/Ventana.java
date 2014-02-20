package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

import listas.Personas;

public class Ventana extends JFrame {
	Bar barra;
	VentanaAgregar agregar;
	Personas personas = new Personas();
	
	public Ventana(){
		super.setLayout(null);
		barra = new Bar();
		super.setJMenuBar(barra);
		barra.agregar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				bloquear();
				
				agregar = new VentanaAgregar();
				agregar.addWindowListener(new WindowAdapter(){
					public void windowClosing(WindowEvent evt) {
						personas.agregar(agregar.getPersona());
		               activar();
		               System.out.println(personas);
		            }
					
				});
			}
		});
		;
		
		
		
		
		this.config();
	}
	
	
	public void config(){
		super.setVisible(true);
		super.setBounds(200, 20, 700, 500);
		//super.setResizable(false);
		super.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	public void bloquear(){
		super.setEnabled(false);
	}
	
	public void activar(){
		super.setEnabled(true);
	}
}
