package gui;
import javax.swing.*;

public class Bar extends JMenuBar{
	JMenu menu;
	JMenuItem agregar;
	JMenuItem modificar;
	JMenuItem eliminar;
	JMenuItem buscar;
	JMenuItem salir;
	
	public Bar(){
		
		menu = new JMenu("Archivo");
		agregar = new JMenuItem("Agregar");
		modificar = new JMenuItem("Modificar");
		eliminar = new JMenuItem("Eliminar");
		buscar = new JMenuItem("Buscar");
		salir = new JMenuItem("Salir");
		
		menu.add(agregar);
		menu.add(modificar);
		menu.add(eliminar);
		menu.add(buscar);
		menu.add(salir);
		
		super.add(menu);
	}
}
