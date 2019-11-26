package ejercicio1;
/**
 * (ábreme)
 * @author miki (Miguel Ángel Berciano Rodríguez)
 * Aquí está resuelto el ejercicio de "ingeniería inversa" de la clase String.
 * Está implementado con el main, por lo que al darle al ejecutar podrás comprobar que funcionan 
 * correctamente para lo que se ha propuesto este ejercicio. 
 * Es una forma, de miles, de resolverlo.
 *
 *
 */

public class StringImpostorResuelto {
	
	/**
	 * Método de IndexOf(): debe devolver el indice donde se encuentra la primera aparición
	 * del caracter suministrado por parámetro.
	 * 
	 * @param s: la String donde buscar
	 * @param c: es la letra a buscar.
	 * @param n: posicion desde donde buscar (por defecto n = 0)
	 * 
	 * @return la 1º posicion del carcater 'c' a partir de n
	 * 
	 */
	public static int Indice (String s, char c, int n){
		if(n < 0){//Excepción (posición no valida) 
			return -1;
		}
		//recorremos la String hasta el final
		for(int i = n; i < s.length(); i ++){
			//utilizamos el método charAt() para comparar los carcteres
			if(s.charAt(i) == c){//Si lo encontramos
				return i; //directamente retornamos la posición y acaba el programa
			} 
		}
		return -1;//si no hemos encontrado el caracter devolvemos -1
	}
	
	/**
	 * Método de LastIndexOf(): debe devolver el indice donde se encuentra la ultima aparición
	 * del caracter suministrado por parámetro.
	 * 
	 * @param s: String donde buscar
	 * @param c: es la letra a buscar.
	 * @param m: posicion de partida (por defecto m = m.length())
	 * 
	 * @return la ultima posicion del carcater 'c' a partir del valor m
	 */
	public static int UltimoIndice (String s, char c, int m){
		if(m > s.length()){//Excepción (posición no valida)
			return -1;
		}
		//recorremos la desde el final String hasta el principio
		for(int i = m-1; i >= 0; i --){//usamos m-1 y no m, por la definición del método de LastIndexOf()
			if(s.charAt(i) == c){//Si encuentra el caracter
				return i;//retornamos directamente
			}
		}
		return -1;//si no hemos encontrado el caracter devolvemos -1
	}
	
	/**
	 * Método trim(): debe devoler la String sin espacios al principio y al final.
	 * ¡Los espacios intermedios se respetan!
	 * 
	 * @param s: es la String
	 * @return la String sin espacios al princpio y al final
	 */
	public static String SinSangria(String s){
		if(s.length() == 0){//Excepción (String vacia)
			return "";
		}

		//bucle que quita los espacios del principio (si los hay)
		for(int i = 0; i < s.length(); i++){
			if(s.charAt(i) != ' '){//Cuando ya no encontremos espacios, cortamos desde esa posición hasta el final
				s = s.substring(i, s.length());
				break;//salimos del bucle
			}
		}
		
		//bucle que quita los espacios del final (si los hay)
		//Ojo: ¡estamos recorriendo del final hacia el principio! (recorrido inverso)
		for(int i = s.length()-1 ; i > 0; i--){
			if(s.charAt(i) != ' '){//Cuando ya no encontremos espacios, cortamos desde esa posición hasta el principio.
				s = s.substring(0, i+1);
				break;//salimos del bucle
			}
		}
		
		//¿y si la String es solo de espacios? (no tenemos referencia para quitar)
		if(s.charAt(0) == ' '){//comprobamos si es el caso
			return "";
		}
		
		return s;//String si espacios al principio y al final
	}
	
	/**
	 * Método subString(): debe devolver un trozo de la String pasada por parámetro a partir
	 * de dos posiciones.
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
		if(a<0 || b < 0 || a > s.length() || b > s.length() || a > b){ //Excepciones (posiciones no validas)
			return "";
		}
		//Creamos una String de apoyo para guardar el resultado
		String res = "";
		
		//Recorremos la String
		for(int i = a; i < b; i++){
			//copiamos caracter a caracter la String s (la pasada por parámetro) en nuestra String de apoyo
			res += s.charAt(i);
		}
		return res;
		
	}

	// =============================================================================//
	  // ============================== MAIN =====================================//
	// =============================================================================//

	/**
	 * 
	 * @author miki (Miguel Ángel Berciano Rodríguez)
	 * 
	 *         Este es el main para las pruebas. Puedes añadir todas las pruebas
	 *         que quieras, pero evita cambiar las que ya están diseñadas.
	 * 
	 */
	
	public static void main (String[] arg){
		
		String s0 = ""; //String vacia (la usaremos para todos los ejercicios)
		//De esta forma dará error si no hemos manejado esta excepción 
		
		
		//=============================================================================//
		//=========================== EJERCICIO 1 ====================================//
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
