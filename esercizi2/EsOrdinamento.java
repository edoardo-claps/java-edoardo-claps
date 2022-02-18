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

    public static void main(String[] args) {
        int[] a = { 1, 6, 9, -12 };
        System.out.println(posMax(a));
        // deve stampare 2
    }
}
