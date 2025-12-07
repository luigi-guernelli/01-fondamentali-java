package biblioteca;

import biblioteca.service.Biblioteca;
import java.util.Scanner;

/**
 * Classe principale: menu interattivo. Scegli Dipendente/Studente -> Menu
 * diversi. Usa do-while per loop menu (da P08).
 */
public class Main {
	public static void main(String[] args) {
		Biblioteca biblio = new Biblioteca(); // Istanzia servizio
		Scanner sc = biblio.getScanner();

		System.out.println("Benvenuti nella Biblioteca Digitale! 📖");
		System.out.println("Scegli il tuo ruolo: 1=Dipendente, 2=Studente, 0=Esci");

		int sceltaRuolo;
		do {
			System.out.print("Ruolo: ");
			sceltaRuolo = sc.nextInt();
			sc.nextLine(); // Consuma

			switch (sceltaRuolo) { // Switch da P04
			case 1: // Menu Dipendente (admin)
				menuDipendente(biblio, sc);
				break;
			case 2: // Menu Studente (user)
				menuStudente(biblio, sc);
				break;
			case 0:
				System.out.println("Arrivederci! 👋");
				break;
			default:
				System.out.println("Scelta invalida!");
			}
		} while (sceltaRuolo != 0);
	}

	// Menu Dipendente: Gestione admin
	private static void menuDipendente(Biblioteca biblio, Scanner sc) {
		System.out.println("\n--- Menu Dipendente ---");
		System.out.println("1. Aggiungi Libro | 2. Rimuovi Libro | 3. Visualizza Libri");
		System.out.println("4. Aggiungi Persona | 5. Visualizza Persone | 0. Esci");

		int scelta;
		do {
			System.out.print("Scelta: ");
			scelta = sc.nextInt();
			sc.nextLine();

			switch (scelta) {
			case 1:
				System.out.print("Titolo: ");
				String tit = sc.nextLine();
				System.out.print("Autore: ");
				String aut = sc.nextLine();
				System.out.print("ISBN: ");
				String isbn = sc.nextLine();
				biblio.aggiungiLibro(tit, aut, isbn);
				break;
			case 2:
				System.out.print("ISBN da rimuovere: ");
				String rem = sc.nextLine();
				biblio.rimuoviLibro(rem);
				break;
			case 3:
				biblio.visualizzaLibri();
				break;
			case 4:
				System.out.println("Aggiungi come Dipendente? 1=Si, 2=No (Studente)");
				int tipo = sc.nextInt();
				sc.nextLine();
				biblio.aggiungiPersona(tipo == 1);
				break;
			case 5:
				biblio.visualizzaPersone(); // Mostra età!
				break;
			case 0:
				System.out.println("Torna al menu principale.");
				break;
			default:
				System.out.println("Opzione non valida!");
			}
		} while (scelta != 0);
	}

	// Menu Studente: Solo prestiti (con check matricola!)
	private static void menuStudente(Biblioteca biblio, Scanner sc) {
		System.out.println("\n--- Menu Studente ---");
		System.out.print("Inserisci la tua matricola: ");
		String mat = sc.nextLine();

		// Verifica studente esiste (usa nuovo metodo da Biblioteca!)
		if (!biblio.studenteEsiste(mat)) {
			System.out.println("❌ Matricola '" + mat + "' non registrata! Chiedi a un Dipendente di aggiungerti.");
			return; // Esci dal menu
		}
		System.out.println("✅ Benvenuto, studente verificato! (Età calcolata dinamicamente nel profilo)");

		System.out.println("1. Visualizza Libri | 2. Prestami un Libro | 3. Restituisci Libro | 0. Esci");

		int scelta;
		do {
			System.out.print("Scelta: ");
			scelta = sc.nextInt();
			sc.nextLine(); // Consuma newline (da P09 su Scanner)

			switch (scelta) {
			case 1:
				biblio.visualizzaLibri();
				break;
			case 2:
				System.out.print("ISBN del libro: ");
				String isbnP = sc.nextLine();
				biblio.prestaLibro(mat, isbnP); // Stampa età studente nel prestito!
				break;
			case 3:
				System.out.print("ISBN da restituire: ");
				String isbnR = sc.nextLine();
				biblio.restituisciLibro(isbnR);
				break;
			case 0:
				System.out.println("Torna al menu principale.");
				break;
			default:
				System.out.println("Opzione non valida!");
			}
		} while (scelta != 0);
	}
}