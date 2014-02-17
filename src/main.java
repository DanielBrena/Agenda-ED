import persona.Persona;
import listas.Correos;
import listas.Numeros;
import listas.Personas;
import nodos.NodoCorreos;
import nodos.NodoNumeros;


public class main {
	public static void main(String[] args){
		Correos correos = new Correos();
		Numeros numeros = new Numeros();
		
		NodoCorreos correo1 = new NodoCorreos("daniel_brena@outlook.com");
		NodoCorreos correo2 = new NodoCorreos("daniel_brena@hotmail.com");
		NodoCorreos correo3 = new NodoCorreos("danielbrenaaquino@gmail.com");
		NodoCorreos correo4 = new NodoCorreos("danielbrena@icloud.com");
		
		
		NodoNumeros numero1 = new NodoNumeros("951872743");
		NodoNumeros numero2 = new NodoNumeros("9511586752");
		NodoNumeros numero3 = new NodoNumeros("951182743");
		
		
		
		
		correos.agregar(correo1.getInfo());
		correos.agregar(correo2.getInfo());
		correos.agregar(correo3.getInfo());
		correos.agregar(correo4.getInfo());
		
		numeros.agregar(numero1.getInfo());
		numeros.agregar(numero2.getInfo());
		numeros.agregar(numero3.getInfo());
		numeros.agregar(new NodoNumeros("12345").getInfo());
		System.out.println(numeros.count());
		numeros.eliminar(4);
		//numeros.eliminar();
		
		
		//System.out.println(correos);
		//System.out.println(numeros);
		
		Persona persona = new Persona("Daniel","Francisco I. Madero","11/01/1992",correos,numeros);
		
		Personas personas = new Personas();
		personas.agregar(persona);
		personas.agregar(persona);
		
		System.out.println(personas);
		
		
	}
}
