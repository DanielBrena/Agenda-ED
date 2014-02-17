package nodos;

public class NodoCorreos {
	private String info;
	private NodoCorreos liga;
	
	
	public NodoCorreos(){
		
	}
	
	public NodoCorreos(String info){
		this.info = info;
		this.liga = null;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public NodoCorreos getLiga() {
		return liga;
	}

	public void setLiga(NodoCorreos liga) {
		this.liga = liga;
	}
	
	
	
}
