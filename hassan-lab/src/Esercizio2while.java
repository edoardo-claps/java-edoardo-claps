import java.util.ArrayList;
import java.util.Scanner;

public class Esercizio2while {
    public static void main(String[] args) {
        int primonumero;
        int secondonumero;

        int numeri;
        int somma=0;
        boolean finito=false;
        Scanner input = new Scanner(System.in);

        System.out.println("quanti numeri vuoi inserire?");
        numeri=input.nextInt();

        ArrayList<Integer> calc= new ArrayList<Integer>();

        while(!finito){

            System.out.println("inserisci il primo numero");
            primonumero=input.nextInt();
            System.out.println("inserisci il secondo numero");
            secondonumero=input.nextInt();

            System.out.println("la somma tra "+ primonumero +" + "+secondonumero+" è "+ (primonumero+secondonumero)  );
            somma+=primonumero+secondonumero;
            calc.add(primonumero+secondonumero);
            numeri--;

            if (numeri==0){
                finito=true;
            }
        }

        for (int elem : calc) {
            System.out.println("Somma provvisoria "+elem );
        }

        System.out.println("Il totale è "+ somma);



    }
}