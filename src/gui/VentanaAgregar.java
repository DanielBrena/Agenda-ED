package gui;
import javax.swing.*;

public class VentanaAgregar extends JFrame{
	JLabel nombre;
	JLabel direccion;
	JLabel fechaNacimiento;
	
	JTextField nombre_;
	JTextField direccion_;
	JTextField fechaNacimiento_;
	
	Panel panelNumeros;
	public VentanaAgregar(){
		this.config();
		
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
		
		super.add(nombre);
		super.add(direccion);
		super.add(fechaNacimiento);
		
		super.add(nombre_);
		super.add(direccion_);
		super.add(fechaNacimiento_);
		
		
	}
	
	
 
   
	
	public void config(){
		super.setLayout(null);
		super.setVisible(true);
		super.setBounds(300, 100, 500, 500);
		
		
	}
}
