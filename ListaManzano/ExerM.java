package ListaManzano;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExerM {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Informe o valor de A: ");
            double A = sc.nextDouble();

            System.out.println("Informe o valor de B: ");
            double B = sc.nextDouble();

            System.out.println("Informe o valor de C: ");
            double C = sc.nextDouble();

            double sumaCuadrados = Math.pow(A, 2) + Math.pow(B, 2) + Math.pow(C, 2);

            System.out.println("A soma dos quadrados de A, B e C é: " + sumaCuadrados);
        } catch (InputMismatchException e) {
            System.out.println("Erro: Por favor, insira valores numéricos válidos.");
        }
    }
}
