package ListaManzano;

public class L30E {
    public static void main(String[] args){
        System.out.println("Apresentar os resultados das potências de 3, variando do expoente 0 até o expoente 15. Deve ser \n" +
                "considerado que qualquer número elevado a zero é 1, e elevado a 1 é ele próprio. Observe que \n" +
                "neste exercício não pode ser utilizado o operador de exponenciação do portuguol (^). ");


        System.out.println("Potências de 3, variando do expoente 0 até  15:");

        for (int expoente = 0; expoente <= 15; expoente++) {
            long resultado = calcularPotencia(expoente);
            System.out.println("3^" + expoente + " = " + resultado);
        }
    }


    public static long calcularPotencia(int expoente) {
        long resultado = 1;

        for (int i = 0; i < expoente; i++) {
            resultado *= 3;
        }

        return resultado;

    }

}
