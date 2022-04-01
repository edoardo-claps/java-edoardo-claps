package Esercizio.esercizio4.es1.poligoni;

public class Poligono {
    private double base;
    private double altezza;

    public Poligono(double base, double altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltezza() {
        return altezza;
    }

    public void setAltezza(double altezza) {
        this.altezza = altezza;
    }

    @Override
    public String toString() {
        return "Poligono{" +
                "base=" + base +
                ", altezza=" + altezza +
                '}';
    }

    public static String dettagli(){
        return " la classe Poligono ha come attributi { base, altezza}";
    }
}
