package com.engim.lezione_abstract.interfaccia;

public class Verifica implements Comparable{
    private int voto;
private String proprietario;

    public Verifica(int voto, String proprietario) {
        this.voto = voto;
        this.proprietario = proprietario;
    }

    public void setVoto(int voto) {
        this.voto = voto;
    }

    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }

    public int getVoto() {
        return voto;
    }

    public String getProprietario() {
        return proprietario;
    }

    @Override
    public int compareTo(Object o) {
        if (o.getClass()==getClass()){
            Verifica v =(Verifica)o;
        if (this.voto>v.voto){
            return 1;
        }
        else if(voto==v.voto){
            return 0;
        }
        else{
            return -1;
        }
        }
        else{
            return 666;
        }
    }

}
