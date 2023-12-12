package ListaManzano;

import java.util.Scanner;

public class L03F {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Elaborar um programa que apresente como resultado o valor de uma potência de uma base \n" +
                "qualquer elevada a um expoente qualquer, ou seja, de BE\n" +
                ", em que B é o valor da base e E o valor \n" +
                "do expoente. Observe que neste exercício não pode ser utilizado o operador de exponenciação do \n" +
                "portuguol (^). ");

        System.out.print("Digite a base (B): ");
        double base = scanner.nextDouble();

        System.out.print("Digite o expoente (E): ");
        int expoente = scanner.nextInt();

        double resultado = calcularPotencia(base, expoente);

        System.out.println("O resultado de " + base + " elevado a " + expoente + " é: " + resultado);
    }


    public static double calcularPotencia(double base, int expoente) {
        double resultado = 1;

        if (expoente >= 0) {
            for (int i = 0; i < expoente; i++) {
                resultado *= base;
            }
        } else {
            for (int i = 0; i < -expoente; i++) {
                resultado /= base;
            }
        }

        return resultado;
    }
}
