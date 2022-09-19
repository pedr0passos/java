package exercicios.slide_giuliano;

import java.util.Scanner;

public class Exe08 {
    public static void main(String[] args) {
        
        // variaveis e vetores
        int i = 10, maior = 0;
        int vet[] = new int [i];

        // criando o objeto scanner
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite os 10 Números: ");
        
        try {

            // for que lê todos os números e armazena dentro do vetor
            for ( int j = 0; j < vet.length; j++ ) {

                // lendo
                vet[j] = scan.nextInt();

                // verificando qual é o maior número 
                if ( vet[j] > maior ) {
                    maior = vet[j];
                }
            
            }

        } finally {
            // fechando o scanner
            scan.close();
        }

        // imprimindo o maior número
        System.out.println("Maior número: "+maior);
        
    }
}
