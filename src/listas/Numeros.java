package listas;

import nodos.NodoNumeros;

public class Numeros {
	private NodoNumeros inicio;
	
	public void agregar(String numero){
		NodoNumeros nuevo = new NodoNumeros(numero);
		nuevo.setLiga(this.inicio);
		this.inicio = nuevo;
	}
	
	public int count(){
		NodoNumeros q = this.inicio;
		int contador = 0;
		
		while(q != null){
			q  = q.getLiga();
			contador++;
		}
		
		return contador;
		
	}
	
	public void eliminar(String numero){
		NodoNumeros q = this.inicio;
		NodoNumeros t = null;
		boolean band = true;
		
		while(q.getInfo() != numero && band){
			if(q.getLiga()  != null){
				t = q;
				q = q.getLiga();
			}else{
				band = false;
			}
		}
		if(!band){
			System.out.println("No se encuentra numero");
		}else{
			if(this.inicio == q){
				this.inicio = q.getLiga();
			}else{
				t.setLiga(q.getLiga());
			}
		}
	}
	
	public NodoNumeros getInicio() {
		return inicio;
	}

	public void setInicio(NodoNumeros inicio) {
		this.inicio = inicio;
	}
	
	public String toString(){
		String resultado = "{ ";
		if(getInicio() == null){
			return "Lista numeros vacia";
			
		}else{
			NodoNumeros q = this.inicio;
			while(q != null){
				resultado += q.getInfo().toString() + ", ";
				q = q.getLiga();
			}
			
		}
		return resultado.substring(0, resultado.length() -1) + " }";
		
		
	}
	
	
}
