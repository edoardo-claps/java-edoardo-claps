package es0;

import java.util.Scanner;

public class Esercitazione {
    /*
     * Si scriva un algoritmo per un semplice gioco che chieda di indovinare un
     * codice numerico di cinque cifre. Quando l'utente scrive la risposta, il
     * programma restituisce due valori: il numero di cifre al posto giusto e la
     * somma di queste cifre. Per esempio, se il codice segreto è 53840 e l'utente
     * ipotizza 83241, le cifre 3 e 4 sono al posto giusto. Il programma perciò
     * restituirebbe in output i numeri 2 (cifre corrette) e 7 (somma). Si permetta
     * all'utente di provare per un numero prefissato di volte (per esempio 10
     * volte)
     */
    public static void main(String[] args) {

        Scanner tastiera = new Scanner(System.in);
        // creo delle variabili
        int n = 5;
        int tentativo = 1;

        // metto il mio codice in un array
        int[] codice = { 5, 3, 8, 4, 0 };

        // creo array per immagazzinare i numeri corretti
        int[] risultato = new int[n];
        int[] prova =new int [n];


        while (tentativo <= 10) {
            //inizializzo la variabile di controllo a true
            boolean bool = true;

            // faccio inserire il codice
            System.out.println("inserisci un codice di " +codice.length + " cifre" );

            for (int i = 0; i < n; i++) {
                System.out.println("Inserisci la cifra numero " + (i + 1) );
                prova[i] = Integer.parseInt(tastiera.nextLine());
            }

            // controllo il codice inserito e salvo quelli giusti
            int somma=0;
            for (int i = 0; i < n; i++) {
                if (codice[i] == prova[i]) {
                    risultato[i] = prova[i];
                    System.out.println("numero " + prova[i] + " CORRETTO");
                    somma+=prova[i];
                } else {
                    System.out.println("numero " + prova[i] + " ERRATO");

                }
            }
            System.out.println("la somma dei numeri giusti fa :"+ somma);

            // controllo che i due codici corrispondano
            for (int i = 0; i < n; i++) {
                if (codice[i] != risultato[i]) {
                    bool = false;
                }
            }
            //do il risultato
            if (bool == false) {
                tentativo++;
                System.out.println("CODICE ERRATO");

            } else {
                System.out.println("Hai indovinato");
                tentativo = 11;
            }

        }
    }
}


//per il confronto utilizzare in un ciclo substring oppure charAt
//metodo 2 (non lo avevo visto)