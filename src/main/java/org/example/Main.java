package org.example;

import java.util.concurrent.Semaphore;

public class Main {
   public static void main(String[] args){
       Semaphore semaforoGlobal = new Semaphore(1);
       Cantina FilaDaFixa = new Cantina(true, semaforoGlobal); //com semaforo
       Cantina FilaDoLanche = new Cantina(false, semaforoGlobal); //sem semaforo

       Thread[] threads = new Thread[6];

       for(int i = 0; i < 6; i++) {
           threads[i] = new Thread(new ProcessoCantina(FilaDaFixa, FilaDoLanche, "Alternando"));
       }

       for (int i = 0; i < 6; i++) {
           threads[i].start();
       }
   }
}


