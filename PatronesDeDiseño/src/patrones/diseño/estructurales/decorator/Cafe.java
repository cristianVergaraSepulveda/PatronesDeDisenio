package patrones.diseño.estructurales.decorator;

/**
 * Created by athanatos on 13-07-2016.
 */
public class Cafe extends Bebida {
    @Override
    public String getDescripcion() {
        return "Cafe";
    }

    @Override
    public double getPrecio() {
        return 2.40;
    }
}
