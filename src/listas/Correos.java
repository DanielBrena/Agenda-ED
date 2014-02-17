package listas;

import nodos.NodoCorreos;

public class Correos {
	
	private NodoCorreos inicio;
	
	public void agregar(String correo){
		NodoCorreos nuevo = new NodoCorreos(correo);
		nuevo.setLiga(this.inicio);
		this.inicio = nuevo;
	}
	
	

	public NodoCorreos getInicio() {
		return inicio;
	}

	public void setInicio(NodoCorreos inicio) {
		this.inicio = inicio;
	}
	
	public String toString(){
		String resultado = "{ ";
		if(getInicio() == null){
			return "Lista de correo vacia";
		}else{
			NodoCorreos q = this.inicio;
			while( q != null){
				resultado += q.getInfo().toString() + " , ";
				q = q.getLiga();
			}
			
		}
		return resultado.substring(0, resultado.length() -1) + " }";
	}
	
	
}
