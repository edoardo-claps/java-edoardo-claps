package com.engim.lezione_abstract.riscaldamento;

public class Node extends List{
    private List next;
    private int value;



    public Node(List node, int value) {
        this.next = node;
        this.value = value;
    }

    public List getNext() {
        return next;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int v) {
        this.value = v;
    }



    @Override
    public String toString() {
        return "value=" + value + " " + this.next.toString();
    }

    @Override
    public int get(int index) {
        if (index==0)
        return this.value;
        else
           return this.next.get(index-1);
    }

    @Override
    public List add(int index, int value) {
        if (index==0){
        this.next=new Node(this.next ,this.value);
        this.value=value;
        }
        else {
          this.next=this.next.add(index - 1, value);
        }
      return this;
    }

    @Override
    public int length() {
     return 1+this.next.length();
    }

    @Override
    public List remove(int n) {
        this.next=next.remove(n);

        if (n==this.value){
           return this.next;
        }
        else {
            return this;
        }
    }

    @Override
    public List removeFromIndex(int i) {
        if (i==0){
            return this.next;
        }
        else {
            this.next=next.removeFromIndex(i - 1);

            return this;
        }

    }

    public static void main(String[] args){


        List oggetto = new Node(new Node(new Node(new Nil(), 3),8),1);
        List oggetto2 = new Nil();

       // System.out.println(oggetto.get(2));

        //oggetto.add(2,5);
        System.out.println(oggetto.length());

     oggetto=oggetto.remove(8);

     System.out.println(oggetto);

     System.out.println(oggetto.length());

    }


}

