package ListaManzano;

import java.util.Scanner;

public class ExerH {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Elaborar um programa que calcule e apresente o volume de uma caixa retangular, por meio da fórmula\n" +
                "VOLUME  COMPRIMENTO * LARGURA * ALTURA.");

        System.out.println("Informe o comprimento da caixa retagunlar: ");
        int comprimento = sc.nextInt();

        System.out.println("Informe o valor da largura: ");
        int largura = sc.nextInt();

        System.out.println("Informe o valor correspondente a altura: ");
        int altura = sc.nextInt();

        int volume = comprimento * largura * altura;

        System.out.println("O valor correspondente ao volume é de: "+volume);


        sc.close();
    }
}
