package Esercizio.esercizio3;

public class AnimalePrivate {
    private String razza;
    private String nome;
    private int eta;

    public AnimalePrivate(String razza, String nome, int eta) {
        this.razza = razza;
        this.nome = nome;
        this.eta = eta;
    }

    public String getRazza() {
        return razza;
    }

    public void setRazza(String razza) {
        this.razza = razza;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getEta() {
        return eta;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }

    @Override
    public String toString() {
        return "AnimalePrivate{" +
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
        AnimalePrivate gufo =new AnimalePrivate("gufo","Anacleto",20);

        System.out.println(gufo.toString());

        //cambio la razza
        gufo.setRazza("serpente");

        //cambio nome
        gufo.setNome("Bis");

        //cambio età
        gufo.setEta(15);

        System.out.println(gufo.toString());
    }
}
