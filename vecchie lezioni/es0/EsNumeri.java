package es0;

import java.util.Scanner;

public class EsNumeri {
    public static void main(String[] args) {

        //inizializzo un array per salvare i numeri
        int[] array= new int[11] ;

        Scanner tastiera = new Scanner(System.in);
        System.out.println("inserisci 10 numeri in ordine crescente o decrescente");

        //faccio inserire i numeri
        for (int i = 1; i <= 10; i++) {
            switch (i) {
            case 1:
                System.out.println("inserisci il primo numero");
                break;
            case 2:
                System.out.println("inserisci il secondo numero");
                break;
            case 3:
                System.out.println("inserisci il terzo numero");
                break;
            case 4:
                System.out.println("inserisci il quarto numero");
                break;
            case 5:
                System.out.println("inserisci il quinto numero");
                break;
            case 6:
                System.out.println("inserisci il sesto numero");
                break;
            case 7:
                System.out.println("inserisci il settimo numero");
                break;
            case 8:
                System.out.println("inserisci l' ottavo numero");
                break;
            case 9:
                System.out.println("inserisci il nono numero");
                break;
            case 10:
                System.out.println("inserisci il decimo numero");
                break;
            }

            array[i] = tastiera.nextInt();
        }

            //controllo se i numeri sono crescenti o no
            int crescenti=0;
            int decrescente=0;
            

            for (int i=1;i<array.length;i++){

                if (array[i]>array[i-1]){
                    crescenti += 1;
                }
                else if(array[i]<array[i-1]){
                    decrescente += 1;
                } 
               
            }


            //per debug
            System.out.println(crescenti+"+"+decrescente);


            // do il risultato
            if(crescenti!=0 && decrescente!=0 ){
                    System.out.println("i numeri non sono ordinati");
            }
            else{ 
                if(crescenti < decrescente){
                    System.out.println("i numeri sono ordinati in modo decrescente");
                }
                else if(crescenti > decrescente){
                    System.out.println("i numeri sono ordinati in modo crescente");
                }
            }
        }
       
}
