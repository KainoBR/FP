package ejercicio4;

/**
 * (ábreme)
 * @author miki
 * 
 * Ejercicio 4 del tema 4: "Paquetes y Clases"
 * 
 * En este ejercicio hay que desarrollar las 3 clases propuestas (Electrodomestico, Lavadora, Television)
 * El main está en la clase ya desarrollada "Uso_Electrodomestico". 
 * Cuando hayas al menos declarado todos los métodos, podrás ejecutar el main. Si lo haces antes dará fallos. 
 * Intenta que las variables, los métodos y las clases tengan el mismo nombre que lo que te indica el enunciado. Si cambias algo
 * las pruebas pueden fallar. 
 * 
 * ========================================================================================================================
 * Clase Electrodomestico:
 * Desarrolle la clase "Electrodomestico" con las siguientes características:
 * 
 * Sus atributos son:
 * 	+ precio base(int)
 *  + color(string)
 *  + consumo energético (letras entre A y F) 
 *  + peso(int)
 *  
 *  
 * Por defecto, el color sera "blanco", el consumo energético sera 'F', el precioBase es de 100 € y el peso de 5 kg. 
 * 
 * Los colores disponibles son blanco, negro, rojo, azul y gris.
 * (si quieres añadir más colores no se verán reflejados en las pruebas y podría dar error)
 * 
 * ========================================================================================================================
 * Los constructores que se implementaran serán:
 * 
 *	- Un constructor por defecto.
 * 	- Un constructor por parámetros con todos los atributos.
 *	
 * Los métodos que implementara serán:
 * 
 * Métodos get de todos los atributos.
 * 
 * comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta, si no es correcta usara la letra por defecto. Se invocara al crear el objeto y no sera visible.
 * 
 * comprobarColor(String color): comprueba que el color es correcto, sino lo es usa el color por defecto. Se invocara al crear el objeto y no sera visible.
 * ========================================================================================================================
 * 
 * precioFinal(): según el consumo energético, aumentara su precio, y según su tamaño, también. 
 * 	Esta es la lista de precios:
 * 
 *  LETRA	  PRECIO
 *  
 *    A	      100 €
 *    B	      80 €
 *    C	      60 €
 *    D	      50 €
 *    E	      30 €
 *    F	      10 €
 *    
 *  	TAMAÑO	    		PRECIO
 *  
 * Entre  0 y 19  kg		10 €
 * Entre  20 y 49 kg	 	50 €
 * Entre  50 y 79 kg		80 €
 * Mayor que 80   kg		100 €
 *
 * 
 */


public class Electrodomestico {
	
	
}