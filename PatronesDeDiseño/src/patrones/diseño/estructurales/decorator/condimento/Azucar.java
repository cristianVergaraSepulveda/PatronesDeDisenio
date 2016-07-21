package patrones.diseño.estructurales.decorator.condimento;

import patrones.diseño.estructurales.decorator.Bebida;

/**
 * Created by athanatos on 13-07-2016.
 */
public class Azucar extends CondimentoAbstracto {

   public Azucar(Bebida bebida){
       this.bebida = bebida;
   }
    @Override
    public String getDescripcion() {
        return bebida.getDescripcion()+" con azucar";
    }

    @Override
    public double getPrecio() {
        return bebida.getPrecio()+0.07;
    }
}
