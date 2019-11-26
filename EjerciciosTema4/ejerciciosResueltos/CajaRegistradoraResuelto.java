package ejerciciosResueltos;
/**
 * 
 * EJERCICIO RESUELTO
 * 
 * @author Miki.
 * 
 * EJERCICIO 1) Programar una clase CajaRegistradora en java que simule las siguientes operaciones y atributos.
 * 
 * Atributos: dinero de tipo double
 * 
 * Operaciones:
 * 
 * Contrusctor por defecto.
 * 
 * Constructor(double), que recibe un parámetro que inicializa el atributo.
 * 
 * getDinero():double, accesor que devuelve el dinero actual.
 * setDinero(double), método que modifica el dinero actual.
 * 
 * cobrar(double):boolean, devuelve 'true' si hay dinero suficiente para cobrar dicha cantidad 
 * y además resta el dinero de la caja, y si no hay dinero devuelve 'false'.
 * 
 * ingresar(double), ingresa la cantidad recibida por parámetro al dinero actual de la caja
 */

public class CajaRegistradoraResuelto {
	
	private double dinero= 0;
	
	public CajaRegistradoraResuelto(double n){
		dinero = n;
	}
	
	public double getDinero(){
		return dinero;
	}
	
	public void setDinero(double n){
		dinero = n;
	}
	
	public boolean cobrar (double n ){
		if(dinero >= n){
			dinero = dinero - n;
			return true;
		}
		return false;
	}
	
	
	public void ingresa (double n){
		dinero = dinero +n;
	}
	
	
	
	
}
