package Excepcion;

public class Impar extends Exception{
	
	private static final long serialVersionUID = 1L;
	/**
	 * Excepcion que saltara si el numero generado es impar
	 */
	public Impar() {
		super("El numero es impar");
	}


}
