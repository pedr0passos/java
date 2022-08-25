package desafios.d001;

import java.util.Locale;

public class LinguagemDoSistema {
    public static void main (String[] args) {
        Locale loc = Locale.getDefault();   
        System.out.print("Idioma do sistema é: ");
        System.out.println(loc.getDisplayLanguage());
    }
}