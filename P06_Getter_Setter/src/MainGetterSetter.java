/**
 * Classe principale per testare getter e setter.
 * 
 * Obiettivo:
 * 1. Incapsulamento: Attributi privati, accessibili solo via metodi.
 * 2. Getter: Lettura sicura dei dati.
 * 3. Setter: Modifica con validazione es.(eta > 0).
 * 
 * Esecuzione: java Main
 */
public class MainGetterSetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Creazione oggetti con costruttore
		
		// Uso getter iniziali per p1
		System.out.println("=== Profilo iniziale P1 ===");
		// p1 prima: valida
		Persona p1 = new  Persona("Luigi",35);
		System.out.println("Nome: " + p1.getNome());
		System.out.println("Età: " + p1.getEta());
		
		System.out.println(); // Separatore
		
		// Uso setter per modificare p1
		p1.setNome("Mario");
		p1.setEta(40); // Valido
		System.out.println("=== Profilo Aggiornato P1 ===");
		System.out.println("Nuovo Nome: " + p1.getNome());
		System.out.println("Nuova Età: " + p1.getEta());
		
		// Test per validazione setter (eta negativa)
		// p1.setEta(-5); // Dovrebbe stampare errore, non modificare
		
		System.out.println(); // Separatore
		// Stampa p2 (eta protetta a 0)
		System.out.println("=== Profilo P2 (con validazione nel costruttore) ===");
		// p2 dopo: invalida, errore qui nel costruttore
		Persona p2 = new  Persona("Anna", -10); // Eta invalida per test setter post-creazione
		System.out.println("Nome: " + p2.getNome());
		System.out.println("Età: " + p2.getEta());

	}

}
