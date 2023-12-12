package ListaManzano;

import java.util.Scanner;

public class L30I {
    public static void main(String[] args) {
        System.out.println("Elaborar um programa que efetue a leitura de 10 valores numéricos e apresente no final o total do \n" +
                "somatório e a média aritmética dos valores lidos. ");

        Scanner ja = new Scanner(System.in);

        int soma = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.println("Informe um número " + i + ": ");

            int numero = ja.nextInt();

            soma += numero;
        }

        int media = soma / 10;

        ja.close();

        System.out.println("A soma dos 10 números é: " + soma);
        System.out.println("A média dos 10 números é: " + media);
    }
}
