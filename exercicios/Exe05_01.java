package exercicios;

public class Exe05_01 {
    public static void main(String[] args) {
        int digito = 9;
        if ( digito < 0 || digito > 9 ) {
            System.out.println("Valor inválido.");
        } else if ( digito == 1 || digito == 2 ) {
            System.out.println("Não podem trafegar na segunda-feira.");
        } else if ( digito == 3 || digito == 4 ) {
            System.out.println("Não podem trafegar na terça-feira.");
        } else if ( digito == 5 || digito == 6 ) {
            System.out.println("Não podem trafegar na quarta-feira.");
        } else if ( digito == 7 || digito == 8 ) {
            System.out.println("Não podem trafegar na quinta-feira.");
        } else if ( digito == 9 || digito == 0 ) {
            System.out.println("Não podem trafegar na sexta-feira.");
        }
    }
}
