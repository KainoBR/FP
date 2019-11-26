package ejercicio2;

public class RecursividadVarios {
	/**
	 * NOTA IMPORTANTE:
	 * EL MAIN NO ESTÁ COMPLETO POR FALTA DE TIEMPO.  
	 * CUANDO PUEDA ACTUALIZARÉ EL EJERCICIO Y SUBIRÉ EL CORRESPONDIENTE RESUELTO
	 * 
	 * 
	 * @author Miki
	 * 
	 * Ejercicios de RecursividadVarios
	 * Estos son los ejercicios del tema 3: recursividad.
	 * 
	 * Abajo tienes una pequeña plantilla de cada ejercicio (solo la declaración del método).
	 * Ya está implementado el main con las pruebas, sin embargo, para este tema, el main solo imprime los 
	 * diferentes resultados, no comprueban si están bien o no.  
	 * Esto es porque son muchas pruebas y encima fáciles de ver a simple vista si van bien o no, por lo que 
	 * me he decantado de hacerlo de esta forma, más compacta y cómoda tanto para mí como para ti. 
	 * 
	 * Igualmente tienes en otra página los métodos ya resueltos de forma que puedes comparar allí.  
	 * Cada ejercicio se puede resolver de múltiples formas, no lo olvides. Ninguna es mejor que otra. 
	 * 
	 * Cualquier duda sobre cualquier apartado la puedes consultar en la Delegación o en las clases que doy.
	 * NOTA: Si encuentras algún fallo coméntalo para poder corregirlo. En general no debería haber ninguno, pero nunca
	 * se sabe.
	 */	

	//------------------------------------------------------------------------------------------------------------
			//----------------------------------------EJERCICIOS----------------------------------//
	//------------------------------------------------------------------------------------------------------------
	
	/**
	 * 1) Pontencia: calcular potencias de un número de forma recursiva.
	 *
	 * @param b base
	 * @param e exponente 
	 * @return b^e 
	*/
	public static int potencia(int b, int e){
		return 0;
	}
	
	/**
	 * 2) Invertir: Dada una String, invertirla utilizando un algoritmo recursivo
	 * Ej: hola --> aloh
	 * 
	 * @param s la String a invertir
	 * @return la String al reves
	 */
	public static String invertir(String s){
		return "";
	}
	
	
	/**
	 * 3) Division: desarrollar el método division para que relaice una
	 * division por restas sucesivas de forma recursiva.
	 * 
	 * @param n número a dividir (Dividendo)
	 * @param d número por el que divide (divisor)
	 * @return resultado de la division
	 */
	public static int division (int n, int d ){
		return 0;
	}
	
	//------------------------------------------------------------------------------------------------------------
	//NOTA: AQUI LA COSA SE COMPLICA.
	//------------------------------------------------------------------------------------------------------------
	
	/**
	 * 4) Producto: desarrollar el método ArrayProducto para que devuelva la suma de los productos de los elementos (en la misma posición)
	 * de dos arrays en función de una longitud de forma que: 
	 * (¡OJO! la longitud es un valor que determina cuantos elementos hay que recorrer))
	 * 
	 * Ej: 
	 * 
	 * (pos) 0 1 2  3 4 5 6 7 8 9 10
	 * 
	 * v1 = [2,5,7, 5,6,7,7,8,8,9,9]
	 * v2 = [4,6,3, 7,8,7,7,7] 
	 * le = 2
	 * 
	 * res = (2*4)+(5*6) = 8+30 = 38
	 * 
	 * @param v1 vector 1 de enteros
	 * @param v2 vector 2 de enteros
	 * 
	 * @param len longitud 
	 * 
	 * @return la suma de los productos de cada elemento de dos vectores.
	 */
	public static int arrayProducto(int[] v1, int[] v2, int len){
		return 0;
	}
	
	
	/**
	 * 5) ArrayComp: desarrollar el método arrayComp que recive 3 ararys, dos de tipo entero y otro de tipo booleano.
	 * Se debe devolver un nuevo array de enteros en funcion de si en la posición actual en el array de booelanos:
	 * Si hay un true, guarda el valor del 1º vector, y si es un false, la del 2º.
	 * 
	 * El nuevo array será de un tamaño pasado por parámetro. (este valor no será mayor que ninguno de los otros arrays)
	 * (¡OJO! la longitud es un valor que determina el TAMAÑO de un ARRAY (.length) ) 
	 * Ej: 
	 * 
	 * (pos) 0 1 2  3 4 5 6 7 8 9 10
	 * 
	 * v1 = [1,3,4,6]
	 * v2 = [5,6,3,2]
	 * v3 = [t,t,f,f] (t = true, f = false)
	 * 
	 * res = [1,3,3,2]
	 * 
	 * 
	 * @param v1 vector 1 de enteros
	 * @param v2 vector 2 de enteros
	 * @param v3 vector 3 de booelanos
	 * 
	 * @param len longitud a reccorrer  
	 * 
	 * @return un nuevo array en función de los otros 3 de tamaño len 
	 * 
	 */
	public static int[] arrayComp (int[] v1, int[] v2, boolean[] v3, int len){
		// para que no de error al ejecutar
		int[] res = new int[len]; 
		return res;
	}
	
	
	/**
	 * 6) SumaVectores: desarrollar el método SumaVectores que deberá sumar los elementos en la misma posicion
	 * de dos vectores y, si la suma es par, se guardará en otro vector resultado de longitud máxima, y si es impar
	 * se guarda un 0. 
	 * 
	 * Ejemplo:
	 * v1 = [2, 2, 3, 5, 6]
	 * v2 = [4,1, 1, 0, 2]
	 * 
	 * res = [6, 0, 4, 0, 8]
	 * 
	 * @param v1 vector 1 de enteros
	 * @param v2 vector 2 de enteros
	 * @return un nuevo vector en función de los otros 2.
	 */
	public static int[] sumaVectores(int[] v1, int[]v2){
		int[] res = {0,0,0,0,0};
		return res;
	}
	
	
	/**
	 * 7) ArrayRecursivo: desarrollar el metodo ArrayRecursivo que a partir de dos vectores de enteros, genera un nuevo 
	 * vector de un tamaño pasado por parámetro. 
	 * El nuevo vector contendrá los elementos del 2º vector si solo sí, en el 1º vector en la misma posición no guarda un
	 * número negativo. En caso contrario guardar un 0. 
	 * (¡OJO! la longitud es un valor que determina el TAMAÑO de un ARRAY (.length) ) 

	 * 
	 * Ejemplo: 
	 * v1 = [2, -3, 0, -1, -5, 3]
	 * v2 = [7, 9, 3, 1, 2, 4]
	 * len = 5
	 * 
	 * res = [7, 0, 3, 0, 0]
	 * 
	 * @param v1 vector 1 de enteros
	 * @param v2 vector 2 de enteros
	 * 
	 * @param len longitud
	 * 
	 * @return un nuevo vector en función de los otros 2 de tamaño len.
	 */
	public static int[] arrayRecursivo(int[] v1, int[] v2, int len){
		int[] res = new int[len];
		return res;
	}
	
	
	//------------------------------------------------------------------------------------------------------------
			//--------------------------- PRRUEBAS---------------------------// 
	//------------------------------------------------------------------------------------------------------------
	
	public static void main(String[] arg){
		
		

		System.out.println();
		System.out.println("PRUEBAS:                                       MIKI");
		System.out.println("-----------------------------------------------------");
		System.out.println("-----------------------------------------------------");
		
		
		//------------------------------------------------------------------------------------------------------------
		//--------------------------- PRRUEBAS DEL EJERCICIO 1 ---------------------------// 
		//------------------------------------------------------------------------------------------------------------
		
		System.out.println("\n-----------------------------------------------------");
		System.out.println("EJERCICIO 1:      POTENCIA\n");
		
		System.out.println("----------------------");
		System.out.println("0 elevado a 0 es: " + potencia(0,0));
		System.out.println("0 elevado a 1 es: " + potencia(0,1));
		System.out.println("0 elevado a 3 es: " + potencia(0,3));
		System.out.println("0 elevado a 5 es: " + potencia(0,5));
		System.out.println("----------------------");
		System.out.println("1 elevado a 0 es: " + potencia(1,0));
		System.out.println("1 elevado a 1 es: " + potencia(1,1));
		System.out.println("1 elevado a 5 es: " + potencia(1,5));
		System.out.println("1 elevado a 7 es: " + potencia(1,7));
		System.out.println("----------------------");
		System.out.println("2 elevado a 0 es: " + potencia(2,0));
		System.out.println("2 elevado a 2 es: " + potencia(2,1));
		System.out.println("2 elevado a 2 es: " + potencia(2,2));
		System.out.println("2 elevado a 3 es: " + potencia(2,3));
		System.out.println("2 elevado a 5 es: " + potencia(2,5));
		System.out.println("2 elevado a 6 es: " + potencia(2,6));
		System.out.println("2 elevado a 8 es: " + potencia(2,8));
		System.out.println("----------------------");
		System.out.println("3 elevado a 3 es: " + potencia(3,3));
		System.out.println("3 elevado a 0 es: " + potencia(3,0));
		System.out.println("3 elevado a 1 es: " + potencia(3,1));
		System.out.println("3 elevado a 5 es: " + potencia(3,5));
		System.out.println("----------------------");
		System.out.println("4 elevado a 2 es: " + potencia(4,2));
		System.out.println("4 elevado a 4 es: " + potencia(4,4));
		System.out.println("4 elevado a 5 es: " + potencia(4,5));
		System.out.println("4 elevado a 6 es: " + potencia(4,6));
		System.out.println("----------------------");
		System.out.println("5 elevado a 0 es: " + potencia(5,0));
		System.out.println("5 elevado a 2 es: " + potencia(5,2));
		System.out.println("5 elevado a 3 es: " + potencia(5,3));
		System.out.println("5 elevado a 4 es: " + potencia(5,4));
		System.out.println("----------------------");
		System.out.println("7 elevado a 0 es: " + potencia(7,0));
		System.out.println("7 elevado a 1 es: " + potencia(7,1));
		System.out.println("7 elevado a 2 es: " + potencia(7,2));
		System.out.println("7 elevado a 4 es: " + potencia(7,4));
		System.out.println("----------------------");
		
		//------------------------------------------------------------------------------------------------------------
		//--------------------------- PRRUEBAS DEL EJERCICIO 2 ---------------------------// 
		//------------------------------------------------------------------------------------------------------------
		
		System.out.println("\n-----------------------------------------------------");
		System.out.println("EJERCICIO 2:      INVERTIR\n");
		
		System.out.println("La String  \"\"      al revés sería: "+ invertir(""));
		System.out.println("La String  \"h\"     al revés sería: "+ invertir("h"));
		System.out.println("La String  \"ho\"    al revés sería: "+ invertir("ho"));
		System.out.println("La String  \"hola\"  al revés sería: "+ invertir("hola"));
		System.out.println("La String  \"1001\"  al revés sería: "+ invertir("1001"));
		System.out.println("----------------------------------------------------");
		
		
		System.out.println("La String  \"delegacion\"  al revés sería: "+ invertir("delegacion"));
		System.out.println("La String  \"computador\"  al revés sería: "+ invertir("computador"));
		System.out.println("La String  \"4889884\"     al revés sería: "+ invertir("4889884"));
		System.out.println("La String  \"reconocer\"   al revés sería: "+ invertir("reconocer"));
		System.out.println("----------------------------------------------------");
		
		System.out.println("La String  \"ReCuRsIvIdAd\"  al revés sería: "+ invertir("ReCuRsIvIdAd"));
		System.out.println("La String  \"A mí me mima\"  al revés sería: "+ invertir("A mí me mima"));
		System.out.println("La String  \"raborpa arap\"  al revés sería: "+ invertir("raborpa arap"));
		System.out.println("----------------------------------------------------");
		
		System.out.println("La String  \"Yo hago yoga hoY\"    al revés sería: "+ invertir("Yo hago yoga hoY"));
		System.out.println("La String  \"Tengo que estudiar\"  al revés sería: "+ invertir("Tengo que estudiar"));
		
		//------------------------------------------------------------------------------------------------------------
		//--------------------------- PRRUEBAS DEL EJERCICIO 3 ---------------------------// 
		//------------------------------------------------------------------------------------------------------------
		
		System.out.println("\n-----------------------------------------------------");
		System.out.println("EJERCICIO 3:      DIVISIÓN\n");
		
		System.out.println("La division de 0 entre 0 es: "+ division(0,0));
		System.out.println("La division de 1 entre 0 es: "+ division(1,0));
		System.out.println("La division de 0 entre 1 es: "+ division(0,1));
		System.out.println("---------------------------------");
		System.out.println("La division de 2 entre 1 es: "+ division(2,1));
		System.out.println("La division de 4 entre 2 es: "+ division(4,2));
		System.out.println("La division de 5 entre 2 es: "+ division(5,2));
		System.out.println("La division de 8 entre 3 es: "+ division(8,3));
		System.out.println("---------------------------------");
		System.out.println("La division de 24 entre 4 es: "+ division(24,4));
		System.out.println("La division de 32 entre 2 es: "+ division(32,2));
		System.out.println("La division de 63 entre 3 es: "+ division(63,3));
		System.out.println("La division de 88 entre 11 es: "+ division(88,11));
		
		
		//------------------------------------------------------------------------------------------------------------
		//--------------------------- PRRUEBAS DEL EJERCICIO 4 ---------------------------// 
		//------------------------------------------------------------------------------------------------------------
		
		System.out.println("\n-----------------------------------------------------");
		System.out.println("EJERCICIO 4:      ARRAYPRODUCTO\n");
		
		int[] v1 = {1,2,3,4,5}; 
		int[] v2 = {0,2,4,6,8};
		int[] v3 = {1,3,5,6,7};
		int[] v4 = {4,4,7,4,8};
		
		
		System.out.println("v1 = {" + v1[0] + "," + v1[1] + "," + v1[2] + "," + v1[3] + "," + v1[4] + "}");
		System.out.println("v2 = {" + v2[0] + "," + v2[1] + "," + v2[2] + "," + v2[3] + "," + v2[4] + "}");
		System.out.println("v3 = {" + v3[0] + "," + v3[1] + "," + v3[2] + "," + v3[3] + "," + v3[4] + "}");
		System.out.println("v4 = {" + v4[0] + "," + v4[1] + "," + v4[2] + "," + v4[3] + "," + v4[4] + "}");
		
		System.out.println("-----------------");
		System.out.println("v1 * v2 (1)= "+arrayProducto(v1,v2,1));
		System.out.println("v1 * v2 (2)= " +arrayProducto(v1,v2,2));
		System.out.println("v1 * v2 (3)= " +arrayProducto(v1,v2,3));
		System.out.println("v1 * v2 (4)= " +arrayProducto(v1,v2,4));
		System.out.println("---------------");
		System.out.println("v2 * v2 (1)= " +arrayProducto(v2,v2,1));
		System.out.println("v2 * v2 (2)= " +arrayProducto(v2,v2,2));
		System.out.println("v2 * v3 (2)= " +arrayProducto(v2,v3,2));
		System.out.println("---------------");
		System.out.println("v3 * v3 (3)= " +arrayProducto(v3,v3,3));
		System.out.println("v3 * v3 (4)= " +arrayProducto(v3,v3,4));
		System.out.println("v4 * v4 (1)= " +arrayProducto(v4,v4,1));
		System.out.println("v4 * v4 (3)= " +arrayProducto(v4,v4,3));
		
	
		
		//------------------------------------------------------------------------------------------------------------
		//--------------------------- PRRUEBAS DEL EJERCICIO 5 ---------------------------// 
		//------------------------------------------------------------------------------------------------------------
		
		System.out.println("\n-----------------------------------------------------");
		System.out.println("EJERCICIO 5:      ArrayComp\n");
		
		
		boolean[] v1boolean = {true,true,false,true,false,false,true,false}; 
		boolean[] v2boolean = {false,false,false,true,true,false,true,true};
		
		
		
		System.out.println("\n------------------------------------\n");
		int[] res1 = {0,0,0};
		res1 = arrayComp(v1,v2,v1boolean, 3);
		System.out.print("{"+res1[0]+","+res1[1]+","+res1[2]+"}\n");
		
		res1 = arrayComp(v1,v2,v2boolean, 3);
		System.out.print("{"+res1[0]+","+res1[1]+","+res1[2]+"}\n");
		
		res1 = arrayComp(v2,v4,v1boolean, 3);
		System.out.print("{"+res1[0]+","+res1[1]+","+res1[2]+"}\n");
		
		res1 = arrayComp(v2,v2,v1boolean, 3);
		System.out.print("{"+res1[0]+","+res1[1]+","+res1[2]+"}\n");
		
		
		
		System.out.println("\n------------------------------------\n");
		int[] res2 = {0,0};
		res2 = arrayComp(v1,v2,v1boolean, 2);
		System.out.print("{"+res2[0]+","+res2[1]+"}\n");
		
		res2 = arrayComp(v4,v2,v1boolean, 2);
		System.out.print("{"+res2[0]+","+res2[1]+"}\n");
		
		res2 = arrayComp(v2,v4,v1boolean, 2);
		System.out.print("{"+res2[0]+","+res2[1]+"}\n");
		
		
		
		
		
		
		//------------------------------------------------------------------------------------------------------------
		//--------------------------- PRRUEBAS DEL EJERCICIO 6 ---------------------------// 
		//------------------------------------------------------------------------------------------------------------
		
		System.out.println("\n-----------------------------------------------------");
		System.out.println("EJERCICIO 6:      SumaVectores\n\n");
		
		
		int[] res_suma = {0,0,0,0,0};
		res_suma = sumaVectores(v1,v2);
		System.out.print("{"+res_suma[0]+","+res_suma[1]+","+res_suma[2]+","+res_suma[3]+","+res_suma[4]+"}\n");
		
		
		
		
		//------------------------------------------------------------------------------------------------------------
		//--------------------------- PRRUEBAS DEL EJERCICIO 7 ---------------------------// 
		//------------------------------------------------------------------------------------------------------------
		
		System.out.println("\n-----------------------------------------------------");
		System.out.println("EJERCICIO 7:      ArrayRecursivo\n");
		
		
		
		
	}
	
	
}
