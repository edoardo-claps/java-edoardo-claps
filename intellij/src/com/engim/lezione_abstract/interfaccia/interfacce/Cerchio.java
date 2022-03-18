package com.engim.lezione_abstract.interfaccia.interfacce;

import java.awt.*;

public class Cerchio extends Forma{

    private int raggio;

    public Cerchio(int raggio){
        this.raggio = raggio;
    }

    @Override
    public void disegna(Graphics g, int x, int y) {
        g.drawOval(x - (raggio / 2), y - (raggio / 2),y,x);

    }
}
