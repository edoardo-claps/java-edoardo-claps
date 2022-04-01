package Esercizio.esercizio4.es1.scolastico;

public class Studente extends Persona{
    private String classeFrequentata;
    private double mediavoti;


    public Studente(String nome, String cognome, String classeFrequentata, double mediavoti) {
        super(nome, cognome);
        this.classeFrequentata = classeFrequentata;
        this.mediavoti = mediavoti;
    }

    public String getClasseFrequentata() {
        return classeFrequentata;
    }

    public void setClasseFrequentata(String classeFrequentata) {
        this.classeFrequentata = classeFrequentata;
    }

    public double getMediavoti() {
        return mediavoti;
    }

    public void setMediavoti(double mediavoti) {
        this.mediavoti = mediavoti;
    }
}
