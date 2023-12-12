package ListaManzano;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExerK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Informe a cotação do dólar, em reais por dólar: ");
            double cotacao = sc.nextDouble();

            System.out.println("Informe a quantidade em reais disponível: ");
            double quantidadeReal = sc.nextDouble();

            double conversaoDolar = quantidadeReal / cotacao;

            System.out.println("O valor em conversão para a moeda americana é de: US$ " + conversaoDolar);
        } catch (InputMismatchException e) {
            System.out.println("Erro: Por favor, insira valores numéricos válidos.");
        } finally {
            sc.close();
        }
    }
}
