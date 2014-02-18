package listas;

import nodos.NodoCorreos;

public class Correos {
	
	private NodoCorreos inicio;
	
	public void agregar(String correo){
		NodoCorreos nuevo = new NodoCorreos(correo);
		nuevo.setLiga(this.inicio);
		this.inicio = nuevo;
	}
	
	public void eliminar(String correo){
		NodoCorreos q = this.inicio;
		NodoCorreos t = null;
		boolean band = true;
		
		while(q.getInfo() != correo &&  band){
			if(q.getLiga() != null){
				t = q;
				q = q.getLiga();
			}else{
				band = false;
			}
		}
		
		if(!band){
			System.out.println("No se encuentra correo");
		}else{
			if(this.inicio == q){
				this.inicio = q.getLiga();
			}else{
				t.setLiga(q.getLiga());
			}
		}
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
