package exercicios.slide_giuliano;

public class Exe05_02 {
    public static void main(String[] args) {
        int digito = 1;
        if ( digito < 0 || digito > 9 ) {
            System.out.println("Valor inválido.");
        } else if ( digito > 0 && digito < 3 ) {
            System.out.println("Não podem trafegar na segunda-feira.");
        } else if ( digito > 2 && digito < 5) {
            System.out.println("Não podem trafegar na terça-feira.");
        } else if ( digito > 4 && digito < 7 ) {
            System.out.println("Não podem trafegar na quarta-feira.");
        } else if ( digito > 6 && digito < 9 ) {
            System.out.println("Não podem trafegar na quinta-feira.");
        } else if ( digito > 8 && digito < 10 ) {
            System.out.println("Não podem trafegar na sexta-feira.");
        } else {
            System.out.println("Não podem trafegar na sexta-feira");
        }
    }
}

