package gui;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import persona.Persona;

public class VentanaAgregar extends JFrame{
	JLabel nombre;
	JLabel direccion;
	JLabel fechaNacimiento;
	
	JTextField nombre_;
	JTextField direccion_;
	JTextField fechaNacimiento_;
	
	Panel panelNumeros;
	Panel panelCorreos;
	Persona persona;
	JButton enviar;
	public VentanaAgregar(){
		this.config();
		
		enviar = new JButton("Enviar");
		
		nombre =new JLabel("Nombre: ");
		direccion = new JLabel("Direccion: ");
		fechaNacimiento = new JLabel("Fecha Nacimiento: ");
		
		nombre_ = new JTextField();
		direccion_ = new JTextField();
		fechaNacimiento_ = new JTextField();
		
		nombre.setBounds(10, 20, 200, 20);
		direccion.setBounds(10, 50, 200, 20);
		fechaNacimiento.setBounds(10, 80, 200, 20);
		
		nombre_.setBounds(210, 20, 200, 20);
		direccion_.setBounds(210, 50, 200, 20);
		fechaNacimiento_.setBounds(210, 80, 200, 20);
		
		panelNumeros = new Panel("Numeros");
		panelNumeros.setBounds(50, 100, 300, 200);
		
		panelCorreos = new Panel("Correos");
		panelCorreos.setBounds(50, 300, 300, 200);
		
		enviar.setBounds(370, 400, 100, 20);
		
		super.add(nombre);
		super.add(direccion);
		super.add(fechaNacimiento);
		
		super.add(nombre_);
		super.add(direccion_);
		super.add(fechaNacimiento_);
		
		super.add(panelNumeros);
		super.add(panelCorreos);
		
		
		super.add(enviar);
		enviar.setEnabled(true);
		
		enviar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				//System.out.println(panelNumeros.getNumeros());
				//System.out.println(panelCorreos.getCorreos());
				
				//panelCorreos = new Panel("Numeros");
				//panelCorreos = new Panel("Correos");
				
				/*limpiarTabla(panelNumeros.mt);
				limpiarTabla(panelCorreos.mt);
				panelNumeros.setNumeros();
				panelCorreos.setCorreos(null);
				*/
				if(!nombre_.getText().equals("") && !direccion_.getText().equals("") && !fechaNacimiento_.getText().equals("")){
					enviar.setEnabled(false);
					nombre_.setEnabled(false);
					direccion_.setEnabled(false);
					fechaNacimiento_.setEnabled(false);
					panelCorreos.boton.setEnabled(false);
					panelNumeros.boton.setEnabled(false);
					persona = new Persona(nombre_.getText(), direccion_.getText(), fechaNacimiento_.getText(), panelCorreos.getCorreos(), panelNumeros.getNumeros());
					//System.out.println(persona);
					JOptionPane.showMessageDialog(null,"Se ah agregado, cierre ahora la ventana");
				}
				
				
			}
			
			
		});
	
		
		
		
		
		
		
		
	}
	
	
 
   
	
	public void config(){
		super.setLayout(null);
		super.setVisible(true);
		super.setTitle("Agregar");
		super.setBounds(300, 100, 500, 500);
		
		
	}
	
	public void limpiarTabla(DefaultTableModel tabla){
		int a = tabla.getRowCount() -1;
		for(int i = a;  i>= 0;i--){
			tabla.removeRow(i);
		}
	}





	public Persona getPersona() {
		return persona;
	}





	public void setPersona(Persona persona) {
		this.persona = persona;
	}
	
	
	
	
	
}
