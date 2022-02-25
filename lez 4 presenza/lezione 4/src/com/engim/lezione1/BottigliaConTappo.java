package com.engim.lezione1;

public class BottigliaConTappo extends Bottiglia{


        private boolean aperta;



        public BottigliaConTappo(int capacità) {
            super(capacità);
            aperta=true;
        }

   /*


        public void apri(){
            this.aperta=true;
        }

        public void chiudi(){
            this.aperta=false;
        }

        public void riempi(int q){
            if(this.aperta) {
                super(q);
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


*/

        @Override
        public String toString() {
            return "Bottiglia{" +
                    "capacita=" + capacita +
                    ", quantita=" + quantita +
                    '}';
        }


}
