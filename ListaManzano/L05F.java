package ListaManzano;

import java.util.Scanner;

public class L05F {
    public static void main(String[] args) {
        Scanner ja = new Scanner(System.in);
        System.out.println("Apresentar todos os números divisíveis por 4 que sejam menores que 200. Para verificar se o \n" +
                "número é divisível por 4, efetuar dentro da malha a verificação lógica desta condição com a \n" +
                "instrução se, perguntando se o número é divisível; sendo, mostre-o; não sendo, passe para o \n" +
                "próximo passo. A variável que controlará o contador deve ser iniciada com o valor 1.");



      for (int i = 1; i <= 200; i++){
          if (i % 4 == 0){
              System.out.println(i);
          }
      }
        ja.close();
    }
}
