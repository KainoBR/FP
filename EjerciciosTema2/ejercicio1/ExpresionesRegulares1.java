package ejercicio1;
//importamos el Pattern y el Matcher para poder ejecutarlos
import java.util.regex.Pattern; 
import java.util.regex.Matcher;
/**
 * (ábreme)
 * @author: miki
 * 
 * Ejercicios de Expresiones Regulares
 * Estos son los ejercicios del tema 2: Expresiones Regulares.
 * 
 * Abajo tienes el enunciado del ejercicio1 con sus 3 apartados más una pequeña plantilla del método a utilizar. 
 * Tambien trae un poquito de Teoría por lo que me he extendido un poco para dejar todo claro.
 * Además tienes un Main con múltiples ejemplos a utilizar.
 * ¡Ojo! Las pruebas tan solo muestran en pantalla el resultado, no te dicen si están bien o no. 
 * Esto lo podras comprobar tu viendo lo que se muestra en consola.
 * 
 * 
 * 
 */
public class ExpresionesRegulares1 {
	/*
	 * Las siguientes Strings se trata de un conjunto de TOKENS para trabajar las Expresiones Regulares.
	 * 
	 * Un token es una combinación CONCRETA de símbolos. 
	 * En este caso el Token es tal que:
	 * 
	 * 	3 letras mayúsculas
	 * 	un guión
	 * 	3 dígitos
	 *  un guión
	 *  3 letras minúsculas
	 *  
	 * Para este ejercicio un TOKEN VÁLIDO será aquel que:
	 *  
	 *  Las 3 letras mayúsculas son MENORES que 'G'.
	 *  Los 3 dígitos MAYORES O IGUALES que 6.
	 *  Las 3 letras minúsculas MAYORES O IGUALES que 'k'.
	 * 
	 * Los tokens estarán separados por espacios
	 * 
	 * 
	 * Realizar el ejercicio propuesto con el uso de Expresiones regulares
	 * 
	 * 	a) Desarrollar el método "BuscarPatron" que identifique si los tokens creados son Válidos o No
	 * y que imprima por pantalla los tokens validos
	 *	(probar cada token por separado)
	 * 
	 * 	b) Implementar un contador que cuente cuantos tokens validos hay en total y lo muestre en pantalla 
	 * 
	 * 	c) Implementar 3 Strings que almacenen: (SOLO DE LOS TOKENS Validos) la 1º, el grupo de letras Mayúsculas, la 2º, el grupo
	 * de las letras minúsculas, y la 3º, el grupo de los digitos y mostralas por pantalla. 
	 * Nota: separar por espacios.
	 * 
	 * 
	 * Para implementar el apartado b y c es tan sencillo como crear una String con el resultado e imprimirla (Con un System.out.print) 
	 * o sumarla en la String res al retornala (si no has entendido esto ultimo consulta el ExpresionesRegularesResuelto)
	 * //TODOS ESTOS EJERCICIOS ESTÁN RESUELTOS EN OTRA PÁGINA//
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
	 * Puedes añadir todas las pruebas que quieras, pero evita cambiar las que
	 * ya están diseñadas. 
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
		
		//Las pruebas están hechas de forma que sean muy claras y fáciles de modificar//
		//¡Ojo! Las pruebas tan solo muestran en pantalla el resultado, no te dicen si están bien
		
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
		
		
		String res = "";//String que utilizaremos para recoger el resultado de los métodos
		//e imprimirlos de forma más cómoda
		
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
