/**
 * Interfaccia Forma: Contratto astratto per calcolare area.
 * 
 * Fondamenti: Interface = metodi pubblici astratti (no corpo).
 * Classi implementanti devono fornire @Override.
 * Abilita: Polimorfismo, estensibilità (aggiungi Triangolo senza cambiare Main).
 */
public interface Forma {
    
    // Metodo astratto: Firma solo, no implementazione
    double calcolaArea();
}