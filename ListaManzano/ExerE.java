package ListaManzano;

import java.util.Scanner;

public class ExerE {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Efetuar o cálculo e a apresentação do valor de uma prestação em atraso, utilizando a fórmula\n" +
                "PRESTACAO \u0001 VALOR + (VALOR * TAXA/100) * TEMPO)");

        System.out.println("Informe o valor atual da prestação: ");
        float valor = sc.nextFloat();

        System.out.println("Informe o valor da taxa: ");
        float taxa = sc.nextFloat();

        System.out.println("Digite o tempo em meses do atraso: ");
        float tempo = sc.nextFloat();

        float prestacao = valor + (valor * taxa/ 100 * tempo);

        System.out.println("O valor da pretação atual é de R$: "+prestacao);


        sc.close();
    }
}
