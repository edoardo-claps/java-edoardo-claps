package Esercizio.esercizio4.es1.lavoratore;

public class Dirigente extends Lavoratore{
    private String settore;

    public Dirigente(String nome, String cognome, double stipendio, String settore) {
        super(nome, cognome, stipendio);
        this.settore = settore;
    }

    public String getSettore() {
        return settore;
    }

    public void setSettore(String settore) {
        this.settore = settore;
    }

    @Override
    public String toString() {
        return "Dirigente{" +
                "nome='" + getNome() + '\'' +
                ", cognome='" + getCognome() + '\'' +
                ", stipendio=" + getStipendio() +
                ", settore='" + settore + '\'' +
                '}';
    }
    public static String dettagli(){
        return " la classe Dirigente ha come attributi { nome, cognome , stipendio, settore}";
    }
}
