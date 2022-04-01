package Esercizio.esercizio4.es1.poligoni;

public class TriangoloRettangolo extends Poligono{
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
}
