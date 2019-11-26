package ejercicio1;
/**
 * (ábreme)
 * @author miki
 * Ejercicios de Recursividad: Estos son los ejercicios del tema 3:
 * recursividad.
 * 
 * Abajo tienes una pequeña plantilla de cada ejercicio (solo la declaración
 * del método). Ya está implementado el main con las pruebas, sin embargo,
 * para este tema, el main solo imprime los diferentes resultados, no
 * comprueban si están bien o no. Esto es porque son muchas pruebas y encima
 * fáciles de ver a simple vista si van bien o no, por lo que me he
 * decantado de hacerlo de esta forma, más compacta y cómoda tanto para mí
 * como para ti.
 * 
 * Igualmente tienes en otra página los métodos ya resueltos de forma que
 * puedes comparar allí. Cada ejercicio se puede resolver de múltiples
 * formas, no lo olvides. Ninguna es mejor que otra.
 * 
 */
public class Recursividad {
	//1)
	//Desarrolle un método que calcule el factorial de un número de forma recursiva
	public static int factorial (int n){
		return 0;
	}
	
	//2)
	//Desarrolle un método que calcule el termino 'n' de la serie de fibonaci de forma recursiva
	public static int Fibonacci (int n){
		return 0;
	}
	
	//3)
	//Desarrolle un método que calcule el MCD de dos números de forma recursiva
	public static int MCD (int a, int b){
		return 0;
	}
	
	//4)
	//Desarrolle un método que calcule la suma de los dígitos de un número 'n' de forma recursiva
	public static int Sumatorio (int n){
		return 0;
	}
	
	
	//5)
	//Desarrolle un método que convierta un número 'n' a binario de forma recursiva
	public static String Binario(int n){
		return "0";
	}
	
	
	//------------------------------------------------------------------------------------------------------------
	//NOTA: AQUI LA COSA SE COMPLICA.
	//Consejo: recuerda que puedes usar submétodos//método auxiliares 
	//------------------------------------------------------------------------------------------------------------
	
	
	//6)
	//Desarrolle un método que sume los elementos de un vector de forma recursiva
	public static int SumaVector (int[] v){
		return 0;
	}
	
	//7)
	//Desarrolle un método que calcule mayor elemento presente en un vector de forma recursiva
	//Extra: realizar cambios en el método realizado para que calcule el menor. (es una actividad extra, no se verá en el main)
	public static int MayorVector (int[] v){
		return 0;
	}
	
	
	//8)
	//Desarrolle un método que identifique cuando la String pasada por parámetro es o no un palíndromo de forma recursiva.
	//La String serán palabras o frases, y en el caso que sean frases, NO habrá espacios de por medio (ejemplo: yodetodotedoy)
	//Nota: Palíndromo = que se lee de igual forma de izquierda a derecha que de derecha a izquierda. Ejemplo: reconocer, ana, oso
	//Pista: En las pruebas solo hay 3 String que no son palíndromos. 
	public static boolean Palindromo (String s){
		return false;
	}
	
	
	//9)
	//Desarrolle un método que identifique cuando el número pasado por parámetro es o no capicua de forma recursiva.
	//Nota: Capicua = que se lee de igual forma de izquierda a derecha que de derecha a izquierda. Ejemplo: 111,6446,2,252,12321
	//NO VALE USAR STRINGS NI VECTORES NI NADA QUE NO SEA INT
	public static boolean Capicua (int n){
		return false;
	}
	
	
	
	//=============================================================================//
	//============================== MAIN =======================================//
	//=============================================================================//


	
	
	public static void main(String[] args) {
		
		// Estan son las pruebas, que son bastante simples por lo que son fáciles de modificar
		// Prueba tus combinaciones y comprueba que funcionan :D
		
		
		//Si tienes hechos tus propios métodos, puedes copiar y pegar este main,
		//aunque te en cuenta los nombres de los métodos y los parámetros
		
		
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
		System.out.println("La suma de los digitos del número  0  es: "     +  Sumatorio(0)       +  "		"  +  (Sumatorio(0)    ==   0));
		System.out.println("La suma de los digitos del número  1  es: "     +  Sumatorio(1)       +  "		"  +  (Sumatorio(1)    ==   1));
		System.out.println("La suma de los digitos del número  12   es: "   +  Sumatorio(12)      +  "		"  +  (Sumatorio(12)    ==   3));
		System.out.println("La suma de los digitos del número  36   es: "   +  Sumatorio(36)      +  "		"  +  (Sumatorio(36)    ==   9));
		System.out.println("La suma de los digitos del número  555  es: "   +  Sumatorio(555)     +  "		"  +  (Sumatorio(555)    ==   15));
		System.out.println("La suma de los digitos del número  123  es: "   +  Sumatorio(123)     +  "		"  +  (Sumatorio(123)    ==   6));
		System.out.println("La suma de los digitos del número  512  es: "   +  Sumatorio(512)     +  "		"  +  (Sumatorio(512)    ==   8));
		System.out.println("La suma de los digitos del número -1564  es: "  +  Sumatorio(-1564)   +  "		"  +  (Sumatorio(-1564)    ==   16));
		System.out.println("La suma de los digitos del número -9852  es: "  +  Sumatorio(-9852)   +  "		"  +  (Sumatorio(-9852)    ==   24));
		System.out.println("La suma de los digitos del número  123456789  es: " + Sumatorio(123456789)   +  "	"  +  (Sumatorio(123456789)    ==   45));

		System.out.println("\n=====================================================");
		
		
		//------------------------------------------------------------------------------------------------------------
				//--------------------------- PRRUEBAS DEL EJERCICIO 5 ---------------------------//
		//------------------------------------------------------------------------------------------------------------
		
		
		System.out.println("\nEJERCICIO 5:      BINARIO\n");
		System.out.println("El número  0      en binario es: " + Binario(0)       +  "		"  +  (Binario(0).equals("0")));
		System.out.println("El número  1      en binario es: " + Binario(1)       +  "		"  +  (Binario(1).equals("1")));
		System.out.println("El número  -5     en binario es: " + Binario(-5)      +  "		"  +  (Binario(-5).equals("0")));
		System.out.println("El número  46     en binario es: " + Binario(46)      +  "		"  +  (Binario(46).equals("101110")));
		System.out.println("El número  102    en binario es: " + Binario(102)     +  "	"  +  (Binario(102).equals("1100110")));
		System.out.println("El número  4096   en binario es: " + Binario(4096)    +  "	"  +  (Binario(4096).equals("1000000000000")));
		System.out.println("El número  13896  en binario es: " + Binario(13896)   +  "	"  +  (Binario(13896).equals("11011001001000")));

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
				//nota: ojo con las mayusculas y espacios si quieres añadir más pruebas
		//------------------------------------------------------------------------------------------------------------
		
	
		System.out.println("\nEJERCICIO 8:      Palindromo\n");
		System.out.println("La palabra vacia es un palindromo: " + Palindromo(""));
		System.out.println("La palabra  \"alla\"     es un palindromo: " + Palindromo("alla"));
		System.out.println("La palabra  \"erre\"     es un palindromo: " + Palindromo("erre"));
		System.out.println("La palabra  \"selles\"     es un palindromo: " + Palindromo("selles"));
		System.out.println("La palabra  \"avivar\"     es un palindromo: " + Palindromo("avivar"));//false
		System.out.println("La palabra  \"erigire\"    es un palindromo: " + Palindromo("erigire"));
		System.out.println("La palabra  \"arañaras\"   es un palindromo: " + Palindromo("arañaras"));//false
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
		System.out.println("El número   0        es capicua: " + Capicua(0));
		System.out.println("El número   48       es capicua: " + Capicua(48));
		System.out.println("El número   33       es capicua: " + Capicua(33));
		System.out.println("El número   98       es capicua: " + Capicua(98));
		System.out.println("El número   222      es capicua: " + Capicua(222));
		System.out.println("El número   282      es capicua: " + Capicua(282));
		System.out.println("El número   589      es capicua: " + Capicua(589));
		System.out.println("El número  -182      es capicua: " + Capicua(-182));
		System.out.println("El número  -222      es capicua: " + Capicua(-222));
		System.out.println("El número  -484      es capicua: " + Capicua(-484));
		System.out.println("El número   1111     es capicua: " + Capicua(1111));
		System.out.println("El número   4848     es capicua: " + Capicua(4848));
		System.out.println("El número   1001     es capicua: " + Capicua(1001));
		System.out.println("El número   5666     es capicua: " + Capicua(5666));
		System.out.println("El número   1260     es capicua: " + Capicua(1260));
		System.out.println("El número   6446     es capicua: " + Capicua(6446));
		System.out.println("El número   8425248  es capicua: " + Capicua(8425248));
		
	}
}
