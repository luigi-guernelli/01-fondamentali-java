package biblioteca.service;

import biblioteca.model.Libro;
import biblioteca.model.Persona;
import biblioteca.model.Dipendente;
import biblioteca.model.Studente;
import java.util.ArrayList; // Da P14
import java.util.List;
import java.util.Scanner; // Da P09 per input

/**
 * Gestore centrale della biblioteca.
 * Usa ArrayList per libri e persone.
 * Metodi per CRUD (Create, Read, Update, Delete) e prestiti.
 */
public class Biblioteca {
    private List<Libro> libri;         // Lista dinamica libri
    private List<Persona> persone;     // Lista dinamica persone (Dipendenti + Studenti)
    private Scanner scanner;           // Per input menu

    public Biblioteca() {
        this.libri = new ArrayList<>();    // Init ArrayList
        this.persone = new ArrayList<>();
        this.scanner = new Scanner(System.in);
    }

    // Aggiungi libro (da P12: metodi con parametri)
    public void aggiungiLibro(String titolo, String autore, String isbn) {
        Libro nuovo = new Libro(titolo, autore, isbn);
        libri.add(nuovo); // Aggiungi a lista
        System.out.println("Libro aggiunto: " + nuovo);
    }

    // Rimuovi libro per ISBN (usa ciclo for-each da P13)
    public void rimuoviLibro(String isbn) {
        for (Libro l : libri) {
            if (l.getIsbn().equals(isbn)) {
                libri.remove(l);
                System.out.println("Libro rimosso: " + l);
                return;
            }
        }
        System.out.println("Libro non trovato!");
    }

    // Visualizza tutti i libri (ciclo while da P08? No, for-each meglio)
    public void visualizzaLibri() {
        if (libri.isEmpty()) {
            System.out.println("Nessun libro disponibile.");
            return;
        }
        for (Libro l : libri) {
            System.out.println(l);
        }
    }

    // Aggiungi persona (generico, ma specifica tipo)
    public void aggiungiPersona(boolean isDipendente) {
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Cognome: ");
        String cognome = scanner.nextLine();
        System.out.print("Anno nascita: ");
        int anno = scanner.nextInt();
        scanner.nextLine(); // Consuma newline

        if (isDipendente) {
            System.out.print("Ruolo: ");
            String ruolo = scanner.nextLine();
            Dipendente d = new Dipendente(nome, cognome, anno, ruolo);
            persone.add(d);
            System.out.println("Dipendente aggiunto: " + d); // Stampa con età!
        } else {
            System.out.print("Matricola: ");
            String mat = scanner.nextLine();
            Studente s = new Studente(nome, cognome, anno, mat);
            persone.add(s);
            System.out.println("Studente aggiunto: " + s); // Età calcolata!
        }
        
    }
    
    // Nuovo metodo: Verifica se studente esiste (usa instanceof da P10 e for-each da P13)
    public boolean studenteEsiste(String matricola) {
        for (Persona p : persone) {
            if (p instanceof Studente && ((Studente) p).getMatricola().equals(matricola)) {
                return true;
            }
        }
        return false;
    }

    // Presta libro a studente (trova studente per matricola, aggiorna stato)
    public void prestaLibro(String matricola, String isbn) {
        Studente studente = null;
        for (Persona p : persone) {
            if (p instanceof Studente && ((Studente) p).getMatricola().equals(matricola)) {
                studente = (Studente) p;
                break;
            }
        }
        if (studente == null) {
            System.out.println("Studente non trovato!");
            return;
        }

        Libro libro = null;
        for (Libro l : libri) {
            if (l.getIsbn().equals(isbn) && l.getStato() == Libro.StatoLibro.DISPONIBILE) {
                libro = l;
                break;
            }
        }
        if (libro != null) {
            libro.setStato(Libro.StatoLibro.PRESTATO);
            System.out.println("Libro prestato a " + studente + ". Età: " + studente.calcolaEta() + " anni.");
        } else {
            System.out.println("Libro non disponibile!");
        }
    }

    // Restituisci libro (inverti stato)
    public void restituisciLibro(String isbn) {
        for (Libro l : libri) {
            if (l.getIsbn().equals(isbn) && l.getStato() == Libro.StatoLibro.PRESTATO) {
                l.setStato(Libro.StatoLibro.DISPONIBILE);
                System.out.println("Libro restituito: " + l);
                return;
            }
        }
        System.out.println("Libro non prestato!");
    }

    // Visualizza persone (con età!)
    public void visualizzaPersone() {
        if (persone.isEmpty()) {
            System.out.println("Nessuna persona registrata.");
            return;
        }
        for (Persona p : persone) {
            System.out.println(p); // Chiama toString con età calcolata
        }
    }

    // Getter per scanner (per main)
    public Scanner getScanner() { return scanner; }
}