package com.engim.lezione1;

public class Bottiglia {

        private int capacita;
        private int contenuto;



        public Bottiglia(int capacita) {
            if (capacita< 0){
                capacita=0;
            }
            this.capacita = capacita;
            this.contenuto = 0;

        }

        public int getCapacita() {
            return capacita;
        }

        public int getContenuto() {
            return contenuto;
        }




        public void riempi(int q){
            if(this.contenuto +q <= this.capacita) {
                this.contenuto += q;
            }
            else{
                this.contenuto =this.capacita;
            }
        }
        public void svuota(int q){
            if(q> this.contenuto){
                this.contenuto =0;
            }
            else {
                this.contenuto -=q;
            }
        }



        @Override
        public String toString() {
            return "Bottiglia{" +
                    "capacita=" + capacita +
                    ", quantita=" + contenuto +
                    '}';
        }


}
