package Esercizio.esercizio2;



public class MediaArray {
    /**
     * @author Edoardo Claps
     * dato un array scrivere la media
     * @param numeri è l'array di cui vogliamo sapere la media
     * @return è la media
     * */

    public static Double media(int[] numeri){
        int somma=0;
        double media;

        //ciclo l'array e sommo i valori
        for (int i=0; i<numeri.length;i++){
            somma+=numeri[i];
        }
        return media=somma/numeri.length;
    }
    public static void main(String[] args) {
//definisco array e variabile per la sommaw
        int[] numeri={2,4,5,6,7,9,0,3,32,1,45,5};

        //stampo la media dei valori
        System.out.println("la media è "+ (media(numeri)));
    }

}
