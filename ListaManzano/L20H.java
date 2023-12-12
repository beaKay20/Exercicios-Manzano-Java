package ListaManzano;

import java.util.Scanner;

public class L20H {
    public static void main(String[] args){
        System.out.println("Efetuar a leitura de cinco números inteiros e identificar o maior e o menor valores");

        Scanner ja = new Scanner(System.in);

        System.out.println("Digite cinco números inteiros:");

        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite o número " + (i + 1) + ": ");
            int numero = ja.nextInt();

            // Verifica se o número é o maior ou o menor
            if (numero > maior) {
                maior = numero;
            }

            if (numero < menor) {
                menor = numero;
            }
        }

        // Exibe o maior e o menor valor
        System.out.println("O maior valor é: " + maior);
        System.out.println("O menor valor é: " + menor);
    }

}
