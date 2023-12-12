package ListaManzano;

import java.util.Scanner;

public class L20D {
    public static void main(String[] args) {
        System.out.println("Ler quatro valores referentes a quatro notas escolares de um aluno e imprimir uma mensagem\n" +
                "dizendo que o aluno foi aprovado, se o valor da média escolar for maior ou igual a 7. Se o valor da\n" +
                "média for menor que 7, solicitar a nota de exame, somar com o valor da média e obter nova média.\n" +
                "Se a nova média for maior ou igual a 5, apresentar uma mensagem dizendo que o aluno foi\n" +
                "aprovado em exame. Se o aluno não foi aprovado, indicar uma mensagem informando esta\n" +
                "condição. Apresentar com as mensagens o valor da média do aluno, para qualquer condição");

        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a primeira nota: ");
        double nota1 = sc.nextDouble();

        System.out.println("Informe a segunda nota: ");
        double nota2 = sc.nextDouble();

        System.out.println("Informe a terceira nota: ");
        double nota3 = sc.nextDouble();

        System.out.println("Informe a quarta nota: ");
        double nota4 = sc.nextDouble();

        // Calcular a média
        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.println("A média do aluno é: " + media);

        if (media >= 7) {
            System.out.println("O aluno foi aprovado!");
        } else {

            System.out.println("Informe a nota do exame: ");
            double notaExame = sc.nextDouble();


            double novaMedia = (media + notaExame) / 2;

            System.out.println("A nova média do aluno é: " + novaMedia);

            if (novaMedia >= 5) {
                System.out.println("O aluno foi aprovado em exame!");
            } else {
                System.out.println("O aluno não foi aprovado.");
            }
        }
    }
}
