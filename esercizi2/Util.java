
import java.util.Scanner;


public class Util {
    public static void stampa(int [] pippo){
        System.out.print("[");
    
    
        for (int i=0; i<pippo.length;i++){
            System.out.print(pippo[i]);
            if(i!=pippo.length-1){
                System.out.print(", ");
            }
        }
        System.out.println("]");
    
    }
    public static int[] creaArray(){
        Scanner tastiera= new Scanner(System.in);


        System.out.println("quanti numeri vuoi inserire?");

        int n=tastiera.nextInt();

        int[] array= new int[n];

        for (int i =0; i<n;i++){
            System.out.println("inserisci numero");
        array[i]=tastiera.nextInt();
        }
        return array;

    }    

}
