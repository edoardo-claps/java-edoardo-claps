package Esercizio.esercizio2;


public class OrdinamentoArrayStringhe {
    /**
     * @author Edoardo Claps
     * dato un array di stringhe riordinarlo
     * @param parole è l'array in ingresso da rioridinare
     * @return l'array ordinato
     * */
    public static String[] ordina(String[] parole){


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
        return parole;
    }

    public static void main(String[] args) {
//definisco array non ordinato
        String [] parole={"ciao","amici","come","state","milano"};

        parole=ordina(parole);

        for(String ele:parole){
            System.out.println(ele);
        }


    }


}
