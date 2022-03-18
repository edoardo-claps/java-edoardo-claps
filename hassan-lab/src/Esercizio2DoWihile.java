import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Edoardo Claps
 * esercizio che richiede di implementare i cicli while-for-dowhile sommando due numeri x volte
 * tenendo traccia dei numeri
 * */

public class Esercizio2DoWihile {
    public static void main(String[] args) {
        int primonumero;
        int secondonumero;

        int numeri;
        int somma=0;
        boolean finito=false;
        Scanner input = new Scanner(System.in);

        System.out.println("quante coppie vuoi inserire?");
        numeri=input.nextInt();

        ArrayList<Integer> calc= new ArrayList<Integer>();

       do {
            System.out.println("inserisci il primo numero");
            primonumero=input.nextInt();
            System.out.println("inserisci il secondo numero");
            secondonumero=input.nextInt();

            System.out.println("la somma tra "+ primonumero +" + "+secondonumero+" è "+ (primonumero+secondonumero)  );
            somma+=primonumero+secondonumero;
            calc.add(primonumero+secondonumero);
            numeri--;

            if (numeri<=0){
                finito=true;
            }
        } while(!finito);

        for (int elem : calc) {
            System.out.println("Somma provvisoria "+elem );
        }

        System.out.println("Il totale è "+ somma);



    }
}
