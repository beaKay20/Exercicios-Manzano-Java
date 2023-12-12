package ListaManzano;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExerJ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Elaborar um programa que efetue a apresentação do valor da conversão em real de um valor lido em\n" +
                "dólar. O programa deve solicitar o valor da cotação do dólar e também a quantidade de dólares\n" +
                "disponível com o usuário, para que seja apresentado o valor em moeda brasileira.");

        try {
            System.out.println("Informe o valor da cotação do dólar: ");
            float cotacao = sc.nextFloat();

            System.out.println("Informe a quantidade de dólares que possui: ");
            float dolar = sc.nextFloat();

            float real = dolar * cotacao;

            System.out.println("O valor em conversão para a moeda brasileira é de R$: " + real);
        } catch (InputMismatchException e) {
            System.out.println("Erro: Por favor, insira valores numéricos válidos.");
        } finally {
            sc.close();
        }
    }
}
