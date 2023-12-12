package ListaManzano;

import java.util.Scanner;

public class L20C {
    public static void main(String[] args){
        System.out.println("Ler quatro valores referentes a quatro notas escolares de um aluno e imprimir uma mensagem\n" +
                "dizendo que o aluno foi aprovado, se o valor da média escolar for maior ou igual a 5. Se o aluno não\n" +
                "foi aprovado, indicar uma mensagem informando esta condição. Apresentar junto das mensagens o\n" +
                "valor da média do aluno para qualquer condição.");

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a primeira nota do aluno, por favor: ");
        int n1 = sc.nextInt();
        System.out.println("Informe a segunda nota do aluno, por favor: ");
        int n2 = sc.nextInt();
        System.out.println("Informe a terceira nota do aluno, por favor: ");
        int n3 = sc.nextInt();
        System.out.println("Informe a quarta nota do aluno, por favor: ");
        int n4 = sc.nextInt();

        float media_aluno = (n1+n2+n3+n4) / 4;

        if (media_aluno < 5){
            System.out.println("Aluno reprovado, mas não desanime :- ");
        }else{
            System.out.println("Aluno arovado, parabéns! ");
        }
    }
}
