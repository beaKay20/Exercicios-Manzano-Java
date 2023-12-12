package ListaManzano;

public class L03D {
    public static void main(String[] args) {
        System.out.println("Apresentar todos os valores numéricos inteiros ímpares situados na faixa de 0 a 20. Para verificar \n" +
                "se o número é ímpar, efetuar dentro da malha a verificação lógica desta condição com a instrução \n" +
                "se, perguntando se o número é ímpar; sendo, mostre-o; não sendo, passe para o próximo passo.  ");

        for (int numero = 0; numero <= 20; numero++) {
            if (numero % 2 != 0) {
                System.out.println(numero);
            }
        }
    }
}
