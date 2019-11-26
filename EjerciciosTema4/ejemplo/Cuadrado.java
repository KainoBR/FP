package ejemplo;

/**
 *(Ábreme) 
 *@author Miki  
 * Aqui te dejo un ejemplo muy básico donde se explican las Clases y Objetos de forma
 * muy simple además podrás observar los conceptos de: 
 * 
 *  - Atributos y modificadores de Acceso.
 *  - Constructor por defecto y por parámetros
 *	- Getter y Setter
 *	- Métodos propios (encapsulamiento)
 *  - @Override
 *  - Instancia
 *  
 *  
 *  ¡NOTA: Este ejercicio va junto con la clase Uso_Cuadrado!
 *  A partir de ahora los ejercicios estarán divios entre los que tienen el main y las clases a desarrollar
 */

//-----------------------------------------------------------------------------------------------//

/**
 *  Esta clase representa un Cuadrado.
 */
public class Cuadrado {
	
	private int lado;
	/*
	 * Este es el atributo que representa el lado del cuadrado y que hemos llamado "lado". 
	 * Le hemos puesto que sea PRIVADO; es decir, que el 'modificador de acceso' solo permita
	 * que ESTA CLASE (y ninguna otra ya esté en este paquete o no) tenga acceso a este atributo y 
	 * pueda llamarlo, utilizarlo o modificarlo. Para ello se deberá utilizar otra via (mediante métodos)
	 * 
	 * Debes darte cuenta que es una variable global de la clase "Cuadrado", lo que quiere decir que desde cualquier parte
	 * dentro de esta clase podemos utilizar la variable "lado" y que hará referencia a este atributo.
	 */
	
	/**
	 * Constructor por Defecto.
	 * Esto quiere decir que si creamos un nuevo Objeto "Cuadrado" por DEFECTO, el lado
	 * tendrá el valor que hemos puesto. (en este caso:  0 cm)
	 * 
	 * En el main de la clase "Uso_Cuadrado" lo hemos comprobado creando un nuevo "Cuadrado"
	 * sin pasarle ningún parámetro. (c0)
	 */
	public Cuadrado(){
		lado = 0;
	}
	
	/**
	 * Contructor por parámetro. A diferencia del Contructor por defecto, éste acepta parámetros. 
	 * En este caso un valor de tipo int que sería el lado del "Cuadrado" a crear. 
	 * 
	 * @param n valor del lado del nuevo Cuadrado.
	 * 
	 * En el main de la clase "Uso_Cuadrado" lo hemos comprobado creando un nuevo "Cuadrado"
	 * sin pasarle ningún parámetro. (c1)
	 * 
	 */
	public Cuadrado(int lado){
		//usamos el this para hacer referencia al lado actual. Me explico:
		/*							
		 * El parámetro (int lado), se llama EXACTAMENTE igual que nuestro atributo. Para poder diferenciar el parámetro pasado
		 * con el atributo, utilizamos el this.
		 */
		this.lado = lado;
	}
	
	/**
	 * Este es el método getLado() que se trata de un Getter. 
	 * Este método nos permite obtener el valor del lado del cuadrado. 
	 * 
	 * @return el valor del atributo "lado".
	 * 
	 * En el main lo hemos utilizado para poder imprimir en pantalla los valores de los dos cuadrados creados. 
	 */
	
	public int getLado(){
		return lado;
	}
	
	/**
	 * Este es el método setLado(int n) y se trata de un Setter. 
	 * Este método nos permite darle un nuevo valor al cuadrado que estamos utilizando. 
	 * Como solo modifica el lado, no devuelve nada (void)  
	 * 
	 * @param n valor del nuevo lado.
	 * 
	 * En el main lo hemos utilizado para modificar el cuadrado "c0" para que sea de lado 3. 
	 */
	public void setLado(int n){
		lado = n;
	}
	
	//MÉTODOS PROPIOS DE LA CLASE CUADRADO//
	
	/*
	 * Esto métodos que se presentan a continuación son métodos que he diseñado para realizar una tarea o comportamiento, es decir,
	 * operaciones con el cuadrado. Son métodos como cualquier otro que hallamos visto de aquí para atrás. 
	 * 
	 * Encapsulamiento:
	 * La cuestión es que estos métodos SOLO se realizan o se ejecutan EN ESTA CLASE. 
	 * Se pueden llamar desde otras clases, pero SE EJECUTARÁN AQUI.
	 * Y si por ejemplo tuviéramos otro Objeto//clase (imaginemos una 
	 */
	
	/**
	 * Método Perímetro:  
	 * @return El perímetro del cuadrado.
	 */
	public int Perimetro(){
		return 4 * lado;//el perímetro de un cuadrado es la suma de sus lados, como son 4 lados. 4*lado. 
	}
	
	/**
	 * Método Área:
	 * @return el Área del Cuadrado
	 */
	public int Area(){
		return lado * lado;//el área del Cuadrado es lado * lado.
	}
	
	/**
	 * Este es el método toString(). 
	 * NOTA: el método toString() ya existe y de hecho está en la biblioteca de java. 
	 * Además es el que se utilizar para impirmir por pantalla (System.out.println()). 
	 * Sin embargo, para poder utilizarlo correctamente, debemos SOBREESCRIBIRLO ( @Override)
	 */
	
	@Override
	public String toString(){
		return "Cuadrado de \""+lado + "\" cm de lado";//devolvemos como queremos que se imprima el objeto cuadrado.
	}	
	
	/**
	 * Método equals. 
	 * @param o Objecto a comparar
	 * @return true si son iguales, false si son distintos
	 */
	@Override
	public boolean equals(Object o) {
		Cuadrado c = (Cuadrado) o;
		if(c.lado == this.lado) {
			return true;
		} else {
			return false;
		}
		
		
		
	}

}


