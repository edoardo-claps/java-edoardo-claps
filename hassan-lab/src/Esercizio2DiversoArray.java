public class Esercizio2DiversoArray {
    public static void main(String[] args) {

        String[] parole={"ciao","amici","come","state","ciao","state"};
        String[] parole2 ={"ciao","giallo","fiori","state","estate","monica"};
        boolean uguali=false;

        for (String ele: parole) {
            for (String element:parole2) {
                if(ele.equalsIgnoreCase(element)){
                    System.out.println("compare piu volte la parola "+ element);
                }
            }
        }



    }
}
