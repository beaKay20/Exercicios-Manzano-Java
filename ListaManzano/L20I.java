package ListaManzano;

import java.util.Scanner;

public class L20I {
    public static void main(String[] args){
        Scanner ja = new Scanner(System.in);


        System.out.println("Elaborar um programa que efetue a leitura de um número inteiro e apresentar uma mensagem\n" +
                "informando se o número é par ou ímpar");

        System.out.println("Informe um número inteiro, por favor: ");
        int valor = ja.nextInt();

        if (valor % 2 == 0){
            System.out.println("O numero informado é par!");
        }else{
            System.out.println("O numero informado é ímpar!");
        }
    }
}
