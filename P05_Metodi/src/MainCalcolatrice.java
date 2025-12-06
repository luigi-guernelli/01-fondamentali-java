/**
 * Main per testare la classe Calcolatrice.
 * 
 * Obiettivo: Dimostrare metodi con/senza parametri e return.
 */
public class MainCalcolatrice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calcolatrice calc = new Calcolatrice();
		
		// Test metodi
		calc.saluta();
		System.out.println("Somma: " + calc.somma(10, 5));
		System.out.println("Sottrazione: " + calc.sottrazione(10, 5));
		System.out.println("Moltiplicazione: " + calc.moltiplicazione(10, 5));
		System.out.println("Divisione: " + calc.divisione(10, 5));
		System.out.println("Divisione per zero(0): " + calc.divisione(10, 0)); // Errore gestito

	}

}
