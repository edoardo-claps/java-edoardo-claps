package com.engim;

public class Bottiglia {

        private int capacita;
        private int quantita;
        private boolean aperta;



        public Bottiglia(int capacita) {
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


        public void setQuantita(int quantita) {
            this.quantita = quantita;
        }

        public void apri(){
            this.aperta=true;
        }
        public void chiudi(){
            this.aperta=false;
        }

        public void riempi(){
            if (aperta==true) {
                this.quantita = this.capacita;
            }
            else{
                System.out.println("La bottiglia è chiusa");
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
