package Esercizio.esercizio4.es1.veicoli;

public class Macchina extends Veicoli{
    private int numeroPorte;
    private boolean assicurata;

    public Macchina(String modello, String annoDiProduzione, int numeroPorte, boolean assicurata) {
        super(modello, annoDiProduzione);
        this.numeroPorte = numeroPorte;
        this.assicurata = assicurata;
    }

    public int getNumeroPorte() {
        return numeroPorte;
    }

    public void setNumeroPorte(int numeroPorte) {
        this.numeroPorte = numeroPorte;
    }

    public boolean isAssicurata() {
        return assicurata;
    }

    public void setAssicurata(boolean assicurata) {
        this.assicurata = assicurata;
    }


    @Override
    public String toString() {
        return "Macchina{" +
                "modello='" + getModello() + '\'' +
                ", annoDiProduzione='" + getAnnoDiProduzione() + '\'' +
                ", numeroPorte=" + numeroPorte +
                ", è assicurata=" + assicurata +
                '}';
    }
    public static String dettagli(){
        return " la classe Nave ha come attributi { modello , annoDiProduzione, numeroPorte, assicurata}";
    }
}
