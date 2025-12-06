/**
 * Progetto P09: Controlli di Flusso - Switch.
 * 
 * Obiettivo: 
 * 1. Switch per rami su valori discreti (case 1-7).
 * 2. Break per uscita da case, default per valori non gestiti.
 * 3. Concreto: Determina giorno settimana da "giornoNascita" (1=Lun, 7=Dom), 
 *    con validazione e demo errore/valido su Persona (da P06/P08).
 * 
 * Compilazione: javac Main.java
 * Esecuzione: java Main
 */
public class Main {

    public static void main(String[] args) {
        // Crea Persona con giorno nascita invalido (8) per demo errore
        Persona p1 = new Persona("Luigi", 20, 1);  // 1=Lun, ..., 7=Dom
        
        System.out.println("=== Primo Test: Giorno Iniziale (Invalido) ===");
        System.out.println("Profilo: " + p1.getNome() + ", Età: " + p1.getEta());
        
        int giorno = p1.getGiornoSettimana();  // Getter da P06
        System.out.println("Giorno della settimana scelto: ");
        
        // Switch per determinare nome giorno
        switch (giorno) {
            case 1:
                System.out.println("LUNEDÌ");
                break;
            case 2:
                System.out.println("MARTEDÌ");
                break;
            case 3:
                System.out.println("MERCOLEDÌ");
                break;
            case 4:
                System.out.println("GIOVEDÌ");
                break;
            case 5:
                System.out.println("VENERDÌ");
                break;
            case 6:
                System.out.println("SABATO");
                break;
            case 7:
                System.out.println("DOMENICA");
                break;
            default:
                System.out.println("Giorno non valido!");  // Per valori fuori 1-7
        }
        
        // Demo secondo: Cambia con setter (valido: 3 = MERCOLEDÌ)
        p1.setGiornoNascita(5);
        System.out.println("\n=== Secondo Test: Dopo Cambio Giorno ===");
        System.out.println("Cambia il giorno con: " + p1.getGiornoSettimana());
        
        int nuovoGiorno = p1.getGiornoSettimana();
        switch (nuovoGiorno) {  // Switch ripetuto per demo
            case 1:
                System.out.println("LUNEDÌ");
                break;
            case 2:
                System.out.println("MARTEDÌ");
                break;
            case 3:
                System.out.println("MERCOLEDÌ");  // Es. output qui
                break;
            case 4:
                System.out.println("GIOVEDÌ");
                break;
            case 5:
                System.out.println("VENERDÌ");
                break;
            case 6:
                System.out.println("SABATO");
                break;
            case 7:
                System.out.println("DOMENICA");
                break;
            default:
                System.out.println("Giorno non valido!");
        }
    }
}