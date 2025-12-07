/**
 * Progetto P16: Strumenti di Utilità OOP - toString, Override, Modificatori Accesso.
 * 
 * Obiettivo: 
 * 1. Override toString() per output leggibile.
 * 2. Override metodi per polimorfismo in ereditarietà.
 * 3. Modificatori accesso per sicurezza (private/default/protected/public).
 * 4. Concreto: Ereditarietà su Persona → Dipendente/Tirocinante; test accesso/output.
 * 
 * Compilazione: javac *.java
 * Esecuzione: java Main
 */
public class Main {

    public static void main(String[] args) {
        // Crea oggetti (polimorfismo: tipo Persona)
        Persona p1 = new Dipendente("Luigi", 30, 2500.0, "IT");  // Stipendio=2500
        Persona p2 = new Tirocinante("Anna", 25, 0.0, "Marketing");  // Stipendio=0 (tirocinio)
        
        // Test Override: Chiama metodo parent (runtime: versione sottoclasse)
        System.out.println("=== Test Override presentati() ===");
        p1.presentati();  // "Sono Luigi, 30 anni, reparto IT – Dipendente con stipendio 2500.0"
        p2.presentati();  // "Sono Anna, 25 anni, reparto Marketing – Tirocinante senza stipendio"
        
        // Test toString(): Stampa automatica leggibile
        System.out.println("\n=== Test toString() ===");
        System.out.println(p1);  // "Persona {nome=Luigi, eta=30, reparto=IT, tipo=Dipendente, stipendio=2500.0}"
        System.out.println(p2);  // "Persona {nome=Anna, eta=25, reparto=Marketing, tipo=Tirocinante, stipendio=0.0}"
        
        // Test Modificatori Accesso (da Main: package default)
        Dipendente d1 = (Dipendente) p1;  // Cast per accesso sottoclasse
        System.out.println("\n=== Test Modificatori Accesso ===");
        System.out.println("Accesso public reparto: " + p1.reparto);  // OK: ovunque
        // System.out.println(p1.nome);  // ERRORE: private (solo dentro classe)
        System.out.println("Accesso default eta (stesso package): " + p1.eta);  // OK: default
        System.out.println("Accesso protected stipendio (da sottoclasse): " + d1.stipendio);  // OK: protected
    }
}