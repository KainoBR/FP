package ejercicio2;
/**
 * 
 * @author Kaino
 * EJERCICIO 2) Desarrolla la clase "Persona" de forma que siga las siguientes condiciones:
 * 
 * 
 * Sus atributos son: nombre, edad, DNI, Genero (H hombre, M mujer), peso y altura. 
 * Si quieres añadir algún atributo puedes hacerlo (aunque no se reflejará en el main)
 * ------------------------------------------------------------------------------------------------------------------------
 * ¡EL DNI ES UN OBJETO A PARTE! 
 * NOTA: DNI es otra clase que ya está implementada, asi que tan solo hay que construir un nuevo Objeto DNI de forma que:
 *  
 *  "private DNI dni = new DNI();"
 *  y para acceder a él, es con el método ya implementado: "getDNI();"
 *  ------------------------------------------------------------------------------------------------------------------------
 * 
 * Por defecto, todos los atributos menos el DNI serán valores por defecto según su tipo
 *  (0 números, cadena vacía para String, etc.). El género sera hombre por defecto.
 *  
 *  
 *  Se implantaran varios constructores:
 *  
 *  - Un constructor por defecto.
 *  - Un constructor con solo el nombre, edad y genero por parámetros.
 *  - Un constructor con TODOS los atributos como parámetro.
 *  
 *  
 *  Los métodos que se implementaran son:
 *  
 *  
 *  + Métodos get de cada parámetro, excepto de DNI.
 *  + Métodos set de cada parámetro, excepto de DNI.
 *  
 *  + esMayorDeEdad(): indica si es mayor de edad, devuelve un booleano.
 *  
 *  + calcularPeso(): calculara si la persona esta en su peso ideal.
 *  Fórmula: (peso en kg/(altura^2  en m)). Si esta fórmula devuelve un valor menor que 20, la función devuelve un -1, 
 *  si devuelve un número entre 20 y 25 (incluidos), significa que esta por debajo de su peso ideal y devuelve un 0  
 *  y si devuelve un valor mayor que 25 significa que tiene sobrepeso, la función devuelve un 1. 
 *  
 *  
 *  +toString(): devuelve toda la información del objeto en forma de String.
 *  
 *  
 */
public class Persona {
		
}



