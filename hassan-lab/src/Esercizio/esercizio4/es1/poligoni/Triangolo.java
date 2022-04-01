package Esercizio.esercizio4.es1.poligoni;

import java.util.HashMap;

/**
 * la classe triangolo padre si ritiene isoscele perchè non so come si calcoli l'area di un triangolo generico
 * */
public class Triangolo extends Poligono{



    public Triangolo(double base, double altezza) {
        super(base, altezza);

    }

    public double area(){
        return ((getBase()*getAltezza())/2);
    }

    public double perimetro(){
        return (
               ( Math.sqrt( (Math.pow((getBase()/2),2)))*2)
                       +getAltezza()

        );
    }

    @Override
    public String toString() {
        return "Triangolo{" +
                "base" + getBase()+
                "altezza" + getAltezza()+
                "}";
    }
    public static String dettagli(){
        return " la classe Triangolo ha come attributi { base, altezza}";
    }
}
