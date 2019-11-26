package enunciados;
/**
 *
 * (�breme) 
 * 
 * Estos son los ejercicios del tema 5: Estructuras Encadenadas
 * 
 * En este paquete se encuentran los ejercicios de manejo de Estructuras
 * Encadenadas, de forma que trabajaremos con listas de enteros.
 * 
 * =========================================================================================================================================================
 * 
 * Ejercicio 1) Desarrollar el m�todo "devolverPares", para que devuelva UNA
 * NUEVA LISTA con los valores que son pares de la lista actual.
 * 
 * Ejemplo:
 * 
 * Lista = [-3, 0, 2, 5, 6, 9, 10, 12] 
 *  
 *  >> Resultado [0, 2, 6, 10, 12]
 *
 *
 *
 * Ejercicio 2) Desarrolle un nuevo m�todo void, sin par�metros llamado
 * "rellenar". �ste m�todo MODIFICAR� la lista referenciada por this, A�ADIENDO
 * los n�meros que faltan para la secuencia de valores que almacena la lista sea
 * consecutiva. (Nota: recalco lo de modificar y lo de a�adir porque no se puede
 * crear una lista o simplemente coger el 1� elemento y hacer una nueva lista
 * hasta el �ltimo)
 * 
 * Lista = this.data -> [4] -> [7] -> [8] -> [12] -> null
 * 
 *  >> Lista modificada = this.data -> [4] -> (new)[5] -> (new)[6] -> [7] -> [8] ->
 * (new)[9] -> (new)[10] -> (new)[11] -> [12] -> null
 * 
 * 
 * Ejercicio 3) Desarrolle el m�todo void "rango" que recibe dos par�metros de
 * tipo entero. �ste m�todo modificar� la lista para que s�lo est�n los
 * elementos comprendidos por el rango que componen los par�metros del m�todo.
 * �El root par�metro tiene un valor menor que el segundo par�metro!
 * 
 * Ejemplo:
 * 
 * menor = 3 
 * mayor = 8 
 * lista = [2, 3, 4, 5, 7, 9, 10]
 * 
 *  >> lista modificada = [4,5,7]
 * 
 * 
 * 
 * Ejercicio 4) Desarrolle el m�todo "reverse", que modificar� la lista actual
 * para dejarla en orden inverso. Las Lista estar�n en orden ascendente y no
 * habr� elementos repetidos.
 * 
 * Ejemplo:
 * 
 * lista = [1, 2, 3, 4, 5, 6] 
 * 
 * 	>> lista modificada = [6, 5, 4, 3, 2, 1]
 * 
 * 
 * 
 * Ejercicio 5) Desarrolle el m�todo "delete" que recibir� por par�metro un entero y devolver� un entero.
 * Habr� que buscar en la lista un nodo con el entero recibido por par�metro y eliminarlo de la lista, 
 * sin afectar a otros nodos que no tengan ese valor.
 * 
 * El m�todo tendr� que devolver la cantidad de nodos que se han borrado.
 * 
 * 
 * Ejemplo:
 * 
 * lista = [5, 3, 4, 1, 7, 5, 0, -1, 5] lista modificada = [3, 4, 1, 7, 0, -1]
 *  >> resultado = 3
 *
 */
public class ListaDeEnteros {
	
	//El desarrollo de los ejercicios est� abajo del todo//
	
	//Atributos//
	Node root; // root Nodo que apunta al siguiente y luego el siguiente apuntar al siguiente.....
	int Size; //Tama�o de la Lista
	int SizeMax; //Tama�o MAXIMO de la lista
	
	//Constructor por defecto de la lista//
	public ListaDeEnteros() { //contructor por defecto de la Lista
		root = null;
		Size = 0;
		SizeMax = 10; // SOLO PUEDEN HABER 10 ELEMENTOS COMO MAXIMO (�este valor es modificable!)
	}
	
	/**
	 * M�todo de Inserci�n: A�ade un nuevo nodo a la lista.
	 * Orden: El primero que entra, primero que sale. El nuevo nodo se pone detr�s el nodo actual (root)
	 * @param valor
	 * Nota: NO CONTEMPLA REPETIDOS NI EL ORDEN 
	 */
	public void insertar(int valor) {
		Node nuevo = new Node(valor);
		
		if (root == null) {//Caso del root nodo
			Size = 1; 
			root = nuevo;
		} else if(Size != SizeMax){ //Si podemos insertar
			Size++;//tama�o + 1;
			nuevo.next = root;
			root = nuevo;
		} 
	}
	/**
	 * M�todo mostrar: Muestra en pantalla la Lista de enteros.
	 */
	void mostrar() {
		Node aux = root;
		System.out.print("root >> |");
		while (aux != null) {
			System.out.print(aux.info + " -> ");
			aux = aux.next;
		}
		System.out.println(" null|");
	}
	
	
	//----------------------------------------------------------------------------------//
	 //--------------------  TRABAJAR A PARTIR DE AQU�  ----------------------------- //
	//----------------------------------------------------------------------------------//

	
	
	
	
	
	

}
