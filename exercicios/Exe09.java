package exercicios;

public class Exe09 {
    public static void main(String[] args) {
        int aux=0, cont=0, media=0;
        for ( int i = 1000; i < 2000; i++ ) {
            if ( i%11 == 5 ) {
                System.out.println("Número: " + i);
                aux += i;
                cont++;
            }
        }
        media = aux/cont;
        System.out.println("Média: " + media);
    }
}
