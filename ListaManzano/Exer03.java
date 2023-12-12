package ListaManzano;

import java.util.Scanner;

public class Exer03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Calcular e apresentar o valor do volume de uma lata de óleo, utilizando a fórmula: volume = raio2 * altura");

        System.out.println("Informe o valor do raio da lata de óleo: ");
        float raio= sc.nextFloat();
        System.out.println("Informe o valor da altura da lata de óleo: ");
        float altura= sc.nextFloat();

        double volume = Math.PI * Math.pow(raio, 2) * altura;

        System.out.println(+volume);

        sc.close();
        }
    }

