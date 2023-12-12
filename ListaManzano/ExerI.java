package ListaManzano;

import java.util.Scanner;

public class ExerI {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Ler dois inteiros (variáveis A e B) e imprimir o resultado do quadrado da diferença do primeiro valor pelo\n" +
                "segundo");

        System.out.println("Informe um valor: ");
        int valor = sc.nextInt();

        System.out.println("Informe um segundo valor: ");
        int valor1 = sc.nextInt();

        double diferenca = Math.pow((valor - valor1), 2);

        System.out.println("o resultado do quadrado da diferença do primeiro valor pelo segundo é: "+diferenca);

        sc.close();
    }

}
