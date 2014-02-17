package persona;

import listas.Correos;
import listas.Numeros;

public class Persona {
	private String nombre;
	private String direccion;
	private String fechaNacimiento;
	
	private Correos correos;
	private Numeros numeros;
	
	
	
	public Persona(String nombre, String direccion, String fechaNacimiento,
			Correos correos, Numeros numeros) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.fechaNacimiento = fechaNacimiento;
		this.correos = correos;
		this.numeros = numeros;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
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
	
	public String toString(){
		String resultado = "";
		
		resultado += "Nombre: " + getNombre() + "\n";
		resultado += "Fecha Nacimiento: " + getFechaNacimiento() + "\n";
		resultado += "Direccion: " + getDireccion() + "\n";
		resultado += "Correos: " + getCorreos() + "\n";
		resultado += "Numeros" + getNumeros();
		
		return resultado;
	}
	
	
}
