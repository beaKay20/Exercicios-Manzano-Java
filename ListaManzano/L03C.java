package ListaManzano;

public class L03C {
    public static void main(String[] args) {
        System.out.println("Elaborar um programa que apresente no final o somatório dos valores pares existentes na faixa de 1 até 500");
        int somatorio = 0;


        for (int numero = 1; numero <= 500; numero++) {

            if (numero % 2 == 0) {
                somatorio += numero;
            }
        }
        System.out.println("O somatório dos valores pares de 1 a 500 é: " + somatorio);

    }
}
