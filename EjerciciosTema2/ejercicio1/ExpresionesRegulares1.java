package ejercicio1;
//importamos el Pattern y el Matcher para poder ejecutarlos
import java.util.regex.Pattern; 
import java.util.regex.Matcher;
/**
 * (�breme)
 * @author: miki
 * 
 * Ejercicios de Expresiones Regulares
 * Estos son los ejercicios del tema 2: Expresiones Regulares.
 * 
 * Abajo tienes el enunciado del ejercicio1 con sus 3 apartados m�s una peque�a plantilla del m�todo a utilizar. 
 * Tambien trae un poquito de Teor�a por lo que me he extendido un poco para dejar todo claro.
 * Adem�s tienes un Main con m�ltiples ejemplos a utilizar.
 * �Ojo! Las pruebas tan solo muestran en pantalla el resultado, no te dicen si est�n bien o no. 
 * Esto lo podras comprobar tu viendo lo que se muestra en consola.
 * 
 * 
 * 
 */
public class ExpresionesRegulares1 {
	/*
	 * Las siguientes Strings se trata de un conjunto de TOKENS para trabajar las Expresiones Regulares.
	 * 
	 * Un token es una combinaci�n CONCRETA de s�mbolos. 
	 * En este caso el Token es tal que:
	 * 
	 * 	3 letras may�sculas
	 * 	un gui�n
	 * 	3 d�gitos
	 *  un gui�n
	 *  3 letras min�sculas
	 *  
	 * Para este ejercicio un TOKEN V�LIDO ser� aquel que:
	 *  
	 *  Las 3 letras may�sculas son MENORES que 'G'.
	 *  Los 3 d�gitos MAYORES O IGUALES que 6.
	 *  Las 3 letras min�sculas MAYORES O IGUALES que 'k'.
	 * 
	 * Los tokens estar�n separados por espacios
	 * 
	 * 
	 * Realizar el ejercicio propuesto con el uso de Expresiones regulares
	 * 
	 * 	a) Desarrollar el m�todo "BuscarPatron" que identifique si los tokens creados son V�lidos o No
	 * y que imprima por pantalla los tokens validos
	 *	(probar cada token por separado)
	 * 
	 * 	b) Implementar un contador que cuente cuantos tokens validos hay en total y lo muestre en pantalla 
	 * 
	 * 	c) Implementar 3 Strings que almacenen: (SOLO DE LOS TOKENS Validos) la 1�, el grupo de letras May�sculas, la 2�, el grupo
	 * de las letras min�sculas, y la 3�, el grupo de los digitos y mostralas por pantalla. 
	 * Nota: separar por espacios.
	 * 
	 * 
	 * Para implementar el apartado b y c es tan sencillo como crear una String con el resultado e imprimirla (Con un System.out.print) 
	 * o sumarla en la String res al retornala (si no has entendido esto ultimo consulta el ExpresionesRegularesResuelto)
	 * //TODOS ESTOS EJERCICIOS EST�N RESUELTOS EN OTRA P�GINA//
	 */
	public static String BuscarPatron(String s){
		
		Pattern p = Pattern.compile("");
		Matcher m = p.matcher("");
		
		while (m.find()){
				
		}
		
		return "";
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
		System.out.println("Resultado: ");
		
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
