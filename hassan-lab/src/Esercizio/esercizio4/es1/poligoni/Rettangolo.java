package Esercizio.esercizio4.es1.poligoni;

public class Rettangolo extends Poligono{
    public Rettangolo(double base, double altezza) {
        super(base, altezza);
    }

    public double area(){
        return (getBase()*getAltezza());
    }

    public double perimetro(){
        return ((getBase()*2)+(getAltezza()*2));
    }
}
