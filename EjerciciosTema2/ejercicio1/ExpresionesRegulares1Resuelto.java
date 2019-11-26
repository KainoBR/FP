package ejercicio1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 * (�breme)
 * @author miki
 * Ejercicio de ExpresionesRegulares 
 * Estos son los ejercicios RESUELTOS del tema 2: Expresiones Regulares.
 * El ejercicio cuenta con los 3 apartados implementados. 
 * Esta es una forma de miles de resolverlo. 
 * 
 *
 * Nota: Los apartados b y c los devolv� al final en forma de String. 
 *
 * PREGUNTAS// DUDAS SOBRE LA RESOLUCION DEL EJERCICIO: 
 * 
 * �Por qu� el Patr�n es " [A-F]{3}-[6-9]{3}-[k-z]{3} " o "\\s[A-F]{3}-[6-9]{3}-[k-z]{3}\\s" y no 
 * "[A-F]{3}-[6-9]{3}-[k-z]{3}" o "\\b[A-F]{3}-[6-9]{3}-[k-z]{3}\\b"? �Por qu� est�n esos espacios? 
 * 
 * Al usar los espacios, nos aseguramos que antes de cada token SOLO pueda haber espacios. 
 * Si no los colocamos o usamos el \\b, un token valido ser�a perfectamente @#/&AAA-666-mmm^`*+-
 * es decir, admitir�a los caracteres no alphanum�ricos (esto lo puedes comprobar f�cilmente en regexr.com)
 * Nota: en la p�gina se usa solo una \ no \\ (es decir \\s aqu� es \s all�) 
 * 
 * El replaceAll est� por una buena raz�n: al usar el \\s o " " al final del patr�n, estamos obligando que cada token tenga que tener
 * dichos espacios y si nos encontramos con este caso: 
 * 
 * 	AAA-666-kkk AAA-666-kkk (los dos son v�lidos y SOLO HAY 1 ESPACIO ENTRE ELLOS) 
 * lo que va a pasar es que el programa no va a reconocer el 2� token, dado que el unico espacio que hay entre ambos lo usa para reconocer el primero
 * (si no ha quedado muy claro te recomiendo que pruebes este tipo de cosas en la p�gina que te he comentado antes) 
 * 
 * ----------------------------------------------------------------------------------------------------------------------------------------------
 * �Si quisiera usar otro patr�n u otra forma de hacerlo diferente a la que has hecho t�, encontrar�a alguna otra soluci�n? 
 * 
 * �Por supuesto que si! La soluci�n que propongo yo es muy simple, directa y c�moda PARA MI, pero quiz�s a algunos lo del \\s o el hecho de que tengas
 * que usar el ReplaceAll les sea un lio. 
 * 
 * Por ejemplo, para los amantes del no poner espacios, una alternativas es hacer un s.split(' ') y ahora tratas con todos los trozos de String
 * (entre los que hay tokens y cosas random). Pero cuidado, si haces esto tendras que hacer un for() recorrer la String[] y aplicar el patron A CADA
 * elemento de la String[], tal que: 
 * 
 *  Pattern p = Pattern.compile("[A-F]{3}-[6-9]{3}-[k-z]{3}");
 *  String res = "";
 *  
 *  String[] listaX = s.split(' ');
 *  
 *  for(int i = 0; i < listaX.length; i ++){
 *  	Matcher m = p.macher(listaX[i]); //hay que enlazar con CADA elemento de la String
 *  
 *  	while(m.find()){
 *  		res += loquesea
 *  	}
 *  }
 *  //nota: no est� completo es para mostrar como ser�a la estructura m�s o menos.
 *  
 *  Otra opci�n es utilizar los m�todos aprendidos en el tema1 (indexOf(), substring()) y buscar o eliminar espacios
 *  
 * Y una cosa. Puede que tenga alg�n fallo que se me halla escapado, por lo que nunca te quedes satisfecho con el trabajo que tienes delante. 
 * Prueba nuevos tokens (que cumplan las condiciones), a�ade m�s complejidad a las String, etc. quiz�s encuentres alg�n fallo.
 * 
 * De todos modos estos ejercicios est�n para ayudar, nada m�s.
 * 
 */
public class ExpresionesRegulares1Resuelto {
	
	public static String BuscarPatron(String s){
		if(s.length() == 0){//Excepci�n (si nos dan una String vacia)
			return "";
		}
		
		String res = "";//inicializamos res para guardar el resultado
		
		//apartado c
		String s1 = "";//inicializamos s1 para guardar el resultado 1 (mayusculas)
		String s2 = "";//inicializamos s2 para guardar el resultado 2 (minusculas)
		String s3 = "";//inicializamos s3 para guardar el resultado 3 (digitos)
		
		//preparamos nuestra String para usar el patron adecuado (esto se hace para poder usar el \\s o " " sin que 
		//interfiera en los extremos y no se coma espacio entre tokens
		s = " " + s + " ";
		s = s.replaceAll(" ", "  ");
		
		Pattern p = Pattern.compile(" ([A-F]{3})-([6-9]{3})-([k-z]{3}) ");//nustro patr�n (\\s o un solo espacio es lo mismo)
		Matcher m = p.matcher(s);
		
		int cuenta = 0;//apartado b
		while (m.find()){ //Cada vez que encuentre
			res += m.group();//guarda el token completo
			
			s1 += m.group(1) + " ";//guarda las MAYUSCULAS
			s2 += m.group(3) + " ";//guarda las MINUSCULAS
			s3 += m.group(2) + " ";//guarda los DIGITOS
			
			cuenta++;//cada vez que suma 1 es un token v�lido encontrado.
			
		}
		
		if(res.length() == 0){//en caso de que no hayamos guardado nada, significa que no hemos encontrado nada
			return "No hay tokens validos";
		}
	
		//devolvemos el resulado en una sola String y de forma "bonita"
		return res + "\n hay " + cuenta + " tokens validos\nMAYUSCULAS: " + s1 + "\nMINUSCULAS: " + s2 + "\nDIGITOS:    " + s3;
	}
	

	//=============================================================================//
	//============================== MAIN =======================================//
	//=============================================================================//
	/**

	 * @author miki
	 * 
	 * Este es el main para las pruebas. 
	 * Puedes a�adir todas las pruebas que quieras, pero evita cambiar las que
	 * ya est�n dise�adas. 
	 * 
	 */
	public static void main(String[] arg){
		
		
		//EJEMPLOS DE TOKENS BASICOS//
		String tokenvacio = "";
		
		
		String token1 = "AAA-666-kkk"; //V
		String token2 = " AAA-666-kkk "; //V
		String token3 = "4AAA-666-kkk "; //NV
		String token4 = "@AAA-666-kkk"; //NV
		
		
		//EJEMPLOS DE TOKENS COMPUESTO//
		
		String token5 = "AAA-666-aaa ABC-456-klm"; //V NV
		String token6 = "AAA-666-aaa ABC-678-klm"; //V V
		String token7 = "AAA-666-aaab holaquetalAAA-666-kkk    @BBB-77 7-lll BBB-777-mmm"; //NV NV NV V
		
		String token8 = "AAA-666-nnn BBB-7-ooo C-888-ppp ABC-989-nmk ashzd.kash asliuzg hasuj bs   s DDD-999-ddd "
				+ "HHH-678-hii    FFFF-998-kil CBD-789-mnn ";// V //V //V //NV //V 	
		
		String token9 = "NosoyUntokenABC-678-koko     ajjdailshzdih ahsidad SSS-666-kkk #@|@#~ A A A - 8 8 8 -  k k k ,hola buenas tardes"; 
		
		String token10 = token1 + " " +token2+ " " + token3+ " " + token4+ " " + token5;
		//pruebas del apartado a) //
		
		//Las pruebas est�n hechas de forma que sean muy claras y f�ciles de modificar//
		//�Ojo! Las pruebas tan solo muestran en pantalla el resultado, no te dicen si est�n bien
		
		System.out.println("Los tokens que se van a usar son: ");
		
		System.out.println("1 \""+token1+ "\"");
		System.out.println("2 \""+token2+ "\"\n");
		
		System.out.println("3 \""+token3+ "\"");
		System.out.println("4 \""+token4+ "\"\n");
		
		System.out.println("5 \""+token5+ "\"");
		System.out.println("6 \""+token6+ "\"\n");
		
		System.out.println("7 \""+token7+ "\"");
		System.out.println("8 \""+token8+ "\"\n");
		
		System.out.println("9 \""+token9+ "\"\n");
		
		System.out.println("10 \""+token10+ "\"\n");
		
		
		String res = "";//String que utilizaremos para recoger el resultado de los m�todos
		//e imprimirlos de forma m�s c�moda
		
		System.out.println("---------------------------------------------------------------------");
		System.out.println("Resultados: ");
		
		System.out.println("token vacio: "+ BuscarPatron(tokenvacio) + "\n");
		

		res = BuscarPatron(token1);
		System.out.println("1) "+ res+ "\n");
		
		res = BuscarPatron(token2);
		System.out.println("2) "+res+ "\n");
		
		res = BuscarPatron(token3);
		System.out.println("3) "+res+ "\n");
		
		res = BuscarPatron(token4);
		System.out.println("4) "+res+ "\n");
		
		res = BuscarPatron(token5);
		System.out.println("5) "+res+ "\n");
		
		res = BuscarPatron(token6);
		System.out.println("6) " +res+ "\n");
		
		res = BuscarPatron(token7);
		System.out.println("7) "+res+ "\n");
		
		res = BuscarPatron(token8);
		System.out.println("8) "+res+ "\n");
		
		res = BuscarPatron(token9);
		System.out.println("9) "+res+ "\n");
		
		res = BuscarPatron(token10);
		System.out.println("10) "+res+ "\n");
		
	}


}
