package ListaManzano;

import java.util.Scanner;

public class ExerA {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Ler uma temperatura em graus Celsius e apresentá-la convertida em graus Fahrenheit. A fórmula de\n" +
                "conversão é F  (9 * C + 160) / 5, sendo F a temperatura em Fahrenheit e C a temperatura em Celsius");


        System.out.println("Informe a temperatura em graus celsius: ");
        float celsius = sc.nextFloat();

        float fahrenheit = (9 * celsius + 160) / 5;

        System.out.println(+fahrenheit);


        sc.close();
    }
}
