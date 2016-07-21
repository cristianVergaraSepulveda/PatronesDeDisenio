package patrones.diseño.estructurales.decorator;

import patrones.diseño.estructurales.decorator.condimento.Azucar;
import patrones.diseño.estructurales.decorator.condimento.Crema;
import patrones.diseño.estructurales.decorator.condimento.Leche;

/**
 * Created by athanatos on 13-07-2016.
 * 
 * @author Cristian vergara
 * @version 1.0
 * @since 13-07-2016
 * @see <a href = "https://www.youtube.com/watch?v=E1-3BrkvCT4" />basado en canal de youtube de Raydelto Hernandez</a>
 * 
 */
public class Sistema {
    public static void main(String[] args){
        Bebida bebida = new Cafe();
        bebida = new Leche(bebida);
        bebida = new Azucar(bebida);
        bebida = new Crema(bebida);
        System.out.println(bebida.getDescripcion() + " cuesta:"+bebida.getPrecio());
    }

}
