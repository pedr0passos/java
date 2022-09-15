package aulas.a003;

public class DataSimples {
    
    //Propriedades
    byte dia,mes;
    short ano;

    //Métodos
    void inicializaDataSimples( byte d, byte m, short a) {
        if ( dataValida(d,m,a)) {
            dia = d;
            mes = m;
            ano = a;
        } else {
            dia = 0;
            mes = 0;
            ano = 0;
        }
    }

    boolean dataValida (byte d, byte m, short a) {
        if ( d >=1 && d <=31 && m >= 1 && m <= 12 ) {
            return true;
        } else {
            return false;
        }
    } 

    boolean igual (DataSimples outraDataSimples) {
        if ( dia == outraDataSimples.dia && mes == outraDataSimples.mes && ano == outraDataSimples.ano) {
            return true;
        } else {
            return false;
        }
    }

    void mostraDataSimples() {
        System.out.print(dia);
        System.out.print("/");
        System.out.print(mes);
        System.out.print("/");
        System.out.print(ano);
    }
}
