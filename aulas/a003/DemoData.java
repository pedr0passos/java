package aulas.a003;

public class DemoData {
    public static void main(String[] args) {
        Data nascimento = new Data();
        Data descobrimentoBrasil = new Data();

        byte umDia, umMes; short umAno;
        umDia = 22; umMes = 13; umAno = 2000;
        nascimento.inicializaData(umDia, umMes, umAno);
        nascimento.mostraData();
        umMes = 4; umAno = 1500;
        System.out.println();
        descobrimentoBrasil.inicializaData(umDia, umMes, umAno);
        descobrimentoBrasil.mostraData();
        System.out.println();
        if ( nascimento.igual(descobrimentoBrasil)) {
            System.out.println("As datas são iguais!");
        } else {
            System.out.println("As datas são diferentes!");
        }
    }
}
