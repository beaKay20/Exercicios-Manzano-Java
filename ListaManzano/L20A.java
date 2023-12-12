package ListaManzano;

import java.util.Scanner;

public class L20A {
    public static void main(String[] args) {
        System.out.println("Ler dois valores numéricos inteiros e apresentar o resultado da diferença do menor pelo maior valor");
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe um valor: ");
        int valor = sc.nextInt();

        System.out.println("Informe um outro valor: ");
        int valor1 = sc.nextInt();

        if (valor1 < valor) {
            int diferencaMenor = valor - valor1;
            System.out.println("A diferença entre os valores informados é de: " + diferencaMenor);
        }
    }
}
