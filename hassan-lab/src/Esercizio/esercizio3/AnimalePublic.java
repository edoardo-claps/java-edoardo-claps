package Esercizio.esercizio3;

public class AnimalePublic {
    public String razza;
    public String nome;
    public int eta;

    public AnimalePublic(String razza, String nome, int eta) {
        this.razza = razza;
        this.nome = nome;
        this.eta = eta;
    }

    @Override
    public String toString() {
        return "AnimalePublic{" +
                "razza='" + razza + '\'' +
                ", nome='" + nome + '\'' +
                ", eta=" + eta +
                '}';
    }

    /**
 * @author edoardo
 * creo un main per accedere alle variabili e instanziare un nuovo oggetto
 * */
    public static void main(String[] args) {
        AnimalePublic gufo=new AnimalePublic("gufo","Anacleto",20);
        System.out.println(gufo.toString());

        //cambio la razza
        gufo.razza="serpente";

        //cambio nome
        gufo.nome="Bis";

        //cambio età
        gufo.eta=15;

        System.out.println(gufo.toString());
    }
}
