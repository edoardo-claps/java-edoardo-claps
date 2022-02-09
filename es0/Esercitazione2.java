package es0;

import java.util.Scanner;

public class Esercitazione2 {
    // per il confronto utilizzare in un ciclo substring oppure charAt
    // metodo 2 (non lo avevo visto)
    public static void main(String[] args) {

        Scanner tastiera = new Scanner(System.in);

        // creo variabile per il numero di tentativi
        int tentativo = 1;

        // metto il mio codice in un array
        String codice = "53840";

        while (tentativo <= 10) {
            // inizializzo la variabile di controllo a true
            boolean bool = true;

            // faccio inserire il codice
            System.out.println("inserisci un codice di " + codice.length() + " cifre");
            String prova = tastiera.nextLine();

             // CONTROLLO CHE IL CODICE INSERITO SIA DI 5 CIFRE
            if (prova.length() == codice.length()) {

                // controllo il codice inserito e salvo i numeri giusti
                int somma = 0;
                for (int i = 0; i < codice.length(); i++) {

                    if (codice.substring(i, i + 1).equalsIgnoreCase(prova.substring(i, i + 1))) {

                        System.out.println("numero " + prova.substring(i, i + 1) + " CORRETTO");
                        somma += Integer.parseInt(prova.substring(i, i + 1));
                    } else {
                        System.out.println("numero " + prova.substring(i, i + 1) + " ERRATO");

                    }
                }
                System.out.println("la somma dei numeri giusti fa :" + somma);

                // controllo che i due codici corrispondano
                if (codice.equalsIgnoreCase(prova)) {
                    System.out.println("Hai indovinato");
                    tentativo = 11;
                }

                else {
                    bool = false;
                }

                // do il risultato "sbagliato"
                if (bool == false) {
                    tentativo++;
                    System.out.println("CODICE ERRATO");
                    System.out.println("rimangono " + (11 - tentativo) + " tentativi");
                }

            } else {
                System.out.println("IL CODICE DEVE CONTENERE " + codice.length() + " CIFRE");
                tentativo++;
                System.out.println("rimangono " + (10 - tentativo) + " tentativi");

            }
        }
    }
}
