package ListaManzano;

import java.util.Scanner;

public class L20E {
    public static void main(String[] args){
        System.out.println("Efetuar a leitura de três valores (variáveis A, B e C) e efetuar o cálculo da equação completa de\n" +
                "segundo grau, apresentando as duas raízes, se para os valores informados for possível efetuar o\n" +
                "referido cálculo. Lembre-se de que a variável A deve ser diferente de zero.");

        Scanner sc = new Scanner(System.in);


        System.out.println("Informe o valor de A: ");
        double A = sc.nextDouble();

        if (A == 0) {
            System.out.println("A equação não é de segundo grau, pois A deve ser diferente de zero.");
            return;
        }

        System.out.println("Informe o valor de B: ");
        double B = sc.nextDouble();

        System.out.println("Informe o valor de C: ");
        double C = sc.nextDouble();

        double delta = B * B - 4 * A * C;


        if (delta < 0) {
            System.out.println("A equação não possui raízes reais.");
        } else {
            // Calcula as raízes
            double raiz1 = (-B + Math.sqrt(delta)) / (2 * A);
            double raiz2 = (-B - Math.sqrt(delta)) / (2 * A);

            System.out.println("As raízes da equação são: ");
            System.out.println("Raiz 1: " + raiz1);
            System.out.println("Raiz 2: " + raiz2);
        }

    }

}
