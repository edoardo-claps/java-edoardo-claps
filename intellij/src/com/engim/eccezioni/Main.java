package com.engim.eccezioni;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner tastiera =new Scanner(System.in);

       // String nome = "sedia";
       // int a = Integer.parseInt(nome); //errore brutto

        int a1 =0;
        boolean inserito = false;

        while (!inserito) {
            try {
                System.out.println("inserisci numero");
                a1 = Integer.parseInt(tastiera.nextLine());
                inserito=true;
            } catch (Exception e) {
                System.out.println("dovevi mettere un numero " + e.getMessage());
            } finally {
                System.out.println("hai inserito " + a1);
            }
        }
    }
}