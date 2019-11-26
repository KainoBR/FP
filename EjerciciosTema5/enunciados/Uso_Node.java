package enunciados;

public class Uso_Node {

	public static void main(String[] args) {
		
		//ListaEnteros lista = new ListaEnteros();
		
		ListaEnteros lista1 = new ListaEnteros();
		ListaEnteros lista2 = new ListaEnteros();
		ListaEnteros lista3 = new ListaEnteros();
		ListaEnteros lista4 = new ListaEnteros();
		
		
		for(int i = 10; i > 0; i --){
			lista1.insertar(i);
			lista2.insertar((i+5)/2);
			lista3.insertar(i*i/4);
			lista4.insertar(i*2);
		}
		
		lista1.mostrar();
		lista2.mostrar();
		lista3.mostrar();
		lista4.mostrar();
		
		System.out.println("============================================================================================");
		
		//-----------------------------------------------------------//
		 //------------------- EJERCICIO 1 -------------------------//
		//-----------------------------------------------------------//
		
		System.out.println("\nPRUEBAS DEL EJERCICIO 1: ObtenerValor(int)\n");
		
		
		//Pruebas del EJERCICIO 1: Obtener valor
		
		System.out.print("--------------------------------------\n Lista Nº 1: ");

		lista1.mostrar();

		System.out.println("ObtenerValor(0):    "  +  lista1.obtenerValor(0));
		System.out.println("ObtenerValor(2):    "  +  lista1.obtenerValor(2));
		System.out.println("ObtenerValor(4):    "  +  lista1.obtenerValor(4));
		System.out.println("ObtenerValor(6):    "  +  lista1.obtenerValor(6));
		System.out.println("ObtenerValor(8):    "  +  lista1.obtenerValor(8));
		System.out.println("ObtenerValor(10):   "  +  lista1.obtenerValor(10)); //Excepcion
		
		System.out.print("--------------------------------------\n Lista Nº 2: ");


		lista2.mostrar();
		
		System.out.println("ObtenerValor(1):    "  +  lista2.obtenerValor(1));
		System.out.println("ObtenerValor(3):    "  +  lista2.obtenerValor(3));
		System.out.println("ObtenerValor(5):    "  +  lista2.obtenerValor(5));
		System.out.println("ObtenerValor(7):    "  +  lista2.obtenerValor(7));
		System.out.println("ObtenerValor(9):    "  +  lista2.obtenerValor(9));
		System.out.println("ObtenerValor(11):   "  +  lista2.obtenerValor(11)); //Excepcion

		System.out.print("--------------------------------------\n Lista Nº 3: ");


		lista3.mostrar();
		
		System.out.println("ObtenerValor(0):    "  +  lista3.obtenerValor(0));
		System.out.println("ObtenerValor(1):    "  +  lista3.obtenerValor(1));
		System.out.println("ObtenerValor(2):    "  +  lista3.obtenerValor(2));
		System.out.println("ObtenerValor(9):    "  +  lista3.obtenerValor(9));
		System.out.println("ObtenerValor(10):   "  +  lista3.obtenerValor(10)); //Excepcion 
		System.out.println("ObtenerValor(11):   "  +  lista3.obtenerValor(11)); //Excepcion
		
		
		System.out.print("--------------------------------------\n Lista Nº 4: ");

		
		lista4.mostrar();
		
		System.out.println("ObtenerValor(1):    "  +  lista4.obtenerValor(1));
		System.out.println("ObtenerValor(2):    "  +  lista4.obtenerValor(2));
		System.out.println("ObtenerValor(6):    "  +  lista4.obtenerValor(6));
		System.out.println("ObtenerValor(7):    "  +  lista4.obtenerValor(7));
		System.out.println("ObtenerValor(11):   "  +  lista4.obtenerValor(11)); //Excepcion
		System.out.println("ObtenerValor(12):   "  +  lista4.obtenerValor(12)); //Excepcion
		
		

		//-----------------------------------------------------------//
		 //------------------- EJERCICIO 2 -------------------------//
		//-----------------------------------------------------------//
		
		System.out.println("\nPRUEBAS DEL EJERCICIO 2: buscar(int)\n");
		
		
		//Pruebas del EJERCICIO 2: buscar valor
		System.out.print("--------------------------------------\n Lista Nº 1: ");
		
		lista1.mostrar();
		
		for(int i = 0; i < 15; i ++){
			System.out.println("buscar("+ i + "):    "  +  lista1.buscar(i));
		}
		
		System.out.print("--------------------------------------\n Lista Nº 2: ");
		
		lista2.mostrar();
		
		for(int i = 0; i < 15; i ++){
			System.out.println("buscar("+ i + "):    "  +  lista2.buscar(i));
		}
		
		System.out.print("--------------------------------------\n Lista Nº 3: ");
		
		lista3.mostrar();
		
		for(int i = 0; i < 15; i ++){
			System.out.println("buscar("+ i + "):    "  +  lista3.buscar(i));
		}
		
		System.out.print("--------------------------------------\n Lista Nº 4: ");
		
		lista4.mostrar();
		
		for(int i = 0; i <= 15; i ++){
			System.out.println("buscar("+ i + "):    "  +  lista4.buscar(i));
			
		}

	

		//-----------------------------------------------------------//
		 //------------------- EJERCICIO 3 -------------------------//
		//-----------------------------------------------------------//
		
		System.out.println("\nPRUEBAS DEL EJERCICIO 3: sumarRango(int,int)\n");
		
		
		//Pruebas del EJERCICIO 3: sumarRango
		
		int pos0 = 1;
		int pos1 = 3;
		int pos2 = 5;
		int pos3 = 7;
		int pos4 = 9;
		
		System.out.print("--------------------------------------\n Lista Nº 1: ");
		lista1.mostrar();

		System.out.print("--------------------------------------\n Lista Nº 2: ");
		lista2.mostrar();

		System.out.print("--------------------------------------\n Lista Nº 3: ");
		lista3.mostrar();

		System.out.print("--------------------------------------\n Lista Nº 4: ");
		lista4.mostrar();

		System.out.println("sumarRango(" + pos0 +"," +  pos1 +"): " + lista1.sumarRango(pos0, pos1));
		System.out.println("sumarRango(" + pos0 +"," +  pos1 +"): " + lista2.sumarRango(pos0, pos1));
		System.out.println("sumarRango(" + pos0 +"," +  pos1 +"): " + lista3.sumarRango(pos0, pos1));
		System.out.println("sumarRango(" + pos0 +"," +  pos1 +"): " + lista4.sumarRango(pos0, pos1));
		System.out.println("-------------------\n");
		
		System.out.println("sumarRango(" + pos1 +"," +  pos2 +"): " + lista1.sumarRango(pos1, pos2));
		System.out.println("sumarRango(" + pos1 +"," +  pos2 +"): " + lista2.sumarRango(pos1, pos2));
		System.out.println("sumarRango(" + pos1 +"," +  pos2 +"): " + lista3.sumarRango(pos1, pos2));
		System.out.println("sumarRango(" + pos1 +"," +  pos2 +"): " + lista4.sumarRango(pos1, pos2));
		System.out.println("-------------------\n");
		
		System.out.println("sumarRango(" + pos2 +"," +  pos3 +"): " + lista1.sumarRango(pos2, pos3));
		System.out.println("sumarRango(" + pos2 +"," +  pos3 +"): " + lista2.sumarRango(pos2, pos3));
		System.out.println("sumarRango(" + pos2 +"," +  pos3 +"): " + lista3.sumarRango(pos2, pos3));
		System.out.println("sumarRango(" + pos2 +"," +  pos3 +"): " + lista4.sumarRango(pos2, pos3));
		System.out.println("-------------------\n");
		
		System.out.println("sumarRango(" + pos3 +"," +  pos4 +"): " + lista1.sumarRango(pos3, pos4));
		System.out.println("sumarRango(" + pos3 +"," +  pos4 +"): " + lista2.sumarRango(pos3, pos4));
		System.out.println("sumarRango(" + pos3 +"," +  pos4 +"): " + lista3.sumarRango(pos3, pos4));
		System.out.println("sumarRango(" + pos3 +"," +  pos4 +"): " + lista4.sumarRango(pos3, pos4));
		System.out.println("-------------------\n");
		
		System.out.println("sumarRango(" + pos1 +"," +  pos3 +"): " + lista1.sumarRango(pos1, pos3));
		System.out.println("sumarRango(" + pos1 +"," +  pos3 +"): " + lista2.sumarRango(pos1, pos3));
		System.out.println("sumarRango(" + pos1 +"," +  pos3 +"): " + lista3.sumarRango(pos1, pos3));
		System.out.println("sumarRango(" + pos1 +"," +  pos3 +"): " + lista4.sumarRango(pos1, pos3));

		
	}

}
