package ListaManzano;

import java.util.Scanner;

public class L30K {
    public static void main(String[] args) {
        System.out.println("Elaborar um programa que possibilite calcular a área total de uma residência (sala, cozinha, \n" +
                "banheiro, quartos, área de serviço, quintal, garagem, etc.). O programa deve solicitar a entrada do \n" +
                "nome, a largura e o comprimento de um determinado cômodo. Em seguida, deve apresentar a área \n" +
                "do cômodo lido e também uma mensagem solicitando do usuário a confirmação de continuar \n" +
                "calculando novos cômodos. Caso o usuário responda “NAO”, o programa deve apresentar o valor \n" +
                "total acumulado da área residencial.");

        Scanner ja = new Scanner(System.in);

        double areaTotal = 0;
        String resposta;

        do {
            System.out.println("Informe o nome do cômodo:");
            String nomeComodo = ja.nextLine();

            System.out.println("Informe a largura do cômodo em metros:");
            double largura = ja.nextDouble();

            System.out.println("Informe o comprimento do cômodo em metros:");
            double comprimento = ja.nextDouble();


            double areaComodo = largura * comprimento;
            areaTotal += areaComodo;

            System.out.println("Área do cômodo " + nomeComodo + ": " + areaComodo + " metros quadrados");


            ja.nextLine();


            System.out.println("Deseja calcular a área de outro cômodo? (SIM/NAO)");
            resposta = ja.nextLine().toUpperCase();

        } while (!"NAO".equals(resposta));


        System.out.println("Área total da residência: " + areaTotal + " metros quadrados");

        ja.close();
    }
}
