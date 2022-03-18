package Esercizio2;
/**
 * @author Edoardo Claps
 * dato un array scrivere la media
 * */

public class MediaArray {
    public static void main(String[] args) {
//definisco array e variabile per la sommaw
        int[] numeri={2,4,5,6,7,9,0,3,32,1,45,5};
        int somma=0;

        //ciclo ò'array e sommo i valori
        for (int i=0; i<numeri.length;i++){
        somma+=numeri[i];
        }

        //stampo la media dei valori
        System.out.println("la media è "+ (somma/numeri.length));
    }

}
