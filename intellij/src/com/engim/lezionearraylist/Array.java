package com.engim.lezionearraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        ArrayList<String> lista= new ArrayList<>();
       /* lista.add("pane");
        lista.add("mozzarella");
        lista.add("pomodoro");
        lista.add("lattuga");
        lista.add("mandarini");
        lista.remove(4);
        for (String elemento: lista) {
            System.out.println("Hai inserito "+elemento);
        }
        System.out.println(lista.contains("pane"));
        System.out.println(lista.contains("mandarini"));
        System.out.println(lista.size());*/
        Scanner tastiera = new Scanner(System.in);
    /*
        lista.add(tastiera.nextLine());

        System.out.println(lista);
        */
        boolean continua = false;

        while (!continua){
            System.out.println("Scrivi add per aggiungere un elemento");
            System.out.println("Scrivi remove per rimuovere un elemento");
            System.out.println("Scrivi view per vedere la lista");
            System.out.println("Scrivi exit per uscire");
         String a= tastiera.nextLine();
         switch (a) {
             case "add":
                 System.out.println("Cosa vuoi inserire?");
                 lista.add(tastiera.nextLine());
                 break;
             case "remove":
                 System.out.println("Cosa vuoi rimuovere?");
                 lista.contains(tastiera.nextLine());





         }
        }

    }


}
