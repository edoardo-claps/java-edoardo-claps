import java.lang.reflect.Array;
import java.util.Scanner;

/**
 * @author Edoardo Claps
 * esercizio che richiede di implementare i cicli while-for-dowhile sommando due numeri x volte
 * tenendo traccia dei numeri
 * */

public class Esercizio2 {
    public static void main(String[] args) {
        int primonumero;
        int secondonumero;

        int numero;
        int numeri;
        int somma=0;
        Scanner input = new Scanner(System.in);

        System.out.println("quanti numeri vuoi inserire?");
        numeri=input.nextInt();

        int[] array= new int[numeri];

        for (int i=0;i<numeri;i++){
            System.out.println("inserisci un numero");
            numero=input.nextInt();
            array[i]=numero;
        }
        for (int element: array) {
            somma += element;
        }

        System.out.println("la somma è "+ somma);


       /* System.out.println("inserisci il primo numero");
        primonumero=input.nextInt();
        System.out.println("inserisci il secondo numero");
        secondonumero=input.nextInt();*/


    }
}
