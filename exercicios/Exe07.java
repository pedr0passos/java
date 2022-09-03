package exercicios;

import java.util.Scanner;

public class Exe07 {
    public static void main(String[] args) {
        int N, j, i;
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite um número: ");
        N = ler.nextInt();
        for ( i = 1; i <= N; i++ ) {
            j += i;
        }
        System.out.println("Soma: "+j);
    }
}
