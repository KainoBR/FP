package ejemplo;
public class Lista {

	Nodo raiz;

	public Lista() {
		raiz = null;
	}

	void insertar(int x) {
		Nodo nuevo = new Nodo(x);
		if (raiz == null) {// si es el primero
			raiz = nuevo;
		} else {// No es el primero
			nuevo.next = raiz;
			raiz = nuevo;
		}
	}

	void mostrar() {
		Nodo nuevo = raiz;
		System.out.print("root ->   |");
		while (nuevo != null) {
			System.out.print(nuevo.info +  " ----> ");
			nuevo = nuevo.next;
		}
		System.out.println(" null|");
	}
}
