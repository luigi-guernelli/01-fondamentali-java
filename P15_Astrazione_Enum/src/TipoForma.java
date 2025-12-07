/**
 * Enum TipoForma: Costanti per tipi di forma.
 * 
 * Fondamenti: Enum = tipi enumerati (public static final impliciti).
 * Aggiungi metodi: getDescrizione() per logica extra.
 */
public enum TipoForma {
    
    RETTANGOLO("Rettangolo con base e altezza"),
    CERCHIO("Cerchio con raggio");
    
    private final String descrizione;
    
    TipoForma(String descrizione) {
        this.descrizione = descrizione;
    }
    
    public String getDescrizione() {
        return descrizione;
    }
}