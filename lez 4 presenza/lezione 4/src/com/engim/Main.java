package com.engim;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Bottiglia b1= new Bottiglia(1000);
        System.out.println(b1);
        b1.riempi();
        System.out.println(b1);
        b1.apri();
        b1.riempi();
        System.out.println(b1);

    }
}
