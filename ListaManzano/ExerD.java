package ListaManzano;

import java.util.Scanner;

public class ExerD {
    public static void main (String []args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Efetuar o cálculo da quantidade de litros de combustível gasta em uma viagem, utilizando um\n" +
                "automóvel que faz 12 Km por litro. Para obter o cálculo, o usuário deve fornecer o tempo gasto\n" +
                "(TEMPO) e a velocidade média (VELOCIDADE) durante a viagem. Desta forma, será possível obter a\n" +
                "distância percorrida com a fórmula DISTANCIA \u0001 TEMPO * VELOCIDADE. Possuindo o valor da\n" +
                "distância, basta calcular a quantidade de litros de combustível utilizada na viagem com a fórmula\n" +
                "LITROS_USADOS \u0001 DISTANCIA / 12. Ao final, o programa deve apresentar os valores da velocidade\n" +
                "média (VELOCIDADE), tempo gasto na viagem (TEMPO), a distancia percorrida (DISTANCIA) e a\n" +
                "quantidade de litros (LITROS_USADOS) utilizada na viagem");

        System.out.println("Informe o tempo gasto naviagem: ");
        float tempo = sc.nextFloat();
        System.out.println("Informe a velocidade durante a viagem: ");
        float velocidade = sc.nextFloat();

        float distancia = tempo * velocidade;

        float litros_usados = distancia / 12;

        System.out.println("A velocidade média é de " +velocidade+ "Km/h" + " O tempo gasto na viagem foi de "+tempo+"h" +" a distância percorrida foi de "
                +distancia+ "Km " + "a quantidades de litros foi " +litros_usados +" l");

        sc.close();
    }
}
