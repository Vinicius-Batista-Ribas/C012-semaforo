package org.example;

public class ProcessoCantina implements Runnable{
        private Cantina fixa; // fila da fixa
        private Cantina lanche; // fila do lanche
        private String fila;

        public ProcessoCantina(Cantina impressoraComSemaforo, Cantina impressoraSemSemaforo) {
            this.fixa = impressoraComSemaforo;
            this.lanche = impressoraSemSemaforo;
        }


        @Override
        public void run() {
            fixa.filaComSemaforo();
            lanche.filaSemSemaforo();
        }
}

