public class Bottiglia{

    //con il private si blocca la possibilità di modificare gli attributi fuori dal file 
    private int capacita;
    private int quantita;
    
    public Bottiglia(int c, int q){
        capacita=c;
        quantita=q;
    }


    public int getcapacita(){
        return capacita;
    }
    public int getquantita(){
        return quantita;
    }

    public void setcapacita(int capacita){
        this.capacita = capacita;
    }
    public void setquantita(int quantita){
        this.quantita = quantita;
    }

}