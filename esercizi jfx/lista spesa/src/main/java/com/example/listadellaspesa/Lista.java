package com.example.listadellaspesa;

import java.util.List;

public class Lista {
    public String nome;
    public List<String > articoli;

    public Lista(String nome) {
        this.nome = nome;
    }

   public Boolean addElemToLista(String articolo){
       if(articolo!="") {
            this.articoli.add(articolo);
            return true;
        }
       else{
           return false;
       }
    }

    public String showList(){
        String s="";
        for(String a:articoli){
            s+= a+"\n";
        }
    return s;
    }


}
