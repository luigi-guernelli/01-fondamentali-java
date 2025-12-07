# repository: 01-fondamentali-java

## Fondamenti di Java: Progetti Base per l'Apprendimento
Benvenuti nel repository 01-java-fundamentals! Questo progetto è una guida pratica e sequenziale ai fondamenti di Java, pensata per principianti e studenti. Partendo da un semplice "Hello World", ogni modulo (P01-P18) introduce un concetto chiave, con codice pulito, commenti didattici e README per esecuzione. L'obiettivo è costruire competenze solide in sintassi, OOP, controlli di flusso, input/output e collezioni, usando esempi concreti e coerenti (es. classe Persona riutilizzata per ereditarietà e liste).

Tutti i progetti sono standalone ma progressivi: compila con javac *.java e esegui con java Main. Richiede JDK 8+ (raccomandato IntelliJ/Eclipse per sviluppo).

# Struttura del Repository
Ogni cartella PXX_NomeProgetto/ contiene:

File .java principali (con Javadoc).
README.md: Obiettivi, prerequisiti, output esempio, note per studenti.
Esempi testati, senza dipendenze esterne.

# Panoramica dei Progetti
Ecco una sintesi dei 18 progetti fondamentali, organizzati per tema. Ogni step builda sul precedente per rinforzare i concetti senza ridondanze.

# Progetto | Tema Principale | Concetti Chiave | Integrazione/Esempio Concreto

P01_Hello_World	| Output e tipi base System.out.println, int/double/String/boolean/char	Stampa variabili primitive – benvenuto generico.

P02_Tipi_Primitivi | Variabili contestualizzate	Dichiarazione/inizializzazione, concatenazione	Profilo "Persona" semplice (nome, età, altezza).

P03_Classi_Oggetti OOP base | Classi, oggetti, attributi, metodi void	Persona con presentati() – creazione multipla.

P04_Attributi_Costruttori_Metodi	OOP esteso	Costruttori parametri, metodi con return/parametri	Persona con init automatica, calcola anno nascita.

P05_Metodi	Utility metodi	Void vs return, parametri, errori base	Calcolatrice standalone (somma, divisione con check).

P06_Getter_Setter	Incapsulamento	Attributi private, getter/setter con validazione	Persona protetta (eta >0, nome non vuoto).

P07_Package	Organizzazione codice	Package/import, multi-classe	Persona in persone, Libro in libri – cross-import.

P08_IfElse	Flusso condizionale	If/else if/else su attributi | Valuta voto Persona (eccellente/sufficiente).

P09_Switch	Scelte multiple | Switch su discreti, default/break	Giorno nascita Persona (LUNEDÌ-MERCOLEDÌ, test invalidi).

P10_Cicli Iterazioni | For/while/do-while | Stampa lista Libro (da P07) con iterazioni variate.

P11_ScannerBase	Input utente base | Scanner nextLine/nextInt + if | Crea Persona da input, verifica maggiorenne.

P12_MenuSemplice Menu decisionale | Scanner + switch | Menu azioni su Persona (saluta, anno nascita).

P13_MenuCiclico	Menu iterativo | Do-while + switch	Loop menu fino a "esci" (saluta/somma ripetute).

P14_Interface Astrazione: Interface | Contratti astratti, polimorfismo	Forma (Rettangolo/Cerchio) – calcolaArea().

P15_Enum | Astrazione: Enum	Costanti + metodi | TipoForma (RET/CER) con switch e descrizione.

P16_UtilityOOP Utilità OOP | toString/override, modificatori accesso	Dipendente/Tirocinante extends Persona – test accesso/override.

P17_Array Collezioni fisse | new[], indici, for/for-each	Array int + Persona[] – itera con presentati().

P18_ArrayList Collezioni dinamiche	| add/remove/contains/size | ArrayList<Persona> – modifica lista, verifica presenza.
