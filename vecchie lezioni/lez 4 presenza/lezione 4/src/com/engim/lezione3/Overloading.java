package com.engim.lezione3;

public class Overloading {

    public static void stampa(int[]array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
    }

    public static void stampa(String[] array){
        for (int i = 0; i < array.length ; i++) {
            System.out.print(array[i]+" ");
        }
    }
    //possiamo usare due nomi uguali purchè la firma sia diversa la firma è :stampa(String[] array)
    // e questa operazione si chiama overloading

    public static void main(String[] args){
        int[] a={1,2,3,1,5,2,25};
        String[] b={"ciao","amici","come","state"};
        stampa(b);
        stampa(a);
    }

}
