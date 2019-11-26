package ejemplo;

import java.util.Scanner;

/**
 * (ábreme)
 * @author miki
 * Ejemplo de recursividad: 
 * 
 * Recursividad es un concepto que aparece cuando utilizamos el propio método
 * para resolver un problema.
 * 
 * Es decir, mientras estamos ejecutando el método, éste se irá llamando a si
 * mismo.
 * 
 * Sin embargo hay que saber que en cada llamada vamos a ir alterando los
 * valores que le pasamos al método porque de no hacerlo se generaría un bucle
 * infinito de llamadas infinita, o lo que es lo mismo: RECURSIVIDAD INFINITA.
 * 
 * La recursividad es un sistema bastante caro, puesto que hacemos muchas
 * llamadas a un método y por tanto hace que la memoria se llene más rápido que
 * si hiciéramos un bucle normal.
 * 
 * Todos los problemas de este tema se podrían resolver con bucles for() o
 * while() pero debes entender que para otros caso mas avanzados la recursividad
 * es tremendamente útil.
 * 
 * En este ejemplo vamos a trabajar con la multiplicación de dos números positivos.
 * Ejecuta el codigo para ver las pruebas.
 */

public class EjemploRecursividad {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduzca dos números positivos para multiplicarlos: \n a = " );
		int a = teclado.nextInt();
		System.out.print(" b = ");
		int b = teclado.nextInt();
		
		System.out.print("\n\n==================================================================\n\nPRUEBA: "+ a +" * " + b + " =  ");

		
		int espero = a*b; //en "espero" guardamos el resultado esperado que será 7*8=56
		
		int res = MultiplicacionRecursiva(a,b);
		
		System.out.println(res);//imprimimos el resultado
		
		System.out.println(res==espero);//¿Está bien?
		
		//voy a separar la prueba simple de la visual
		System.out.println("\n==================================================================\n\nPRUEBA VISUAL: \n");
		
		System.out.println(MultiplicacionRecursivaVisual(a,b));
		
		System.out.println("\n\nFíjate que primero 'b' ha tenido que llegar hasta 1 \npara llegar al caso base, y a partir de ahí construir"
				+ " las operaciones,\npor lo que hasta que 'b' no llega a 1,\n ¡la función aun no ha devuelto ningún valor!");
		
		teclado.close();
	}
	
	/**
	 * Método que multiplica  a*b de forma recursiva
	 * @param a
	 * @param b
	 * @return la multiplicación de a * b
	 * 
	 *  Una multiplicación de "a * b" equivale a "a + a + a + ...{b}... a + a"
	 *   Ejemplo: 
	 *   
	 *   	a = 5;
	 *   	b = 7;
	 *   	5*7 = 5+5+5+5+5+5+5 = 35 (5*7 = 35) 
	 *   
	 *   	
	 */
	
	public static int MultiplicacionRecursiva(int a, int b){
		if(a == 0 || b == 0){//¡¡EXCEPCIONES!!
			return 0;
		}
		/**
		 * Una vez tratadas las excepciones, desarrollamos el método. 
		 * 
		 * Para cualquier problema de recursividad tenemos que tener en cuenta 2 cosas: 
		 * 
		 * 	1) ¿Cuál es el caso base?
		 * 	2) ¿Cómo se llega al caso base?
		 * 
		 * 
		 *  1) El caso base es nuestra condición de parada. Por ejemplo, si estamos frente a una String y estamos acortándola
		 * el caso base será cuando no podamos cortar mas. (string vacia)
		 * 
		 *  2) Es lo que vamos a modificar cuando llamemos al método. En el caso de la String sería acortándola en cada llamada.
		 *  Y en este caso será disminuyendo las veces que estamos sumando.
		 *  es decir, el valor de b.
		 *  
		 *  Muchas veces sabremos cual es el caso base pero otras no; para esas ocasiones piensa en qué estás modificando
		 *  a la hora de hacer la llamada recursiva y piensa cuando debe parar el programa.
		 */
		
		 // Fijate que nuestro caso base será cuando 'b' llegue a 1 y cuando eso ocurra devolveremos 'a'
		if(b == 1){//caso base
			return a;
		} else {
			//¡Y aqui llamamos al método otra vez! AL MISMO MÉTODO, con la diferencia que b ahora es b-1.
			return a+MultiplicacionRecursiva(a,b-1);//llamada al método recursivo
		}
	}
	
	/**
	 * Método para que se vea el ejemplo de la recursividad visualmente
	 * @param a
	 * @param b
	 * @return
	 */
	
	public static int MultiplicacionRecursivaVisual(int a, int b){
		if(a == 0 || b == 0){//¡¡EXCEPCIONES!!
			return 0;
		}
		
		System.out.print("Hola, soy b y valgo: " + b);
		System.out.print("  ¿cuanto vale el resultado?   ni idea");
		
		if(b == 1){//caso base
			System.out.println(" ......");
			System.out.println("\n¿¡b vale 1!? ¡Entonces el resultado vale "+ a+ "!\n\n¡TERMINE!\n ");
			return a;
		} else {
			System.out.println();
			int res =  a+MultiplicacionRecursivaVisual(a,b-1);//llamada al método recursivo
			System.out.println("Hola, soy el resultado y valgo: " + res+ " cuando b vale: " +  b);
			return res;
		}
	}

}
