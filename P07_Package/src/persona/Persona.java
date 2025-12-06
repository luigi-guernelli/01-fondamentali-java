/**
 * Classe Persona in package 'persone': Incapsulata con getter/setter.
 * 
 * Coerenza: Estende P06 (private attributi, validazione).
 */
package persona;

import biblioteca.Libro;

//Definizione della classe
public class Persona {
 // Attributi privati (incapsulamento)
 private String nome;
 private int eta;

 // Costruttore
 public Persona(String nome, int eta) {
     this.nome = nome;
     this.eta = eta;
 }

 // Metodo per presentarsi
 public void presentaPersona() {
     System.out.println("Ciao, mi chiamo " + nome + " e ho " + eta + " anni.");
 }

 // Nuovo metodo: Interagisce con Libro (coerenza tra package)
 public void leggiLibro(Libro libro) {
     System.out.println(nome + " sta leggendo: " + libro.getTitolo() + " di " + libro.getAutore() + ".");
 }

 // Getter per attributi (buona pratica)
 public String getNome() { return nome; }
 public int getEta() { return eta; }
}