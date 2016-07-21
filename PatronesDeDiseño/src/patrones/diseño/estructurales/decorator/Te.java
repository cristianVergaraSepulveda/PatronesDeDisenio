package patrones.diseño.estructurales.decorator;

/**
 * Created by athanatos on 13-07-2016.
 */
public class Te extends Bebida {
    @Override
    public String getDescripcion() {
        return "Te";
    }

    @Override
    public double getPrecio() {
        return 1.5;
    }
}
