package ejerciciosResueltos;

/**
 * (�breme)
 * @author miki
 * 
 * Este apartado pertenece al Ejercio 4 del tema 4: "Paquetes y clases"
 * El main est� en la clase ya desarrollada "Uso_Electrodomestico".
 * 
 * ========================================================================================================================
 * 
 * Desarrolle la clase "Television" que es una subclase de "Electrodomestico" con las siguientes caracter�sticas:
 *
 * Sus atributos son:
 * 
 *  	+ resoluci�n (en pulgadas) 
 *  	+ y sintonizador TDT (booleano)
 *  	+ atributos heredados.
 *  
 * Por defecto, la resoluci�n sera de 20 pulgadas y el sintonizador sera false.
 * 
 * ========================================================================================================================
 * Los constructores que se implementaran ser�n:
 * 
 * 	- Un constructor por defecto.
 * 	- Un constructor con la resoluci�n, sintonizador TDT y el resto de atributos heredados. 
 * Recuerda que debes llamar al constructor de la clase padre.
 * 
 * Los m�todos que se implementara ser�n:
 * 
 * M�todo get de resoluci�n y sintonizador TDT.
 * precioFinal(): si tiene una resoluci�n mayor de 40 pulgadas, se incrementara el precio un 30% y si tiene un sintonizador TDT incorporado, aumentara 50 �. 
 * Recuerda que las condiciones que hemos visto en la clase Electrodomestico tambi�n deben afectar al precio.
 *
 *
 *
 */

public class TelevisionResuelto extends ElectrodomesticoResuelto {
    
    private int resolucion;
    private boolean sintonizadorTDT;
  
    //Constructor
    
    /**
     * Constructor por defecto
     */
    public TelevisionResuelto(){
    	super();
    	resolucion = 20;
    	sintonizadorTDT = false;
    }
    
    /**
     * Contructor con 6 parametros
     * @param precioBase
     * @param peso
     * @param consumoEnergetico
     * @param color
     * @param resolucion
     * @param sintonizadorTDT
     */
    public TelevisionResuelto(double precioBase, double peso, char consumoEnergetico, String color, int resolucion, boolean sintonizadorTDT){
    	super(precioBase, peso, consumoEnergetico, color);
    	this.resolucion=resolucion;
    	this.sintonizadorTDT=sintonizadorTDT;
    }
    
    //M�todos publicos
  
    /**
     * Precio final de la television
     * @return precio final de la television
     */
    public double precioFinal(){
        //Invocamos el m�todo precioFinal del m�todo padre
        double plus=super.precioFinal();
  
        //A�adimos el codigo necesario
        if (resolucion>40){
            plus+=precioBase*0.3;
        }
        if (sintonizadorTDT){
            plus+=50;
        }
        return plus;
    }
}
