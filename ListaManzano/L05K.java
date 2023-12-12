package ListaManzano;

public class L05K {
    public static void main(String[] args) {
        System.out.println("Elaborar um programa que apresente como resultado o valor do fatorial dos valores ímpares \n" +
                "situados na faixa numérica de 1 a 10.");

        for (int i = 1; i <= 10; i += 2) {
            long fatorial = calcularFatorial(i);
            System.out.println("Fatorial de " + i + " é " + fatorial);
        }
    }

    private static long calcularFatorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }

        return result;
    }
}
