package ListaManzano;

import java.util.Scanner;

public class ExerN {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Elaborar um programa que efetue a leitura de três valores (A,B e C) e apresente como resultado final o\n" +
                "quadrado da soma dos três valores lidos.");

        System.out.println("Informe o valor de A: ");
        float valor1 = sc.nextFloat();
        System.out.println("Informe o valor de B: ");
        float valor2 = sc.nextFloat();
        System.out.println("Informe o valor de C: ");
        float valor3 = sc.nextFloat();

        float  soma = valor1 + valor2 + valor3;
        float quadrado = soma * soma;

        System.out.println("O quadrado da soma dos três valores lido é: "+quadrado);
    }
}
