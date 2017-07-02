package patrones.diseño.estructurales.adapter;



/**
 * @author athanatos
 *	Patron de adapter, permite  adaptar una objeto a otro objeto.
 */
public class Sistema {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Motor motor = new MotorEconomico();
	    motor = new MotorComun();
	    motor.encender();
	    motor.acelerar();
	    motor.apagar();
	    
	    Motor motorE = new MotorElectricoAdapter() ;
	    motorE.encender();
	    motorE.acelerar();
	    motorE.apagar();  
	    
	    Motor motorEco = new MotorEconomico();
	    motorEco.encender();
	    motorEco.acelerar();
	    motorEco.apagar(); 
	}

}
