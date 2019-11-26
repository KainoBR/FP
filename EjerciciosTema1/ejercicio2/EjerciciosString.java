package ejercicio2;

/**
 * (ábreme)
 * @author miki (Miguel Ángel Berciano Rodríguez)
 *   
 * Estos son ejercicios del tema 1: "La Clase String"
 * Aquí te dejo unos cuantos ejercicios variados para entrenar el manejo de los métodos de la
 * clase String.
 * 
 * Ya está la cabecera de todos los métodos a desarrollar por lo que solo tendrás que desarrollar
 * el código para que realice lo que te indica el enunciado.
 * 
 * Una vez hallas terminado, podrás ir comprobando tus resultados ejecuntado el main de este ejercicio
 * que tiene ya una bateria de pruebas o también puedes revisar el archivo "EjerciciosStringResuelto".
 *
 * Nota: lee atentamente los enunciados, plantea el algoritmo en una hoja en sucio, 
 * cuidado con las posibles excepciones o errores y revisa tus resultados. 
 */
public class EjerciciosString {
	
	/**
	 *  Ejercicio 1: Desarrollar el método ContarLetra que, a partir del uso del método de la clase String,
	 * IndexOf(), cuente el número total de una letra presentes en una String. (¡SOLO USANDO indexOf()!)
	 * 
	 * @param s: la String donde buscar
	 * @param c: el caracter a buscar
	 * 
	 * @return el numero total de veces que aparece 'c'
	 */
	public static int ContarLetra(String s, char c) {
		return 0;
	}

	
	/**
	 *  Ejercicio 2: Desarrollar un método llamado Filtrar1 que, a partir de dos Strings, 
	 * devuelva una String que contenga todas las palabras de la 1º String que estén 
	 * compuestas por la 2º String.
	 * 
	 * @param s1: String de palabras
	 * @param s2: La palabra a utilizar
	 * 
	 * @return String con todas las palabras que contengan 's2'
	 * 
	 * Ej: 
	 * String s1: "loca poca mota casa roca bola boca fin ocarina carambola oca "
	 * String s2: "oca"
	 * 
	 *  >> resultado: "loca poca roca boca ocarina oca" (porque contienen "oca")
	 * 
	 */
	public static String Filtrar1 (String s1, String s2){
		return "";
	}
	
	
	/**
	 *   Ejercicio 3: Desarrollar un método llamado Filtrar2 que, a partir de dos Strings, 
	 * devuelva una String que contenga todas las palabras de la 1º String que EMPIECEN por  
	 * la 2º String.
	 * 
	 * @param s1: String de palabras
	 * @param s2: La palabra a utilizar
	 * 
	 * @return String con todas las palabras que empiecen por 's2'
	 * 
	 * Ej:
	 * String s1: "loca poca mota casa roca bola boca fin carambola oca"
	 * String s2: "oca"
	 * 
	 *  >> resultado: "ocarina oca" (porque empiezan por "oca")
	 * 
	 */
	public static String Filtrar2 (String s1, String s2){
		return "";
	}
	
	
	/** 
	 *  Ejercicio 4: Desarrollar un método llamado FiltrarCorreo que filtre una ristra de correos
	 * según un dominio recibido como parámetro. (los correos están separados por espacios)
	 * 
	 * @param s1: Lista de correos
	 * @param s2: el dominio (gmail, hotmail,ulpgc...)
	 * 
	 * @return Los correos validos
	 */
	public static String FiltrarCorreo (String s1, String s2){
		return "";
	}
	

	/**
	 *  Ejercicio 5: Desarrollar un método llamado FiltrarIP que filtre una ristra de IP
	 * según el segundo parámetro. (las IP están separados por espacios)
	 * La ristra resultado deberá estar compuesta por todas las IP de la primera ristra
	 * que NO contengan la segunda	
	 * 
	 * @param s1: Lista de IP
	 * @param s2: dominioIP
	 * 
	 * @return IP NO validas.
	 * 
	 */
	public static String FiltrarIP (String s1, String s2){
		return "";
	}
	
	
	/**
	 *  Ejercicio 6: Desarrollar un método llamado FiltrarFecha que filtre una ristra de fechas
	 * según el mes pasado por parámetro. (Las Fechas están separadas por espacios y todas son fechas validas)
	 * La ristra resultado deberá estar compuesta por todas las fechas de la primera ristra que
	 * NO contengan el mes. 
	 * Nota: las fechas están en formato "dd/mm/aaaa" y el mes en formato "NOMBRE"
	 * 
	 * @param s1: Lista de Fechas
	 * @param s2: Nombre del Mes a filtrar
	 * 
	 * @return Fechas sin el mes del parámetro 's2'
	 * 
	 * Ej: 
	 * 
	 * String s1: "05/10/2016 12/05/2005 04/10/2010"
	 * String s2: "OCTURBE"
	 * 
	 *  >> resultado: 12/05/2005
	 * 
	 */
	public static String FiltrarFecha (String s1, String s2){
		return "";
	}
	
	
	/**
	 * Ejercicio 7: Desarrollar un método llamado Capitalizar que capitalice todas las palabras de una String
	 * pasada por parámetro.
	 * Nota: Capitalizar es pasar la primera letra de cada palabra a Mayúscula.
	 * Importante: para este ejercicio consideramos palabra aquello que va después de un espacio.
	 * 
	 * @param s String
	 * 
	 * @return String con todas las palabras capitalizadas.
	 * 
	 *  Ej:
	 *  
	 *  String s: "buenos días, soy una String amable, ¿que tal estás?"
	 *    
	 *    >> resultado: "Buenos Días, Soy Una String Amable ¿que Tal Estás? "
	 */
	
	public static String Capitalizar(String s){
		return "";
	}
	
	
	
	/**
	 * Ejercicio 8: Desarrollar un método llamado BuscarPALABRAS que recoja en una String todas las
	 * palabras MAYUSCULAS que aparezcan en la String pasada por parámetro.
	 * Dato: palabra implica todos y cada uno de sus caracteres
	 * @param s String
	 * 
	 * @return String con todas las palabras MAYUSCULAS de la String pasada por parámetros
	 * 
	 *  Ej:
	 *  
	 *  String s: "ME PArece que VOY a irME YA"
	 *  
	 *    >> resultado: "ME VOY YA"
	 */
	
	public static String BuscarPALABRAS(String s){
		return "";
	}
	
	
	//=============================================================================//
	//============================== MAIN =======================================//
	//=============================================================================//
	/**
	 * 
	 * @author miki (Miguel Ángel Berciano Rodríguez)
	 * 
	 *  Este es el main para las pruebas. Puedes añadir todas las pruebas
	 * que quieras, pero evita cambiar las que ya están diseñadas.
	 * 
	 */
	public static void main(String[] args) {

		// STRINGS PARA LOS DIFRENTES EJERCICIOS//

		String vacia = "";// String vacia

		// EJERCICIO 1//
		String c2 = "o";
		String c3 = "ouo";
		String c4 = "o o o";
		String c5 = "Hola que tal, mira ver cuantas 'a' tengo";
		String c6 = "   Mmm Mmm Mmm no está mal    M ";

		// EJERCICIO 2 y 3 //
		String f1 = "";
		String f2 = "cas";
		String f3 = "casa casita cascos";
		String f4 = "mundo llaves cas caza cosas caos comadrejas caramelos";
		String f5 = "cocos agua caseron roncas carteras aparcas captas cascas";
		String filtro = "cas";

		String f6 = "loca poca mota casa roca bola boca fin ocarina carambola oca ";
		String filtro2 = "oca";

		// EJERCICIO 4//
		String MostrarCorreo = "CorreoEjemplo@gmail.com  Ania86@kmail.com  \nGonzalo_Rodriguez92@hotmail.com  Prueba@gmail.com "
				+ "  \nkaino.miguibr@gmail.com  DEII@ulpgc.es Juan.Gomez102@ulpgc.es \nkurukuru22@hotmail.com "
				+ " Gato@gmail.com  miguibr@hotmail.com ";
		String correo1 = "CorreoEjemplo@gmail.com  Ania86@kmail.com  Gonzalo_Rodriguez92@hotmail.com  Prueba@gmail.com "
				+ "  kaino.miguibr@gmail.com  DEII@ulpgc.es Juan.Gomez102@ulpgc.es kurukuru22@hotmail.com "
				+ " Gato@gmail.com  miguibr@hotmail.com ";

		String dominio1 = "gmail";
		String dominio2 = "hotmail";
		String dominio3 = "ulpgc";

		// EJERCICIO 5//
		String id1 = "196.168.0.1 127.123.1.0 255.230.44.1 100.168.100.1 90.168.0.1";
		String id2 = "42.168.87.177 157.386.1.0 168.105.94.1 0.154.1.68 22.01.201.6 ";

		String id = "168";

		// EJERCICIO 6//

		String fecha = "05/12/1996 22/01/2016 03/10/1956 21/12/2012 06/10/2001 " + "12/01/2005 21/10/1999";

		String NombreFecha1 = "OCTUBRE";
		String Nombrefecha2 = "DICIEMBRE";
		String NombreFecha3 = "ENERO";

		// =============================================================================//
		// ========================== EJERCICIO 1 =====================================//
		// =============================================================================//

		System.out.println("PRUEBAS DEL EJERCICIO 1: ContarLetra()");

		System.out.println("\nContar letras en una String vacia: " + ContarLetra(vacia, 'o'));

		System.out.println(
				"String: \"" + c2 + "\" tiene " + ContarLetra(c2, 'o') + " 'o'      || " + (ContarLetra(c2, 'o') == 1));
		System.out.println(
				"String: \"" + c3 + "\" tiene " + ContarLetra(c3, 'o') + " 'o'    || " + (ContarLetra(c3, 'o') == 2));
		System.out.println(
				"String: \"" + c4 + "\" tiene " + ContarLetra(c4, 'o') + " 'o'  || " + (ContarLetra(c4, 'o') == 3));
		System.out.println(
				"String: \"" + c6 + "\" tiene " + ContarLetra(c6, 'M') + " 'M'  || " + (ContarLetra(c6, 'M') == 4));
		System.out.println(
				"String: \"" + c5 + "\" tiene " + ContarLetra(c5, 'a') + " 'a'  || " + (ContarLetra(c5, 'a') == 6));

		// =============================================================================//
		// ========================== EJERCICIO 2 =====================================//
		// =============================================================================//

		System.out.println("___________________________________________________________");
		System.out.println("PRUEBAS DEL EJERCICIO 2: Filtrar1");

		System.out.println("\nFiltrar una String vacia: " + Filtrar1(f1, filtro));

		System.out.println("String: \"" + f2 + "\" \ny las palabras que tienen " + "\"" + filtro + "\" son: \""
				+ Filtrar1(f2, filtro) + "\"   || " + (Filtrar1(f2, filtro).equals("cas")));

		System.out.println("\nString: \"" + f3 + "\" \ny las palabras que tienen " + "\"" + filtro + "\" son: \""
				+ Filtrar1(f3, filtro) + "\"   || " + (Filtrar1(f3, filtro).equals("casa casita cascos")));

		System.out.println("\nString: \"" + f4 + "\" \ny las palabras que tienen " + "\"" + filtro + "\" son: \""
				+ Filtrar1(f4, filtro) + "\"   || " + (Filtrar1(f4, filtro).equals("cas")));

		System.out.println("\nString: \"" + f5 + "\" \ny las palabras que tienen " + "\"" + filtro + "\" son:  \""
				+ Filtrar1(f5, filtro) + "\"  || " + (Filtrar1(f5, filtro).equals("caseron roncas aparcas cascas")));

		System.out.println("\nString: \"" + f6 + "\" \ny las palabras que tienen " + "\"" + filtro2 + "\" son:  \""
				+ Filtrar1(f6, filtro2) + "\"  || "
				+ (Filtrar1(f6, filtro2).equals("loca poca roca boca ocarina oca")));

		// =============================================================================//
		// ========================== EJERCICIO 3 =====================================//
		// =============================================================================//
		System.out.println("___________________________________________________________");
		System.out.println("PRUEBAS DEL EJERCICIO 3: Filtrar2");

		System.out.println("\nFiltrar una String vacia: " + Filtrar2(f1, filtro));
		System.out.println("String: \"" + f2 + "\" \ny las palabras que comiencen por" + "\"" + filtro + "\" son: \""
				+ Filtrar2(f2, filtro) + "\"    || " + Filtrar2(f2, filtro).equals("cas"));

		System.out.println("\nString: \"" + f3 + "\" \ny las palabras que comiencen por " + "\"" + filtro + "\" son: \""
				+ Filtrar2(f3, filtro) + "\"   || " + Filtrar2(f3, filtro).equals("casa casita cascos"));

		System.out.println("\nString: \"" + f4 + "\" \ny las palabras que comiencen por " + "\"" + filtro + "\" son: \""
				+ Filtrar2(f4, filtro) + "\"   || " + Filtrar2(f4, filtro).equals("cas"));

		System.out.println("\nString: \"" + f5 + "\" \ny las palabras que comiencen por " + "\"" + filtro + "\" son: \""
				+ Filtrar2(f5, filtro) + "\"   || " + Filtrar2(f5, filtro).equals("caseron cascas"));

		System.out.println("\nString: \"" + f6 + "\" \ny las palabras que comiencen por " + "\"" + filtro2
				+ "\" son:  \"" + Filtrar2(f6, filtro2) + "\"  || " + (Filtrar2(f6, filtro2).equals("ocarina oca")));

		// =============================================================================//
		// ========================== EJERCICIO 4 =====================================//
		// =============================================================================//
		System.out.println("___________________________________________________________");
		System.out.println("PRUEBAS DEL EJERCICIO 4: FiltrarCorreo");

		System.out.println("\nCorreos: \"" + MostrarCorreo + "\"\n");

		System.out
				.println("Los correos con el dominio \"" + dominio3 + "\"   son: \"" + FiltrarCorreo(correo1, dominio3)
						+ "\" || " + FiltrarCorreo(correo1, dominio3).equals("DEII@ulpgc.es Juan.Gomez102@ulpgc.es"));

		System.out.println("Los correos con el dominio \"" + dominio1 + "\"   son: \""
				+ FiltrarCorreo(correo1, dominio1) + "\" || " + FiltrarCorreo(correo1, dominio1)
						.equals("CorreoEjemplo@gmail.com Prueba@gmail.com kaino.miguibr@gmail.com Gato@gmail.com"));

		System.out.println("Los correos con el dominio \"" + dominio2 + "\" son: \"" + FiltrarCorreo(correo1, dominio2)
				+ "\" || " + FiltrarCorreo(correo1, dominio2)
						.equals("Gonzalo_Rodriguez92@hotmail.com kurukuru22@hotmail.com miguibr@hotmail.com"));

		// =============================================================================//
		// ========================== EJERCICIO 5 =====================================//
		// =============================================================================//
		System.out.println("___________________________________________________________");
		System.out.println("PRUEBAS DEL EJERCICIO 5: FiltrarIP");
		System.out.println("\nLista de IP: \n\"" + id1 + "\"\n");
		System.out.println("Las ip SIN el dominio \"" + id + "\"son: \n\"" + FiltrarIP(id1, id) + "\" || "
				+ FiltrarIP(id1, id).equals("127.123.1.0 255.230.44.1"));

		System.out.println("\n\nLista de IP: \n\"" + id2 + "\"");
		System.out.println("\nLas ip SIN el dominio \"" + id + "\"son: \n\"" + FiltrarIP(id2, id) + "\" || "
				+ FiltrarIP(id2, id).equals("157.386.1.0 0.154.1.68 22.01.201.6"));

		// =============================================================================//
		// ========================== EJERCICIO 6 =====================================//
		// =============================================================================//
		System.out.println("___________________________________________________________");
		System.out.println("PRUEBAS DEL EJERCICIO 6: FiltrarFecha");

		String mostrar = fecha.substring(1, 44) + "\n" + fecha.substring(44, fecha.length());

		System.out.println("\nFechas: \"" + mostrar + "\" \n");

		// ENERO//
		String resFecha1 = "05/12/1996 03/10/1956 21/12/2012 06/10/2001 21/10/1999";
		String resFecha2 = "05/12/1996 22/01/2016 21/12/2012 12/01/2005";
		String resFecha3 = "22/01/2016 03/10/1956 06/10/2001 12/01/2005 21/10/1999";

		System.out.println("Las fechas sin \"" + NombreFecha3 + "\"     son:\n \"" + FiltrarFecha(fecha, NombreFecha3)
				+ "\" || " + FiltrarFecha(fecha, NombreFecha3).equals(resFecha1));

		// OCTURBE//
		System.out.println("\nLas fechas sin \"" + NombreFecha1 + "\"   son:\n \"" + FiltrarFecha(fecha, NombreFecha1)
				+ "\" || " + FiltrarFecha(fecha, NombreFecha1).equals(resFecha2));

		// DICIEMBRE//
		System.out.println("\nLas fechas sin \"" + Nombrefecha2 + "\" son:\n \"" + FiltrarFecha(fecha, Nombrefecha2)
				+ "\" || " + FiltrarFecha(fecha, Nombrefecha2).equals(resFecha3));

		// =============================================================================//
		// ========================== EJERCICIO 7 =====================================//
		// =============================================================================//
		
		System.out.println("___________________________________________________________");
		System.out.println("PRUEBAS DEL EJERCICIO 7: Capitalizar");
		
		String cap1 = "buenos dias, soy una String amable, ¿que tal estas?";
		String cap2 = "la verdad es que esto es mas dificil de lo que parece";
		String cap3 = "Esto seria mucho mas Facil si usaramos Expresiones Regulares";
		
		System.out.println("\nString s1: \"" + cap1 +"\"");
		System.out.println("String s2: \"" + cap2 +"\"");
		System.out.println("String s3: \"" + cap3 +"\"");
		
		String res1 = "Buenos Dias, Soy Una String Amable, ¿que Tal Estas?";
		String res2 = "La Verdad Es Que Esto Es Mas Dificil De Lo Que Parece";
		String res3 = "Esto Seria Mucho Mas Facil Si Usaramos Expresiones Regulares";
		
		System.out.println("¡Vamos a Capitalizar!");
		
		System.out.println("String s1: \""+Capitalizar(cap1)+ "\" || " + Capitalizar(cap1).equals(res1));
		System.out.println("String s2: \""+Capitalizar(cap2)+ "\" || " + Capitalizar(cap2).equals(res2));
		System.out.println("String s3: \""+Capitalizar(cap3)+ "\" || " + Capitalizar(cap3).equals(res3));
	
		
		// =============================================================================//
		// ========================== EJERCICIO 8 =====================================//
		// =============================================================================//
				
		System.out.println("___________________________________________________________");
		System.out.println("PRUEBAS DEL EJERCICIO 8: BuscarPALABRAS");
	
		String B1 = "ME PArece que VOY a irME YA";
		String B2 = "Por supuesto que SI que ACEPTO las CONDICIONES";
		String B3 = "Deberia intentar EsFOrZarme MAS y dar un PROVECHO aun MEJOR para obtener un buen RESULTADO";
	
		
		System.out.println("\nString s1: \"" + B1 +"\"");
		System.out.println("String s2: \"" + B2 +"\"");
		System.out.println("String s3: \"" + B3 +"\"");
		
		res1 = "ME VOY YA";
		res2 = "SI ACEPTO CONDICIONES";
		res3 = "MAS PROVECHO MEJOR RESULTADO";
		
		System.out.println("Las palabras mayúsculas son...");
		
		System.out.println("String s1: \""+BuscarPALABRAS(B1)+ "\" || " + BuscarPALABRAS(B1).equals(res1));
		System.out.println("String s2: \""+BuscarPALABRAS(B2)+ "\" || " + BuscarPALABRAS(B2).equals(res2));
		System.out.println("String s3: \""+BuscarPALABRAS(B3)+ "\" || " + BuscarPALABRAS(B3).equals(res3));
		
	}

}

