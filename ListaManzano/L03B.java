package ListaManzano;

public class L03B {
    public static void main (String[] args){
        System.out.println(" Apresentar o total da soma obtida dos cem primeiros números inteiros (1+2+3+4+...+98+99+100)");
        int somatorio = 0;


        for (int i = 1; i <= 100;  i++){
            somatorio += i;
        }
        System.out.println("O resultado final da somas dos valores é: " +somatorio);
    }
}
