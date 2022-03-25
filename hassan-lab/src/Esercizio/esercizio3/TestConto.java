package Esercizio.esercizio3;

import java.util.Scanner;

public class TestConto {
    public static void main(String[] args) {
        boolean finito = false;

        Scanner tastiera = new Scanner(System.in);
        System.out.println("Vuoi aprire un nuovo conto ? y/n");
        try {

            String apertura = tastiera.nextLine();
            if (apertura.equalsIgnoreCase("y")) {

                System.out.println("inserisci il tuo nome");
                String titolare = tastiera.nextLine();

                String iban = "IT5400003030h44848";

                System.out.println("Effettua il primo versamento per l'apertura");
                double saldo = tastiera.nextDouble();

                ContoCorrente c1 = new ContoCorrente(titolare, iban, saldo);

                System.out.println("saldo: " + c1.getSaldo());


                while (!finito) {

                    System.out.println("Signor " + c1.getTitolare() + " vuole effettuare delle operazioni? y/n" + " saldo: " + c1.getSaldo());
                    String risposta = tastiera.next();

                    if (risposta.equalsIgnoreCase("y")) {
                        System.out.println("Scriva V per Versamento e P per prelievo E per uscire dal servizio");
                        String risposta2 = tastiera.next();

                        if (risposta2.equalsIgnoreCase("v")) {
                            System.out.println("quanto vuole versare?");
                            c1.deposito(tastiera.nextDouble());
                            System.out.println("saldo: " + c1.getSaldo());


                        } else if (risposta2.equalsIgnoreCase("p")) {
                            System.out.println("quanto vuole prelevare?");

                            c1.prelievo(tastiera.nextDouble());
                            System.out.println("saldo: " + c1.getSaldo());

                        } else if (risposta2.equalsIgnoreCase("e")) {
                            System.out.println("Grazie e arrivederci !");
                            finito = true;
                        }

                    } else if (risposta.equalsIgnoreCase("n")) {
                        System.out.println("Grazie e arrivederci !");
                        finito = true;
                    }
                }
            } else if (apertura.equalsIgnoreCase("n")) {
                System.out.println("Grazie e arrivederci !");
            }
        }catch (Exception error){
            System.out.println("hai inserito un valore non possibile ci spiace ma è impossibile elaborare la richiesta");
        }
    }
}
