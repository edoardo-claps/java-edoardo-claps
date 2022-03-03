package com.engim.lezione_abstract.riscaldamento;

public class Nil extends List{
    @Override
    public int get(int index) {
        return 0;
    }

    @Override
    public List add(int index, int value) {
        if(index==0) {
            return  new Node(this, value);
        }
        else{
            System.out.println("exeption : index out of bound");
            System.exit(0);
            return null;
        }

    }

    @Override
    public int length(int i) {
        return 0;
    }
}
