package exercicios;

public class Exe03 {
    public static void main(String[] args) {
        double h = 1.65, kg = 55.0,imc;
        imc = kg/(h*h);
        System.out.println("IMC: "+imc);
        if ( imc <= 18.5) {
            System.out.println("Abaixo do peso normal");
        } else if ( imc > 18.5 && imc < 25.0 ) {
            System.out.println("Peso normal");
        } else if ( imc >= 25 && imc <= 30 ) {
            System.out.println("Acima do peso normal");
        } else {
            System.out.println("Obesidade");
        }
    }
}
