package ListaManzano;

public class L03H {
    public static void main(String[] args){
        System.out.println("Elaborar um programa que apresente os valores de conversão de graus Celsius em Fahrenheit, de \n" +
                "10 em 10 graus, iniciando a contagem em 10 graus Celsius e finalizando em 100 graus Celsius. O \n" +
                "programa deve apresentar os valores das duas temperaturas. A fórmula de conversão \n" +
                "é\n" + "5\n" + "9 +160\n" + "=\n"  +"C\n" + "F , sendo F a temperatura em Fahrenheit e C a temperatura em Celsius.");

        int celsius = 10;

        int limite = 100;

        System.out.println("Graus Celsius para Fahrenheit");

        while (celsius <= limite){
            double fahrenheit = converter(celsius);
            System.out.println(celsius + "\t" + fahrenheit);

            celsius =+ 10;
        }
    }

    private static double converter(int celsius) {
        return ((celsius * 9.0 / 5.0) + 32);
    }
}
