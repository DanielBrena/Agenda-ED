package gui;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import persona.Persona;
import listas.Correos;
import listas.Numeros;

public class Panel extends JPanel{
	
	private Correos correos;
	private Numeros numeros;
	//JLabel titulo;
	JButton boton;
	private String titulo;
	JTable tabla;
	DefaultTableModel mt;
	public Panel(String tit){
		super.setLayout(null);
		this.titulo = tit;
		boton = new JButton("Agregar "+titulo);
		
		//Persona persona;
		correos = new Correos();
		numeros = new Numeros();
		//titulo = new JLabel(tit);
		//titulo.setBounds(40, 20, 200, 20);
		
		//add(titulo);
		
		Object[][] datos = {};
		
		String[] columnas = {titulo};
		 mt = new DefaultTableModel(datos,columnas);
		tabla = new JTable(mt);
		/*Object[] nuevaFila = {"12345"};
		Object[] nuevaFila1 = {"12345"};
		Object[] nuevaFila2 = {"12345"};
		Object[] nuevaFila3 = {"12345"};
		
		mt.addRow(nuevaFila);
		mt.addRow(nuevaFila1);
		mt.addRow(nuevaFila2);
		mt.addRow(nuevaFila3);
		*/
		tabla.setPreferredScrollableViewportSize(new Dimension(250, 100));
		JScrollPane scrollpane = new JScrollPane(tabla);
		super.add(scrollpane);
		super.add(boton);
		
		scrollpane.setBounds(10, 20, 250, 60);
		boton.setBounds(30,110,200,20);
		
		boton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String numero = JOptionPane.showInputDialog("Ingresa el " + titulo);
				if(!numero.equals("")){
					Object[] nuevaFila1 = {numero};
					mt.addRow(nuevaFila1);
					
					if(getTitulo().equals("Numeros")){
						numeros.agregar(numero);
					}else{
						correos.agregar(numero);
					}
				}
				
				
			}
		});
		
		
	}
	
	public void configuracion(){
		super.setLayout(null);
		super.setVisible(true);
		
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Correos getCorreos() {
		return correos;
	}

	public void setCorreos(Correos correos) {
		this.correos = correos;
	}

	public Numeros getNumeros() {
		return numeros;
	}

	public void setNumeros(Numeros numeros) {
		this.numeros = numeros;
	}
	
	
	
	
	
	
}
