public class CartaNormal extends Carta{

    public CartaNormal(String atributo, double ataque, double defensa) {
        super(atributo, ataque, defensa);
    }

    public void funcion(){

        System.out.println("Funcion: Aumenta el daño de todas las demas cartas un 10%");

    }
}
