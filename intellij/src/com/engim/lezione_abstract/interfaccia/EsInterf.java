package com.engim.lezione_abstract.interfaccia;

public class EsInterf {
    public static void main(String[] args) {
        Verifica v1 = new Verifica(75, "pippo");
        Verifica v2 = new Verifica(45, "pluto");

        System.out.println(v1.compareTo(v2));
        System.out.println(v2.compareTo(v1));

    }
}
