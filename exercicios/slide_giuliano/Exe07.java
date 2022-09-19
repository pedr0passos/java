package exercicios.slide_giuliano;

import java.util.Scanner;

public class Exe07 {
    public static void main(String[] args) {
        
        // variaveis
        int N, j = 0, i;

        // criando o objeto scanner, que irá ler o valor digitado
        Scanner ler = new Scanner(System.in);
        
        try {

            System.out.print("Digite um número: ");

            // lendo o valor e guardando dentro da variavel inteira N 
            N = ler.nextInt();

            // for para somar todos o números
            for ( i = 1; i <= N; i++ ) {
                j += i;
            }

        } finally {

            // fechando o scanner
            ler.close();

        }

        //printando o valor da soma
        System.out.println("Soma: "+j);

    }
}
