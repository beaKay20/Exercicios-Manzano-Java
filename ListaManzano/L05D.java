package ListaManzano;

import java.util.Scanner;

public class L05D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Elaborar um programa que apresente no final o somatório dos valores pares existentes na faixa de \n" +
                "1 até 500.");

       int somaPares = 0;

      for ( int numero = 1; numero <= 500; numero++){
          if (numero % 2 == 0){
              somaPares += numero;
          }

          System.out.println(somaPares);
      }

    }
}
