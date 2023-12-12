package ListaManzano;

import java.util.Scanner;

public class L50C {
    public static void main(String[] args){
        System.out.println("Apresentar o total da soma obtida dos cem primeiros números inteiros (1+2+3+4+...+98+99+100). ");

        int numero = 1;
        int soma = 0;
        Scanner sc = new Scanner(System.in);


        while (numero <= 100){
          soma = soma + numero;
          numero = numero + 1;

          System.out.println("A soma dos cem primeiros números inteiros é: " + soma);
        }
    }
}
