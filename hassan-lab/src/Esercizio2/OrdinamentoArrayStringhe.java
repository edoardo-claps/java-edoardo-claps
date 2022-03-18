package Esercizio2;
/**
 * @author Edoardo Claps
 * dato un array scrivere la media
 * */

public class OrdinamentoArrayStringhe {
    public static void main(String[] args) {
//definisco array non ordinato
        String [] parole={"ciao","amici","come","state","milano"};


        //ciclo per ordinare
        for (int j = 1; j < parole.length; j++) {

            for (int i = 1; i < parole.length; i++) {

                if ( parole[i-1].compareTo(parole[i])>0) {
                    String  a = parole[i];
                    parole[i] = parole[i - 1];
                    parole[i - 1] = a;

                }
            }
        }

        for(String ele:parole){
            System.out.println(ele);
        }


    }


}
