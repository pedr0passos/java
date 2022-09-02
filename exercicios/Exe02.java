package exercicios;

public class Exe02 {
    public static void main(String[] args) {
        double num1 = 5.5, num2 = 3.2, soma, dif, prod, div;
        int escolha = 4;
        soma = num1 + num2;
        dif = num1 - num2;
        prod = num1 * num2;
        div = num1/num2;
        if ( escolha == 1 ) {
            System.out.println("A soma dos números é: "+soma);
        } else if ( escolha == 2) {
            System.out.println("A diferença entre os números é: "+dif);
        } else if ( escolha == 3 ) {
            System.out.println("O produto dos números é "+prod);
        } else if ( escolha == 4 ) {
            System.out.println("A divisão entre os números é "+div);
        }
    }
}
