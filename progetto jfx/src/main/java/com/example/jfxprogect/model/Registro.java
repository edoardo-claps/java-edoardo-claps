package com.example.jfxprogect.model;

import java.util.ArrayList;
import java.util.List;

public class Registro {
    private List<Persona> persone;
    private static Registro instance;

    private Registro(){
        persone=new ArrayList<>();
    }

    public void addPersona(String a){
        Persona p=new Persona(a);
        persone.add(p);

    }

    public String getNomi(){
        String s="";
        for(Persona p:persone){
            s+=p.getNome()+"\n";
        }
        return s;
    }
    public static Registro getInstance(){
        if(instance==null)
            instance=new Registro();
        return instance;
    }
}
