package Esercizio.esercizio4.es1.veicoli;

public class Nave extends Veicoli {
    private int numeroPasseggeri;
    private String rotta;

    public Nave(String modello, String annoDiProduzione, int numeroPasseggeri, String rotta) {
        super(modello, annoDiProduzione);
        this.numeroPasseggeri = numeroPasseggeri;
        this.rotta = rotta;
    }

    public int getNumeroPasseggeri() {
        return numeroPasseggeri;
    }

    public void setNumeroPasseggeri(int numeroPasseggeri) {
        this.numeroPasseggeri = numeroPasseggeri;
    }

    public String getRotta() {
        return rotta;
    }

    public void setRotta(String rotta) {
        this.rotta = rotta;
    }

    @Override
    public String toString() {
        return "Nave{" +
                "modello='" + getModello() + '\'' +
                ", annoDiProduzione='" + getAnnoDiProduzione() + '\'' +
                ", numeroPasseggeri=" + numeroPasseggeri +
                ", rotta='" + rotta + '\'' +
                '}';
    }

    public static String dettagli(){
        return " la classe Nave ha come attributi { modello , annoDiProduzione, numeroPasseggeri}";
    }
}
