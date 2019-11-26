package ejerciciosResueltos;

import ejercicio2.DNI;

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
 *  
 */
public class PersonaResuelto {
	
	private DNI dni = new DNI();//Creamos el objeto "DNI", como nos han indicado en el Enunciado.
	
	private String nombre;
	private int edad;
	private char genero;
	
	private double peso;
	private double altura;
	
	/**
	 * Constructor por defecto
	 */
	public PersonaResuelto(){
		nombre = "";
		edad = 0;
		genero = 'H';
		peso = 0;
		altura = 0;
	}
	
	/**
	 * Contructor por parámetros (solo Nombre, Edad y género)
	 * @param n nombre
	 * @param e edad
	 * @param g genero
	 */
	
	public PersonaResuelto(String n, int e, char g){
		nombre = n;
		//edad
		if(e >= 0 && e <= 100){
			edad = e;
		} else {
			System.out.println("¡Ups! Parece que hubo un error, inialización de edad por defecto");
			edad = 0;
		}
		//genero
		if(g == 'M'|| g == 'H'){
			genero = g;
		} else {
			System.out.println("¡Ups! Parece que hubo un error, inialización de edad por defecto");
			genero = 'H';
		}
	}
	
	/**
	 * Contrsuctor por parámetros
	 * @param n nombre
	 * @param e edad
	 * @param g genero
	 * @param p peso
	 * @param a altura
	 */
	public PersonaResuelto(String n, int e, char g, double p, double a){
		nombre = n;
		if(e >= 0 && e <= 100){
			edad = e;
		} else {
			System.out.println("¡Ups! Parece que hubo un error, inialización de edad por defecto");
			edad = 0;
		}
		//genero
		if(g == 'M' || g == 'H'){
			genero = g;
		} else {
			System.out.println("¡Ups! Parece que hubo un error, inialización de edad por defecto");
			genero = 'H';
		}
		if(p>=0 && p < 180){
			peso = p;
		} else {
			System.out.println("¡Ups! Parece que hubo un error, inialización de peso por defecto");
			peso = 0;
		}
		if(a>=0 && a < 3.00){
			altura = a;
		}else {
			System.out.println("¡Ups! Parece que hubo un error, inialización de altura por defecto");
			altura = 0;
		}
	}
	
	//--------------------------------------------------//
	//--------------------SETTERS---------------------//
	//--------------------------------------------------//
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	public void setEdad(int e){
		if(e > 0 && e < 100){
			edad = e;
		}
	}
	public void setGenero(char G){
		if(G == 'H' || G == 'M'){
			genero = G;
		}
	}
	public void setPeso(double p){
		if(p > 0 && p < 180){
			peso = p;
		}
	}
	public void setAltura(double a){
		if(a > 0 && a < 3){
			altura = a;
		}
	}
	
	//--------------------------------------------------//
	//--------------------GETTERS---------------------//
	//--------------------------------------------------//
	
	public String getNombre(){
		return nombre;
	}
	public int getEdad(){
		return edad;
	}
	public char getGenero(){
		return genero;
	}
	public double getPeso(){
		return peso;
	}
	public double getAltura(){
		return altura;
	}
	
	//--------------------------------------------------//
	//---------------------MÉTODOS----------------------//
	//--------------------------------------------------//
	
	/**
	 * Método esMayorDeEdad
	 * @return true, si es mayor de edad, false, si no lo es.
	 */
	public boolean esMayorDeEdad(){
		if(edad >= 18){
			return true;
		} else {
			return false;
		}
	}
	
	/**
	 * Método de CalcularPeso: 
	 * @return 1, 0, -1 en funcion de la fórmula (peso/altura^2) 
	 */
	public int calcularPeso(){
		double p = peso/(altura*altura);
		
		if( p<20){
			return -1;//peso ideal
		} else if(p>=20 && p<=25){
			return 0;//por debajo de su peso ideal
		} else if (p>25){
			return 1;//sobrepeso
		}
		
		return -1; //valor por defecto
	}
	/**
	 * Sobreescripción del método toString para que imprima toda la información de la clase persona.
	 */
	@Override
	public String toString(){
		return "Nombre: "+nombre + "\nEdad: " + edad + "\nGenero: " +  genero + "\nDNI: " + dni.getDNI() + "\nPeso: " +  peso + "\nAltura " + altura + "\n";
	} 
	
	
}



