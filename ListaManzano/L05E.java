package ListaManzano;

import java.util.Scanner;

public class L05E {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Apresentar todos os valores numéricos inteiros ímpares situados na faixa de 0 a 20. Para verificar \n" +
                "se o número é ímpar, efetuar dentro da malha a verificação lógica desta condição com a instrução \n" +
                "se, perguntando se o número é ímpar; sendo, mostre-o; não sendo, passe para o próximo passo.");


        int i = 1;

        while (i <= 20) {
            if (i % 2 != 0) {

                System.out.println("Números ímpares: "+i);
            } i++;
        }
        sc.close();
    }
}