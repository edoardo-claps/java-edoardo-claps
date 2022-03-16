package com.engim.eccezioni.progetto1;

public class MessaggioTroppoLungoExeption extends Exception {

        private int length;


        public MessaggioTroppoLungoExeption(int x) {

            this("Messaggio troppo lungo", x);
            // super("Messaggio troppo lungo");
        }

        public MessaggioTroppoLungoExeption(String message, int x) {
            super(message);
            length = x;
        }


}
