package ejercicio1;

/**
 * Nodos de la Lista de Enteros. 
 *
 */
public class Node {
	
	//Atributos// 
	int info;	//¡al valor del nodo se le denomina INFO!
	Node next;	//siguiente nodo
	Node prev;

	//Constructor//
	public Node(int x) {
		info = x;
		next = null;
		prev = null;
	}

	
}