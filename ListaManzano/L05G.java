package ListaManzano;

import java.util.Scanner;

public class L05G {
    public static void main(String[] args) {

        Scanner ja = new Scanner(System.in);

        System.out.println("Apresentar os resultados das potências de 3, variando do expoente 0 até o expoente 15. Deve ser \n" +
                "considerado que qualquer número elevado a zero é 1, e elevado a 1 é ele próprio. Observe que \n" +
                "neste exercício não pode ser utilizado o operador de exponenciação do portuguol (^). ");

       int base = 3;

        for(int i = 1; i <= 15; i++){

                int potencia = (int) Math.pow(base, i);

            System.out.println("3 ^ "+i + " = " +potencia);
        }
        ja.close();
    }

}
