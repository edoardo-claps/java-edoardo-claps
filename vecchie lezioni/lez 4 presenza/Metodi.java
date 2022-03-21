/* Esercizi Java riscaldamento

Scrivere i seguenti metodi

- Dato a e b restituire se a è divisibile per b
- dueVolteArray: dato un array restituire un array che ripete ogni elemento: es [0,1,2] restituisce [0,0,1,1,2,2]
- sommaVettoriale: dati due array restituire un array con la somma elemento per elemento. Se uno dei due array è più grande restituire gli elementi restanti non sommati. Esempio a=[1,2]; b=[3,4,5]  restituisce [4,6,5]
- fattoriale: fattoriale(n) = fattoriale(n-1) * n. fattoriale(0) = 1. fare un metodo ricorsivo che restituisce il fattoriale

Ultime modifiche: giovedì, 24 febbraio 2022, 08:57
 */

public class Metodi {

    public static boolean divisibile(int a, int b) {
        boolean divisione = false;
        if (a % b == 0) {
            divisione = true;
        }

        return divisione;

    }

    public static int[] doppio(int[] array) {
        int[] doppio = new int[(array.length*2)];

        for (int i = 0; i < array.length; i++) {
            doppio[i] = array[i];
            
        }

        return doppio;
    }

    public static int[] somma(int[]array1,int[]array2){
       
       int[]somma={};
       int min=array2.length;
       int max=array1.length;
        int piugrande=1;
    
        if(array2.length>array1.length){
        min=array1.length;
        max=array2.length;
        piugrande=2;
       }

       for(int i=0; i<max;i++)
       if (i<min){
           somma[somma.length]=array1[i]+array2[i];
       }
       else{
           if(piugrande==2)
           somma[somma.length]=array2[i];
           else{
           somma[somma.length]=array1[i];

           }
       }
        return somma;
    }

  /*   public static int fattoriale(int a) {
        int b=0;
        b=(a-1)*a;

        fattoriale();
        return b;
    }
 */


    public static void main(String[] args) {
        int[] array={1,2,3,4,5,6,7,8};
        int[]ciao=doppio(array);
       
        for (int i =0; i< ciao.length;i++){
            System.out.println(ciao[i]);
        }

         divisibile(1,2);
       }

}
