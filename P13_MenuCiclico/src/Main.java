/**
 * Progetto P13: Menu Ciclico con Scanner, Do-While e Switch.
 * 
 * Obiettivo: 
 * 1. Do-while per loop interattivo (da P10).
 * 2. Combina con switch/menu da P12.
 * 3. Concreto: Ripeti azioni su Persona fino a "esci".
 * 
 * Compilazione: javac *.java
 * Esecuzione: java Main
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int scelta;

        // Do-while: Stampa menu, leggi, processa, ripeti se !=3
        do {
            System.out.println("\n===== MENU PRINCIPALE =====");
            System.out.println("1. Saluta Persona");
            System.out.println("2. Calcola somma (utility)");
            System.out.println("3. Esci");
            System.out.print("Scegli un'opzione (1-3): ");
            scelta = scanner.nextInt();

            // Switch per controllo
            switch (scelta) {
                case 1:
                    System.out.print("Inserisci nome: ");
                    String nome = scanner.next();
                    System.out.print("Inserisci età: ");
                    int eta = scanner.nextInt();
                    Persona p1 = new Persona(nome, eta);
                    if (eta >= 18) {
                        System.out.println("Ciao, " + nome + "! Sei maggiorenne.");
                    } else {
                        System.out.println("Ciao, " + nome + "! Sei minorenne.");
                    }
                    break;
                case 2:
                    System.out.print("Inserisci primo numero: ");
                    int num1 = scanner.nextInt();
                    System.out.print("Inserisci secondo numero: ");
                    int num2 = scanner.nextInt();
                    System.out.println("La somma è: " + (num1 + num2));
                    break;
                case 3:
                    System.out.println("Uscita dal programma... Arrivederci!");
                    break;
                default:
                    System.out.println("Scelta non valida. Riprova.");
            }
        } while (scelta != 3);  // Ripeti finché !=3

        scanner.close();
    }
}