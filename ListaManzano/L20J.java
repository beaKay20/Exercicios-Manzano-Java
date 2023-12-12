package ListaManzano;

import java.util.Scanner;

public class L20J {
    public static void main(String[] args){
        Scanner ja = new Scanner(System.in);


        System.out.println("Elaborar um programa que efetue a leitura de um valor que esteja entre a faixa de 1 a 9. Após a\n" +
                "leitura do valor fornecido pelo usuário, o programa deverá indicar uma de duas mensagens: \"O\n" +
                "valor está na faixa permitida\", caso o usuário forneça o valor nesta faixa, ou a mensagem \"O valor\n" +
                "está fora da faixa permitida\", caso o usuário forneça valores menores que 1 ou maiores que 9.");

        System.out.println("Informe um valor que esteja dentro da faixa de 1 até 9: ");
        int numero = ja.nextInt();;

        if (numero >= 1 && numero <= 9 ){
            System.out.println("O valor "+ numero + " está dentro da faixa permitida, obrigada" );
        }else {
            System.out.println("O valor informado está fora da faixa, por favor informe um valor permitido.");
        }
    }
}
