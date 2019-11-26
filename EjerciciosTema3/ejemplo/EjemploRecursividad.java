package ejemplo;

import java.util.Scanner;

/**
 * (�breme)
 * @author miki
 * Ejemplo de recursividad: 
 * 
 * Recursividad es un concepto que aparece cuando utilizamos el propio m�todo
 * para resolver un problema.
 * 
 * Es decir, mientras estamos ejecutando el m�todo, �ste se ir� llamando a si
 * mismo.
 * 
 * Sin embargo hay que saber que en cada llamada vamos a ir alterando los
 * valores que le pasamos al m�todo porque de no hacerlo se generar�a un bucle
 * infinito de llamadas infinita, o lo que es lo mismo: RECURSIVIDAD INFINITA.
 * 
 * La recursividad es un sistema bastante caro, puesto que hacemos muchas
 * llamadas a un m�todo y por tanto hace que la memoria se llene m�s r�pido que
 * si hici�ramos un bucle normal.
 * 
 * Todos los problemas de este tema se podr�an resolver con bucles for() o
 * while() pero debes entender que para otros caso mas avanzados la recursividad
 * es tremendamente �til.
 * 
 * En este ejemplo vamos a trabajar con la multiplicaci�n de dos n�meros positivos.
 * Ejecuta el codigo para ver las pruebas.
 */

public class EjemploRecursividad {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduzca dos n�meros positivos para multiplicarlos: \n a = " );
		int a = teclado.nextInt();
		System.out.print(" b = ");
		int b = teclado.nextInt();
		
		System.out.print("\n\n==================================================================\n\nPRUEBA: "+ a +" * " + b + " =  ");

		
		int espero = a*b; //en "espero" guardamos el resultado esperado que ser� 7*8=56
		
		int res = MultiplicacionRecursiva(a,b);
		
		System.out.println(res);//imprimimos el resultado
		
		System.out.println(res==espero);//�Est� bien?
		
		//voy a separar la prueba simple de la visual
		System.out.println("\n==================================================================\n\nPRUEBA VISUAL: \n");
		
		System.out.println(MultiplicacionRecursivaVisual(a,b));
		
		System.out.println("\n\nF�jate que primero 'b' ha tenido que llegar hasta 1 \npara llegar al caso base, y a partir de ah� construir"
				+ " las operaciones,\npor lo que hasta que 'b' no llega a 1,\n �la funci�n aun no ha devuelto ning�n valor!");
		
		teclado.close();
	}
	
	/**
	 * M�todo que multiplica  a*b de forma recursiva
	 * @param a
	 * @param b
	 * @return la multiplicaci�n de a * b
	 * 
	 *  Una multiplicaci�n de "a * b" equivale a "a + a + a + ...{b}... a + a"
	 *   Ejemplo: 
	 *   
	 *   	a = 5;
	 *   	b = 7;
	 *   	5*7 = 5+5+5+5+5+5+5 = 35 (5*7 = 35) 
	 *   
	 *   	
	 */
	
	public static int MultiplicacionRecursiva(int a, int b){
		if(a == 0 || b == 0){//��EXCEPCIONES!!
			return 0;
		}
		/**
		 * Una vez tratadas las excepciones, desarrollamos el m�todo. 
		 * 
		 * Para cualquier problema de recursividad tenemos que tener en cuenta 2 cosas: 
		 * 
		 * 	1) �Cu�l es el caso base?
		 * 	2) �C�mo se llega al caso base?
		 * 
		 * 
		 *  1) El caso base es nuestra condici�n de parada. Por ejemplo, si estamos frente a una String y estamos acort�ndola
		 * el caso base ser� cuando no podamos cortar mas. (string vacia)
		 * 
		 *  2) Es lo que vamos a modificar cuando llamemos al m�todo. En el caso de la String ser�a acort�ndola en cada llamada.
		 *  Y en este caso ser� disminuyendo las veces que estamos sumando.
		 *  es decir, el valor de b.
		 *  
		 *  Muchas veces sabremos cual es el caso base pero otras no; para esas ocasiones piensa en qu� est�s modificando
		 *  a la hora de hacer la llamada recursiva y piensa cuando debe parar el programa.
		 */
		
		 // Fijate que nuestro caso base ser� cuando 'b' llegue a 1 y cuando eso ocurra devolveremos 'a'
		if(b == 1){//caso base
			return a;
		} else {
			//�Y aqui llamamos al m�todo otra vez! AL MISMO M�TODO, con la diferencia que b ahora es b-1.
			return a+MultiplicacionRecursiva(a,b-1);//llamada al m�todo recursivo
		}
	}
	
	/**
	 * M�todo para que se vea el ejemplo de la recursividad visualmente
	 * @param a
	 * @param b
	 * @return
	 */
	
	public static int MultiplicacionRecursivaVisual(int a, int b){
		if(a == 0 || b == 0){//��EXCEPCIONES!!
			return 0;
		}
		
		System.out.print("Hola, soy b y valgo: " + b);
		System.out.print("  �cuanto vale el resultado?   ni idea");
		
		if(b == 1){//caso base
			System.out.println(" ......");
			System.out.println("\n��b vale 1!? �Entonces el resultado vale "+ a+ "!\n\n�TERMINE!\n ");
			return a;
		} else {
			System.out.println();
			int res =  a+MultiplicacionRecursivaVisual(a,b-1);//llamada al m�todo recursivo
			System.out.println("Hola, soy el resultado y valgo: " + res+ " cuando b vale: " +  b);
			return res;
		}
	}

}
