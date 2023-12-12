package ListaManzano;

import java.util.Scanner;

public class L50B {
    public static void main(String[] args) {
        System.out.println("Apresentar os resultados de uma tabuada de multiplicar (de 1 até 10) de um número qualquer");

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe um número: ");
        int numero = sc.nextInt();

        for (int contadora = 1; contadora <= 10; contadora++) {
            int resultado = contadora * numero;
            System.out.println(numero + " x " + contadora + " = " + resultado);
        }

        sc.close();
    }
}
