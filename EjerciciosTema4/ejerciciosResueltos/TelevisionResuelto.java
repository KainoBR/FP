package ejerciciosResueltos;

/**
 * (ábreme)
 * @author miki
 * 
 * Este apartado pertenece al Ejercio 4 del tema 4: "Paquetes y clases"
 * El main está en la clase ya desarrollada "Uso_Electrodomestico".
 * 
 * ========================================================================================================================
 * 
 * Desarrolle la clase "Television" que es una subclase de "Electrodomestico" con las siguientes características:
 *
 * Sus atributos son:
 * 
 *  	+ resolución (en pulgadas) 
 *  	+ y sintonizador TDT (booleano)
 *  	+ atributos heredados.
 *  
 * Por defecto, la resolución sera de 20 pulgadas y el sintonizador sera false.
 * 
 * ========================================================================================================================
 * Los constructores que se implementaran serán:
 * 
 * 	- Un constructor por defecto.
 * 	- Un constructor con la resolución, sintonizador TDT y el resto de atributos heredados. 
 * Recuerda que debes llamar al constructor de la clase padre.
 * 
 * Los métodos que se implementara serán:
 * 
 * Método get de resolución y sintonizador TDT.
 * precioFinal(): si tiene una resolución mayor de 40 pulgadas, se incrementara el precio un 30% y si tiene un sintonizador TDT incorporado, aumentara 50 €. 
 * Recuerda que las condiciones que hemos visto en la clase Electrodomestico también deben afectar al precio.
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
    
    //Métodos publicos
  
    /**
     * Precio final de la television
     * @return precio final de la television
     */
    public double precioFinal(){
        //Invocamos el método precioFinal del método padre
        double plus=super.precioFinal();
  
        //Añadimos el codigo necesario
        if (resolucion>40){
            plus+=precioBase*0.3;
        }
        if (sintonizadorTDT){
            plus+=50;
        }
        return plus;
    }
}
