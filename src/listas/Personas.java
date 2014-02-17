package listas;

import nodos.NodoPersonas;
import persona.Persona;

public class Personas {

	private NodoPersonas inicio;

	public void agregar(Persona persona){
		NodoPersonas q = new NodoPersonas(persona) ;
		q.setLiga(this.inicio);
		this.inicio = q;
	}
	


	public NodoPersonas getInicio() {
		return inicio;
	}

	public void setInicio(NodoPersonas inicio) {
		this.inicio = inicio;
	}
	
	public String toString(){
		String resultado = "{ ";
		if(getInicio() == null){
			return "Lista personas esta vacia";
		}else{
			NodoPersonas q = this.inicio;
			while(q != null){
				resultado += q.getInfo().toString() + ",\n\n";
				q = q.getLiga();
				
			}
			return resultado.substring(0,resultado.length() -1 ) +" }";
		}
		
	}
	
	
	
	
	
}
