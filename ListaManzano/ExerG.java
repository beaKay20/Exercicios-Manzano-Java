package ListaManzano;

import java.util.Scanner;

public class ExerG {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Ler quatro números inteiros e apresentar o resultado da adição e multiplicação, baseando-se na" +
               "utilização do conceito da propriedade distributiva. Ou seja, se forem lidas as variáveis A, B, C, e D,\n" +
               "devem ser somadas e multiplicadas A com B, A com C e A com D. Depois B com C, B com D e por fim" +
               "C com D. Perceba que será necessário efetuar seis operações de adição e seis operações de" +
               "multiplicação e apresentar doze resultados de saída.");


       System.out.print("Digite o valor para A: ");
       int A = sc.nextInt();

       System.out.print("Digite o valor para B: ");
       int B = sc.nextInt();

       System.out.print("Digite o valor para C: ");
       int C = sc.nextInt();

       System.out.print("Digite o valor para D: ");
       int D = sc.nextInt();

       // Realiza as operações utilizando a propriedade distributiva
       int resultado1 = A + B;
       int resultado2 = A + C;
       int resultado3 = A + D;
       int resultado4 = B + C;
       int resultado5 = B + D;
       int resultado6 = C + D;

       int resultado7 = A * B;
       int resultado8 = A * C;
       int resultado9 = A * D;
       int resultado10 = B * C;
       int resultado11 = B * D;
       int resultado12 = C * D;

       // Exibe os resultados
       System.out.println("Resultados da adição:");
       System.out.println("A + B = " + resultado1);
       System.out.println("A + C = " + resultado2);
       System.out.println("A + D = " + resultado3);
       System.out.println("B + C = " + resultado4);
       System.out.println("B + D = " + resultado5);
       System.out.println("C + D = " + resultado6);

       System.out.println("Resultados da multiplicação:");
       System.out.println("A * B = " + resultado7);
       System.out.println("A * C = " + resultado8);
       System.out.println("A * D = " + resultado9);
       System.out.println("B * C = " + resultado10);
       System.out.println("B * D = " + resultado11);
       System.out.println("C * D = " + resultado12);


       sc.close();

   }
}

