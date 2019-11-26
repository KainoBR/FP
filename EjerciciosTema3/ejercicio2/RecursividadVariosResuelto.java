package ejercicio2;

public class RecursividadVariosResuelto {
	/**
	 * (�breme)
	 * @author Miki
	 * 
	 * Ejercicios de RecursividadVarios
	 * Estos son ejercicios RESUELTOS del tema 3: "Recursividad."
	 * 
	 * Cualquier duda sobre cualquier apartado la puedes consultar en la Delegaci�n o en las clases que doy.
	 * NOTA: Si encuentras alg�n fallo com�ntalo para poder corregirlo. En general no deber�a haber ninguno, pero nunca
	 * se sabe.
	 */	

	//------------------------------------------------------------------------------------------------------------
			//----------------------------------------EJERCICIOS----------------------------------//
	//------------------------------------------------------------------------------------------------------------
	
	/**
	 * 1) Pontencia: calcular potencias de un n�mero de forma recursiva.
	 * 
	 * @param b base
	 * @param e exponente 
	 * @return b^e
	 *
	 * Para este ejercicio utilizaremos la propia definici�n del exponente 
	 *   a ^ b = a*a*a*a*a...{b}...a*a*a. 
	 *   Esto quiere decir a^b equivale a multiplicar 'b' veces 'a'. 
	 *   Por tanto lo que queda es realizar la llamada recursiva colocando como caso base la b cuando sea 0 
	 *   (que por convenio x^0 = 1) y luego en la llamada, mediante (e-1) llegamos hasta el caso base. 
	 *  
	*/
	public static int potencia(int b, int e){
		if(e < 0){//�como estamos usando variables de tipo INT, no podemos hacer potencias de n�meros negativos!
			return 0;
		}
		
		if(e == 0){//caso base
			return 1;
		} else {
			return b * potencia(b,e-1);//Volvemos a llamar al m�todo realizando la operacion 
		}
	}
	
	/**
	 * 2) Invertir: Dada una String, invertirla utilizando un algoritmo recursivo
	 * Ej: hola --> aloh
	 * 
	 * @param s la String a invertir
	 * @return la String al reves
	 * 
	 * Para este ejercicio debemos recurrir a lo aprendido en el tema 1. 
	 * 
	 * Utilizaremos el m�todo .charAt(s.length()-1) para ir recogiendo las ULTIMAS letras
	 * Y luego mediante un subString(0,s.length()-1) llegaremos al caso base, que es cuando la String
	 * est� vacia. 
	 * 
	 */
	public static String invertir(String s){
		if(s.length()== 0){//Caso base
			return "";
		} else {
			return s.charAt(s.length()-1) + invertir(s.substring(0, s.length()-1));//Volvemos a llamar al m�todo concatenando a la inversa 
		}
	}
	
	
	/**
	 * 3) Division: desarrollar el m�todo division para que realice una
	 * division por restas sucesivas de forma recursiva.
	 * 
	 * @param n n�mero a dividir (Dividendo)
	 * @param d n�mero por el que divide (divisor)
	 * @return resultado de la division
	 * 
	 * Para este ejercicio utilizaremos la definici�n de divisi�n, de forma que:
	 *    8/2 == 8 - 2 = 4 - 2 = 2 - 2 = 0 - 2
	 *    Y: 	 	1  	   2       3       4   ==> hemos restado 4 veces: el resultado es 4. 
	 */
	public static int division (int n, int d ){
		if(d == 0){//Excepci�n
			return 0;
		}
		if(d>n){//caso base
			return 0;
		} else {
			return division(n-d, d)+1; //�Cada vez que sumamos 1 son las veces que hemos resado!
		}
	}
	
	//------------------------------------------------------------------------------------------------------------
	//NOTA: AQUI LA COSA SE COMPLICA.
	//------------------------------------------------------------------------------------------------------------
	
	/**
	 * 4) Producto: desarrollar el m�todo ArrayProducto para que devuelva la suma de los productos de los elementos (en la misma posici�n)
	 * de dos arrays en funci�n de una longitud de forma que: 
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
	 * @param len longitud 
	 * @return la suma de los productos de cada elemento de dos vectores.
	 */
	public static int arrayProducto(int[] v1, int[] v2, int len){
		if(len < 0|| v1.length < len || v2.length < len){//Excepci�n
			return 0;
		}
		
		if(len == 0){//caso base
			return v1[0] * v2[0]; //producto de los 1� valores
		} else {
			return v1[len] * v2[len] + arrayProducto(v1,v2,len-1); //suma de productos
		}
	}
	
	
	/**
	 * 5) ArrayComp: desarrollar el m�todo arrayComp que recive 3 ararys, dos de tipo entero y otro de tipo booleano.
	 * Se debe devolver un nuevo array de enteros en funcion de si en la posici�n actual en el array de booelanos:
	 * Si hay un true, guarda el valor del 1� vector, y si es un false, la del 2�.
	 * El nuevo array ser� de un tama�o pasado por par�metro. (este valor no ser� mayor que ninguno de los otros arrays)
	 * 
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
	 * @param len longitud 
	 * @return un nuevo array en funci�n de los otros 3 de tama�o len 
	 * 
	 */
	public static int[] arrayComp (int[] v1, int[] v2, boolean[] v3, int len){
		
		
		int[] res = new int[len];
		AuxArrayComp(v1,v2,v3,len-1,res);
		return res;
	}
	private static void AuxArrayComp (int[] v1, int[] v2, boolean[] v3, int len, int[] res){
		if(len == 0){
			if(v3[0] == true){
				 res[0] = v1[0];
			} else {
				res[0] = v2[0];
			} 
		} else {
			if(v3[len] == true){
				res[len] =v1[len];
			} else {
				res[len] = v2[len];
			} 
			AuxArrayComp(v1,v2,v3,len-1,res);
		}
	}
	
	
	/**
	 * 6) SumaVectores: desarrollar el m�todo SumaVectores que deber� sumar los elementos en la misma posicion
	 * de dos vectores y, si la suma es par, se guardar� en otro vector resultado de longitud m�xima, y si es impar
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
	 * @return un nuevo vector en funci�n de los otros 2.
	 */
	public static int[] sumaVectores(int[] v1, int[]v2){
		int tama�o =0;
		int hasta =0;
		if(v1.length >= v2.length){
			tama�o = v1.length;
			hasta = v2.length;
		} else {
			tama�o = v2.length;
			hasta = v1.length;
		}
		int[] res = new int[tama�o];
		AuxSumaVectores(v1,v2,hasta-1,res);
		return res;
	}
	

	private static void AuxSumaVectores (int[] v1, int[] v2, int len, int[] res){
		if(len == 0){
			if(v1[0]+v2[0]%2 == 0){
				res[0] = v1[0]+v2[0];
			}
		} else {
			
			AuxSumaVectores(v1,v2,len-1,res);
		}
	}
	
	
	/**
	 * 7) ArrayRecursivo: desarrollar el metodo ArrayRecursivo que a partir de dos vectores de enteros, genera un nuevo 
	 * vector de un tama�o pasado por par�metro. 
	 * El nuevo vector contendr� los elementos del 2� vector si solo s�, en el 1� vector en la misma posici�n no guarda un
	 * n�mero negativo. En caso contrario guardar un 0. 
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
	 * @param len longitud
	 * @return un nuevo vector en funci�n de los otros 2 de tama�o len.
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
		
		System.out.println("La String  \"\"      al rev�s ser�a: "+ invertir(""));
		System.out.println("La String  \"h\"     al rev�s ser�a: "+ invertir("h"));
		System.out.println("La String  \"ho\"    al rev�s ser�a: "+ invertir("ho"));
		System.out.println("La String  \"hola\"  al rev�s ser�a: "+ invertir("hola"));
		System.out.println("La String  \"1001\"  al rev�s ser�a: "+ invertir("1001"));
		System.out.println("----------------------------------------------------");
		
		
		System.out.println("La String  \"delegacion\"  al rev�s ser�a: "+ invertir("delegacion"));
		System.out.println("La String  \"computador\"  al rev�s ser�a: "+ invertir("computador"));
		System.out.println("La String  \"4889884\"     al rev�s ser�a: "+ invertir("4889884"));
		System.out.println("La String  \"reconocer\"   al rev�s ser�a: "+ invertir("reconocer"));
		System.out.println("----------------------------------------------------");
		
		System.out.println("La String  \"ReCuRsIvIdAd\"  al rev�s ser�a: "+ invertir("ReCuRsIvIdAd"));
		System.out.println("La String  \"A m� me mima\"  al rev�s ser�a: "+ invertir("A m� me mima"));
		System.out.println("La String  \"raborpa arap\"  al rev�s ser�a: "+ invertir("raborpa arap"));
		System.out.println("----------------------------------------------------");
		
		System.out.println("La String  \"Yo hago yoga hoY\"    al rev�s ser�a: "+ invertir("Yo hago yoga hoY"));
		System.out.println("La String  \"Tengo que estudiar\"  al rev�s ser�a: "+ invertir("Tengo que estudiar"));
		
		//------------------------------------------------------------------------------------------------------------
		//--------------------------- PRRUEBAS DEL EJERCICIO 3 ---------------------------// 
		//------------------------------------------------------------------------------------------------------------
		
		System.out.println("\n-----------------------------------------------------");
		System.out.println("EJERCICIO 3:      DIVISI�N\n");
		
		System.out.println("La division de 0 entre 0 es: "+ division(0,0));
		System.out.println("La division de 1 entre 0 es: "+ division(1,0));
		System.out.println("La division de 0 entre 1 es: "+ division(0,1));
		System.out.println("---------------------------------");
		System.out.println("La division de 2 entre 1 es: "+ division(2,1));
		System.out.println("La division de 4 entre 2 es: "+ division(4,2));
		System.out.println("La division de 5 entre 2 es: "+ division(5,2));
		System.out.println("La division de 8 entre 2 es: "+ division(8,2));
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
