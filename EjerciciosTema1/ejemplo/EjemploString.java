package ejemplo;


import java.util.*;

public class EjemploString {
	/**
	 * (ábreme)
	 * @author miki (Miguel Ángel Berciano Rodríguez)
	 * Ejemplo del Tema 1 de Fundamentos de la Programación: "La clase String"
	 * En esta página tienes la teoría sobre la clase String además de algunos ejemplos. 
	 * Te recomiendo que ejecutes y vayas leyendo los comentarios, el código y el resultado mostrado en
	 * la consola. Igualmente, en el banco de apuntes podrás encontrar esta teoría explicada en formato
	 * PDF.
	 * 
	 * Para no saturar la consola, he puesto que cada ciertos comandos se pare y espere hasta que pulses
	 * si continuar o no.
	 * 
	 * Nota: En este tema se da por entendido que sabes los conceptos de variables, llamadas a métodos,
	 * parámetros y retorno.
	 */
	public static void main(String[] arg){
		Scanner teclado = new Scanner(System.in);//Habilitar el uso del teclado
				
		//Para declarar una String, se crea de la misma manera que cuando se declaraban las demás
		//variables en java: String nombre = valor;
		//Las String se escriben entre DOBLES comillas ("hola") y su valor por defecto es NO tener
		//caracteres ("") ==> se dice que la String está vacia (tamaño 0)
		
		String ejemplo = "hola";//Hemos declarado una String llamada ejemplo que contiene la frase "hola"
		System.out.println("String 'ejemplo' = \"" + ejemplo + "\"\n"); //imprimimos "hola" por pantalla 
		//(el \n es para que haga un salto de linea)
		/**
		 * La clase String ya está definida en la Biblioteca de java y con esta trae
		 * una variedad de métodos que veremos a continuación. 
		 */
		//Para llamar a los métodos de una clase utilizaremos el punto --> '.' 
		//De forma que si queremos utilizar un método definido ya en la clase String
		//Lo invocaremos mediante: String.NombreMétodo(parámetros);
		
		//Nota: recuerda que los métodos devuelven algo por lo que deberás guardar el resultado.
		//(A menos que sea void)
		
		//En estos ejemplos lo he hecho lo más simple y claro posible sin optimización alguna para que
		//puedas seguir el código sin problema alguno
		
		//Empezaremos con métodos básicos
		
		/**
		 * Método length() 
		 * @return: tamaño de la String => Número de caracteres que contiene la String.
		 * (¡Nota: los caracteres son números, letras, símbolos e incluso espacios!)
		 * Se podría decir que es todo lo que hay entre las dos comillas ("") que conforman la String.
		 */
		System.out.println("\n----------Método .length()----------\n");
		int tam = ejemplo.length(); 
		System.out.println("Método .length(): ejemplo.length()\n >> resultado:  " + tam +  "\n "
				+ "\nEl tamaño de la String es de " +  tam +" caracteres\n" );//Imprimo el resultado
		
		//(Dato: El tamaño es un valor de tipo int que no podrá ser inferior a 0) 
		
		//------------------------------------------------------------------------//
		   //------------------------------------------------------------------//
		//------------------------------------------------------------------------//
		System.out.println("\n----------Método .concat()----------\n");

		/**
		 * Método concat(String s)
		 * 
		 * @paran s: String a la que concatenar
		 * 
		 * @return Una String resultado de concatenar la 1º String con la pasada por parámetro. 
		 * (Nota: no es lo mismo String1.concat(String2) que String2.concat(String1)
		 */
		String frase = " mundo, ¿que tal?";//Creo otra String 
		System.out.println("String 'frase' = \"" + frase +"\"\n");//La muestro por pantalla
		
		
		int tam2 = frase.length(); //Obtengo el tamaño de la segunda String
		System.out.println("Método .length(): frase.length()\n >> resultado:  " + tam2 +  "\n");//Imprimo el resultado
		
		frase = ejemplo.concat(frase);//Concateno "hola" con " mundo, ¿que tal?"
		//¡Fijate que he sobreescrito "frase"! Ahora cuando la imprima no será " mundo, ¿que tal? sino "hola mundo, ¿que tal?"
		System.out.println("Método .concat(): ejemplo.concat(frase)\n >> resultado: \"" + frase +  "\"\n" );//Imprimo el resultado
		
		System.out.println("String 'frase' = \"" + frase + "\"\n");//Imprimo la frase actual
		
		//¡Fijate que ahora el tamaño ha cambiado!
		tam2 = frase.length(); //Hallo el tamaño
		System.out.println("Método .length(): frase.length()\n >> resultado:  " + tam2 +  "\n\n");//Imprimo el resultado
		
		//------------------------------------------------------------------------//
		   //------------------------------------------------------------------//
		//------------------------------------------------------------------------//
			//Se para el programa//
		System.out.println("Pulse \"s\" para continuar\n  (recuerda clicar en la consola para introducir el caracter)\n");
		String s = teclado.nextLine();
		if(s.equals("s") || s.equals("S")){
			
			//Continuación del programa//
		System.out.println("\n\n\nSeguimos\n\n");
		

		//------------------------------------------------------------------------//
		   //------------------------------------------------------------------//
		//------------------------------------------------------------------------//
		System.out.println("----------Método .charAt()----------");
		
		System.out.println("String 'frase' = \"" + frase + "\"");//Imprimo la frase
		System.out.println("Posiciones:       0123456789...\n");//Imprimo una guia debajo de la String
				
		/**
		 * Método charAt(int)
		 * 
		 * @param la posición donde buscar
		 * 
		 * @return devuelve el caracter en la posición indicada.
		 * ¡La posición debe estar entre 0 y el tamaño de la string, si no dará error!
		 * (Dato: El resultado se devuelve en forma de un caracter (char))
		 */
		char c = frase.charAt(0); //Hallo el caracter de la posición CERO de la String
		System.out.println("Método .charAt(0) = '" + c +"'");//Imprimo el resultado
	
		char c2 = frase.charAt(5); //Hallo el caracter de la posición CINCO de la String
		System.out.println("Método .charAt(5) = '" + c2 +"'");//Imprimo el resultado
		
		char c3 = frase.charAt(11); //Hallo el caracter de la posición ONCE de la String
		System.out.println("Método .charAt(11) = '" + c3 +"'" + "\n");//Imprimo el resultado
		//¿Por qué en el último no imprime "nada"? ¿Hay algún fallo?
		
		//------------------------------------------------------------------------//
		   //------------------------------------------------------------------//
		//------------------------------------------------------------------------//
		System.out.println("----------Método .indexOf()----------");
		System.out.println("String 'frase' = \"" + frase + "\"");//Imprimo la frase
		System.out.println("Posiciones:       0123456789...\n");//Imprimo una guia debajo de la String
		
		
		/**
		 * Método indexOf(char c)
		 * 
		 * @param c: caracter a buscar
		 * 
		 * @return la posicion de la PRIMERA aparición del caracter pasado por parámetro 
		 * En caso de no encontrarlo devolverá -1
		 */
		
		int pos = frase.indexOf('o');//Hallo la posición de la primera 'o' de la String
		System.out.println("Método .indexOf('o') = " +  pos);//Imprimo el resultado
		
		int pos2 = frase.indexOf('t');//Hallo la posición de la primera 't' de la String
		System.out.println("Método .indexOf('t') = " +  pos2 + "\n");//Imprimo el resultado
		
		 // Sin embargo, existe una varienta del indexOf(), fíjate: 
		System.out.println("Variante del indexOf(char,int) \n");
		
		
		/** 
		 * Método indexOf(char c, int i)
		 * 
		 * @param c: el caracter a buscar
		 * @param i: la posición a partir de la cual buscar.
		 * 
		 * @return la posicion de la PRIMERA aparición del caracter pasado por el primer parámetro a partir 
		 * de la posición pasado por el segundo parámetro
		 */
		pos = frase.indexOf('o',2);//Hallo la posición de la primera 'o' de la String a partir de la posición '2'
		System.out.println("Método .indexOf('o',2) = " +  pos);//Imprimo el resultado. 
		//¿Es igual al anterior? ¿Por qué? 
		
		pos2 = frase.indexOf('t',4);//Hallo la posición de la primera 't' de la String a partir de la posición '4'
		System.out.println("Método .indexOf('t',4) = " +  pos2+ "\n");//Imprimo el resultado.
		//¿Es igual al anterior? ¿Por qué? 
		
		//------------------------------------------------------------------------//
		   //------------------------------------------------------------------//
		//------------------------------------------------------------------------//

		System.out.println("----------Método lastIndexOf()----------");
		System.out.println("String 'frase' = \"" + frase + "\"");//Imprimo la frase
		System.out.println("Posiciones:       0123456789...");//Imprimo una guia debajo de la String
		
		
		/**
		 * Método lastIndexOf(char c)
		 * @param c: caracter a buscar
		 * @return la posicion de la ÚLTIMA aparición del caracter pasado por parámetro 
		 */
		
		int lpos = frase.lastIndexOf('o');//Hallo la posición de la última 'o' de la String
		System.out.println("\nMétodo lastIndexOf('o') = " +  lpos);//Imprimo el resultado. 
		//¿Coincide con algún resultado anterior? ¿Por qué?
		
		int lpos2 = frase.lastIndexOf('t');//Hallo la posición de la última 't' de la String
		System.out.println("Método lastIndexOf('t') = " +  lpos2 + "\n");//Imprimo el resultado 
		//¿Coincide con algún resultado anterior? ¿Por qué?
		
		 // Sin embargo, existe una varienta del indexOf(), fíjate: 
		System.out.println("Variante del lastIndexOf(char,int) \n");
		
		
		/**
		 * Método lasIndexOf(char,int)
		 * Devuelve la posicion de la ÚLTIMA aparición del caracter pasado por el primer 
		 * parámetro 
		 * 
		 */
		
		lpos = frase.lastIndexOf('o',5);//Hallo la posición de la última 'o' de la String antes de la posición '5'
		System.out.println("Método lastIndexOf('o',5) = " +  lpos);//Imprimo el resultado ¿Coincide con alguno anterior? ¿Por qué?
		
		lpos2 = frase.lastIndexOf('t',8);//Hallo la posición de la última 't' de la String antes de la posición '8'
		System.out.println("Método lastIndexOf('t',8) = " +  lpos2 + "\n");//Imprimo el resultado ¿Coincide con alguno anterior? ¿Por qué? 
		
		//------------------------------------------------------------------------//
		   //------------------------------------------------------------------//
		//------------------------------------------------------------------------//
		
			//Se para el programa//
		System.out.println("Pulse \"s\" para continuar\n  (recuerda clicar en la consola para introducir el caracter)\n");
		s = teclado.nextLine();
		if(s.equals("s") || s.equals("S")){
			//Continuación del programa//
			System.out.println("\n\n\nSeguimos\n\n");
			
		//------------------------------------------------------------------------//
		   //------------------------------------------------------------------//
		//------------------------------------------------------------------------//
		System.out.println("----------Método toUpperCase()----------");
		//Ahora que hemos visto que se pueden obtener los datos que contiene una String, vamos
		//a trabajar en como modificar estos datos
		
		
		/***
		 * Método toUpperCase()
		 * 
		 * @return la String con todos los caracteres en mayúsculas.
		 */
		System.out.println("String 'frase' = \"" + frase + "\"\n");//Imprimo la frase
		String FRASE = frase.toUpperCase();//Convertimos la frase a mayúsculas
		System.out.println("frase.toUpperCase(): \"" + FRASE + "\"\n"
				+ " hemos pasado a mayúsculas\n");
		
		System.out.println("----------Método toLowerCase()----------");
		/**
		 * Método toLowerCase()
		 * 
		 * @return la String con todos los caracteres en minúsculas.
		 */
			
		FRASE = FRASE.toLowerCase();//Convertimos la frase a mayúsculas
		System.out.println("FRASE.toLowerCase(): \"" + FRASE + "\"\n"
				+ " hemos pasado a minúsculas\n");
		
		//------------------------------------------------------------------------//
		   //------------------------------------------------------------------//
		//------------------------------------------------------------------------//
		
		/**
		 * Método trim()
		 * 
		 * @return la String sin espacios al principio ni al final
		 */
		System.out.println("----------Método .trim()----------");
		frase = "        " + frase + "        ";
		System.out.println("String 'frase' = \"" + frase + "\"\n");//Imprimo la frase
		frase= frase.trim();
		System.out.println("Método .trim() = \"" + frase + "\"\n");
		
		//------------------------------------------------------------------------//
		   //------------------------------------------------------------------//
		//------------------------------------------------------------------------//
		
		/**
		 * Método substring(int pos1, int pos 2)
		 * 
		 * @param pos1 posición desde la que parte
		 * @param pos2 posicion final 
		 * 
		 * @return un fragmento de la String desde pos1 hasta pos2-1
		 * Nota: si NO añadimos el 2º parámetro, substring toma su valor por defecto (length()) 
		 */
		
		System.out.println("----------Método .substring()----------");
		
		/*El método substring lo que hace es eliminar fragmentos de String. 
		 * Sin embargo, debemos verlo de forma que: "lo que está entre las dos posiciones
		 * indicadas es con lo que nos quedamos y el resto se elimina.
		 * 
		 * Dato: LAS STRING SON INMUTABLES. esto quiere decir que al hacer el substring,
		 * el concat, y más métodos que "modifiquen" a la String, lo que estamos haciendo
		 * es creando OTRA String.
		 * 
		 * java automáticamente elmina la String original y la sustituye por la modificada
		 */
		System.out.println("String 'frase' = \"" + frase + "\"");//Imprimo la frase
		System.out.println("Posiciones:       0....56789...");//Imprimo una guia debajo de la String
		System.out.println("El tamaño de la String es de " + frase.length() + " caracteres\n");

		//Método substring con solo 1 parámetro
		System.out.println("Método .substring(5) = \"" + frase.substring(5) + "\"");
		//fijate que hemos eliminado todo lo anterior a la posición 5
		System.out.println("Posiciones:             0123456789...");//Imprimo una guia debajo de la String
		//¿El tamaño ha cambiado?
		System.out.println("El tamaño de la String es de " + (frase.substring(5)).length() + " caracteres\n");
		
		//Método substring con 2 parámetros (desde, hasta-1)
		System.out.println("Método .substring(5,10) = \"" + frase.substring(5,10) + "\"");
		//fijate que hemos eliminado todo lo que había antes del 5 y después del 10 (10 incluido, que es la ',')
		System.out.println("Posiciones:                01234   5(tamaño)");//Imprimo una guia debajo de la String
		//¿El tamaño ha cambiado?
		System.out.println("El tamaño de la String es de " + (frase.substring(5,10)).length() + " caracteres\n");
		
		
		//------------------------------------------------------------------------//
		   //------------------------------------------------------------------//
		//------------------------------------------------------------------------//
		
		/**
		 * Método split(String separador)
		 * @param separador: Expresión por el cual se va a trozear la String 
		 * 
		 * @return un Array de Strings en los que cada elemento son trozos de String entre
		 * un separador y el siguiente. 
		 */
		System.out.println("----------Método .split()----------");

		System.out.println("Método .split(\" \"): ");
		//simplemente vamos a coger y vamos a trozear la String 'frase' con la que hemos estado
		//trabajando por espacios y mostrarla por pantalla
		String[] lista = frase.split(" ");
		//como es un Array, para acceder a sus elementos hace falta recorrerlo con un for()
		for(int i = 0; i < lista.length; i++){
			System.out.println(i +") \""+ lista[i] + "\"");
		}
		
		
		//------------------------------------------------------------------------//
		   //------------------------------------------------------------------//
		//------------------------------------------------------------------------//
			//Se para el programa//
		System.out.println("Pulse \"s\" para continuar\n  (recuerda clicar en la consola para introducir el caracter)\n");
		s = teclado.nextLine();
		if(s.equals("s") || s.equals("S")){
			
			//Continuación del programa//
		System.out.println("\n\n\nSeguimos\n\n");
		

		//------------------------------------------------------------------------//
		   //------------------------------------------------------------------//
		//------------------------------------------------------------------------//
		
			//Durante todo este rato hemos trabajado usando una String base, pero
			//Por lo general muchas veces no encontraremos con varias String
			//Es por ello que existen una serie de métodos que sirven para comparar
			//Strings entre ellas y obtener datos útiles.
		
		
		/**
		 * Método compareTo(String s)
		 * @param s: la String con la que comparar
		 * 
		 * @return la diferencia en peso númerico de la 1º String con respecto a la pasada por parámetro.
		 * La comparación se basa en el valor Unicode de cada carácter en las cadenas. 
		 * 
		 * ¡compareTo devuelve 0 si son exactamente iguales!
		 * 
		 *  Si dos cadenas son diferentes, entonces o bien tienen caracteres diferentes en algún índice 
		 *  siendo este índice válido para ambas cadenas, o sus longitudes son diferentes, o ambos casos.
		 *  
		 *  Si tienen caracteres diferentes en una o más posiciones de índice, se comparará con el índice
		 *  más pequeño, por lo que compareTo devuelve la diferencia de los dos valores de caracteres
		 *  en dicha posicion.
		 */
		
		//Esta extensa explicación, se ve más clara con los ejemplos.

		frase = "hola";
		String comparar = "holi";
		
		System.out.println("----------Método .compareTo()----------");
		//Imprimimos ambas frases
		System.out.println("String 'frase' = \"" + frase + "\"");
		System.out.println("String 'comparar' = \"" + comparar + "\"");

		System.out.println("\nVamos a comparar \"" + frase + "\" con...");
		
		System.out.println("\nComparación con Strings del MISMO tamaño");
		
		//comparación consigo misma (dos String IGUALES): da 0
		System.out.println("\nMétodo .compareTo(\"" + frase + "\"): " + frase.compareTo(frase));
		
		//comparación con otra String DEL MISMO TAMAÑO. Difieren solo en el último caracter
		System.out.println("Método .compareTo(\"" + comparar + "\"): " + frase.compareTo(comparar));
		//¿Por qué da -8? ==> Porque la diferencia de 'a' entre 'i' es de 8. Piensalo de esta forma
		//Suponiendo que 'a' == 1, 'i' está en la 9ª posición del alfabeto       (abcdefghi...)
		// Por lo que 9 - 1 = 8. Como estamos comparando al reves, sale negativo (123456789...)
		
		
		//ahora vamos a ver que ocurre cuando comparamos con distintos tamaños:
		System.out.println("\nComparación de Strings de DISTINTOS tamaños");
		comparar = "ho";//hemos quitado 2 carcateres
		//comparación con otra String con tamaño MENOR pero NO DIFIEREN en carcacteres
		System.out.println("\nMétodo .compareTo(\"" + comparar + "\"): " + frase.compareTo(comparar));
		

		comparar = "hola   ";//añadimos 3 espacios!
		//comparación con otra String con tamaño MAYOR pero NO DIFIEREN en carcacteres
		System.out.println("Método .compareTo(\"" + comparar + "\"): " + frase.compareTo(comparar));
		
		//¡Fijate que el resultado es la diferencia de los tamaños! Esto es porque NO difieren en caracteres
		
		comparar = "hal";
		//Comparación con otra String con tamaño MENOR y DIFIEREN en caracteres
		System.out.println("Método .compareTo(\"" + comparar + "\"): " + frase.compareTo(comparar));
		//El valor obtenido es con respecto a la diferencia entre la 'a' y la 'o' (que es el primer
		//carcater donde difiere con la otra String.
		
		//En defenitiva: el compareTo compara dos String en función del orden alfabético sin importar el tamaño
		//El tamaño solo tiene relevancia cuando las Strings son IGUALES (Su diferencia está en el nº de espacios) 
		
		
		//------------------------------------------------------------------------//
		   //------------------------------------------------------------------//
		//------------------------------------------------------------------------//
		

		/**
		 * Método equals(String s)
		 * 
		 * @param s: String a comparar
		 *
		 * @return true si las dos String son IGUALES, false, si no lo son. 
		 * Nota. Dos String se consideran iguales sin tienen EL MISMO TAMAÑO y LOS MISMOS CARACTERES 
		 * en la misma posición
		 * 
		 * Dato: Cuando un compareTo() da 0 significa que si hacemos un equals() daría true.
		 * ¡Ojo! compareTo() y equals() NO es lo mismo. compareTo() devuelve un int, equals() un boolean
		 */
		comparar = "holi";
		
		System.out.println("\n----------Método .equals()----------");
		//Imprimimos ambas frases
		System.out.println("String 'frase' = \"" + frase + "\"");
		System.out.println("String 'comparar' = \"" + comparar + "\"");
		
		System.out.println("\nVamos a comparar \"" + frase + "\" con...");
		
		//comparamos frase CONSIGO MISMA (dará true porque son iguales)
		System.out.println("Método .equals(\"" + frase + "\"): " + frase.equals(frase));
		//comparamos frase con otra String (dará false porque son distintas)
		System.out.println("Método .equals(\"" + comparar + "\"): " + frase.equals(comparar));
		
		
		//------------------------------------------------------------------------//
		   //------------------------------------------------------------------//
		//------------------------------------------------------------------------//
		
		/**
		 * Método contains(String s)
		 * 
		 * @param s: String que buscamos
		 * 
		 * @return true, si la String pasada por parámetro está CONTENIDA en la String a buscar,
		 * false si no la ha encontrado.
		 * 
		 * Nota: Una String está contenida en otra si, solo si, TODOS sus caracteres están en algún trozo 
		 * de la String donde buscar en el mismo orden.
		 */
		
		String buscar = "la";
		System.out.println("\n----------Método .contains()----------");
		//Imprimimos ambas frases
		System.out.println("String 'frase' = \"" + frase + "\"");
		System.out.println("String 'comparar' = \"" + comparar + "\"");
		
		System.out.println("\nVamos a BUSCAR EN \"" + frase + "\" a...");
		//¡Fijate que estamos buscando en la String "hola"!
		
		//¿está "la" contenida en "hola"?
		System.out.println("Método .contains(\"" + buscar + "\"): " + frase.contains(buscar));
		//Si: "ho |la|" <--
		buscar = "hola"; //¿está "hola" contenida en "hola"?
		System.out.println("Método .contains(\"" + buscar + "\"): " + frase.contains(buscar));
		//Si: "|hola|" <--
		buscar = "hla"; //¿está "hla" contenida en "hola"?
		System.out.println("Método .contains(\"" + buscar + "\"): " + frase.contains(buscar));
		//No ==> ¡hay una 'o' de por medio! Si la String fuera "hola |hla|" si sería true
		buscar = "hola "; //está "hola " contenida en "hola"? 
		System.out.println("Método .contains(\"" + buscar + "\"): " + frase.contains(buscar));
		//No, ¡de hecho la String "hola " es más grande! Fíjate que al revés si sería correcto.
		
				}
			}
		}
				
		System.out.println("\n===============FIN DEL PROGRAMA===============");
		teclado.close();

	}
}