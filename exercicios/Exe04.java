package exercicios;

public class Exe04 {
    public static void main(String[] args) {
        int idade = 25, idiomas = 1;
        double altura = 1.70;
        System.out.println("Idade: "+idade);
        System.out.println("Altura: "+altura);
        System.out.println("Idiomas: "+idiomas);
        if ( idade >= 24 && idiomas >= 2 && altura >= 1.70 ) {
            System.out.println("Você tem as características necessárias para ser uma aeromoça");
        } else {
            System.out.println("Você não tem as caracteirísticas necessárias para ser uma aeromoça");
        }
    }
}
