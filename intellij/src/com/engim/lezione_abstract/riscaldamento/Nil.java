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
    public int length() {
    return 0;
    }

    @Override
    public List remove(int n) {
        return this;
    }

    @Override
    public List removeFromIndex(int i) {
  //      System.out.println("index out of bound");
        return this;
    }
}
