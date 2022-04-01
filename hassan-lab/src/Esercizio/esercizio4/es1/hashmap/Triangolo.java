package Esercizio.esercizio4.es1.hashmap;


import java.util.HashMap;

/**
 * la classe triangolo padre si ritiene isoscele perchè non so come si calcoli l'area di un triangolo generico
 * */
public class Triangolo {
    private double base;
    private double lato1;
    private double lato2;
    private double altezza;

    public Triangolo(HashMap<String,Double> lista){
        this.base=lista.get("base");
        this.lato1=lista.get("lato1");
        this.lato2=lista.get("lato2");
        this.altezza=lista.get("altezza");

    }

    public Double perimetro(){
        return base+lato1+lato2;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getLato1() {
        return lato1;
    }

    public void setLato1(double lato1) {
        this.lato1 = lato1;
    }

    public double getLato2() {
        return lato2;
    }

    public void setLato2(double lato2) {
        this.lato2 = lato2;
    }

    public double getAltezza() {
        return altezza;
    }

    public void setAltezza(double altezza) {
        this.altezza = altezza;
    }

    @Override
    public String toString() {
        return "Triangolo{" +
                "base=" + base +
                ", lato1=" + lato1 +
                ", lato2=" + lato2 +
                ", altezza=" + altezza +
                '}';
    }
}

