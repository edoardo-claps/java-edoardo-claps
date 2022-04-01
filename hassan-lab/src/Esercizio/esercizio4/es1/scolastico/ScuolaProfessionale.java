package Esercizio.esercizio4.es1.scolastico;

public class ScuolaProfessionale extends Scuola {
    private String ambito;

    public ScuolaProfessionale(String nome, String indirizzo, int numeroAlunni, String ambito) {
        super(nome, indirizzo, numeroAlunni);
        this.ambito = ambito;
    }

    public String getAmbito() {
        return ambito;
    }

    public void setAmbito(String ambito) {
        this.ambito = ambito;
    }

    @Override
    public String toString() {
        return "ScuolaProfessionale{" +
                "nome='" + getNome() + '\'' +
                ", indirizzo='" + getIndirizzo() + '\'' +
                ", numero Alunni=" + getNumeroAlunni() +
                ", ambito='" + ambito + '\'' +
                '}';
    }
    public static String dettagli(){
        return " la classe Liceo ha come attributi { nome, indirizzo ,numeroAlunni, ambito }";
    }
}
