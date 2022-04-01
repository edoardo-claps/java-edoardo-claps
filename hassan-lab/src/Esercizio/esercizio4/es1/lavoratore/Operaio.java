package Esercizio.esercizio4.es1.lavoratore;

public class Operaio extends Lavoratore{
    private boolean turnoNotturno;
    private String lineaDiProduzione;


    public Operaio(String nome, String cognome, double stipendio, boolean turnoNotturno, String lineaDiProduzione) {
        super(nome, cognome, stipendio);
        this.turnoNotturno = turnoNotturno;
        this.lineaDiProduzione = lineaDiProduzione;
    }

    public boolean isTurnoNotturno() {
        return turnoNotturno;
    }

    public void setTurnoNotturno(boolean turnoNotturno) {
        this.turnoNotturno = turnoNotturno;
    }

    public String getLineaDiProduzione() {
        return lineaDiProduzione;
    }

    public void setLineaDiProduzione(String lineaDiProduzione) {
        this.lineaDiProduzione = lineaDiProduzione;
    }

    @Override
    public String toString() {
        return "Operaio{" +
                "nome='" + getNome() + '\'' +
                ", cognome='" + getCognome() + '\'' +
                ", stipendio=" + getStipendio() +
                ", turno di notte=" + turnoNotturno +
                ", linea di produzione='" + lineaDiProduzione + '\'' +
                '}';
    }
    public static String dettagli(){
        return " la classe Lavoratore ha come attributi { nome, cognome , stipendio, turnoNotturno, lineaDiProduzione}";
    }
}
