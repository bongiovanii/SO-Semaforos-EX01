package controller;

import java.util.concurrent.Semaphore;

public class ThreadCarro extends Thread {
   private static final Semaphore semaforo = new Semaphore(1);
   private final String sentido;

   public ThreadCarro(String sentido) {
      this.sentido = sentido;
   }

   @Override
   public void run() {
      try {
         semaforo.acquire(); // o carro vai tentar etrar entrar no cruzamento
         System.out.println("Carro ID# " + threadId() + " está passando no sentido: " + sentido);
         Thread.sleep(2000); // o carro ta passando no cruzamento
      } catch (InterruptedException e) {
         e.printStackTrace();
      } finally {
         System.out.println("Carro ID# " + threadId() + " saiu do cruzamento.");
         semaforo.release(); // o carro ja passou no cruzamento, e agora outro carro pode passar
      }
   }
}








