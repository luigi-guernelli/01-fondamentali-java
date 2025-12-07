/**
 * Progetto P15: Astrassione Avanzata - Enum.
 * 
 * Obiettivo: 
 * 1. Enum per costanti nominate (sicure vs int magici).
 * 2. Metodi in enum (es. getDescrizione()).
 * 3. Concreto: Assegna TipoForma a oggetti Forma (da P14), stampa info.
 * 
 * Compilazione: javac *.java
 * Esecuzione: java Main
 */
public class Main {

    public static void main(String[] args) {
        // Crea forme da P14
        Forma rett = new Rettangolo(5, 3);
        Forma cer = new Cerchio(2);
        
        // Assegna enum TipoForma
        TipoForma tipoRett = TipoForma.RETTANGOLO;
        TipoForma tipoCer = TipoForma.CERCHIO;
        
        // Usa enum per output dinamico
        System.out.println("Forma: " + tipoRett.getDescrizione() + ", Area: " + rett.calcolaArea());
        System.out.println("Forma: " + tipoCer.getDescrizione() + ", Area: " + cer.calcolaArea());
        
        // Demo switch su enum (da P09)
        TipoForma tipo = TipoForma.CERCHIO;
        switch (tipo) {
            case RETTANGOLO:
                System.out.println("È un rettangolo – lati dritti!");
                break;
            case CERCHIO:
                System.out.println("È un cerchio – rotondo!");
                break;
        }
    }
}