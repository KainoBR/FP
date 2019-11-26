package enunciados;


/**
 * (�breme)
 * @author miki
 * 
 * Estos son los ejercicios del tema 5: Estructuras Encadenadas 
 * 
 * En este paquete se encuentran los frontos ejercicios de manejo de Estructuras Encadenadas en las que
 * trabajaremos con los Nodos a un nivel muy b�sico. 
 * Recuerda que tienes un ejemplo sobre Estructuras Encadenadas de forma que podr�s consultar cualquier duda
 * que tengas respecto a como se usan, declaran y construyen los Nodos. 
 * 
 * Trabajo a realizar: Desarrollar los diferentes m�todos propuestos. 
 * 
 *  En todos los m�todos estaremos trabajando con diferentes listas que: 
 * 
 *  	1) Solo contiene n�meros positivos
 *  	2) Van de menor a mayor (orden ascendente) 
 *  	3) Pueden haber elementos repetidos.
 *  
 * Ejemplo de Lista:  1,2,2,3,4,5,5,6,7,8,9
 * ==========================================================================================================
 * 
 * Ejercicio 1) Desarrollar un m�todo llamado ObtenerValor(int) que devuelva la informaci�n
 * del nodo en dicha posici�n.  
 * Recibir� por par�metro la posici�n a buscar, si el elemento no se encuentra devolver -1.
 * 
 * Ejemplo: 
 * Lista = [2, 4, 5, 6, 8, 9] 
 * resultado = lista.ObtenerValor(4); 
 *  >> resultado = 8 
 * 
 * 
 * 
 * Ejercicio 2) Desarrollar el m�todo buscar(int), que recibe por par�metro un elemento, y devolver true o false
 * si se encuentra o no.
 * 
 * Ejemplo:
 * 
 * Lista = [2, 4, 5] 
 * resultado = buscar(4) 
 *  >> resultado = true
 * 
 * 
 * 
 * Ejercicio 3) Desarrollar el m�todo sumarRango, que suma los valores de la lista en base a
 *  un rango definido por dos par�metros (ambos incluidos).
 *  Nota: el rango es el intervalo de los valores de los nodos, no las posiciones.
 * 
 * Ejemplo:
 * 
 * @param1: 3
 * @param2: 7
 *  Lista = [-3, 0, 1, 3, 0, 7, 2, 8]
 *   Resultado = 7 + 3 = 10
 *
 * 
 */

public class ListaEnteros {
	
	Node front; // front Nodo que apunta al siguiente y luego el siguiente apuntar al siguiente.....
	int Size; //Tama�o de la Lista
	int SizeMax; //Tama�o MAXIMO de la lista
	
	
	public ListaEnteros() { //contructor por defecto de la Lista
		front = null;
		Size = 0;
		SizeMax = 10; // SOLO PUEDEN HABER 10 ELEMENTOS COMO MAXIMO
	}
	
	/**
	 * 
	 * @param valor
	 * Nota: NO CONTEMPLA REPETIDOS NI EL ORDEN (a la hora de crearlos en el main lo har�mos de forma
	 * ascendente sin repetici�n)
	 */
	
	void insertar(int valor) {
		
		Node nuevo = new Node(valor);
		
		if (front == null) {
			Size = 1; 
			front = nuevo;
		} else if(Size != SizeMax){ //Si podemos insertar
			Size++;//tama�o + 1;
			nuevo.next = front;
			front = nuevo;
		} 
	}
	
		void mostrar() {
			Node aux = front;
			System.out.print("front  >>  |");
			while (aux != null) {
				System.out.print(aux.info + "  ->  ");
				aux = aux.next;
			}
			System.out.println(" null|\n");
		}

	

	//----------------------------------------------------------------------------------//
	 //--------------------  TRABAJAR A PARTIR DE AQU�  ----------------------------- //
	//----------------------------------------------------------------------------------//
		
		
	public int obtenerValor(int pos){
		Node aux = front;
		while(aux != null && pos > 0){
			aux = aux.next;
			pos--;
		}
		if(aux == null){
			return -1;
		}
		return aux.info;
	}
	
	public boolean buscar(int valor){
		Node aux = front;
		while(aux != null && aux.info != valor){
			aux = aux.next;
		}
		if(aux == null){
			return false;
		}
		return true;
	}
	
	public int sumarRango (int a, int b){
		Node aux = front;
		int res = 0;
		while(aux != null){
			if (aux.info >= a && aux.info <= b){
				res+= aux.info;
		}
			aux = aux.next;
		}
		return res;
	}

}
