package desafios.djuntos;

import java.util.Date;
import java.util.Locale;
import java.awt.Toolkit;
import java.awt.Dimension;

public class DesafiosJuntos {
    public static void main (String[] args) {
        Date relogio = new Date();
        System.out.print("Hora do Sistema: ");
        System.out.println(relogio.toString());
        Locale loc = Locale.getDefault();
        System.out.print("Idioma do Sistema é: ");
        System.out.println(loc.getDisplayLanguage());
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();
        System.out.println("A Resolução da Tela é: " + d.width + " X " + d.height);
    }
}
