package Esercizio.esercizio4.es1.poligoni;

public class TriangoloRettangolo extends Triangolo{
    public TriangoloRettangolo(double base, double altezza) {
        super(base, altezza);
    }

    public double area(){
        return ((getBase()*getAltezza())/2);
    }

    public double perimetro(){
        return (
                Math.sqrt( (Math.pow(getBase(),2))+(Math.pow(getAltezza(),2)))
                        +getAltezza()
                        +getBase()
        );
    }
    @Override
    public String toString() {
        return "TriangoloRettangolo{" +
                "base" + getBase()+
                "altezza" + getAltezza()+
                "}";
    }
    public static String dettagli(){
        return " la classe TriangoloRettangolo ha come attributi { base, altezza}";
    }
}
