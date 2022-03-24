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
        Lista p=new Lista(a);
        liste.add(p);

    }

    public List<String> getListe(){
        List<String> s = null;
        for(Lista p:liste){
            s.add(p.nome);
        }
        return s;
    }

    public  List<String> findListaByNome( String nome){
        for (Lista p:liste){
            if(p.nome.equalsIgnoreCase(nome)){
                return p.articoli;
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
