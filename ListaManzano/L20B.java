package ListaManzano;

import java.util.Scanner;

public class L20B {
    public static void main(String[] args){
        System.out.println("Efetuar a leitura de um valor inteiro positivo ou negativo e apresentar o número lido como sendo um\n" +
                "valor positivo, ou seja, o programa deverá apresentar o módulo de um número fornecido. Lembre-se\n" +
                "de verificar se o número fornecido é menor que zero; sendo, multiplique-o por -1.");

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira um valor por favor: ");
        int numero = sc.nextInt();

        if(numero > 0){
            System.out.println("O número informado é positivo.");
        }else{
            int negativo = numero * -1;
            System.out.println("O número informado é negativo.");
        }
    }

}
