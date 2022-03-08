package com.engim.lezione_abstract.riscaldamento;

public abstract class List {


    public abstract int get( int index);
    public abstract List add(int index, int value);
    public abstract int length ();
    public abstract List remove(int n);
    public abstract List removeFromIndex(int i);

}
