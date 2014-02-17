package nodos;

import persona.Persona;

public class NodoPersonas {
	
	private Persona info;
	private NodoPersonas liga;
	
	public NodoPersonas(Persona info){
		this.info = info;
		this.liga = null;
	}
	
	

	public Persona getInfo() {
		return info;
	}

	public void setInfo(Persona info) {
		this.info = info;
	}

	public NodoPersonas getLiga() {
		return liga;
	}

	public void setLiga(NodoPersonas liga) {
		this.liga = liga;
	}
	
	
}
