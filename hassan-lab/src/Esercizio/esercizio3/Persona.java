package Esercizio.esercizio3;

/**
 *@author edoardo claps
 * esempio di classe e oggetti
 * classe persona
 * */
public class Persona {
    private String nome;
    private String cognome;
    private String datanascita;
    private Integer eta;

    public  Persona(){

    }
    public  Persona(String nome, String cognome){
        this.nome=nome;
        this.cognome=cognome;

    }

    public Persona(String nome, String cognome, String datanascita) {
        this.nome = nome;
        this.cognome = cognome;
        this.datanascita = datanascita;
    }

    public Persona(String nome, String cognome, String datanascita, Integer eta) {
        this.nome = nome;
        this.cognome = cognome;
        this.datanascita = datanascita;
        this.eta = eta;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public String getDatanascita() {
        return datanascita;
    }

    public int getEta() {
        return eta;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public void setDatanascita(String datanascita) {
        this.datanascita = datanascita;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", datanascita='" + datanascita + '\'' +
                ", eta=" + eta +
                '}';
    }
}
