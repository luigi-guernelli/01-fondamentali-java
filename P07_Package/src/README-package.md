# Progetto: Package in Java - Persona Biblioteca

## Obiettivo
Imparare ad usare i **package** per organizzare classi correlate. I package sono come "cartelle" logiche nel codice: evitano nomi duplicati e promuovono il riutilizzo es.('import persona.Persona').

## Struttura del progetto
- 'src/persona/Persona.java': Classe per rappresentare una persona (con nome ed età).
- 'src/bibliotece/Libro.java': Classe per un libro (titolo e autore).
- 'src/Main.java': Classe principale che importa e usa le classi dai package.

## Come Compilare ed Eseguire
1. Crea la struttura cartelle 'src/persona'; 'src/biblioteca', 'src/'
2. Salva i file nelle cartelle corrette.
3. Apri terminale nella root del progetto.
4. Compila: 'javac -d . src/*.java src/persona/*.java src/biblioteca/*.java'
5. Esegui: 'java Main'
6. Output atteso: Ciao mi chiamo Luigi ho 20 anni.
				  Il libro "Il signore degli Anelli" scritto da Tolkien.
				  Luigi sta leggendo: Il Signore degli anelli da Tolkien.
				  
## Concetti chiave
- **Dichiarazione**: 'package nomePackage;' all'inizio del file. 
- **Import**: 'import packag.Classe;' per usare classi esterne.
- **Vantaggi**: Codice modulare, namespace es.(evita conflitti tra 'Persona')
- **Errori Comuni**: Dimenticare il package o import; struttura cartelle non allineata.

## Eveluzione progetto
Aggiungere metodi per "prestito libri" o ereditarietà es.('Studente extends Persona')
