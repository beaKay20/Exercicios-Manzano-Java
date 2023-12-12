package ListaManzano;

import java.util.Scanner;

public class L20G {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Efetuar a leitura de quatro números inteiros e apresentar os números que são divisíveis por 2 e 3.");

        System.out.println("Digite um número, por favor: ");
        int numero01 = sc.nextInt();
        System.out.println("Digite um número, por favor: ");
        int numero02 = sc.nextInt();
        System.out.println("Digite um número, por favor: ");
        int numero03 = sc.nextInt();

        System.out.println("Números divisíveis por 2 e 3:");


        if (numero01 % 2 == 0 && numero01 % 3 == 0) {
            System.out.println(numero01);
        }

        if (numero02 % 2 == 0 && numero02 % 3 == 0) {
            System.out.println(numero02);
        }

        if (numero03 % 2 == 0 && numero03 % 3 == 0) {
            System.out.println(numero03);
        }
    }
}
