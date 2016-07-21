package patrones.diseño.creacionales.singleton; 

/**
 * Created by  athanatos on 12-07-2016.
 */
public class Main {

    /**
     * @author cristian vergara
     * @version 1.0
     * se valida comportamiento de patron singleton. 
     * aunque se generan 2 instancias de la clase singleton
     * esta solo mantiene el valor de  la ultima accion 
     * en este caso  sin2.setValue("sing2");
     * 
     */
    public static void main(String[] args){

        Singleton sin = Singleton.getInstance();
        sin.log("hola mundo");
        Singleton sin2 = Singleton.getInstance();

        sin.setValue("sing1");
        sin2.setValue("sing2");
       
        
        System.out.println(sin.getValue());
    }

}
