package ejercicio1;

/**
 * (ábreme)
 * @author miki (Miguel Ángel Berciano Rodríguez)
 *  Estos son ejercicios del tema 1: "La Clase String"
 *  
 * Ejercicio de la clase String: 
 * Te propongo que hagas ingeniería inversa e intentes desarrollar los métodos de la clase String
 * a tu manera, de forma que realicen lo mismo que los métodos originales. 
 * 
 * Es decir, si tenemos que desarrollar el método CharAt() que tiene por definicion: 
 *  "El método charAt se le manda una posición y devuelve el caracter en esa posción del la String" 
 *  	Ejemplo: 
 *  		s = "Hola" 
 *  			 0123
 *  
 *  		s.charAt(3) = 'a'
 *   
 * Hay que desarrollar un método que haga exactamente lo dicho. 
 * 
 * Abajo tienes una plantilla, aunque recuerda que eres libre de realizar el ejercicio como a ti
 * te convenga. (¡Ojo con el main luego!)
 * 
 * Nota: el objetivo es que entiendas como funcionan los métodos de la clase String y que los vayas
 * utilizando.
 * Por ejemplo, mientras estás desarrollando el método IndexOf() nada te impide que utilices otro método
 * como el charAt() (de hecho es recomendable). Pero en el caso de que esté, por ejemplo, desarrollando el método
 * substring(), no utilices substring() en el código para resolverlo, porque si no, no estarías haciendo nada.
 * 
 * Métodos de la clase String a desarrollar:
 * 
 * IndexOf(), LastIndexOf()
 * trim(),substring()
 * 
 * Deberás consultar la teoría para saber que hace cada método
 * 
 * NOTA: obviamente no están todos porque: 
 *  1) serían demasiados.
 *  2) eso acarrearía más pruebas.
 *  3) algunos son complicados de definir u otros muy sencillos.
 * 
 * Eso sí, si quieres desarrollar alguno, eres libre de intentarlo, ¡pero recuerda que no hay pruebas!:
 * Métodos Extras que te propongo: 
 * 
 * Concact(),Split() [Dificultad fácil]
 * ToUpperCase(),ToLowerCase(),[Dificultad normal] (recuerda UNICODE)
 * Replace(),ReplaceAll() [Dificultad dificil]
 *
 */
public class StringImpostor {

	//Métodos modificados//
	
	/**
	 * Desarrolla el método Indice que realiza la misma función que el método IndexOf() de la clase String
	 *  
	 * @param s: la String donde buscar
	 * @param c: es la letra a buscar.
	 * @param n: posicion desde donde buscar
	 * 
	 * @return la 1º posicion del carcater 'c' a partir de n si lo encuentra. Si no, -1.
	 * 
	 */
	public static int Indice (String s, char c, int n){
		return -1;
	}
	
	/**
	 * Método de LastIndexOf()
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
	 * Método trim()
	 * 
	 * @param s: es la String a tratar
	 * 
	 * @return la String sin espacios al princpio y al final
	 */
	public static String SinSangria(String s){
		return "";
	}
	
	/**
	 * Método SubString()
	 * 
	 * @param s: la String a "cortar"
	 * Nota: ¡ LAS STRING SON ESTÁTICAS!
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

	 * @author miki (Miguel Ángel Berciano Rodríguez)
	 * 
	 * Este es el main para las pruebas. 
	 * Puedes añadir todas las pruebas que quieras, pero evita cambiar las que
	 * ya están diseñadas. 
	 * 
	 */
	public static void main (String[] arg){
	
			String s0 = ""; //String vacia (la usaremos para todos los ejercicios)
			//De esta forma dará error si no hemos manejado esta excepción 
			
			
			//=============================================================================//
			  //=========================== EJERCICIO 1 =================================//
			//=============================================================================//
			
			//String//
			
			String in1 = "Hola ¿que tal? ¡soy una String grande! AAAAAAAAAAA";

			
			System.out.println("PRUEBAS DEL EJERCICIO 1: IndexOf() ");
			System.out.println("Busqueda en una String vacia: " + Indice(s0,'a', 0));//Excepción
			System.out.println("\nSTRING:     \"" +in1 + "\""); //Mostramos la String por pantalla
			System.out.println("Posiciones: |01234567890123456789012345678901234567890123456789|\n");
			//Pruebas//
			
			System.out.print("\nLa primera 'a' está en la pos: " + Indice(in1,'a', 0));//Resultado 
			System.out.println(";"+(Indice(in1,'a', 0)==(3)));//Si es correcto o no
			
			System.out.print("La primera 'a' despues de la pos 15 está en la pos: " + Indice(in1,'a', 15));//Resultado 
			System.out.println(";"+(Indice(in1,'a', 15)==(22)));//Si es correcto o no
			
			System.out.print("La primera 'a' despues de la pos 35 está en la pos: " + Indice(in1,'a', 35));//Resultado 
			System.out.println(";"+(Indice(in1,'a', 35)==(-1)));//Si es correcto o no
			
			
			//=============================================================================//
			//=========================== EJERCICIO 2 ====================================//
			//=============================================================================//
	
			System.out.println("___________________________________________________________");
			System.out.println("PRUEBAS DEL EJERCICIO 2: LastIndexOf() ");
			
			System.out.println("busqueda en una String vacia: " + UltimoIndice(s0,'a', 0));//Excepción
			
			//Pruebas//
			System.out.print("\n\nLa ultima 'A' está en la pos: " + UltimoIndice(in1,'A',in1.length()));//Resultado 
			System.out.println(";"+ (UltimoIndice(in1,'A',in1.length())==in1.length()-1));//Si es correcto o no
			
			System.out.print("La ultima 'A' antes de la pos 40 está en la pos: " + UltimoIndice(in1,'A',40));//Resultado 
			System.out.println(";"+ (UltimoIndice(in1,'A',40)==39));//Si es correcto o no
			
			System.out.print("La ultima 'A' antes de la pos 30 está en la pos: " + UltimoIndice(in1,'A',30));//Resultado 
			System.out.println(";"+ (UltimoIndice(in1,'A',-1)==-1));//Si es correcto o no
			
			
			
			//=============================================================================//
			//=========================== EJERCICIO 3 ====================================//
			//=============================================================================//
	
			System.out.println("___________________________________________________________");
			System.out.println("PRUEBAS DEL EJERCICIO 3: trim() ");
			
			System.out.print("String vacia: " + SinSangria(s0));//Excepción
			System.out.println(SinSangria(s0).isEmpty());
			
			System.out.print("String solo de espacios: " + SinSangria("              "));//Excepción
			if(SinSangria("              ").isEmpty()){//Si es correcto o no
				System.out.println(true);
			} else {
				System.out.println(SinSangria("              ") + false);
			}
			
			System.out.print("String solo de un espacio: " + SinSangria(" "));//Excepción
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
			//Aqui están los resultados esperados de las pruebas
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
				System.out.println(";"+false + ", debería ser: \"Hola\" ");
			} else {
				System.out.println("; true");
			}
			
			
			System.out.print("\""+CortarString(c1,4,9)+"\"");//Resultado
			if(CortarString(c1,4,9).equals(" mund")==false){//Si es correcto o no
				System.out.println(";"+false + ", debería ser: \" mund\" ");
			} else {
				System.out.println(";"+ true);
			}
			
			System.out.print("\""+CortarString(c2,9,16)+"\"");//Resultado
			if(CortarString(c2,9,16).equals("MENSAJE")==false){//Si es correcto o no
				System.out.println(";"+false + ", debería ser: \"MENSAJE\" ");
			} else {
				System.out.println(";"+ true);
			}
		}
}



