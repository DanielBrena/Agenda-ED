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
	
	public void eliminar(int indice){
		if(indice > count()){
			System.out.println("Se salio");
		}else{
			NodoNumeros q = this.inicio;
			int cont = 1;
			
			NodoNumeros aux = null;
			while(cont != indice){
				this.inicio = q.getLiga();
				
				cont++;
			}
			q.setLiga(this.inicio);
			
		}
		/*if(this.inicio != null){
			this.inicio = this.inicio.getLiga();
		}
		*/
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
