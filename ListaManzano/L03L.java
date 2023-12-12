package ListaManzano;

import java.util.Scanner;

public class L03L {
    public static void main(String[] args){
        System.out.println("Elaborar um programa que efetue a leitura de valores positivos inteiros até que um valor negativo \n" +
                "seja informado. Ao final devem ser apresentados o maior e o menor valores informados pelo \n" +
                "usuário.");

        Scanner ja = new Scanner(System.in);

        int valor;
        int mayor = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        do {
            System.out.println("Informe um valor positivo (ou um valor negativo para sair): ");
            valor = ja.nextInt();

            if (valor >= 0) {
                mayor = Math.max(mayor, valor);
                menor = Math.min(menor, valor);
            }

        } while (valor >= 0);


        if (mayor != Integer.MIN_VALUE && menor != Integer.MAX_VALUE) {
            System.out.println("O maior valor informado foi: " + mayor);
            System.out.println("O menor valor informado foi: " + menor);
        } else {
            System.out.println("Nenhum valor positivo foi informado.");
        }

       ja.close();
    }
}
