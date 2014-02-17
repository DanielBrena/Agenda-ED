package nodos;

public class NodoNumeros {
	
	private String info;
	private NodoNumeros liga;
	
	public NodoNumeros(){
		
	}
	
	public NodoNumeros(String info){
		this.info = info;
		this.liga = null;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public NodoNumeros getLiga() {
		return liga;
	}

	public void setLiga(NodoNumeros liga) {
		this.liga = liga;
	}
	
	
}
