package Esercizio.esercizio4.es1.scolastico;

public class Scuola {
    private String nome;
    private String indirizzo;
    private int numeroAlunni;

    public Scuola(String nome, String indirizzo, int numeroAlunni) {
        this.nome = nome;
        this.indirizzo = indirizzo;
        this.numeroAlunni = numeroAlunni;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public int getNumeroAlunni() {
        return numeroAlunni;
    }

    public void setNumeroAlunni(int numeroAlunni) {
        this.numeroAlunni = numeroAlunni;
    }

    @Override
    public String toString() {
        return "Scuola{" +
                "nome='" + nome + '\'' +
                ", indirizzo='" + indirizzo + '\'' +
                ", numero Alunni=" + numeroAlunni +
                '}';
    }

    public static String dettagli(){
        return " la classe Scuola ha come attributi { nome, indirizzo ,numeroAlunni}";
    }
}
