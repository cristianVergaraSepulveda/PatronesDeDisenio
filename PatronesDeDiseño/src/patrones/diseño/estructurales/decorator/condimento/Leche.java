package patrones.dise�o.estructurales.decorator.condimento;

import patrones.dise�o.estructurales.decorator.Bebida;

/**
 * Created by athanatos on 13-07-2016.
 */
public class Leche extends CondimentoAbstracto {

   public Leche(Bebida bebida){
       this.bebida = bebida;
   }
    @Override
    public String getDescripcion() {
        return bebida.getDescripcion()+" con leche";
    }

    @Override
    public double getPrecio() {
        return bebida.getPrecio()+0.25;
    }
}
