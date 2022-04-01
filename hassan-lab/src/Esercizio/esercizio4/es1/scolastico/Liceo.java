package Esercizio.esercizio4.es1.scolastico;

public class Liceo extends Scuola{
    private String tipologia;

    public Liceo(String nome, String indirizzo, int numeroAlunni, String tipologia) {
        super(nome, indirizzo, numeroAlunni);
        this.tipologia = tipologia;
    }

    public String getTipologia() {
        return tipologia;
    }

    public void setTipologia(String tipologia) {
        this.tipologia = tipologia;
    }



    @Override
    public String toString() {
        return "Liceo{" +
                "nome='" + getNome() + '\'' +
                ", indirizzo='" + getIndirizzo() + '\'' +
                ", numero Alunni=" + getNumeroAlunni() +
                ", tipologia='" + tipologia + '\'' +
                '}';
    }
    public static String dettagli(){
        return " la classe Liceo ha come attributi { nome, indirizzo ,numeroAlunni, tipologia}";
    }
}
