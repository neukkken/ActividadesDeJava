public class CartaEspecial extends Carta {


    public CartaEspecial(String atributo, double ataque, double defensa) {
        super(atributo, ataque, defensa);
    }

    public void Funcion(){

        System.out.println("Funcion: Esta carta deshabilita todas las cartas de tipo luz (Solo se puede usar una vez por partida)");

    }

}
