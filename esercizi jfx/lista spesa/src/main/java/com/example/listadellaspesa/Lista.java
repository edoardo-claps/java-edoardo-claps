package com.example.listadellaspesa;

import java.util.List;

public class Lista {
    public String nome;
    public List<String > articoli ;

    public Lista(String nome) {
        this.nome = nome;
        this.articoli=null;
    }

    public String getNome(){
        return this.nome;
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
    public Boolean removeElemToLista(String articolo){
        for (String ele:articoli){
            if(ele.equalsIgnoreCase(articolo)) {
                this.articoli.remove(articolo);
                return true;
            }
        }
        return false;

    }
    public String showList(){
        String s="";
        for(String a:articoli){
            s+= a+"\n";
        }
    return s;
    }


}
