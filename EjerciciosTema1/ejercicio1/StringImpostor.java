package ejercicio1;

/**
 * (�breme)
 * @author miki (Miguel �ngel Berciano Rodr�guez)
 *  Estos son ejercicios del tema 1: "La Clase String"
 *  
 * Ejercicio de la clase String: 
 * Te propongo que hagas ingenier�a inversa e intentes desarrollar los m�todos de la clase String
 * a tu manera, de forma que realicen lo mismo que los m�todos originales. 
 * 
 * Es decir, si tenemos que desarrollar el m�todo CharAt() que tiene por definicion: 
 *  "El m�todo charAt se le manda una posici�n y devuelve el caracter en esa posci�n del la String" 
 *  	Ejemplo: 
 *  		s = "Hola" 
 *  			 0123
 *  
 *  		s.charAt(3) = 'a'
 *   
 * Hay que desarrollar un m�todo que haga exactamente lo dicho. 
 * 
 * Abajo tienes una plantilla, aunque recuerda que eres libre de realizar el ejercicio como a ti
 * te convenga. (�Ojo con el main luego!)
 * 
 * Nota: el objetivo es que entiendas como funcionan los m�todos de la clase String y que los vayas
 * utilizando.
 * Por ejemplo, mientras est�s desarrollando el m�todo IndexOf() nada te impide que utilices otro m�todo
 * como el charAt() (de hecho es recomendable). Pero en el caso de que est�, por ejemplo, desarrollando el m�todo
 * substring(), no utilices substring() en el c�digo para resolverlo, porque si no, no estar�as haciendo nada.
 * 
 * M�todos de la clase String a desarrollar:
 * 
 * IndexOf(), LastIndexOf()
 * trim(),substring()
 * 
 * Deber�s consultar la teor�a para saber que hace cada m�todo
 * 
 * NOTA: obviamente no est�n todos porque: 
 *  1) ser�an demasiados.
 *  2) eso acarrear�a m�s pruebas.
 *  3) algunos son complicados de definir u otros muy sencillos.
 * 
 * Eso s�, si quieres desarrollar alguno, eres libre de intentarlo, �pero recuerda que no hay pruebas!:
 * M�todos Extras que te propongo: 
 * 
 * Concact(),Split() [Dificultad f�cil]
 * ToUpperCase(),ToLowerCase(),[Dificultad normal] (recuerda UNICODE)
 * Replace(),ReplaceAll() [Dificultad dificil]
 *
 */
public class StringImpostor {

	//M�todos modificados//
	
	/**
	 * Desarrolla el m�todo Indice que realiza la misma funci�n que el m�todo IndexOf() de la clase String
	 *  
	 * @param s: la String donde buscar
	 * @param c: es la letra a buscar.
	 * @param n: posicion desde donde buscar
	 * 
	 * @return la 1� posicion del carcater 'c' a partir de n si lo encuentra. Si no, -1.
	 * 
	 */
	public static int Indice (String s, char c, int n){
		return -1;
	}
	
	/**
	 * M�todo de LastIndexOf()
	 * 
	 * @param s: String donde buscar
	 * @param m: posicion de partida 
	 * @param c: es la letra a buscar.
	 * 
	 * @return la ultima posicion del carcater 'c' a partir del valor m si lo encuentra. Si no, -1.
	 */
	public static int UltimoIndice (String s, char c, int m){
		return -1;
	}
	
	/**
	 * M�todo trim()
	 * 
	 * @param s: es la String a tratar
	 * 
	 * @return la String sin espacios al princpio y al final
	 */
	public static String SinSangria(String s){
		return "";
	}
	
	/**
	 * M�todo SubString()
	 * 
	 * @param s: la String a "cortar"
	 * Nota: � LAS STRING SON EST�TICAS!
	 * 
	 * @param a: desde
	 * @param b: hasta
	 * 
	 * @return UNA NUEVA STRING, a partir de la anterior
	 */
	public static String CortarString(String s, int a, int b){
		return "";
	}
	

	//=============================================================================//
	  //============================== MAIN =====================================//
	//=============================================================================//
	
	/**

	 * @author miki (Miguel �ngel Berciano Rodr�guez)
	 * 
	 * Este es el main para las pruebas. 
	 * Puedes a�adir todas las pruebas que quieras, pero evita cambiar las que
	 * ya est�n dise�adas. 
	 * 
	 */
	public static void main (String[] arg){
	
			String s0 = ""; //String vacia (la usaremos para todos los ejercicios)
			//De esta forma dar� error si no hemos manejado esta excepci�n 
			
			
			//=============================================================================//
			  //=========================== EJERCICIO 1 =================================//
			//=============================================================================//
			
			//String//
			
			String in1 = "Hola �que tal? �soy una String grande! AAAAAAAAAAA";

			
			System.out.println("PRUEBAS DEL EJERCICIO 1: IndexOf() ");
			System.out.println("Busqueda en una String vacia: " + Indice(s0,'a', 0));//Excepci�n
			System.out.println("\nSTRING:     \"" +in1 + "\""); //Mostramos la String por pantalla
			System.out.println("Posiciones: |01234567890123456789012345678901234567890123456789|\n");
			//Pruebas//
			
			System.out.print("\nLa primera 'a' est� en la pos: " + Indice(in1,'a', 0));//Resultado 
			System.out.println(";"+(Indice(in1,'a', 0)==(3)));//Si es correcto o no
			
			System.out.print("La primera 'a' despues de la pos 15 est� en la pos: " + Indice(in1,'a', 15));//Resultado 
			System.out.println(";"+(Indice(in1,'a', 15)==(22)));//Si es correcto o no
			
			System.out.print("La primera 'a' despues de la pos 35 est� en la pos: " + Indice(in1,'a', 35));//Resultado 
			System.out.println(";"+(Indice(in1,'a', 35)==(-1)));//Si es correcto o no
			
			
			//=============================================================================//
			//=========================== EJERCICIO 2 ====================================//
			//=============================================================================//
	
			System.out.println("___________________________________________________________");
			System.out.println("PRUEBAS DEL EJERCICIO 2: LastIndexOf() ");
			
			System.out.println("busqueda en una String vacia: " + UltimoIndice(s0,'a', 0));//Excepci�n
			
			//Pruebas//
			System.out.print("\n\nLa ultima 'A' est� en la pos: " + UltimoIndice(in1,'A',in1.length()));//Resultado 
			System.out.println(";"+ (UltimoIndice(in1,'A',in1.length())==in1.length()-1));//Si es correcto o no
			
			System.out.print("La ultima 'A' antes de la pos 40 est� en la pos: " + UltimoIndice(in1,'A',40));//Resultado 
			System.out.println(";"+ (UltimoIndice(in1,'A',40)==39));//Si es correcto o no
			
			System.out.print("La ultima 'A' antes de la pos 30 est� en la pos: " + UltimoIndice(in1,'A',30));//Resultado 
			System.out.println(";"+ (UltimoIndice(in1,'A',-1)==-1));//Si es correcto o no
			
			
			
			//=============================================================================//
			//=========================== EJERCICIO 3 ====================================//
			//=============================================================================//
	
			System.out.println("___________________________________________________________");
			System.out.println("PRUEBAS DEL EJERCICIO 3: trim() ");
			
			System.out.print("String vacia: " + SinSangria(s0));//Excepci�n
			System.out.println(SinSangria(s0).isEmpty());
			
			System.out.print("String solo de espacios: " + SinSangria("              "));//Excepci�n
			if(SinSangria("              ").isEmpty()){//Si es correcto o no
				System.out.println(true);
			} else {
				System.out.println(SinSangria("              ") + false);
			}
			
			System.out.print("String solo de un espacio: " + SinSangria(" "));//Excepci�n
			if(SinSangria(" ").isEmpty()){//Si es correcto o no
				System.out.println(true);
			} else {
				System.out.println(SinSangria(" ") + false);
			}
			
			//String//
			String esp1 = "          muchos espacios al principio";
			String esp2 = "muchos espacios al final          ";
			String esp3 = "           HOLA             ";
			String esp4 = "    TENGO         MUCHOS      ESPACIOS     ";
			
			//String resultados//
			//Aqui est�n los resultados esperados de las pruebas
			String res1 = "muchos espacios al principio";
			String res2 = "muchos espacios al final";
			String res3 = "HOLA";
			String res4 = "TENGO         MUCHOS      ESPACIOS";
			
			//Pruebas//
			System.out.println("\nSTRING S A UTILIZAR ");//Imprimimos las String
			System.out.println("|\"" +esp1+"\"|");
			System.out.println("|\"" +esp2+"\"|");
			System.out.println("|\"" +esp3+"\"|");
			System.out.println("|\"" +esp4+"\"|");
			
			System.out.println("\n");
			System.out.print("|\"" +SinSangria(esp1)+"\"|");//Resultado
			System.out.println(SinSangria(esp1).equals(res1));//Si es correcto o no
			
			System.out.print("|\"" +SinSangria(esp2)+"\"|");//Resultado
			System.out.println(SinSangria(esp2).equals(res2));//Si es correcto o no
			
			System.out.print("|\"" +SinSangria(esp3)+"\"|");//Resultado
			System.out.println(SinSangria(esp3).equals(res3));//Si es correcto o no
			
			System.out.print("|\"" +SinSangria(esp4)+"\"|");//Resultado
			System.out.println(SinSangria(esp4).equals(res4));//Si es correcto o no
			
			
			
			//=============================================================================//
			//=========================== EJERCICIO 4 ====================================//
			//=============================================================================//
	
			System.out.println("___________________________________________________________");
			System.out.println("PRUEBAS DEL EJERCICIO 4 : substring() ");
			
			//String//
			String c1 = "Hola mundo";
			String c2 = "ashdashuiMENSAJEaiosjdoaijso";
					
			System.out.println("\nSTRINGS A UTILIZAR: ");//Imprimimos las String
			System.out.println("\""+ c1 + "\"");
			System.out.println("\""+ c2 + "\"");
			
			//Pruebas//
			System.out.print("\n\""+CortarString(c1,0,4)+"\"");//Resultado
			if(CortarString(c1,0,4).equals("Hola")==false){//Si es correcto o no
				System.out.println(";"+false + ", deber�a ser: \"Hola\" ");
			} else {
				System.out.println("; true");
			}
			
			
			System.out.print("\""+CortarString(c1,4,9)+"\"");//Resultado
			if(CortarString(c1,4,9).equals(" mund")==false){//Si es correcto o no
				System.out.println(";"+false + ", deber�a ser: \" mund\" ");
			} else {
				System.out.println(";"+ true);
			}
			
			System.out.print("\""+CortarString(c2,9,16)+"\"");//Resultado
			if(CortarString(c2,9,16).equals("MENSAJE")==false){//Si es correcto o no
				System.out.println(";"+false + ", deber�a ser: \"MENSAJE\" ");
			} else {
				System.out.println(";"+ true);
			}
		}
}



