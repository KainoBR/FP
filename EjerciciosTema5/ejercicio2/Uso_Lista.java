package ejercicio2;


public class Uso_Lista {

	public static void main(String[] args) {
		
		ListaDeEnteros lista = new ListaDeEnteros();

		ListaDeEnteros lista1 = new ListaDeEnteros();
		ListaDeEnteros lista2 = new ListaDeEnteros();
		ListaDeEnteros lista3 = new ListaDeEnteros();
		ListaDeEnteros lista4 = new ListaDeEnteros();

		for (int i = 8; i > 0; i--) {
			lista.insertar(4);
			lista1.insertar(i);
			lista2.insertar((i + 5) / 2);
			lista3.insertar(i * i / 4);
			lista4.insertar(i * 2);
		}
		
		
		lista.mostrar();
		
		lista1.mostrar();
		//lista2.mostrar();
		//lista3.mostrar();
		//lista4.mostrar();
/*
		System.out.println("\n============================================================================================\n"
				+ "Ejercicio 1: ");

		// -----------------------------------------------------------//
		// ------------------- EJERCICIO 1 -------------------------//
		// -----------------------------------------------------------//

		ListaDeEnteros lista1p = new ListaDeEnteros();
		ListaDeEnteros lista2p = new ListaDeEnteros();
		ListaDeEnteros lista3p = new ListaDeEnteros();
		ListaDeEnteros lista4p = new ListaDeEnteros();
		
		
		lista1p = lista1.devolverPares();
		lista2p = lista2.devolverPares();
		lista3p = lista3.devolverPares();
		lista4p = lista4.devolverPares();

		lista1p.mostrar();
		lista2p.mostrar();
		lista3p.mostrar();
		lista4p.mostrar();
		*/
		
		System.out.println("\n============================================================================================\n"
				+ "Ejercicio 2: ");

		// -----------------------------------------------------------//
		// ------------------- EJERCICIO 2 -------------------------//
		// -----------------------------------------------------------//
		
		//lista1.rellenar();
		//lista2.rellenar();
	
		//lista.rellenar();
		
		
		
		//lista3.rellenar();
		//lista4.rellenar();
		//lista.mostrar();
		
		//lista1.mostrar();
		//lista2.mostrar();
		//lista3.mostrar();
		//lista4.mostrar();
		
		
		System.out.println("\n============================================================================================\n"
				+ "Ejercicio 3: ");

		// -----------------------------------------------------------//
		// ------------------- EJERCICIO 3 -------------------------//
		// -----------------------------------------------------------//
		
		lista1.reverse();
		//lista2.reverse();
		//lista3.reverse();
		//lista4.reverse();
		
		lista1.mostrar();
		///lista2.mostrar();
		//lista3.mostrar();
		//lista4.mostrar();
		
				
		/*
		System.out.println("\n============================================================================================\n"
				+ "Ejercicio 4: ");

		// -----------------------------------------------------------//
		// ------------------- EJERCICIO 4 -------------------------//
		// -----------------------------------------------------------//
		
		int a = 4;
		int b = 8;
		
		
		lista1.rango(a, b);
		lista2.rango(a, b);
		lista3.rango(a, b);
		lista4.rango(a, b);
		
		lista1.mostrar();
		lista2.mostrar();
		lista3.mostrar();
		lista4.mostrar();
		int a = 4;
		
		System.out.println("\n============================================================================================\n"
				+ "Ejercicio 5: ");

		// -----------------------------------------------------------//
		// ------------------- EJERCICIO 5 -------------------------//
		// -----------------------------------------------------------//
		

		System.out.println(lista.delete(a));
		System.out.println(lista1.delete(a));
		System.out.println(lista2.delete(a));
		System.out.println(lista3.delete(a));
		System.out.println(lista4.delete(a));
		
		lista1.mostrar();
		lista2.mostrar();
		lista3.mostrar();
		lista4.mostrar();
		
		 */
	}

}
