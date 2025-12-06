/**
 * Classe principale per eseguire il programma.
 * 
 * Obiettivo:
 * 1. Dimostrare creazioni e uso di oggetti da una classe personalizzata.
 * 2. Introduzione base e OOP: classi, oggetti, attributi e metodi
 * 
 * Esecuzione: java Main
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Creazione di un oggetto della classe Persona
		Persona p1 = new Persona();
		
		// Assegnazione valori agli attributi (setter manuali)
		p1.nome = "Mario"; 
		p1.eta = 35;
		
		// Richiamo del metodo per output
		p1.presentati();
		
		// Esempio di Secondo oggetto di aiuto (generico, no cicli)
		Persona p2 = new Persona();
		p2.nome = "Anna";
		p2.eta = 25;
		p2.presentati();
		

	}

}
