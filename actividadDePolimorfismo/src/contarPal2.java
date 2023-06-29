import java.util.regex.Pattern;
public class contarPal2 extends contadorDePalabras{

    public int contarPalabras2(String text) {
        String[] palabras = Pattern.compile("[\\s-]+").split(text);
        return palabras.length;
    }

}
