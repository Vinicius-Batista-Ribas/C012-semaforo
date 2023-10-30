package org.example;
import java.util.concurrent.Semaphore;

public class Cantina {
    private Semaphore semaphore;
    private boolean comSemaforo;
    private Semaphore semaforoGlobal;

    public Cantina(boolean comSemaforo, Semaphore semaforoGlobal) {
        this.comSemaforo = comSemaforo;
        this.semaforoGlobal = semaforoGlobal;
        if (comSemaforo) {
            semaphore = semaforoGlobal;
        }
    }

    public void filaComSemaforo(String fila) {
        if (comSemaforo) {
            try {
                semaphore.acquire();
                System.out.println(Thread.currentThread().getName() + " da fila está pegando sua FIXA!");
            } catch (InterruptedException e) {

            } finally {
                System.out.println("A  " + Thread.currentThread().getName() + " da fila Pegou sua FIXA!");
                semaphore.release();
            }
        }
    }

    public void filaSemSemaforo(String fila) {
        if (!comSemaforo) {
            System.out.println(Thread.currentThread().getName() + " da fila está SENDO ATENDIDO!");
            System.out.println("Documento da " + Thread.currentThread().getName() + " da fila PEGOU SEU LANCHE!");
        }
    }
}


