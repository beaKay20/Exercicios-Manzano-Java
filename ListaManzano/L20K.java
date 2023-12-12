package ListaManzano;

import java.util.Scanner;

public class L20K {
    public static void main(String[] args){
        Scanner ja = new Scanner(System.in);


        System.out.println("Elaborar um programa que efetue a leitura de um determinado valor inteiro, e efetue a sua\n" +
                "apresentação, caso o valor não seja maior que três");

        System.out.println("Informe um valor, por favor:  ");
        int numero = ja.nextInt();;

        if (numero > 3){
            System.out.println("O Número " +numero+ " informado  é maior que 3 " );
        }else {
            System.out.println("Valor " +numero+ " informado é menor ou igual a 3 .");
        }
    }
}


