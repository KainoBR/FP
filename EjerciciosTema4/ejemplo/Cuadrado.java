package ejemplo;

/**
 *(�breme) 
 *@author Miki  
 * Aqui te dejo un ejemplo muy b�sico donde se explican las Clases y Objetos de forma
 * muy simple adem�s podr�s observar los conceptos de: 
 * 
 *  - Atributos y modificadores de Acceso.
 *  - Constructor por defecto y por par�metros
 *	- Getter y Setter
 *	- M�todos propios (encapsulamiento)
 *  - @Override
 *  - Instancia
 *  
 *  
 *  �NOTA: Este ejercicio va junto con la clase Uso_Cuadrado!
 *  A partir de ahora los ejercicios estar�n divios entre los que tienen el main y las clases a desarrollar
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
	 * que ESTA CLASE (y ninguna otra ya est� en este paquete o no) tenga acceso a este atributo y 
	 * pueda llamarlo, utilizarlo o modificarlo. Para ello se deber� utilizar otra via (mediante m�todos)
	 * 
	 * Debes darte cuenta que es una variable global de la clase "Cuadrado", lo que quiere decir que desde cualquier parte
	 * dentro de esta clase podemos utilizar la variable "lado" y que har� referencia a este atributo.
	 */
	
	/**
	 * Constructor por Defecto.
	 * Esto quiere decir que si creamos un nuevo Objeto "Cuadrado" por DEFECTO, el lado
	 * tendr� el valor que hemos puesto. (en este caso:  0 cm)
	 * 
	 * En el main de la clase "Uso_Cuadrado" lo hemos comprobado creando un nuevo "Cuadrado"
	 * sin pasarle ning�n par�metro. (c0)
	 */
	public Cuadrado(){
		lado = 0;
	}
	
	/**
	 * Contructor por par�metro. A diferencia del Contructor por defecto, �ste acepta par�metros. 
	 * En este caso un valor de tipo int que ser�a el lado del "Cuadrado" a crear. 
	 * 
	 * @param n valor del lado del nuevo Cuadrado.
	 * 
	 * En el main de la clase "Uso_Cuadrado" lo hemos comprobado creando un nuevo "Cuadrado"
	 * sin pasarle ning�n par�metro. (c1)
	 * 
	 */
	public Cuadrado(int lado){
		//usamos el this para hacer referencia al lado actual. Me explico:
		/*							
		 * El par�metro (int lado), se llama EXACTAMENTE igual que nuestro atributo. Para poder diferenciar el par�metro pasado
		 * con el atributo, utilizamos el this.
		 */
		this.lado = lado;
	}
	
	/**
	 * Este es el m�todo getLado() que se trata de un Getter. 
	 * Este m�todo nos permite obtener el valor del lado del cuadrado. 
	 * 
	 * @return el valor del atributo "lado".
	 * 
	 * En el main lo hemos utilizado para poder imprimir en pantalla los valores de los dos cuadrados creados. 
	 */
	
	public int getLado(){
		return lado;
	}
	
	/**
	 * Este es el m�todo setLado(int n) y se trata de un Setter. 
	 * Este m�todo nos permite darle un nuevo valor al cuadrado que estamos utilizando. 
	 * Como solo modifica el lado, no devuelve nada (void)  
	 * 
	 * @param n valor del nuevo lado.
	 * 
	 * En el main lo hemos utilizado para modificar el cuadrado "c0" para que sea de lado 3. 
	 */
	public void setLado(int n){
		lado = n;
	}
	
	//M�TODOS PROPIOS DE LA CLASE CUADRADO//
	
	/*
	 * Esto m�todos que se presentan a continuaci�n son m�todos que he dise�ado para realizar una tarea o comportamiento, es decir,
	 * operaciones con el cuadrado. Son m�todos como cualquier otro que hallamos visto de aqu� para atr�s. 
	 * 
	 * Encapsulamiento:
	 * La cuesti�n es que estos m�todos SOLO se realizan o se ejecutan EN ESTA CLASE. 
	 * Se pueden llamar desde otras clases, pero SE EJECUTAR�N AQUI.
	 * Y si por ejemplo tuvi�ramos otro Objeto//clase (imaginemos una 
	 */
	
	/**
	 * M�todo Per�metro:  
	 * @return El per�metro del cuadrado.
	 */
	public int Perimetro(){
		return 4 * lado;//el per�metro de un cuadrado es la suma de sus lados, como son 4 lados. 4*lado. 
	}
	
	/**
	 * M�todo �rea:
	 * @return el �rea del Cuadrado
	 */
	public int Area(){
		return lado * lado;//el �rea del Cuadrado es lado * lado.
	}
	
	/**
	 * Este es el m�todo toString(). 
	 * NOTA: el m�todo toString() ya existe y de hecho est� en la biblioteca de java. 
	 * Adem�s es el que se utilizar para impirmir por pantalla (System.out.println()). 
	 * Sin embargo, para poder utilizarlo correctamente, debemos SOBREESCRIBIRLO ( @Override)
	 */
	
	@Override
	public String toString(){
		return "Cuadrado de \""+lado + "\" cm de lado";//devolvemos como queremos que se imprima el objeto cuadrado.
	}	
	
	/**
	 * M�todo equals. 
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


