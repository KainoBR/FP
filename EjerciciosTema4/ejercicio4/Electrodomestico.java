package ejercicio4;

/**
 * (�breme)
 * @author miki
 * 
 * Ejercicio 4 del tema 4: "Paquetes y Clases"
 * 
 * En este ejercicio hay que desarrollar las 3 clases propuestas (Electrodomestico, Lavadora, Television)
 * El main est� en la clase ya desarrollada "Uso_Electrodomestico". 
 * Cuando hayas al menos declarado todos los m�todos, podr�s ejecutar el main. Si lo haces antes dar� fallos. 
 * Intenta que las variables, los m�todos y las clases tengan el mismo nombre que lo que te indica el enunciado. Si cambias algo
 * las pruebas pueden fallar. 
 * 
 * ========================================================================================================================
 * Clase Electrodomestico:
 * Desarrolle la clase "Electrodomestico" con las siguientes caracter�sticas:
 * 
 * Sus atributos son:
 * 	+ precio base(int)
 *  + color(string)
 *  + consumo energ�tico (letras entre A y F) 
 *  + peso(int)
 *  
 *  
 * Por defecto, el color sera "blanco", el consumo energ�tico sera 'F', el precioBase es de 100 � y el peso de 5 kg. 
 * 
 * Los colores disponibles son blanco, negro, rojo, azul y gris.
 * (si quieres a�adir m�s colores no se ver�n reflejados en las pruebas y podr�a dar error)
 * 
 * ========================================================================================================================
 * Los constructores que se implementaran ser�n:
 * 
 *	- Un constructor por defecto.
 * 	- Un constructor por par�metros con todos los atributos.
 *	
 * Los m�todos que implementara ser�n:
 * 
 * M�todos get de todos los atributos.
 * 
 * comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta, si no es correcta usara la letra por defecto. Se invocara al crear el objeto y no sera visible.
 * 
 * comprobarColor(String color): comprueba que el color es correcto, sino lo es usa el color por defecto. Se invocara al crear el objeto y no sera visible.
 * ========================================================================================================================
 * 
 * precioFinal(): seg�n el consumo energ�tico, aumentara su precio, y seg�n su tama�o, tambi�n. 
 * 	Esta es la lista de precios:
 * 
 *  LETRA	  PRECIO
 *  
 *    A	      100 �
 *    B	      80 �
 *    C	      60 �
 *    D	      50 �
 *    E	      30 �
 *    F	      10 �
 *    
 *  	TAMA�O	    		PRECIO
 *  
 * Entre  0 y 19  kg		10 �
 * Entre  20 y 49 kg	 	50 �
 * Entre  50 y 79 kg		80 �
 * Mayor que 80   kg		100 �
 *
 * 
 */


public class Electrodomestico {
	
	
}