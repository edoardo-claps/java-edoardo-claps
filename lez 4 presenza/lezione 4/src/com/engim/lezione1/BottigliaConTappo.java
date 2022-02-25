package com.engim.lezione1;

public class BottigliaConTappo {

        private int capacita;
        private int quantita;
        private boolean aperta;



        public BottigliaConTappo(int capacita) {
            if (capacita< 0){
                capacita=0;
            }
            this.capacita = capacita;
            this.quantita = 0;
            this.aperta=false;

        }

        public int getCapacita() {
            return capacita;
        }

        public int getQuantita() {
            return quantita;
        }



        public void apri(){
            this.aperta=true;
        }

        public void chiudi(){
            this.aperta=false;
        }

        public void riempi(int q){
            if(this.aperta) {
                if (this.quantita + q <= this.capacita) {
                    this.quantita += q;
                } else {
                    this.quantita = this.capacita;
                }
            }
            else{
                System.out.println("la bottiglia è chiusa");
            }
        }


        public void svuota(int q){
            if(this.aperta) {
                if(q> this.quantita){
                this.quantita=0;
                }
                else {
                    this.quantita-=q;
                }
            }
            else{
                System.out.println("la bottiglia è chiusa");
            }
        }




        @Override
        public String toString() {
            return "Bottiglia{" +
                    "capacita=" + capacita +
                    ", quantita=" + quantita +
                    '}';
        }


}
