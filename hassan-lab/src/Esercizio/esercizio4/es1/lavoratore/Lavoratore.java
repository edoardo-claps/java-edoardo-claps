package Esercizio.esercizio4.es1.lavoratore;

public class Lavoratore {
    private String nome;
    private String cognome;
    private double stipendio;

    public Lavoratore(String nome, String cognome, double stipendio) {
        this.nome = nome;
        this.cognome = cognome;
        this.stipendio = stipendio;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public double getStipendio() {
        return stipendio;
    }

    public void setStipendio(double stipendio) {
        this.stipendio = stipendio;
    }

    @Override
    public String toString() {
        return "Lavoratore{" +
                "nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", stipendio=" + stipendio +
                '}';
    }
    public static String dettagli(){
        return " la classe Lavoratore ha come attributi { nome, cognome , stipendio}";
    }
}
