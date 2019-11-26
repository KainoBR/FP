package ejemplo;

//NECESARIO IMPORTAR PARA PODER USAR EXPRESIONES REGULARES
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class EjemploRegex {
	/**
	 * (ábreme)
	 * @author miki (Miguel Ángel Berciano Rodríguez)
	 * Ejemplo del Tema 2 de Fundamentos de la Programación: "Expresiones Regulares"
	 * En esta página tienes parte de la teoría sobre las expresiones regulares y un ejemplo
	 * Te recomiendo que vayas leyendo los comentarios, el código y ejecutes cuando se te indique para ver el resultado mostrado en
	 * la consola. Igualmente, en el banco de apuntes podrás encontrar esta teoría explicada en formato
	 * PDF.
	 * 
	 * Nota: En este tema se da por entendido que sabes todo lo anterior dado.
	 */
	public static void main (String[] args){
		//Lo primero que debes saber es que las Expresiones regulares son lo que comúnmente 
		//conocemos como "patrones". Estos "patrones" tiene muchas utilidades y nos permite
		//realizar trabajos con Strings mucho más rápido y de forma más óptima. 
		
		//Pogamos el siguiente ejemplo: 
		//"Imaginemos que queremos hacer un programa que nos buque entre toda una larga cadena de 
		//String las palabras en las que TODAS las letras sean MAYUSCULAS"
		
		//Para hacer ese trabajo, por ejemplo, lo que haríamos sería coger la String, trocearla por espacios mediante un .split(),
		//recorrer el String[] mediante un for, a cada String[i] comprobar que cada letra es mayúscula, guardarla en una
		//String resultado"...
		
		//Sin embargo con Expresiones regulares se puede resolver en tan solo 4 lineas. 
		
		//En este apartado solo veremos declaración de expresiones regulares y como se utilizan, pero es importante
		//que sepas que existen unos "patrones específicos" que reconoce java y que es ESCENCIAL que te los aprendas.
		
		//EMPECEMOS
		//String ejemplo
		String s = " BIEN pues Esto es una String de EJmplo que  HA Sido creada con TRamPas y si Ejecutas El ProGRama verás"
				+ "quE Ha FUNCIONADO Pero LUego deberás MIrAR si Funciona CORRECTAMENTE";
		String res = ""; //String donde vamos a guardar el resultado
		//Lo primero es declarar los import: 
		    //import java.util.regex.Pattern; --> vamos a usar un Pattern
			//import java.util.regex.Matcher; --> vamos a usar un Matcher
		
		//Estos se declaran al principio del programa ANTES de la clase a utilizar.
		
		/**
		 * El pattern es el patron a utilizar. Cualquier patrón es válido por lo que el que quieras utilizar dependerá de
		 * como quieras afrontar el problema. El truco es crear uno que se parezca lo máximo posible con lo que te están
		 * pidiendo. Mientras más se distancie de eso, más código necesitará el programa para que funcione correctamente. 
		 * Un patrón se puede considerar "mejor" que otro si optimiza el código, pero eso no quiera decir que sea "mas correcto"
		 * o que los otros sean "menos correctos"
		 */
		
		//Declaramos un patrón: siguiendo el ejemplo, estamos buscando palabras que todas sus letras sean MAYUSCULAS
		Pattern p = Pattern.compile(" +[A-Z]+ +"); //Patron que busca: (espacio + Letras mayusculas (min 1) + espacio)
		
		//Pattern (<-- objeto) p (<-- nombre) = Pattern.compile(String) (<-- método que asigna una Expr. regular a un objeto Pattern)
		
		/**
		 * El matcher se puede interpetrar como el objeto que relaciona la String con el patrón. 
		 */
		Matcher m = p.matcher(s);
		
		//Matcher (<-- objeto) m (<-- nombre) = p.matcher(String) (<-- método que aplica un patron creado sobre una String y lo guarda en un Matcher)
		
		//Matcher = Trozos de una String que conforman el patron. 
		//Ej: Patron: Números || String: hola 123 que 456 tal 789 || Matcher: (123)(456)(789)
		while(m.find()){//m.find() método que devuelve true si el patrón se encuentra en la String. ==> (Si siguen habiendo Matcher)
			res += m.group().trim() + " ";//m.group()  método que devuelve los "matcher" encontrados (si los hay)
		}
		
		//EJECUTA EL CODIGO
		System.out.println(res.trim());
		
	}

}
