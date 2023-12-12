package ListaManzano;

import java.util.Scanner;

public class L20F {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Efetuar a leitura de três valores (variáveis A, B e C) e apresentá-los dispostos em ordem crescente");
        System.out.println("Informe o valor de A: ");
        int A = sc.nextInt();

        System.out.println("Informe o valor de B: ");
        int B = sc.nextInt();

        System.out.println("Informe o valor de C: ");
        int C = sc.nextInt();


        if (A > B) {
            int temp = A;
            A = B;
            B = temp;
        }

        if (B > C) {
            int temp = B;
            B = C;
            C = temp;
        }

        if (A > B) {
            int temp = A;
            A = B;
            B = temp;
        }

        System.out.println("Os valores em ordem crescente são: " + A + ", " + B + ", " + C);
    }

}
