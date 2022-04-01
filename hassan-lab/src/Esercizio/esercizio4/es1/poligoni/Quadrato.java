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
}
