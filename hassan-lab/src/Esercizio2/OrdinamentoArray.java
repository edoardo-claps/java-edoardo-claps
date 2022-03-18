package Esercizio2;


public class OrdinamentoArray {
    /**
     * @author Edoardo Claps
     * dato un array di interi rioridinarlo
     * @param numeri è il parametro in ingresso, l'array da ordinare
     * @return array ordinato
     * */
    public static int[] ordina(int[] numeri){

        //ciclo per ordinare
        for (int j = 1; j < numeri.length; j++) {

            for (int i = 1; i < numeri.length; i++) {

                if (numeri[i] < numeri[i - 1]) {
                    int a = numeri[i];
                    numeri[i] = numeri[i - 1];
                    numeri[i - 1] = a;

                }
            }
        }
    return numeri;
    }

    public static void main(String[] args) {
        //definisco array non ordinato
        int[] numeri={2,4,5,6,7,9,0,3,32,1,45,5};

        numeri=ordina(numeri);

        for(int ele:numeri){
            System.out.println(ele);
        }

    }
}
