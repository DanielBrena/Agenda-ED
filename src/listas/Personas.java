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
	
	public void eliminar(String nombre){
		NodoPersonas q = this.inicio;
		NodoPersonas t = null;
		boolean band = true;
		
		while(q.getInfo().getNombre() != nombre && band){
			if(q.getLiga() != null){
				t = q;
				q = q.getLiga();
			}else{
				band = false;
			}
		}
		
		if(!band){
			System.out.println("No se encontro a la persona");
		}else{
			if(this.inicio == q){
				this.inicio = q.getLiga();
			}else{
				t.setLiga(q.getLiga());
			}
		}
		//System.out.println(this.inicio.getInfo());
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
