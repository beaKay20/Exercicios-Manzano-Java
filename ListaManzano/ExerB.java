package ListaManzano;

import java.util.Scanner;

public class ExerB {
    public static void main (String[] args){
         Scanner sc = new Scanner(System.in);

         System.out.println("Ler uma temperatura em graus Fahrenheit e apresentá-la convertida em graus Celsius. A fórmula de\n" +
                 "conversão é C  (F - 32) * (5/9) , sendo F a temperatura em Fahrenheit e C a temperatura em Celsius.");


         System.out.println("Informe a temparatura em graus fahrenheit: ");
         float farhenheit = sc.nextFloat();

        float celsius = (farhenheit -32) * (5f/9);

        System.out.println("Os graus covertido para celsius corresponde a " + celsius +"C°");

         sc.close();
    }
}
