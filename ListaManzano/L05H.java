package ListaManzano;

import java.util.Scanner;

public class L05H {
    public static void main(String[] args) {
        Scanner li = new Scanner(System.in);

        System.out.println(") Elaborar um programa que apresente como resultado o valor de uma potência de uma base \n" +
                "qualquer elevada a um expoente qualquer, ou seja, de BE\n" +
                ", em que B é o valor da base e E o valor \n" +
                "do expoente. Observe que neste exercício não pode ser utilizado o operador de exponenciação do \n" +
                "portuguol (^).");

        System.out.println("Informe o valor da base, por favor: ");
        int base = li.nextInt();
        System.out.println("Informe o valor da base, por favor: ");
        int expoente = li.nextInt();

        int potencia = 1;


        for(int i = 1; i <= expoente; i++) {
             potencia *= base ;
        }
        System.out.println("O valor da potênciação do número informado é igual a: "+potencia);
    }
}
