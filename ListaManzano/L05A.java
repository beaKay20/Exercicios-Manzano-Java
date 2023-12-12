package ListaManzano;

import java.util.Scanner;

public class L05A {
    public static void main(String[] args){
        System.out.println("Apresentar os quadrados dos números inteiros de 15 a 200");
        Scanner sc = new Scanner(System.in);

        for (int i = 15; i <= 200; i++) {
           float quadrado = i * i;

           System.out.println("Numero " +i+ " Quadrado: " +quadrado);
        }

    }
}
