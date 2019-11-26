package ejercicio1;
/**
 * (�breme)
 * @author miki
 * 
 * Estos son los ejercicios resueltos del apartado de recursividad. Est�n ya
 * implementados los m�todos y el main con la soluciones, por lo que solo tienes
 * que darle al "ejecutar" para que funcione.
 * 
 * Recordar: hay varias formas de resolver un ejercicio, este apartado de
 * soluciones sirve para que puedas comprobar tus propias soluciones o ver como
 * se tratan los m�todos recursivos. Los ejercicios m�s complicados tendr�n m�s
 * comentarios y estar�n menos optimizados, aunque siempre se intenta dejar el
 * c�digo lo m�s limpio y claro posible
 * 
 * Te animo a que los resuelvas por tu cuenta hasta que al menos hayas pillado
 * la mecanica
 * 
 * NOTA: Si encuentras cualquier fallo com�ntalo para poder solucionarlo.
 * Siempre se me puede haber escapado algo. Cualquier duda sobre cualquier
 * apartado la puedes consultar en la Delegaci�n o en las clases que doy.
 * 
 */
public class RecursividadResuelto {
	
	/**
	 * Ejercicio 1: Factorial de un n�mero
	 * @param n: el n�mero ha realizar el factorial
	 * @return el factorial del n�mero
	 * 
	 * Explicaci�n: el factorial de un n�mero es la m�ltiplicaci�n
	 * suscesiva desde 1 hasta dicho n�mero.
	 * En recursividad utilizamos la propia definici�n de factorial 
	 * para resolverlo de la siguiente forma: (ejemplo)
	 * 
	 * n = 5
	 * 5! = 5 * 4! 
	 * 4! = 4 * 3! 
	 * ...
	 * 1! = 1
	 */
	public static int factorial (int n){
		if(n<0){//exepci�n (No existe el factorial de numeros negativos)
			return 0;
		}
		
		if(n==0){//caso base 0! = 1. (el factorial de 0 es 1 por convenio)
			return 1;
		} else {
			n = n * factorial(n-1);//llamada recursiva
			return n;
		}
	}
	
	/**
	 * Ejercicio 2: Serie de Fibonaci
	 * @param n: posici�n 
	 * @return el numero en la posicion 'n' en la serie de fibonacci
	 * 
	 * Explicaci�n: La serie de Fibonacci surge a partir de ir sumando un n�mero m�s su anterior, siendo
	 * el 1� y el 2� n�mero 1. De tal forma queda: 
	 * 
	 * Serie de Fibonacci: 1, 1, 2, 3, 5, 8, 13, 21, 34, 55....
	 * 
	 */
	public static int Fibonacci (int n){
		if(n <= 0){//exepci�n (la serie de Fibonacci comienza en 1)
			return 0;
		}
		if(n==1){//caso base
			return 1;
		}else{
			return Fibonacci(n-1)+Fibonacci(n-2);//llamada recursiva
	    }  
	}
		
	/**
	 * Ejercicio 3: MCD de dos numeros
	 * @param a: primer n�mero
	 * @param b: segundo n�mero
	 * @return el MCD divisor
	 * Nota: tambien pueden a�adir if(a==0) { return b, pero ya la op. a%b maneja esa excepcion
	 */
	public static int MCD (int a, int b){		
		//(algoritmo de Euclides)
		if(b==0){//caso base
            return a;
		} else{
            return MCD(b, a % b); //llamada recursiva
		}
    }
	
	/**
	 * Ejercicio 4: Suma de los componentes de un n�mero
	 * @param n el n�mero a tratar
	 * @return la suma de todos sus digitos
	 * 
	 * Explicaci�n: un n�mero se puede expresar en potencias de 10 de forma: 
	 * x0*10^0 + x1*10^1 + x2*10^2 + x3*10^3 ... xn*10^n (de forma que cada x corresponde a cada digito del
	 * n�mero; es decir, unidades, decenas, centenas... Basta con coger cualquier n�mero y dividirlo por 10
	 * sucesivamente para extraer las diferentes posiciones 
	 */
	public static int Sumatorio (int n){
		if(n< 0){//excepcion: si son n�mero negativos.
			n = n*(-1); //lo pasamos a positivos
		}
		
		//(tambien puede ser if(n == 0)
		if (n < 10){//caso base (no se puede dividir por 10) 
		    return n;
		}else{
		    return (Sumatorio(n/10)) + (n%10);//n/10 hacemos m�s peque�o el numero y con n%10 congemos el digito actual
	    }
	}
	
	/**
	 * Ejercicio 5: Pasar n�mero a binario.
	 * @param n el n�mero a tratar
	 * @return el n�mero en formato binario
	 * 
	 * Explicaci�n: Para pasar un n�mero a binario el m�todo m�s sencillo de utilizar
	 * es la divisi�n suscesiva por 2 hasta llegar a 1. 
	 * Ten en cuenta que el resultado se pone en String para poder mostrar el resultado
	 * de forma a�n m�s sencilla. Y por si hay duda, colocar una String y concatenar
	 * (usando el +) a un n�mero, �ste pasa a ser una String.
	 */
	public static String Binario(int n){
		if(n<=0){//excepcion (no vamos a manejar el caso de los n�mero negativos)
			return "0";
		}
		
		if(n==1){//caso base
			return "1";
		}else {
			return Binario(n/2)+n%2;
		}
	}
	
	//------------------------------------------------------------------------------------------------------------
	//NOTA: AQUI LA COSA SE COMPLICA.
	//Consejo: recuerda que puedes usar subm�todos//m�todo auxiliares (introducci�n a la inform�tica)
	//------------------------------------------------------------------------------------------------------------
	
	/**
	 * Ejercicio 6: Suma de los elementos de un vector
	 * @param v vector a tratar
	 * @return la suma de los elementos del vector
	 * 
	 * Explicaci�n: Para este ejercicio necesitamos de la posici�n para poder desplazarnos 
	 * por el array, por lo que reccurrimos a un m�todo auxiliar que admita dos par�metros: el vector
	 * y un int.
	 */
	public static int SumaVector(int[] v){
		if(v.length == 0){//excepci�n
			return 0;
		}
		return AuxSumaVector(v, v.length-1);//llamada al m�todo auxiliar para que podamos manejar posiciones
	}
	/**
	 * M�todo auxiliar AuxSumaVector:
	 * @param v vector a tratar
	 * @param pos guarda una posici�n
	 * @return la suma de dos elementos en dos posiciones adyacente
	 */
	private static int AuxSumaVector (int[] v, int pos){
		if (pos == 0){//caso base
		    return v [pos]; // devuelvo la pos actual
		}else{
		    return AuxSumaVector(v,pos-1) + v [pos]; //llamada recursiva del elemeto actual + el anterior
	    }
	}
	
	/**
	 * Ejercicio 7: Mayor de los elementos de un vector
	 * @param v vector a tratar
	 * @return el mayor de los elementos que contiene un vector
	 * 
	 * Anotaci�n: La llamada recursiva se realiza dentro del if para ahorrar lineas
	 * de c�digo aunque se puede utilizar una variable auxiliar si lo prefires.
	 * 
	 * Apartado extra: si te fijas (y puedes comprobarlo) con cambiar el > por un < obtendr�as
	 * un m�todo que te calcula el MENOR. 
	 */
public static int MayorVector(int[] v){
		
		return AuxMayorVector(v, v.length-1);//llamada al m�todo auxiliar para que podamos manejar posiciones
	}

	private static int AuxMayorVector (int[] v, int pos){
		if (pos == 0){//Caso base
			return v [pos];
		}else {
			if (v[pos] > AuxMayorVector (v, pos-1)){ //llamada recursiva (�es mayor v[pos actual] que los siguientes?)
				return v[pos];
			}else{
				return AuxMayorVector (v, pos-1); // llamada recursiva (siguiente elemento)
			}
		}     
	}
		
	/**
	 * Ejercicio 8: Detectar si una String es un Pal�ndromo
	 * @param s la String a tratar
	 * @return true, si es un pal�ndromo, false si no lo es
	 * 
	 * Explicaci�n: Lo que hacemos es ir acortando la String y comprobando que
	 * los extremos son iguales hasta que nos quede una String con 1 elemento (si era de tam�o
	 * impar) o de 0 elementos (si era de tama�o par) 
	 * Ejemplos: 
	 * 
	 * 1) SALAS (S con S)		RALLAR 	(R con R)
	 * 2) ALA	(A con A)		ALLA   	(A con A)
	 * 3) L	//caso base			LL 		(L con L) --> caso base ""
	 * 
	 */
	public static boolean Palindromo (String s){
		if(s.length() == 0 || s.length() == 1){//Caso base
			return true; 
		} else {
			if(s.charAt(0) == s.charAt(s.length()-1)){//comprobamos letra con letra
				return Palindromo(s.substring(1,s.length()-1));
			} else {
				return false;//desde que no coindica, fuera
			}
		}
	}	
	/**
	 * Ejercicio 9: Dectectar si un n�mero es Capic�a
	 * @param n, el n�mero a tratar
	 * @return true si es capic�a, false si no lo es
	 * 
	 * Explicaci�n: Lo que hacemos para detectar si un n�mero es capicua o no sin 
	 * usar vectores o String es tan simple como acudir a otro m�todo de apoyo.
	 * 
	 * Lo que hacemos en el m�todo de apoyo es invertir el n�mero.
	 * 
	 * Luego lo comparamos con el orginal. Al ser capic�a nos encontraremos con que 
	 * ambos n�meros son iguales. (por la propia definici�n de capicua)
	 * 
	 * 
	 */
	public static boolean Capicua (int n){

		int result = invertir(n);//llamada al m�todo recursivo
		
		if(result == n){//�Son iguales?
	    	return true;
	    } else {
	    	return false;
	    }
	}
	/**
	 * M�todo de apoyo para invertir un n�mero. Usa un algoritmo recursivo
	 * @param n el n�mero a invertir
	 * @return el n�mero invertido
	 * 
	 * Explicaci�n: para invertir un n�mero solo debemos descomponerlo y volverlo a construir
	 * 
	 * Para ello tenemos que primero observar que un n�mero se puede descomponer
	 * de forma que, por ejemplo 123 = 100 + 20 + 3 = 1*100 + 2*10 + 3.
	 * (�como en el ejercicio 4!)
	 * Por tanto para reordenarlo es tan simple como hacer la composici�n 
	 * al rev�s; es decir, 3*100 + 2*10 + 1 = 300 + 20 + 1 = 321   
	 * 
	 * Usamos el operando %, de forma que 123 % 10 = 3 (recuerda que es RESTO)
	 * y luego lo multiplicamos por 10 ^ exp, siendo exp la posicion donde debe
	 * estar el digito.
	 * 
	 * Para no estar hayando el exp, hacemos el (10 ^ exp) en un bucle directamente. 
	 */
	 private static int invertir (int n){
		 //Parece complicado pero es m�s simple de lo que crees.
		if (n < 10){//caso base (no se puede dividir m�s por 10)
		    return n;
		}else{
			int exp = 1;
			//calculamos por cuanto hay que elevar cada digito
			//Piensa que 'n' va variando en cada itearic�n del algoritmo recursivo de forma que se va haciendo m�s peque�o cada vez.
			for (int i = 10; i < n; i = i*10){
				 exp = exp * 10; 
			}
			
		    return  (n%10)*exp + (invertir (n/10));//llamada recursiva
	    }
	 }
	 

		
		
		public static void main(String[] args) {
			
			// Estan son las pruebas, que son bastante simples por lo que son f�ciles de modificar
			// Prueba tus combinaciones y comprueba que funcionan :D
			
			
			//Si tienes hechos tus propios m�todos, puedes copiar y pegar este main,
			//aunque te en cuenta los nombres de los m�todos y los par�metros
			
			
			//Arrays para los ejercicios de vectores//
			int[] v1 = {0,10,20,40};
			int[] v2 = {1,2,3,4,5,6};
			int[] v3 = {5,5,5,5,5,5};
			int[] v4 = {2,4,6,4,2,8};
			int[] v5 = {7,13,3,8,15}; 
			int[] v6 = {-5,7,2,1,-5};
			int[] v7 = {8,-10,7,-20};
			
			
			
			
			
			System.out.println();
			System.out.println("PRUEBAS:                                       MIKI");
			System.out.println("-----------------------------------------------------");
			System.out.println("-----------------------------------------------------");
			
			
			//------------------------------------------------------------------------------------------------------------
					//--------------------------- PRRUEBAS DEL EJERCICIO 1 ---------------------------// 
			//------------------------------------------------------------------------------------------------------------
			
			
			System.out.println("\nEJERCICIO 1:      FACTORIAL\n");
			System.out.println("El factorial de  -10  es: " + factorial(-10) +  "		"  +  (factorial(-10) == 0));
			System.out.println("El factorial de  -5   es: " + factorial(-5)  +  "		"  +  (factorial(-5)  == 0));
			System.out.println("El factorial de   0   es: " + factorial(0)   +  "		"  +  (factorial(0)   == 1));
			System.out.println("El factorial de   1   es: " + factorial(1)   +  "		"  +  (factorial(1)   == 1));
			System.out.println("El factorial de   2   es: " + factorial(2)   +  "		"  +  (factorial(2)   == 2));
			System.out.println("El factorial de   3   es: " + factorial(3)   +  "		"  +  (factorial(3)   == 6));
			System.out.println("El factorial de   4   es: " + factorial(4)   +  "		"  +  (factorial(4)   == 24));
			System.out.println("El factorial de   5   es: " + factorial(5)   +  "		"  +  (factorial(5)   == 120));
			System.out.println("El factorial de   6   es: " + factorial(6)   +  "		"  +  (factorial(6)   == 720));
			System.out.println("El factorial de   7   es: " + factorial(7)   +  "		"  +  (factorial(7)   == 5040));
			System.out.println("El factorial de   8   es: " + factorial(8)   +  "		"  +  (factorial(8)   == 40320));
			System.out.println("El factorial de   9   es: " + factorial(9)   +  "	"  +  (factorial(9)   == 362880));
			System.out.println("El factorial de  10   es: " + factorial(10)  +  "	"  +  (factorial(10)  == 3628800));
			System.out.println("El factorial de  15   es: " + factorial(15)  +  "	"  +  (factorial(15)  == 2004310016));
			
			System.out.println("\n=====================================================");
			
			
			//------------------------------------------------------------------------------------------------------------
					//--------------------------- PRRUEBAS DEL EJERCICIO 2 ---------------------------// 
			//------------------------------------------------------------------------------------------------------------
			
			
			System.out.println("\nEJERCICIO 2:      FIBONACI\n");
			System.out.println("La serie de fibonaci de  -5  terminos es: " + Fibonacci(-5)  +  "	"  +  (Fibonacci(-5) ==  0));
			System.out.println("La serie de fibonaci de  0  terminos  es: " + Fibonacci(0)   +  "	"  +  (Fibonacci(0)  ==  0));
			System.out.println("La serie de fibonaci de  1  terminos  es: " + Fibonacci(1)   +  "	"  +  (Fibonacci(1)  ==  1));
			System.out.println("La serie de fibonaci de  2  terminos  es: " + Fibonacci(2)   +  "	"  +  (Fibonacci(2)  ==  1));
			System.out.println("La serie de fibonaci de  3  terminos  es: " + Fibonacci(3)   +  "	"  +  (Fibonacci(3)  ==  2));
			System.out.println("La serie de fibonaci de  4  terminos  es: " + Fibonacci(4)   +  "	"  +  (Fibonacci(4)  ==  3));
			System.out.println("La serie de fibonaci de  5  terminos  es: " + Fibonacci(5)   +  "	"  +  (Fibonacci(5)  ==  5));
			System.out.println("La serie de fibonaci de  6  terminos  es: " + Fibonacci(6)   +  "	"  +  (Fibonacci(6)  ==  8));
			System.out.println("La serie de fibonaci de  7  terminos  es: " + Fibonacci(7)   +  "	"  +  (Fibonacci(7)  ==  13));
			System.out.println("La serie de fibonaci de  8  terminos  es: " + Fibonacci(8)   +  "	"  +  (Fibonacci(8)  ==  21));
			System.out.println("La serie de fibonaci de  9  terminos  es: " + Fibonacci(9)   +  "	"  +  (Fibonacci(9)  ==  34));
			System.out.println("La serie de fibonaci de  10  terminos es: " + Fibonacci(10)  +  "	"  +  (Fibonacci(10) ==  55));
			System.out.println("La serie de fibonaci de  15  terminos es: " + Fibonacci(15)  +  "	"  +  (Fibonacci(15) ==  610));

			System.out.println("\n=====================================================");
			
			
			//------------------------------------------------------------------------------------------------------------
					//--------------------------- PRRUEBAS DEL EJERCICIO 3 ---------------------------// 
			//------------------------------------------------------------------------------------------------------------
			
			
			System.out.println("\nEJERCICIO 3:      MCD\n");
			System.out.println("El MCD de 50    y  0    es: " + MCD(50,0)     +  "	"  +  (MCD(50,0)     ==   50));
			System.out.println("El MCD de 0     y  50   es: " + MCD(0,50)     +  "	"  +  (MCD(0,50)     ==   50));
			System.out.println("El MCD de 50    y  50   es: " + MCD(50,50)    +  "	"  +  (MCD(50,50)    ==   50));
			System.out.println("El MCD de 1024  y  729  es: " + MCD(1024,729) +  "	"  +  (MCD(1024,729) ==   1));
			System.out.println("El MCD de 42    y  97   es: " + MCD(42,97)    +  "	"  +  (MCD(42,97)    ==   1));
			System.out.println("El MCD de 102   y  36   es: " + MCD(102,36)   +  "	"  +  (MCD(102,36)   ==   6));
			System.out.println("El MCD de -88   y  484  es: " + MCD(-88,484)  +  "	"  +  (MCD(-88,484)  ==   44));
			System.out.println("El MCD de 30    y  105  es: " + MCD(30,105)   +  "	"  +  (MCD(30,105)   ==   15));
			System.out.println("El MCD de 180   y  150  es: " + MCD(180,150)  +  "	"  +  (MCD(180,150)  ==   30));
			
			System.out.println("\n=====================================================");
			
			
			//------------------------------------------------------------------------------------------------------------
					//--------------------------- PRRUEBAS DEL EJERCICIO 4 ---------------------------// 
			//------------------------------------------------------------------------------------------------------------
			
			
			System.out.println("\nEJERCICIO 4:      SUMATORIO\n");
			System.out.println("La suma de los digitos del n�mero  0  es: "     +  Sumatorio(0)       +  "		"  +  (Sumatorio(0)    ==   0));
			System.out.println("La suma de los digitos del n�mero  1  es: "     +  Sumatorio(1)       +  "		"  +  (Sumatorio(1)    ==   1));
			System.out.println("La suma de los digitos del n�mero  12   es: "   +  Sumatorio(12)      +  "		"  +  (Sumatorio(12)    ==   3));
			System.out.println("La suma de los digitos del n�mero  36   es: "   +  Sumatorio(36)      +  "		"  +  (Sumatorio(36)    ==   9));
			System.out.println("La suma de los digitos del n�mero  555  es: "   +  Sumatorio(555)     +  "		"  +  (Sumatorio(555)    ==   15));
			System.out.println("La suma de los digitos del n�mero  123  es: "   +  Sumatorio(123)     +  "		"  +  (Sumatorio(123)    ==   6));
			System.out.println("La suma de los digitos del n�mero  512  es: "   +  Sumatorio(512)     +  "		"  +  (Sumatorio(512)    ==   8));
			System.out.println("La suma de los digitos del n�mero -1564  es: "  +  Sumatorio(-1564)   +  "		"  +  (Sumatorio(-1564)    ==   16));
			System.out.println("La suma de los digitos del n�mero -9852  es: "  +  Sumatorio(-9852)   +  "		"  +  (Sumatorio(-9852)    ==   24));
			System.out.println("La suma de los digitos del n�mero  123456789  es: " + Sumatorio(123456789)   +  "	"  +  (Sumatorio(123456789)    ==   45));

			System.out.println("\n=====================================================");
			
			
			//------------------------------------------------------------------------------------------------------------
					//--------------------------- PRRUEBAS DEL EJERCICIO 5 ---------------------------//
			//------------------------------------------------------------------------------------------------------------
			
			
			System.out.println("\nEJERCICIO 5:      BINARIO\n");
			System.out.println("El n�mero  0      en binario es: " + Binario(0)       +  "		"  +  (Binario(0).equals("0")));
			System.out.println("El n�mero  1      en binario es: " + Binario(1)       +  "		"  +  (Binario(1).equals("1")));
			System.out.println("El n�mero  -5     en binario es: " + Binario(-5)      +  "		"  +  (Binario(-5).equals("0")));
			System.out.println("El n�mero  46     en binario es: " + Binario(46)      +  "		"  +  (Binario(46).equals("101110")));
			System.out.println("El n�mero  102    en binario es: " + Binario(102)     +  "	"  +  (Binario(102).equals("1100110")));
			System.out.println("El n�mero  4096   en binario es: " + Binario(4096)    +  "	"  +  (Binario(4096).equals("1000000000000")));
			System.out.println("El n�mero  13896  en binario es: " + Binario(13896)   +  "	"  +  (Binario(13896).equals("11011001001000")));

			System.out.println("\n=====================================================");
			
			
			//------------------------------------------------------------------------------------------------------------
					//--------------------------- PRRUEBAS DEL EJERCICIO 6 ---------------------------//
			//------------------------------------------------------------------------------------------------------------
			
			
			System.out.println("\nEJERCICIO 6:      SumaVector\n"); 
			System.out.println("La suma de los elementos del vector [0,10,20,40]  es: "  +  SumaVector(v1)   +  "	"  +  (SumaVector(v1) == 70)); 
			System.out.println("La suma de los elementos del vector [1,2,3,4,5,6] es: "  +  SumaVector(v2)   +  "	"  +  (SumaVector(v2) == 21)); 
			System.out.println("La suma de los elementos del vector [5,5,5,5,5,5] es: "  +  SumaVector(v3)   +  "	"  +  (SumaVector(v3) == 30)); 
			System.out.println("La suma de los elementos del vector [2,4,6,4,2,8] es: "  +  SumaVector(v4)   +  "	"  +  (SumaVector(v4) == 26)); 
			System.out.println("La suma de los elementos del vector [7,13,3,8,15] es: "  +  SumaVector(v5)   +  "	"  +  (SumaVector(v5) == 46)); 
			System.out.println("La suma de los elementos del vector [-5,7,2,1,-5] es: "  +  SumaVector(v6)   +  "		"  +  (SumaVector(v6) == 0)); 
			System.out.println("La suma de los elementos del vector [8,-10,7,-20] es: "  +  SumaVector(v7)   +  "	"  +  (SumaVector(v7) == -15)); 
			

			System.out.println("\n=====================================================");
			
			
			//------------------------------------------------------------------------------------------------------------
					//--------------------------- PRRUEBAS DEL EJERCICIO 7 ---------------------------//
			//------------------------------------------------------------------------------------------------------------
			
			
			System.out.println("\nEJERCICIO 7:      MayorVector\n");
			System.out.println("El mayor elemento del vector [0,10,20,40]  es: " + MayorVector(v1)  +  "	"  +  (MayorVector(v1) == 40));
			System.out.println("El mayor elemento del vector [1,2,3,4,5,6] es: " + MayorVector(v2)  +  "	"  +  (MayorVector(v2) == 6));
			System.out.println("El mayor elemento del vector [5,5,5,5,5,5] es: " + MayorVector(v3)  +  "	"  +  (MayorVector(v3) == 5));
			System.out.println("El mayor elemento del vector [2,4,6,4,2,8] es: " + MayorVector(v4)  +  "	"  +  (MayorVector(v4) == 8));
			System.out.println("El mayor elemento del vector [7,13,3,8,15] es: " + MayorVector(v5)  +  "	"  +  (MayorVector(v5) == 15));
			System.out.println("El mayor elemento del vector [-5,7,2,1,-5] es: " + MayorVector(v6)  +  "	"  +  (MayorVector(v6) == 7));
			System.out.println("El mayor elemento del vector [8,-10,7,-20] es: " + MayorVector(v7)  +  "	"  +  (MayorVector(v7) == 8));

			System.out.println("\n=====================================================");
			
			
			//------------------------------------------------------------------------------------------------------------
					//--------------------------- PRRUEBAS DEL EJERCICIO 8 ---------------------------// 
					//nota: ojo con las mayusculas y espacios si quieres a�adir m�s pruebas
			//------------------------------------------------------------------------------------------------------------
			
		
			System.out.println("\nEJERCICIO 8:      Palindromo\n");
			System.out.println("La palabra vacia es un palindromo: " + Palindromo(""));
			System.out.println("La palabra  \"alla\"     es un palindromo: " + Palindromo("alla"));
			System.out.println("La palabra  \"erre\"     es un palindromo: " + Palindromo("erre"));
			System.out.println("La palabra  \"selles\"     es un palindromo: " + Palindromo("selles"));
			System.out.println("La palabra  \"avivar\"     es un palindromo: " + Palindromo("avivar"));//false
			System.out.println("La palabra  \"erigire\"    es un palindromo: " + Palindromo("erigire"));
			System.out.println("La palabra  \"ara�aras\"   es un palindromo: " + Palindromo("ara�aras"));//false
			System.out.println("La palabra  \"afromorfa\"  es un palindromo: " + Palindromo("afromorfa"));
			System.out.println("La palabra  \"reconocer\"  es un palindromo: " + Palindromo("reconocer"));
			System.out.println("La palabra  \"sometemos\"  es un palindromo: " + Palindromo("sometemos"));
			System.out.println("La palabra  \"abracadacarba\" es un palindromo: " + Palindromo("abracadacarba"));
			System.out.println();
			System.out.println("La frase   \"yo de todo te doy\"      es un palindromo: " + Palindromo("yodetodotedoy"));
			System.out.println("La frase   \"alli ves sevilla\"       es un palindromo: " + Palindromo("allivessevilla"));
			System.out.println("La frase   \"atar a la rata\"         es un palindromo: " + Palindromo("ataralarata"));
			System.out.println("La frase   \"ella te dara detalles\"  es un palindromo: " + Palindromo("ellatedaradetalles"));//fasle
			

			System.out.println("\n=====================================================");
			
			
			//------------------------------------------------------------------------------------------------------------
					//--------------------------- PRRUEBAS DEL EJERCICIO 9 ---------------------------//
			//------------------------------------------------------------------------------------------------------------
			
			
			System.out.println("\nEJERCICIO 9:      Capicua\n");
			System.out.println("El n�mero   0        es capicua: " + Capicua(0));
			System.out.println("El n�mero   48       es capicua: " + Capicua(48));
			System.out.println("El n�mero   33       es capicua: " + Capicua(33));
			System.out.println("El n�mero   98       es capicua: " + Capicua(98));
			System.out.println("El n�mero   222      es capicua: " + Capicua(222));
			System.out.println("El n�mero   282      es capicua: " + Capicua(282));
			System.out.println("El n�mero   589      es capicua: " + Capicua(589));
			System.out.println("El n�mero  -182      es capicua: " + Capicua(-182));
			System.out.println("El n�mero  -222      es capicua: " + Capicua(-222));
			System.out.println("El n�mero  -484      es capicua: " + Capicua(-484));
			System.out.println("El n�mero   1111     es capicua: " + Capicua(1111));
			System.out.println("El n�mero   4848     es capicua: " + Capicua(4848));
			System.out.println("El n�mero   1001     es capicua: " + Capicua(1001));
			System.out.println("El n�mero   5666     es capicua: " + Capicua(5666));
			System.out.println("El n�mero   1260     es capicua: " + Capicua(1260));
			System.out.println("El n�mero   6446     es capicua: " + Capicua(6446));
			System.out.println("El n�mero   8425248  es capicua: " + Capicua(8425248));
			
		}
}
