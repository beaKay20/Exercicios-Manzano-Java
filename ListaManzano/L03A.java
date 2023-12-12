package ListaManzano;

import java.util.Scanner;

public class L03A {
      public static void main (String[]args){

          Scanner leia = new Scanner(System.in);

          System.out.println("Apresentar os resultados de uma tabuada de multiplicar (de 1 até 10) de um número qualquer.");

          System.out.println("Informe um valor: ");
          int numero = leia.nextInt();

          int contadora = 1;

          while (contadora < 11){
              System.out.printf(" %d  x  %d = %d" , numero , contadora , numero * contadora);

              contadora++;
          }
          leia.close();
      }
}

