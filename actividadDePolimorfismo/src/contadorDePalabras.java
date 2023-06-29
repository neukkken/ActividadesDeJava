

class contadorDePalabras {

        public int contadorDePalabras(String text) {
                String[] palabras = text.split("\\s+");
                return palabras.length;
        }

        public int contarPalabras(String text) {
                String[] palabras = text.split("[\\s-]+");
                return palabras.length;
        }



}
