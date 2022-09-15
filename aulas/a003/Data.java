package aulas.a003;

public class Data {

    private byte dia, mes;
    private short ano;

    public void inicializaData(byte d, byte m, short a) {
        if ( dataValida(d,m,a)) {
            dia = d; mes = m; ano = a;
        } else {
            dia = 0; mes = 0; ano = 0;
        }
    }

    public byte retornoDia () {
        return dia;
    }

    public byte retornaMes () {
        return mes;
    }

    public short retornaAno () {
        return ano;
    }

    public boolean dataValida(byte d, byte m, short a) {
        if ( d >= 1 && d <= 31 && m >=1 && m <= 12 ) {
            return true;
        } else {
            return false;
        }
    }

    public boolean igual (Data outraData ) {
        if ( dia == outraData.dia && mes == outraData.mes && ano == outraData.ano ) {
            return true;
        }  else {
            return false;
        }
    }

    public void mostraData () {
        System.out.print(dia);
        System.out.print("/");
        System.out.print(mes);
        System.out.print("/");
        System.out.print(ano);
    }

}
