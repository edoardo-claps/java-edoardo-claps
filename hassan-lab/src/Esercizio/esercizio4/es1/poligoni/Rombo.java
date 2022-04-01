package Esercizio.esercizio4.es1.poligoni;

public class Rombo extends Poligono{
    public Rombo(double base, double altezza) {
        super(base, altezza);
    }

    public double area(){
        return (getBase()*getAltezza());
    }

    public double perimetro(){
        return ((getBase()*2)+(getAltezza()*2));
    }

    @Override
    public String toString() {
        return "Rombo{" +
                "base" + getBase()+
                "altezza" + getAltezza()+
                "}";
    }

    public static String dettagli(){
        return " la classe Rombo ha come attributi { base, altezza}";
    }
}
