package patrones.diseño.creacionales.singleton; 

/**
 * Created by athanatos on 12-07-2016.
 */
public class Singleton {

    private  static Singleton singl;
    private  String value;

    /**
     *
     */
    private Singleton(){

    }
    public static Singleton getInstance(){
        if(singl==null){
            singl = new Singleton();
        }
        return singl;
    }

    public void log(String msg){
        System.out.print(msg);
    }


    public void setValue(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;

    }
}
