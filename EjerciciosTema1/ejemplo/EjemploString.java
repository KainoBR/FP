package ejemplo;


import java.util.*;

public class EjemploString {
	/**
	 * (�breme)
	 * @author miki (Miguel �ngel Berciano Rodr�guez)
	 * Ejemplo del Tema 1 de Fundamentos de la Programaci�n: "La clase String"
	 * En esta p�gina tienes la teor�a sobre la clase String adem�s de algunos ejemplos. 
	 * Te recomiendo que ejecutes y vayas leyendo los comentarios, el c�digo y el resultado mostrado en
	 * la consola. Igualmente, en el banco de apuntes podr�s encontrar esta teor�a explicada en formato
	 * PDF.
	 * 
	 * Para no saturar la consola, he puesto que cada ciertos comandos se pare y espere hasta que pulses
	 * si continuar o no.
	 * 
	 * Nota: En este tema se da por entendido que sabes los conceptos de variables, llamadas a m�todos,
	 * par�metros y retorno.
	 */
	public static void main(String[] arg){
		Scanner teclado = new Scanner(System.in);//Habilitar el uso del teclado
				
		//Para declarar una String, se crea de la misma manera que cuando se declaraban las dem�s
		//variables en java: String nombre = valor;
		//Las String se escriben entre DOBLES comillas ("hola") y su valor por defecto es NO tener
		//caracteres ("") ==> se dice que la String est� vacia (tama�o 0)
		
		String ejemplo = "hola";//Hemos declarado una String llamada ejemplo que contiene la frase "hola"
		System.out.println("String 'ejemplo' = \"" + ejemplo + "\"\n"); //imprimimos "hola" por pantalla 
		//(el \n es para que haga un salto de linea)
		/**
		 * La clase String ya est� definida en la Biblioteca de java y con esta trae
		 * una variedad de m�todos que veremos a continuaci�n. 
		 */
		//Para llamar a los m�todos de una clase utilizaremos el punto --> '.' 
		//De forma que si queremos utilizar un m�todo definido ya en la clase String
		//Lo invocaremos mediante: String.NombreM�todo(par�metros);
		
		//Nota: recuerda que los m�todos devuelven algo por lo que deber�s guardar el resultado.
		//(A menos que sea void)
		
		//En estos ejemplos lo he hecho lo m�s simple y claro posible sin optimizaci�n alguna para que
		//puedas seguir el c�digo sin problema alguno
		
		//Empezaremos con m�todos b�sicos
		
		/**
		 * M�todo length() 
		 * @return: tama�o de la String => N�mero de caracteres que contiene la String.
		 * (�Nota: los caracteres son n�meros, letras, s�mbolos e incluso espacios!)
		 * Se podr�a decir que es todo lo que hay entre las dos comillas ("") que conforman la String.
		 */
		System.out.println("\n----------M�todo .length()----------\n");
		int tam = ejemplo.length(); 
		System.out.println("M�todo .length(): ejemplo.length()\n >> resultado:  " + tam +  "\n "
				+ "\nEl tama�o de la String es de " +  tam +" caracteres\n" );//Imprimo el resultado
		
		//(Dato: El tama�o es un valor de tipo int que no podr� ser inferior a 0) 
		
		//------------------------------------------------------------------------//
		   //------------------------------------------------------------------//
		//------------------------------------------------------------------------//
		System.out.println("\n----------M�todo .concat()----------\n");

		/**
		 * M�todo concat(String s)
		 * 
		 * @paran s: String a la que concatenar
		 * 
		 * @return Una String resultado de concatenar la 1� String con la pasada por par�metro. 
		 * (Nota: no es lo mismo String1.concat(String2) que String2.concat(String1)
		 */
		String frase = " mundo, �que tal?";//Creo otra String 
		System.out.println("String 'frase' = \"" + frase +"\"\n");//La muestro por pantalla
		
		
		int tam2 = frase.length(); //Obtengo el tama�o de la segunda String
		System.out.println("M�todo .length(): frase.length()\n >> resultado:  " + tam2 +  "\n");//Imprimo el resultado
		
		frase = ejemplo.concat(frase);//Concateno "hola" con " mundo, �que tal?"
		//�Fijate que he sobreescrito "frase"! Ahora cuando la imprima no ser� " mundo, �que tal? sino "hola mundo, �que tal?"
		System.out.println("M�todo .concat(): ejemplo.concat(frase)\n >> resultado: \"" + frase +  "\"\n" );//Imprimo el resultado
		
		System.out.println("String 'frase' = \"" + frase + "\"\n");//Imprimo la frase actual
		
		//�Fijate que ahora el tama�o ha cambiado!
		tam2 = frase.length(); //Hallo el tama�o
		System.out.println("M�todo .length(): frase.length()\n >> resultado:  " + tam2 +  "\n\n");//Imprimo el resultado
		
		//------------------------------------------------------------------------//
		   //------------------------------------------------------------------//
		//------------------------------------------------------------------------//
			//Se para el programa//
		System.out.println("Pulse \"s\" para continuar\n  (recuerda clicar en la consola para introducir el caracter)\n");
		String s = teclado.nextLine();
		if(s.equals("s") || s.equals("S")){
			
			//Continuaci�n del programa//
		System.out.println("\n\n\nSeguimos\n\n");
		

		//------------------------------------------------------------------------//
		   //------------------------------------------------------------------//
		//------------------------------------------------------------------------//
		System.out.println("----------M�todo .charAt()----------");
		
		System.out.println("String 'frase' = \"" + frase + "\"");//Imprimo la frase
		System.out.println("Posiciones:       0123456789...\n");//Imprimo una guia debajo de la String
				
		/**
		 * M�todo charAt(int)
		 * 
		 * @param la posici�n donde buscar
		 * 
		 * @return devuelve el caracter en la posici�n indicada.
		 * �La posici�n debe estar entre 0 y el tama�o de la string, si no dar� error!
		 * (Dato: El resultado se devuelve en forma de un caracter (char))
		 */
		char c = frase.charAt(0); //Hallo el caracter de la posici�n CERO de la String
		System.out.println("M�todo .charAt(0) = '" + c +"'");//Imprimo el resultado
	
		char c2 = frase.charAt(5); //Hallo el caracter de la posici�n CINCO de la String
		System.out.println("M�todo .charAt(5) = '" + c2 +"'");//Imprimo el resultado
		
		char c3 = frase.charAt(11); //Hallo el caracter de la posici�n ONCE de la String
		System.out.println("M�todo .charAt(11) = '" + c3 +"'" + "\n");//Imprimo el resultado
		//�Por qu� en el �ltimo no imprime "nada"? �Hay alg�n fallo?
		
		//------------------------------------------------------------------------//
		   //------------------------------------------------------------------//
		//------------------------------------------------------------------------//
		System.out.println("----------M�todo .indexOf()----------");
		System.out.println("String 'frase' = \"" + frase + "\"");//Imprimo la frase
		System.out.println("Posiciones:       0123456789...\n");//Imprimo una guia debajo de la String
		
		
		/**
		 * M�todo indexOf(char c)
		 * 
		 * @param c: caracter a buscar
		 * 
		 * @return la posicion de la PRIMERA aparici�n del caracter pasado por par�metro 
		 * En caso de no encontrarlo devolver� -1
		 */
		
		int pos = frase.indexOf('o');//Hallo la posici�n de la primera 'o' de la String
		System.out.println("M�todo .indexOf('o') = " +  pos);//Imprimo el resultado
		
		int pos2 = frase.indexOf('t');//Hallo la posici�n de la primera 't' de la String
		System.out.println("M�todo .indexOf('t') = " +  pos2 + "\n");//Imprimo el resultado
		
		 // Sin embargo, existe una varienta del indexOf(), f�jate: 
		System.out.println("Variante del indexOf(char,int) \n");
		
		
		/** 
		 * M�todo indexOf(char c, int i)
		 * 
		 * @param c: el caracter a buscar
		 * @param i: la posici�n a partir de la cual buscar.
		 * 
		 * @return la posicion de la PRIMERA aparici�n del caracter pasado por el primer par�metro a partir 
		 * de la posici�n pasado por el segundo par�metro
		 */
		pos = frase.indexOf('o',2);//Hallo la posici�n de la primera 'o' de la String a partir de la posici�n '2'
		System.out.println("M�todo .indexOf('o',2) = " +  pos);//Imprimo el resultado. 
		//�Es igual al anterior? �Por qu�? 
		
		pos2 = frase.indexOf('t',4);//Hallo la posici�n de la primera 't' de la String a partir de la posici�n '4'
		System.out.println("M�todo .indexOf('t',4) = " +  pos2+ "\n");//Imprimo el resultado.
		//�Es igual al anterior? �Por qu�? 
		
		//------------------------------------------------------------------------//
		   //------------------------------------------------------------------//
		//------------------------------------------------------------------------//

		System.out.println("----------M�todo lastIndexOf()----------");
		System.out.println("String 'frase' = \"" + frase + "\"");//Imprimo la frase
		System.out.println("Posiciones:       0123456789...");//Imprimo una guia debajo de la String
		
		
		/**
		 * M�todo lastIndexOf(char c)
		 * @param c: caracter a buscar
		 * @return la posicion de la �LTIMA aparici�n del caracter pasado por par�metro 
		 */
		
		int lpos = frase.lastIndexOf('o');//Hallo la posici�n de la �ltima 'o' de la String
		System.out.println("\nM�todo lastIndexOf('o') = " +  lpos);//Imprimo el resultado. 
		//�Coincide con alg�n resultado anterior? �Por qu�?
		
		int lpos2 = frase.lastIndexOf('t');//Hallo la posici�n de la �ltima 't' de la String
		System.out.println("M�todo lastIndexOf('t') = " +  lpos2 + "\n");//Imprimo el resultado 
		//�Coincide con alg�n resultado anterior? �Por qu�?
		
		 // Sin embargo, existe una varienta del indexOf(), f�jate: 
		System.out.println("Variante del lastIndexOf(char,int) \n");
		
		
		/**
		 * M�todo lasIndexOf(char,int)
		 * Devuelve la posicion de la �LTIMA aparici�n del caracter pasado por el primer 
		 * par�metro 
		 * 
		 */
		
		lpos = frase.lastIndexOf('o',5);//Hallo la posici�n de la �ltima 'o' de la String antes de la posici�n '5'
		System.out.println("M�todo lastIndexOf('o',5) = " +  lpos);//Imprimo el resultado �Coincide con alguno anterior? �Por qu�?
		
		lpos2 = frase.lastIndexOf('t',8);//Hallo la posici�n de la �ltima 't' de la String antes de la posici�n '8'
		System.out.println("M�todo lastIndexOf('t',8) = " +  lpos2 + "\n");//Imprimo el resultado �Coincide con alguno anterior? �Por qu�? 
		
		//------------------------------------------------------------------------//
		   //------------------------------------------------------------------//
		//------------------------------------------------------------------------//
		
			//Se para el programa//
		System.out.println("Pulse \"s\" para continuar\n  (recuerda clicar en la consola para introducir el caracter)\n");
		s = teclado.nextLine();
		if(s.equals("s") || s.equals("S")){
			//Continuaci�n del programa//
			System.out.println("\n\n\nSeguimos\n\n");
			
		//------------------------------------------------------------------------//
		   //------------------------------------------------------------------//
		//------------------------------------------------------------------------//
		System.out.println("----------M�todo toUpperCase()----------");
		//Ahora que hemos visto que se pueden obtener los datos que contiene una String, vamos
		//a trabajar en como modificar estos datos
		
		
		/***
		 * M�todo toUpperCase()
		 * 
		 * @return la String con todos los caracteres en may�sculas.
		 */
		System.out.println("String 'frase' = \"" + frase + "\"\n");//Imprimo la frase
		String FRASE = frase.toUpperCase();//Convertimos la frase a may�sculas
		System.out.println("frase.toUpperCase(): \"" + FRASE + "\"\n"
				+ " hemos pasado a may�sculas\n");
		
		System.out.println("----------M�todo toLowerCase()----------");
		/**
		 * M�todo toLowerCase()
		 * 
		 * @return la String con todos los caracteres en min�sculas.
		 */
			
		FRASE = FRASE.toLowerCase();//Convertimos la frase a may�sculas
		System.out.println("FRASE.toLowerCase(): \"" + FRASE + "\"\n"
				+ " hemos pasado a min�sculas\n");
		
		//------------------------------------------------------------------------//
		   //------------------------------------------------------------------//
		//------------------------------------------------------------------------//
		
		/**
		 * M�todo trim()
		 * 
		 * @return la String sin espacios al principio ni al final
		 */
		System.out.println("----------M�todo .trim()----------");
		frase = "        " + frase + "        ";
		System.out.println("String 'frase' = \"" + frase + "\"\n");//Imprimo la frase
		frase= frase.trim();
		System.out.println("M�todo .trim() = \"" + frase + "\"\n");
		
		//------------------------------------------------------------------------//
		   //------------------------------------------------------------------//
		//------------------------------------------------------------------------//
		
		/**
		 * M�todo substring(int pos1, int pos 2)
		 * 
		 * @param pos1 posici�n desde la que parte
		 * @param pos2 posicion final 
		 * 
		 * @return un fragmento de la String desde pos1 hasta pos2-1
		 * Nota: si NO a�adimos el 2� par�metro, substring toma su valor por defecto (length()) 
		 */
		
		System.out.println("----------M�todo .substring()----------");
		
		/*El m�todo substring lo que hace es eliminar fragmentos de String. 
		 * Sin embargo, debemos verlo de forma que: "lo que est� entre las dos posiciones
		 * indicadas es con lo que nos quedamos y el resto se elimina.
		 * 
		 * Dato: LAS STRING SON INMUTABLES. esto quiere decir que al hacer el substring,
		 * el concat, y m�s m�todos que "modifiquen" a la String, lo que estamos haciendo
		 * es creando OTRA String.
		 * 
		 * java autom�ticamente elmina la String original y la sustituye por la modificada
		 */
		System.out.println("String 'frase' = \"" + frase + "\"");//Imprimo la frase
		System.out.println("Posiciones:       0....56789...");//Imprimo una guia debajo de la String
		System.out.println("El tama�o de la String es de " + frase.length() + " caracteres\n");

		//M�todo substring con solo 1 par�metro
		System.out.println("M�todo .substring(5) = \"" + frase.substring(5) + "\"");
		//fijate que hemos eliminado todo lo anterior a la posici�n 5
		System.out.println("Posiciones:             0123456789...");//Imprimo una guia debajo de la String
		//�El tama�o ha cambiado?
		System.out.println("El tama�o de la String es de " + (frase.substring(5)).length() + " caracteres\n");
		
		//M�todo substring con 2 par�metros (desde, hasta-1)
		System.out.println("M�todo .substring(5,10) = \"" + frase.substring(5,10) + "\"");
		//fijate que hemos eliminado todo lo que hab�a antes del 5 y despu�s del 10 (10 incluido, que es la ',')
		System.out.println("Posiciones:                01234   5(tama�o)");//Imprimo una guia debajo de la String
		//�El tama�o ha cambiado?
		System.out.println("El tama�o de la String es de " + (frase.substring(5,10)).length() + " caracteres\n");
		
		
		//------------------------------------------------------------------------//
		   //------------------------------------------------------------------//
		//------------------------------------------------------------------------//
		
		/**
		 * M�todo split(String separador)
		 * @param separador: Expresi�n por el cual se va a trozear la String 
		 * 
		 * @return un Array de Strings en los que cada elemento son trozos de String entre
		 * un separador y el siguiente. 
		 */
		System.out.println("----------M�todo .split()----------");

		System.out.println("M�todo .split(\" \"): ");
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
			
			//Continuaci�n del programa//
		System.out.println("\n\n\nSeguimos\n\n");
		

		//------------------------------------------------------------------------//
		   //------------------------------------------------------------------//
		//------------------------------------------------------------------------//
		
			//Durante todo este rato hemos trabajado usando una String base, pero
			//Por lo general muchas veces no encontraremos con varias String
			//Es por ello que existen una serie de m�todos que sirven para comparar
			//Strings entre ellas y obtener datos �tiles.
		
		
		/**
		 * M�todo compareTo(String s)
		 * @param s: la String con la que comparar
		 * 
		 * @return la diferencia en peso n�merico de la 1� String con respecto a la pasada por par�metro.
		 * La comparaci�n se basa en el valor Unicode de cada car�cter en las cadenas. 
		 * 
		 * �compareTo devuelve 0 si son exactamente iguales!
		 * 
		 *  Si dos cadenas son diferentes, entonces o bien tienen caracteres diferentes en alg�n �ndice 
		 *  siendo este �ndice v�lido para ambas cadenas, o sus longitudes son diferentes, o ambos casos.
		 *  
		 *  Si tienen caracteres diferentes en una o m�s posiciones de �ndice, se comparar� con el �ndice
		 *  m�s peque�o, por lo que compareTo devuelve la diferencia de los dos valores de caracteres
		 *  en dicha posicion.
		 */
		
		//Esta extensa explicaci�n, se ve m�s clara con los ejemplos.

		frase = "hola";
		String comparar = "holi";
		
		System.out.println("----------M�todo .compareTo()----------");
		//Imprimimos ambas frases
		System.out.println("String 'frase' = \"" + frase + "\"");
		System.out.println("String 'comparar' = \"" + comparar + "\"");

		System.out.println("\nVamos a comparar \"" + frase + "\" con...");
		
		System.out.println("\nComparaci�n con Strings del MISMO tama�o");
		
		//comparaci�n consigo misma (dos String IGUALES): da 0
		System.out.println("\nM�todo .compareTo(\"" + frase + "\"): " + frase.compareTo(frase));
		
		//comparaci�n con otra String DEL MISMO TAMA�O. Difieren solo en el �ltimo caracter
		System.out.println("M�todo .compareTo(\"" + comparar + "\"): " + frase.compareTo(comparar));
		//�Por qu� da -8? ==> Porque la diferencia de 'a' entre 'i' es de 8. Piensalo de esta forma
		//Suponiendo que 'a' == 1, 'i' est� en la 9� posici�n del alfabeto       (abcdefghi...)
		// Por lo que 9 - 1 = 8. Como estamos comparando al reves, sale negativo (123456789...)
		
		
		//ahora vamos a ver que ocurre cuando comparamos con distintos tama�os:
		System.out.println("\nComparaci�n de Strings de DISTINTOS tama�os");
		comparar = "ho";//hemos quitado 2 carcateres
		//comparaci�n con otra String con tama�o MENOR pero NO DIFIEREN en carcacteres
		System.out.println("\nM�todo .compareTo(\"" + comparar + "\"): " + frase.compareTo(comparar));
		

		comparar = "hola   ";//a�adimos 3 espacios!
		//comparaci�n con otra String con tama�o MAYOR pero NO DIFIEREN en carcacteres
		System.out.println("M�todo .compareTo(\"" + comparar + "\"): " + frase.compareTo(comparar));
		
		//�Fijate que el resultado es la diferencia de los tama�os! Esto es porque NO difieren en caracteres
		
		comparar = "hal";
		//Comparaci�n con otra String con tama�o MENOR y DIFIEREN en caracteres
		System.out.println("M�todo .compareTo(\"" + comparar + "\"): " + frase.compareTo(comparar));
		//El valor obtenido es con respecto a la diferencia entre la 'a' y la 'o' (que es el primer
		//carcater donde difiere con la otra String.
		
		//En defenitiva: el compareTo compara dos String en funci�n del orden alfab�tico sin importar el tama�o
		//El tama�o solo tiene relevancia cuando las Strings son IGUALES (Su diferencia est� en el n� de espacios) 
		
		
		//------------------------------------------------------------------------//
		   //------------------------------------------------------------------//
		//------------------------------------------------------------------------//
		

		/**
		 * M�todo equals(String s)
		 * 
		 * @param s: String a comparar
		 *
		 * @return true si las dos String son IGUALES, false, si no lo son. 
		 * Nota. Dos String se consideran iguales sin tienen EL MISMO TAMA�O y LOS MISMOS CARACTERES 
		 * en la misma posici�n
		 * 
		 * Dato: Cuando un compareTo() da 0 significa que si hacemos un equals() dar�a true.
		 * �Ojo! compareTo() y equals() NO es lo mismo. compareTo() devuelve un int, equals() un boolean
		 */
		comparar = "holi";
		
		System.out.println("\n----------M�todo .equals()----------");
		//Imprimimos ambas frases
		System.out.println("String 'frase' = \"" + frase + "\"");
		System.out.println("String 'comparar' = \"" + comparar + "\"");
		
		System.out.println("\nVamos a comparar \"" + frase + "\" con...");
		
		//comparamos frase CONSIGO MISMA (dar� true porque son iguales)
		System.out.println("M�todo .equals(\"" + frase + "\"): " + frase.equals(frase));
		//comparamos frase con otra String (dar� false porque son distintas)
		System.out.println("M�todo .equals(\"" + comparar + "\"): " + frase.equals(comparar));
		
		
		//------------------------------------------------------------------------//
		   //------------------------------------------------------------------//
		//------------------------------------------------------------------------//
		
		/**
		 * M�todo contains(String s)
		 * 
		 * @param s: String que buscamos
		 * 
		 * @return true, si la String pasada por par�metro est� CONTENIDA en la String a buscar,
		 * false si no la ha encontrado.
		 * 
		 * Nota: Una String est� contenida en otra si, solo si, TODOS sus caracteres est�n en alg�n trozo 
		 * de la String donde buscar en el mismo orden.
		 */
		
		String buscar = "la";
		System.out.println("\n----------M�todo .contains()----------");
		//Imprimimos ambas frases
		System.out.println("String 'frase' = \"" + frase + "\"");
		System.out.println("String 'comparar' = \"" + comparar + "\"");
		
		System.out.println("\nVamos a BUSCAR EN \"" + frase + "\" a...");
		//�Fijate que estamos buscando en la String "hola"!
		
		//�est� "la" contenida en "hola"?
		System.out.println("M�todo .contains(\"" + buscar + "\"): " + frase.contains(buscar));
		//Si: "ho |la|" <--
		buscar = "hola"; //�est� "hola" contenida en "hola"?
		System.out.println("M�todo .contains(\"" + buscar + "\"): " + frase.contains(buscar));
		//Si: "|hola|" <--
		buscar = "hla"; //�est� "hla" contenida en "hola"?
		System.out.println("M�todo .contains(\"" + buscar + "\"): " + frase.contains(buscar));
		//No ==> �hay una 'o' de por medio! Si la String fuera "hola |hla|" si ser�a true
		buscar = "hola "; //est� "hola " contenida en "hola"? 
		System.out.println("M�todo .contains(\"" + buscar + "\"): " + frase.contains(buscar));
		//No, �de hecho la String "hola " es m�s grande! F�jate que al rev�s si ser�a correcto.
		
				}
			}
		}
				
		System.out.println("\n===============FIN DEL PROGRAMA===============");
		teclado.close();

	}
}