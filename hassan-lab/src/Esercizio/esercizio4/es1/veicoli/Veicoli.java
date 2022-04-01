package Esercizio.esercizio4.es1.veicoli;

public class Veicoli {
    private String modello;
    private String annoDiProduzione;

    public Veicoli(String modello, String annoDiProduzione) {
        this.modello = modello;
        this.annoDiProduzione = annoDiProduzione;
    }

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public String getAnnoDiProduzione() {
        return annoDiProduzione;
    }

    public void setAnnoDiProduzione(String annoDiProduzione) {
        this.annoDiProduzione = annoDiProduzione;
    }

    @Override
    public String toString() {
        return "Veicoli{" +
                "modello='" + modello + '\'' +
                ", annoDiProduzione='" + annoDiProduzione + '\'' +
                '}';
    }
    public static String dettagli(){
        return " la classe Veicoli ha come attributi { modello , annoDiProduzione}";
    }
}
