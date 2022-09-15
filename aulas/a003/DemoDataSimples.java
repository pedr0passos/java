package aulas.a003;

public class DemoDataSimples {
    public static void main(String[] args) {
        DataSimples hoje = new DataSimples();
        DataSimples independeciaBrasil = new DataSimples();
        byte dia, mes; short ano;
        dia = 40; mes = 1; ano = 2001;
        // Iniciando a data "hoje" sendo ela n�o v�lida pois tem dia >= 31 
        hoje.inicializaDataSimples(dia, mes, ano);
        // mostrando a data hoje; ou seja, 0/0/0 por causa de ser n�o v�lida
        hoje.mostraDataSimples();
        // colocando uma data v�lida no dia da independencia 
        dia = 7; mes = 9; ano = 1822;

        // inicializando a data da independencia do Brasil
        System.out.println();
        independeciaBrasil.inicializaDataSimples(dia, mes, ano);
        independeciaBrasil.mostraDataSimples();
        System.out.println();

        //testando o metodo igual 
        if ( hoje.igual(independeciaBrasil)) {  // verificando se a data de hoje é igual a data da independencia
            System.out.println("As datas são iguais");
        } else {
            System.out.println("As datas são diferentes");
        }

        hoje.dia = 0;
        hoje.mes = 1;
        hoje.ano = 2001;
        hoje.mostraDataSimples(); // imprime  0/1/2001
        independeciaBrasil.mes = 13;
        independeciaBrasil.mostraDataSimples(); // imprime 7/13/1822
    }
}
