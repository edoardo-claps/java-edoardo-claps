package com.engim.eccezioni.progetto1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner tastiera =new Scanner(System.in);

        boolean finito=false;
        while (!finito) {
            System.out.println("inserisci meno di 20 caratteri");
            String s = tastiera.nextLine();
            try {
                if (s.length() < 20) {
                    throw new MessaggioTroppoLungoExeption(s.length());
                } else {
                    System.out.println("hai inserito " + s.length() + " caratteri");
                }
            } catch (MessaggioTroppoLungoExeption e) {
                System.out.println(e.getMessage());
            }
            System.out.println("vuoi ancora inserire qualcosa? (s/n)");
            String risposta=tastiera.nextLine();
            if (risposta.equalsIgnoreCase("s")){

            }
            else if (risposta.equalsIgnoreCase("n")) {
                finito=true;
            }
        }
    }

}
