package com.engim.lezione_abstract.interfaccia.interfacce;

import java.awt.*;

public class Rettangolo extends Poligono {

    private int larghezza;
    private int altezza;

    public Rettangolo(int l, int a){
        this.larghezza = l;
        this.altezza = a;
    }


    @Override
    public void disegna(Graphics g, int x, int y) {

        g.drawLine(x - (larghezza / 2), y - (altezza / 2), x + (larghezza / 2), y - (altezza / 2));
        g.drawLine(x - (larghezza / 2), y - (altezza / 2), x - (larghezza / 2), y + (altezza / 2));
        g.drawLine(x + (larghezza / 2), y - (altezza / 2), x + (larghezza / 2), y + (altezza / 2));
        g.drawLine(x - (larghezza / 2), y + (altezza / 2), x + (larghezza / 2), y + (altezza / 2));
    }
}
