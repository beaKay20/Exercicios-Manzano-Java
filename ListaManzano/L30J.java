package ListaManzano;

import java.util.Scanner;

public class L30J {
    public static void main(String[] args) {
        System.out.println("Elaborar um programa que apresente os resultados da soma e da média aritmética dos valores \n" +
                "pares situados na faixa numérica de 50 a 70.");

        Scanner ja = new Scanner(System.in);

        int suma = 0;
        int Pares = 0;

        for (int i = 50; i <= 70; i++) {
            if (i % 2 == 0) {
                System.out.println("Par: " + i);
                suma += i;
                Pares++;
            }
        }

        double media = (double) suma / Pares;

        ja.close();

        System.out.println("A soma dos valores pares é: " + suma);
        System.out.println("A média dos valores pares é: " + media);
    }
}
