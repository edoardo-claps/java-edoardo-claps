public class EsOrdinamento {
    // fare un metodo che ritorna la posizione del numero massimo in un array
    public static int posMax(int[] a) {

        int max = a[0];
        int b = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
                b = i;
            }
        }
        return b;
    }

        
     // metodo swap che dato un array e due posizioni, scambi i valori all'interno
     public static void swap(int[] array, int pos1, int pos2){
         int a=array[pos1];
         array[pos1]=array[pos2];
         array[pos2]=a;
         
         
        Util.stampa(array);

    }

     public static void main(String[] args) {
        int[] a = { 1, 6, 9, 12 };

        swap(a, 2, 1);


    }
} 
