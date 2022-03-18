import javax.swing.text.Element;

public class Esercizio2Stessoarray {
    public static void main(String[] args) {

        String[] parole={"ciao","amici","come","state","ciao","state"};
        boolean uguali=false;

        for (int i=0;i<parole.length;i++) {
            for (int b=0;b<parole.length;b++){
                if(parole[i].equalsIgnoreCase(parole[b])&& i!=b && i<b ){
                    System.out.println("compare più volte la parola "+ parole[b]);
                }
            }
        }



    }
}
