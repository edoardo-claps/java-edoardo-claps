package Esercizio.esercizio4.es1.hashmap;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String,Double> valori=new HashMap<String,Double>();
        valori.put("base", 2.0);
        valori.put("lato1",4.0);
        valori.put("lato2",5.0);
        valori.put("altezza",6.0);

        Triangolo t = new Triangolo(valori);
        System.out.println(t.perimetro());

    }
}
