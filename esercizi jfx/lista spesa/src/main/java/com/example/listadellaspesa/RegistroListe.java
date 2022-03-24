package com.example.listadellaspesa;

import java.util.ArrayList;
import java.util.List;

public class RegistroListe {
    private List<Lista> liste;
    private static RegistroListe instance;

    private RegistroListe(){
        liste=new ArrayList<>();
    }

    public void addLista(String a){
        if(liste.isEmpty()){
            Lista p = new Lista(a);
            liste.add(p);
        }
        else if (RegistroListe.getInstance().exist(a)){
                Lista p = new Lista(a);
                liste.add(p);
            }
    }

    public Boolean exist( String a){
        for (Lista e: liste) {
            if (e.nome.equalsIgnoreCase(a) ) {
                return false;
            }
        }
        return true;
    }

    public String getListe(){
        String s="";
        for(Lista p: liste){
            s+= (p.getNome() + "\n");
        }
        return s;
    }

    public  Lista findListaByNome( String nome){
        for (Lista p:liste){
            if(p.nome.equalsIgnoreCase(nome)){
                return p;
            }
        }
        return null;
    }
    public boolean removeListaByNome(String nome){
        for (Lista p:liste){
            if(p.nome.equals(nome)){
                liste.remove(p);
                return true;
            }
        }
        return false;
    }

    public static RegistroListe getInstance(){
        if(instance==null)
            instance=new RegistroListe();
        return instance;
    }
}
