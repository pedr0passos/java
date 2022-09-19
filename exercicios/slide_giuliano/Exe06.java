package exercicios.slide_giuliano;

public class Exe06 {
    public static void main(String[] args) {
        int ano = 1900;
        if ( ano%4 == 0 && ano%100 != 0 ) {
            System.out.println("Foi um ano bissexto");
        } else if ( ano%4 == 0 && ano%100 == 0 ) {
            if ( ano%400 == 0 ) {
                System.out.println("Foi um ano bissexto");
            } else {
                System.out.println("Não foi um ano bissexto");
            }
        } else if ( ano%4 != 0 ) {
            System.out.println("Não foi um ano bissexto");
        }
    }
}
