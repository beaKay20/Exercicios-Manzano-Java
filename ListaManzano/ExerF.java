package ListaManzano;

import java.util.Scanner;

public class ExerF{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Ler dois valores (inteiros, reais ou caracteres) para as variáveis A e B, e efetuar a troca dos valores de" +
                "forma que a variável A passe a possuir o valor da variável B e a variável B passe a possuir o valor da" +
                "variável A. Apresentar os valores trocados");
        System.out.print("Digite o valor para A: ");
        int A = sc.nextInt();

        // Solicita e lê o valor para a variável B
        System.out.print("Digite o valor para B: ");
        int B = sc.nextInt();

        // Troca dos valores utilizando uma variável temporária
        int temp = A;
        A = B;
        B = temp;

        // Exibe os valores trocados
        System.out.println("Valores trocados: A = " + A + ", B = " + B);

        // Fecha o scanner
        sc.close();

    }
}
