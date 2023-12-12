package ListaManzano;

import java.util.Scanner;

public class L05I {
    public static void main(String[] args) {

        Scanner ju = new Scanner(System.in);

        System.out.println("Escreva um programa que apresente a série de Fibonacci até o décimo quinto termo. A série de \n" +
                "Fibonacci é formada pela seqüência: 1, 1, 2, 3, 5, 8, 13, 21, 34, ..., etc. Esta série se caracteriza \n" +
                "pela soma de um termo atual com o seu anterior subseqüente, para que seja formado o próximo \n" +
                "valor da seqüência. Portanto começando com os números 1, 1 o próximo termo é 1+1=2, o próximo \n" +
                "é 1+2=3, o próximo é 2+3=5, o próximo 3+5=8, etc.");

        int n = 15;
        int primeiroTermo = 1;
        int segundoTermo = 1;


        System.out.println("Finabocci " +n);

        System.out.println(primeiroTermo + "," + segundoTermo);

        for (int i = 3; i <= n; i++){
            int proximoTermo = primeiroTermo + segundoTermo;
            System.out.println(+proximoTermo);

            primeiroTermo = segundoTermo;
            segundoTermo = proximoTermo;
        }
    }
}
