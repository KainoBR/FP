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
 * Desarrolle la clase "Lavadora" que es una subclase de "Electrodomestico" con las siguientes caracter�sticas:
 * 
 * Sus atributos son:  
 * 
 * 	+ carga (int) 
 *  + atributos heredados!
 * 
 * 
 * Por defecto, la carga es de 5 kg.
 * 
 * Los constructores que se implementaran ser�n:
 * 
 *  - Un constructor por defecto.
 *  - Un constructor con la carga y el resto de atributos heredados. Recuerda que debes llamar al constructor de la clase padre.
 *  
 *  ========================================================================================================================
 *  
 * Los m�todos que se implementara ser�n:
 * 
 *  - M�todo get de carga.
 *  - precioFinal():, si tiene una carga mayor de 30 kg, aumentara el precio 50 �, sino es as� no se incrementara el precio.
 *  
 *  
 *  Nota: �Recuerda que las condiciones que hemos visto en la clase Electrodomestico tambi�n deben afectar al precio!
 *
 */

public class LavadoraResuelto extends ElectrodomesticoResuelto {
	
	private int carga;
	//Constructor
	  
    /**
     * Contructor por defecto
     */
    public LavadoraResuelto(){
    	super();
    	carga = 5;
    	
    	
    }
  
  
    /**
     * Constructor con 5 parametros
     * @param precioBase
     * @param peso
     * @param consumoEnergetico
     * @param color
     * @param carga
     */
    public LavadoraResuelto(double precioBase, double peso, char consumoEnergetico, String color, int carga){
        super(precioBase,peso, consumoEnergetico,color);
        this.carga=carga;
    }
	
  
    //M�todos publicos
  
    /**
     * Devuelve la carga de la lavadora
     * @return
     */
    public int getCarga() {
        return carga;
    }
    /**
     * Precio final de la lavadora
     * @return precio final de la lavadora
     */
    public double precioFinal(){
        //Invocamos el m�todo precioFinal del m�todo padre
        double plus=super.precioFinal();
        //a�adimos el c�digo necesario
        if (carga>30){
            plus+=50;
        }
        return plus;
    }
}
	
	

