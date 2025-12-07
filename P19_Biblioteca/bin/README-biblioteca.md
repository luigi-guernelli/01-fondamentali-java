# P19_Biblioteca: Il Progetto Finale per i Fondamentali di Java!

**Benvenuti nel "Primo Progetto Java"!**
Dopo i **18 progetti standalone** (da Hello World a ArrayList e enum), uniamo **TUTTO** in un'app interattiva: una **Biblioteca digitale** con gestione utenti, libri, prestiti e menu base!


Questo è **P19_Biblioteca**, un'applicazione console **standalone** che integra:
- **OOP avanzata**: Ereditarietà (Persona → Dipendente/Studente), incapsulamento, polimorfismo (da P05-P11).
- **Collezioni dinamiche**: ArrayList per libri e persone (da P14).
- **Input/Output**: Scanner con validazioni, switch per menu, cicli do-while (da P04, P08, P09).
- **Enum e Interfacce**: Stati libri (da P16), calcoli dinamici (da P17 con LocalDate).
- **Struttura pro**: Package per model/service/main (best practices per progetti reali).

**Obiettivo**: Simula una biblioteca reale. Login come **Dipendente** (admin: CRUD libri/utenti) o **Studente** (user: prestiti/restituzioni). **Età calcolata dinamicamente** (anno corrente - anno nascita) e mostrata in output!

## Caratteristiche Principali
- **Utenti**: Persone con nome, cognome, anno nascita (età auto-calcolata). Dipendenti (ruolo) e Studenti (matricola).
- **Libri**: Titolo, autore, ISBN, stato (Disponibile/Prestato via enum).
- **Menu Differenziati**:
  - **Dipendente**: Aggiungi/rimuovi/visualizza libri/persone.
  - **Studente**: Visualizza/presta/restituisci libri (con check matricola).
- **Dati in Memoria**: ArrayList in memoria volatile.
- **Età Dinamica**: Usa `LocalDate.now().getYear()` – es. Nato 2000 → "Età: 25 anni" (su 07/12/2025).

## Requisiti
- **Java**: JDK 8 o superiore (testato su 17+).
- **IDE**: Opzionale – IntelliJ, Eclipse o VS Code con Java Extension.
- **Build**: Solo `javac` e `java` (nessun Maven/Gradle per semplicità).

## Come Avviare (Step-by-Step)
1. **Clona/ il Repo**: