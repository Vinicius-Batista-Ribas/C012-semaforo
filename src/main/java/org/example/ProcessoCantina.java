package org.example;

public class ProcessoCantina implements Runnable{
        private Cantina fixa; // fila da fixa
        private Cantina lanche; // fila do lanche
        private String fila;

        public ProcessoCantina(Cantina impressoraComSemaforo, Cantina impressoraSemSemaforo, String fila) {
            this.fixa = impressoraComSemaforo;
            this.lanche = impressoraSemSemaforo;
            this.fila = fila;
        }


        @Override
        public void run() {
            fixa.filaComSemaforo(fila);
            lanche.filaSemSemaforo(fila);
        }
}

