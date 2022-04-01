package Esercizio.esercizio4.es1.poligoni;

public class Quadrato extends Poligono{

    public Quadrato(double base) {
        super(base, base);
    }

    public double area(){
        return (getBase()*getBase());
    }

    public double perimetro(){
        return (getBase()*4);
    }

    @Override
    public String toString() {
        return "Quadrato{" +
                "lato=" +getBase()+
                "}";
    }
    public static String dettagli(){
        return " la classe Quadrato ha come attributi {base}";
    }
}
