import java.util.regex.Pattern;

class contPalabrasPoly extends contadorDePalabras {

    public int contadorDePalabras(String text) {

        String[] palabras = Pattern.compile("\\s+").split(text);
        return palabras.length;

    }

}
