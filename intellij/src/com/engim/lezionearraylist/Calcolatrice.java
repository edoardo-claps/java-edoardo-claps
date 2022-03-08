package com.engim.lezionearraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Calcolatrice {
    static ArrayList<Double> pila;

    public static double pop(){
        double n=pila.get(pila.size()-1);
        pila.remove(pila.size()-1);
        return n;
    }

    public static void somma(){
       if (pila.size()>=2) {
           double n1 = pop();
           double n2 = pop();

           aggiunta(n1+n2);

       }
    }
    public static void diviso(){
        if (pila.size()>=2) {
            double n1 = pop();
            double n2 = pop();

            aggiunta(n2/n1);

        }

    }
    public static void moltiplica(){
        if (pila.size()>=2) {
        double n1 = pop();
        double n2 = pop();

        aggiunta(n1*n2);

    }

    }
    public static void differenza(){
        if (pila.size()>=2) {
        double n1 = pop();
        double n2 = pop();

        aggiunta(n2-n1);

    }

    } public static void aggiunta(Double num){
        pila.add(num);

    }






    public static void main(String[] args) {
        pila=new ArrayList<>();
        System.out.println("benvenuto nella calcolatrice inserisci una espressione in versione polacca");
        Scanner tastiera= new Scanner(System.in);
        while (tastiera.hasNext()){
            String inserito=tastiera.next();
            switch (inserito){
                case"+":
                    somma();
                    break;
                case"-":
                    differenza();
                    break;
                case"*":
                    moltiplica();
                    break;
                case"/":
                    diviso();
                    break;
                case "=":
                    System.out.println(pila);
                    break;
                case "!":
                    System.exit(0);
                    break;
                default:
                    aggiunta(Double.parseDouble(inserito));
            }
        }


    }
}
