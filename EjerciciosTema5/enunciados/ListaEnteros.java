package enunciados;


/**
 * (ábreme)
 * @author miki
 * 
 * Estos son los ejercicios del tema 5: Estructuras Encadenadas 
 * 
 * En este paquete se encuentran los frontos ejercicios de manejo de Estructuras Encadenadas en las que
 * trabajaremos con los Nodos a un nivel muy básico. 
 * Recuerda que tienes un ejemplo sobre Estructuras Encadenadas de forma que podrás consultar cualquier duda
 * que tengas respecto a como se usan, declaran y construyen los Nodos. 
 * 
 * Trabajo a realizar: Desarrollar los diferentes métodos propuestos. 
 * 
 *  En todos los métodos estaremos trabajando con diferentes listas que: 
 * 
 *  	1) Solo contiene números positivos
 *  	2) Van de menor a mayor (orden ascendente) 
 *  	3) Pueden haber elementos repetidos.
 *  
 * Ejemplo de Lista:  1,2,2,3,4,5,5,6,7,8,9
 * ==========================================================================================================
 * 
 * Ejercicio 1) Desarrollar un método llamado ObtenerValor(int) que devuelva la información
 * del nodo en dicha posición.  
 * Recibirá por parámetro la posición a buscar, si el elemento no se encuentra devolver -1.
 * 
 * Ejemplo: 
 * Lista = [2, 4, 5, 6, 8, 9] 
 * resultado = lista.ObtenerValor(4); 
 *  >> resultado = 8 
 * 
 * 
 * 
 * Ejercicio 2) Desarrollar el método buscar(int), que recibe por parámetro un elemento, y devolver true o false
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
 * Ejercicio 3) Desarrollar el método sumarRango, que suma los valores de la lista en base a
 *  un rango definido por dos parámetros (ambos incluidos).
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
	int Size; //Tamaño de la Lista
	int SizeMax; //Tamaño MAXIMO de la lista
	
	
	public ListaEnteros() { //contructor por defecto de la Lista
		front = null;
		Size = 0;
		SizeMax = 10; // SOLO PUEDEN HABER 10 ELEMENTOS COMO MAXIMO
	}
	
	/**
	 * 
	 * @param valor
	 * Nota: NO CONTEMPLA REPETIDOS NI EL ORDEN (a la hora de crearlos en el main lo harémos de forma
	 * ascendente sin repetición)
	 */
	
	void insertar(int valor) {
		
		Node nuevo = new Node(valor);
		
		if (front == null) {
			Size = 1; 
			front = nuevo;
		} else if(Size != SizeMax){ //Si podemos insertar
			Size++;//tamaño + 1;
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
	 //--------------------  TRABAJAR A PARTIR DE AQUÍ  ----------------------------- //
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
