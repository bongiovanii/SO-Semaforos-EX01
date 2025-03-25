package view;

import controller.ThreadCarro;

public class Cruzamento {
   public static void main(String[] args) {
      String[] sentidos = {"Norte-Sul", "Sul-Norte", "Leste-Oeste", "Oeste-Leste"};

      for (String sentido : sentidos) {
         new ThreadCarro(sentido).start();
      }
   }

}
