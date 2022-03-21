package com.engim.lezione1;

public class BottigliaConTappo extends Bottiglia{


        private boolean aperta;



        public BottigliaConTappo(int capacità) {
            super(capacità);
            aperta=true;
        }


        public void apri(){
            this.aperta=true;
        }

        public void chiudi(){
            this.aperta=false;
        }
//con override ridefiniamo il comportamento di un metodo in una sottoclasse

    @Override
    public void riempi(int q) {
            if(aperta)
        super.riempi(q);
    }

    @Override
    public void svuota(int q) {
            if(aperta)
        super.svuota(q);
    }
}
