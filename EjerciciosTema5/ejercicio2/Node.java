package ejercicio2;

public class Node {
	int info;	//¡al valor del nodo se le denomina INFO!
	Node next;	//siguiente nodo
	Node prev;

	public Node(int x) { //Constructor de la clase Node
		info = x;
		next = null;
		prev = null;
	}

}