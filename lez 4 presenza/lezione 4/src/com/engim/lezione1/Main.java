package com.engim.lezione1;

public class Main {

    public static void main(String[] args) {
	// creo la bottiglia e la vedo
        Bottiglia b1= new Bottiglia(1000);
        BottigliaConTappo b2= new BottigliaConTappo(1000);
        System.out.println(b1);
        //provo a riempire la bottiglia che parte chiusa
        b1.riempi(500);
        System.out.println(b1);
        //apro la bottiglia e la riempio
        b1.apri();
        b1.riempi(500);
        System.out.println(b1);
        //chiudo e provo a riempire
        b1.chiudi();
        b1.riempi(400);
        System.out.println(b1);

        //provo a modificare la quantità con tappo chiuso

        System.out.println(b1);

    }
}
