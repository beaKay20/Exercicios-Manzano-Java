package ListaManzano;

import java.util.Scanner;

public class L05J {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Elaborar um programa que apresente os valores de conversão de graus Celsius em Fahrenheit, de \n" +
                "10 em 10 graus, iniciando a contagem em 10 graus Celsius e finalizando em 100 graus Celsius. O \n" +
                "programa deve apresentar os valores das duas temperaturas. A fórmula de conversão \n" +
                "é\n" + "5\n" + "9 +160\n" + "=\n" + "C\n" + "F , sendo F a temperatura em Fahrenheit e C a temperatura em Celsiu");


        for(int celsius = 10; celsius <= 100; celsius += 10){
            double fahrenheit = celsius * 9 / 5.0 + 32;

            System.out.println(celsius + " conversão " +fahrenheit);
        }
    }
}
