package ejercicio2;



/**
 * (ábreme)
 * @author miki (Miguel Ángel Berciano Rodríguez)
 * Aqui tienes resuelto los ejercicios planteados de la clase String.
 * Está implementado con el main, por lo que al darle al ejecutar podrás comprobar que funcionan 
 * correctamente para lo que se ha propuesto este ejercicio.
 * 
 */

public class EjerciciosStringResuelto {
	/**
	 *  Ejercicio 1: Desarrollar un método que, a partir del uso del método de la clase String,
	 * IndexOf(), cuente el número total de una letra presente en una String. 
	 *
	 * @param s, la String donde buscar
	 * @param c, el caracter a contar
	 * @return el número de veces que encontramos el caracter
	 * 
	 *   Explicación: para resolver este ejercicio es necesario saber como funciona el indexOf().
	 * Una vez lo comprendemos, lo único que nos falta es recorrer la String usando dicho método,
	 * de forma que lo único que debemos hacer es asociar la variable que utilizamos para iterar (la 'i').
	 * Recordar que si .indexOf no encuentra ningún carctere, devuelve -1. (condición de parada)
	 */
	
	public static int ContarLetra(String s, char c) {
		if(s.length() == 0){//Excepción
			return 0;
		}
		int cont = 0; //iniciamos un contador donde guardar el resultado
		
		for(int i = s.indexOf(c); i != -1; i = s.indexOf(c, i+1)){
			cont ++;
		}
		return cont;
	}
	
	/**
	 *   Ejercicio 2: Desarrollar un método llamado Filtrar1 que a partir de dos Strings 
	 * devuelva una String que contenga todas las palabras de la 1º String que estén 
	 * compuestas por la 2º String
	 * 
	 * @param s1 la String principal 
	 * @param s2 la palabra a buscar
	 * @return una String a patir de las dos Strings pasadas por parámetros
	 */
	public static String Filtrar1 (String s1, String s2){
		if(s1.length() == 0 || s2.length() == 0 || s1.length() < s2.length() ){//Excepción
			return "";
		}
		String res = " ";//String donde vamos a guardar el resultado
		//lo iniciamos con un espacio para poder hacer el .trim() al final sin que de error 
		
		s1 = " " + s1 + " "; //añadimos espacios al principio y al final 
		//con esto nos eliminamos los casos de las palabras de los extremos 
		//"hola mundo" --> " hola mundo " 
		String aux = "";
		for(int i = 0; i < s1.length()-1; i++){
			//cogemos cada palabras por separado ( hola mundo) --> ( hola ) ( mundo )
			aux = s1.substring(s1.indexOf(' ',i), s1.indexOf(' ', i+1));
			if(aux.contains(s2)){// ¿la palabra tiene el filtro?
				res += aux;
			}
		}
		return res.trim();//quitamos el último espacio
	}
	/**
	 *   Ejercicio 3: Desarrollar un método llamado Filtrar2 que a partir de dos Strings 
	 * devuelva una String que contenga todas las palabras de la 1º String que EMPIECEN por  
	 * la 2º String.
	 * 
	 * @param s1 la String principal 
	 * @param s2 la palabra a buscar
	 * @return una String a patir de las dos Strings pasadas por parámetros
	 * 
	 */
	public static String Filtrar2 (String s1, String s2){
		if(s1.length() == 0 || s2.length() == 0 || s1.length() < s2.length() ){//Excepción
			return "";
		}
		String res = " ";//String donde vamos a guardar el resultado
		//lo iniciamos con un espacio para poder hacer el .trim() al final sin que de error 
		
		s1 = " " + s1 + " "; //añadimos espacios al principio y al final 
		//con esto nos eliminamos los casos de las palabras de los extremos 
		//"hola mundo" --> " hola mundo " 
		String aux = "";
		for(int i = 0; i < s1.length()-1; i++){
			//cogemos cada palabras por separado ( hola mundo) --> ( hola ) ( mundo )
			aux = s1.substring(s1.indexOf(' ',i), s1.indexOf(' ', i+1));
			//cogemos solo el trozo del principio ( hola ) ¿(hol) == (cas)?
			if(aux.length() > s2.length() && aux.substring(1, s2.length()+1).equals(s2)){// ¿la palabra EMPIEZA por el filtro?
				res += aux;
			}
		}
		return res.trim();//quitamos el último espacio
	}
	
	
	/**
	 * Ejercicio 4: Desarrollar un método llamado FiltrarCorreo que filtre una ristra de correos
	 * según un dominio recibido como parámetro. (los correos están separados por espacios)
	 * 
	 * @param s1 la String principal con los correos 
	 * @param s2 el dominio
	 * @return una String a patir de las dos Strings pasadas por parámetros
	 * 
	 */
	public static String FiltrarCorreo (String s1, String s2){
		if(s1.length() == 0 || s2.length() == 0 || s1.length() < s2.length() ){//Excepción
			return "";
		}
		String res = " ";//String donde vamos a guardar el resultado
		//lo iniciamos con un espacio para poder hacer el .trim() al final sin que de error 
		
		s1 = " " + s1 + " "; //añadimos espacios al principio y al final 
		//con esto nos eliminamos los casos de las palabras de los extremos 
		//"hola mundo" --> " hola mundo " 
		String aux = "";
		for(int i = 0; i < s1.length()-1; i++){
			//cogemos cada palabras por separado ( hola mundo) --> ( hola ) ( mundo )
			aux = s1.substring(s1.indexOf(' ',i), s1.indexOf(' ', i+1));
			if(aux.contains(s2)){// ¿la palabra tiene el filtro?
				res += aux;
			}
		}
		return res.trim();//quitamos el último espacio	
	
	}
	
	/**
	 *  Ejercicio 5: Desarrollar un método llamado FiltrarIP que filtre una ristra de IP
	 * según el segundo parámetro. (las IP están separados por espacios)
	 * La ristra resultado deberá estar compuesta por todas las IP de la primera ristra
	 * que NO contengan la segunda
	 * 
	 * 
	 * @param s1 la String principal 
	 * @param s2 la palabra a buscar
	 * @return una String a patir de las dos Strings pasadas por parámetros
	 * 
	 */
	
	public static String FiltrarIP (String s1, String s2){
		if(s1.length() == 0 || s2.length() == 0 || s1.length() < s2.length() ){
			return "";
		}
		String res = "";//String donde vamos a guardar el resultado
		
		//lo iniciamos con un espacio para poder hacer el .trim() al final sin que de error 
		
		s1 = " " + s1 + " "; //añadimos espacios al principio y al final 
		//con esto nos eliminamos los casos de las palabras de los extremos 
		//"hola mundo" --> " hola mundo " 
		String aux = "";
		for(int i = s1.indexOf(' '); i < s1.length()-1; i = s1.indexOf(' ', (i+1))){
			//cogemos cada palabras por separado ( hola mundo) --> ( hola ) ( mundo )
			aux = s1.substring(i, s1.indexOf(' ', i+1));
			
			if(!aux.contains(s2)){// ¿la palabra NO tiene el filtro?
				res += aux;
			}
		}
		return res.trim();//quitamos el último espacio	
	}	 
	/**
	 *   Ejercicio 6: Desarrollar un método llamado FiltrarFecha que filtre una ristra de fechas
	 * según el mes pasado por parámetro. (Las Fechas están separadas por espacios)
	 * La ristra resultado deberá estar compuesta por todas las fechas de la primera ristra que
	 * NO contengan el mes. Nota: las fechas están en formato "dd/mm/aaaa" y el mes "NombreMes"
	 * 
	 * @param s1 la String principal que contienen las fechas
	 * @param s2 el mes para filtrar
	 * @return una String a patir de las dos Strings pasadas por parámetros
	 */
	
	public static String FiltrarFecha (String s1, String s2){
		if(s1.length() == 0 || s2.length() == 0 || s1.length() < s2.length() ){//Excepciones
			return "";
		}
		String res = " ";//String donde vamos a guardar el resultado
	
		//Creamos una String con TODOS LOS MESES separado por espacios
		String meses = "ENERO FEBRERO MARZO ABRIL MAYO JUNIO JULIO AGOSTO SEPTIEMBRE OCTUBRE NOVIEMBRE DICIEMBRE";
		String[] mes = meses.split(" ");//lo convertimos en una String[] de forma que quedará 
			//mes[0] = ENERO
			//mes[1] = FEBRERO
			//mes[2] = MARZO
			//       ...
			// mes[11] = NOVIEMBRE
			// mes[12] = DICIEMBRE
		
		for(int i = 0; i < 12; i ++){
			if(mes[i].equals(s2)){//Buscamos el NOMBRE del mes y lo pasamos a su equivalente numérico (indicado por la posicion en el String[])
				s2 = "0" + (i+1);//(recordamos que empezamos en 0; hay que sumar 1 al valor de la i) 
				break;
			}
		}
		//una vez llegados a este punto es que tenemos el mes convertido a su equivalente numérico.
		
		if(s2.length()>2){//Si fuera OCTUBRE NOVIEMBRE o DICEMBRE   (puesto que el número quedaría tal que: 010, 011, 012 respectivamente)
			s2 = s2.substring(1, s2.length());//le quitamos el 0
		}
		
		
		String[] patron = s1.split(" ");//Creamos un String[] a patir de espacios
		for(int i = 0; i < patron.length; i ++){
			if(patron[i].substring(3, 5).equals(s2)==false){//Miramos que fechas contienen el mes
				res += patron[i] + " ";//Se suman las que NO cumplan condición
			}
		}
		return res.trim();//quitamos el último espacio
	}
	
	/**
	 * Ejercicio 7: Desarrollar un método llamado Capitalizar que capitalice todas las palabras, si no lo están. 
	 * Capitalizar es pasar la primera letra de cada palabra a Mayúscula.
	 * 
	 * @param s String
	 * @return Sting con todas las palabras capitalizadas.
	 */
	
	public static String Capitalizar(String s){
		if(s.isEmpty()){//Excepción
			return "";
		}
		
		//le añadimos un espcio al principio para el caso de la primera palabra
		s = " " + s;
		
		//recorremos saltando de espacio en espacio
		for(int i = s.indexOf(' '); i != -1; i = s.indexOf(' ', i+1)){
			if(s.charAt(i+1) > 96 && s.charAt(i+1) < 123){//es una letra minúscula
				//Convertimos la letra en mayusculas y dejamos todo igual.
				s = s.substring(0,i+1) + s.substring(i+1,i+2).toUpperCase() + s.substring(i+2);
			}
		}
		
		return s.trim();
	}
	
	/**
	 * Ejercicio 8: Desarrollar un método llamado BuscarPALABRAS que recoja en una String todas las
	 * palabras MAYUSCULAS que aparezcan en la String pasada por parámetro.
	 * 
	 * @param s String
	 * 
	 * @return String con todas las palabras MAYUSCULAS de la String pasada por parámetros
	 */
	
	public static String BuscarPALABRAS(String s){
		if(s.isEmpty()){
			return "";
		}
		String res = "";
		String[] p = s.split(" ");
		
		for(int i = 0; i < p.length; i ++){
			for(int j = 0; j < p[i].length(); j++){
				if(p[i].charAt(j) < 65 || p[i].charAt(j) > 91){//No es una mayuscula!
					j = p[i].length();
					p[i] = ""; 
				}
				
			}
			if(p[i].length() != 0){
				res += p[i] +" ";
			}
		}
		return res.trim();
		
	}
	
	//=============================================================================//
	//============================== MAIN =======================================//
	//=============================================================================//
	/**
	 * 
	 * @author miki (Miguel Ángel Berciano Rodríguez)
	 * 
	 * Este es el main para las pruebas.
	 * Puedes añadir todas las pruebas que quieras, pero evita cambiar las que
	 * ya están diseñadas. 
	 * 
	 */
public static void main(String[] args) {
	
	//STRINGS PARA LOS DIFRENTES EJERCICIOS//
	
	String vacia = "";//String vacia
	
	//EJERCICIO 1//
	String c2 = "o";
	String c3 = "ouo";
	String c4 = "o o o";
	String c5 = "Hola que tal, mira ver cuantas 'a' tengo";
	String c6 = "   Mmm Mmm Mmm no está mal    M ";
	
	//EJERCICIO 2 y 3 //
	String f1 = "";
	String f2 = "cas";
	String f3 = "casa casita cascos";
	String f4 = "mundo llaves cas caza cosas caos comadrejas caramelos";
	String f5 = "cocos agua caseron roncas carteras aparcas captas cascas";
	String filtro = "cas";
	
	
	String f6 = "loca poca mota casa roca bola boca fin ocarina carambola oca ";
	String filtro2 = "oca";
	
	//EJERCICIO 4//
	String MostrarCorreo = "CorreoEjemplo@gmail.com  Ania86@kmail.com  \nGonzalo_Rodriguez92@hotmail.com  Prueba@gmail.com "
			+ "  \nkaino.miguibr@gmail.com  DEII@ulpgc.es Juan.Gomez102@ulpgc.es \nkurukuru22@hotmail.com "
			+ " Gato@gmail.com  miguibr@hotmail.com ";
	String correo1 = "CorreoEjemplo@gmail.com  Ania86@kmail.com  Gonzalo_Rodriguez92@hotmail.com  Prueba@gmail.com "
			+ "  kaino.miguibr@gmail.com  DEII@ulpgc.es Juan.Gomez102@ulpgc.es kurukuru22@hotmail.com "
			+ " Gato@gmail.com  miguibr@hotmail.com ";
	
	
	String dominio1 = "gmail";
	String dominio2 = "hotmail";
	String dominio3 = "ulpgc";
	
	
	//EJERCICIO 5//
	String id1 = "196.168.0.1 127.123.1.0 255.230.44.1 100.168.100.1 90.168.0.1";
	String id2 = "42.168.87.177 157.386.1.0 168.105.94.1 0.154.1.68 22.01.201.6 ";
	
	String id = "168";
	
	
	//EJERCICIO 6//
	
	String fecha = "05/12/1996 22/01/2016 03/10/1956 21/12/2012 06/10/2001 "
			+ "12/01/2005 21/10/1999";
	
	String NombreFecha1 = "OCTUBRE";
	String Nombrefecha2 = "DICIEMBRE";
	String NombreFecha3 = "ENERO";
	
	//=============================================================================//
	//========================== EJERCICIO 1 =====================================//
	//=============================================================================//
		
		System.out.println("PRUEBAS DEL EJERCICIO 1: ContarLetra()");
		
		System.out.println("\nContar letras en una String vacia: " + ContarLetra(vacia,'o'));
		
		System.out.println("String: \""+ c2 +  "\" tiene " + ContarLetra(c2,'o') + " 'o'      || " + (ContarLetra(c2,'o') == 1));
		System.out.println("String: \""+ c3 +  "\" tiene " + ContarLetra(c3,'o') + " 'o'    || " + (ContarLetra(c3,'o') == 2));
		System.out.println("String: \""+ c4 +  "\" tiene " + ContarLetra(c4,'o') + " 'o'  || " + (ContarLetra(c4,'o') == 3));
		System.out.println("String: \""+ c6 +  "\" tiene " + ContarLetra(c6,'M') + " 'M'  || " + (ContarLetra(c6,'M') == 4));
		System.out.println("String: \""+ c5 +  "\" tiene " + ContarLetra(c5,'a') + " 'a'  || " + (ContarLetra(c5,'a') == 6));
			
		//=============================================================================//
		//========================== EJERCICIO 2 =====================================//
		//=============================================================================//
				
		
		System.out.println("___________________________________________________________");
		System.out.println("PRUEBAS DEL EJERCICIO 2: Filtrar1");
		
		System.out.println("\nFiltrar una String vacia: " + Filtrar1(f1, filtro));
		
		System.out.println("String: \""+ f2 + "\" \ny las palabras que tienen " 
		+ "\""+filtro+ "\" son: \"" +Filtrar1(f2, filtro)+ "\"   || " + (Filtrar1(f2, filtro).equals("cas") ));
		
		
		System.out.println("\nString: \""+ f3 + "\" \ny las palabras que tienen " 
				+ "\""+filtro+ "\" son: \"" +Filtrar1(f3, filtro)+ "\"   || " + (Filtrar1(f3, filtro).equals("casa casita cascos") ));
		
		
		System.out.println("\nString: \""+ f4 + "\" \ny las palabras que tienen " 
				+ "\""+filtro+ "\" son: \"" +Filtrar1(f4, filtro)+ "\"   || " + (Filtrar1(f4, filtro).equals("cas") ));
		
		
		System.out.println("\nString: \""+ f5 + "\" \ny las palabras que tienen " 
				+ "\""+filtro+ "\" son:  \"" +Filtrar1(f5, filtro) + "\"  || " + (Filtrar1(f5, filtro).equals("caseron roncas aparcas cascas") ));
		
		System.out.println("\nString: \""+ f6 + "\" \ny las palabras que tienen " 
				+ "\""+filtro2+ "\" son:  \"" +Filtrar1(f6, filtro2) + "\"  || " + (Filtrar1(f6, filtro2).equals("loca poca roca boca ocarina oca") ));
		
		
		
		//=============================================================================//
		//========================== EJERCICIO 3 =====================================//
		//=============================================================================//
		System.out.println("___________________________________________________________");
		System.out.println("PRUEBAS DEL EJERCICIO 3: Filtrar2");
		
		System.out.println("\nFiltrar una String vacia: " + Filtrar2(f1, filtro));
		System.out.println("String: \""+ f2 + "\" \ny las palabras que comiencen por" 
		+ "\""+filtro+ "\" son: \"" +Filtrar2(f2, filtro)+ "\"    || " + Filtrar2(f2, filtro).equals("cas"));
		
		System.out.println("\nString: \""+ f3 + "\" \ny las palabras que comiencen por " 
				+ "\""+filtro+ "\" son: \"" +Filtrar2(f3, filtro)+ "\"   || " + Filtrar2(f3, filtro).equals("casa casita cascos"));
		
		System.out.println("\nString: \""+ f4 + "\" \ny las palabras que comiencen por " 
				+ "\""+filtro+ "\" son: \"" +Filtrar2(f4, filtro)+ "\"   || " + Filtrar2(f4, filtro).equals("cas"));
		
		System.out.println("\nString: \""+ f5 + "\" \ny las palabras que comiencen por " 
				+ "\""+filtro+ "\" son: \"" +Filtrar2(f5, filtro)+ "\"   || " + Filtrar2(f5, filtro).equals("caseron cascas"));
		
		System.out.println("\nString: \""+ f6 + "\" \ny las palabras que comiencen por " 
				+ "\""+filtro2+ "\" son:  \"" +Filtrar2(f6, filtro2) + "\"  || " + (Filtrar2(f6, filtro2).equals("ocarina oca") ));
		
		
		
		//=============================================================================//
		//========================== EJERCICIO 4 =====================================//
		//=============================================================================//
		System.out.println("___________________________________________________________");
		System.out.println("PRUEBAS DEL EJERCICIO 4: FiltrarCorreo");
		
		System.out.println("\nCorreos: \"" + MostrarCorreo + "\"\n");
		
		System.out.println("Los correos con el dominio \""
				+ dominio3 + "\"   son: \"" + FiltrarCorreo(correo1, dominio3) + "\"   || " + FiltrarCorreo(correo1, dominio3).equals("DEII@ulpgc.es Juan.Gomez102@ulpgc.es"));
		
		System.out.println("Los correos con el dominio \""
				+ dominio1 + "\"   son: \"" + FiltrarCorreo(correo1, dominio1)+ "\"  || " + FiltrarCorreo(correo1, dominio1).equals("CorreoEjemplo@gmail.com Prueba@gmail.com kaino.miguibr@gmail.com Gato@gmail.com"));
		
		System.out.println("Los correos con el dominio \""
				+ dominio2 + "\" son: \"" + FiltrarCorreo(correo1, dominio2) + "\" || " + FiltrarCorreo(correo1, dominio2).equals("Gonzalo_Rodriguez92@hotmail.com kurukuru22@hotmail.com miguibr@hotmail.com"));
		
		
		
		//=============================================================================//
		//========================== EJERCICIO 5 =====================================//
		//=============================================================================//
		System.out.println("___________________________________________________________");
		System.out.println("PRUEBAS DEL EJERCICIO 5: FiltrarIP");
		System.out.println("\nLista de IP: \n\"" + id1 + "\"\n");
		System.out.println("Las ip SIN el dominio \""
				+ id + "\"son: \n\"" + FiltrarIP(id1, id) + "\" || "+ FiltrarIP(id1, id).equals("127.123.1.0 255.230.44.1"));
		
		System.out.println("\n\nLista de IP: \n\"" + id2 + "\"");
		System.out.println("\nLas ip SIN el dominio \""
				+ id + "\"son: \n\"" + FiltrarIP(id2, id) + "\" || "+ FiltrarIP(id2, id).equals("157.386.1.0 0.154.1.68 22.01.201.6"));
		
		
		//=============================================================================//
		//========================== EJERCICIO 6 =====================================//
		//=============================================================================//
		System.out.println("___________________________________________________________");
		System.out.println("PRUEBAS DEL EJERCICIO 6: FiltrarFecha");
		
		String mostrar = fecha.substring(1, 44) + "\n" + fecha.substring(44,fecha.length());
		
		System.out.println("\nFechas: \"" + mostrar + "\" \n");
		
		//ENERO//
		String resFecha1 = "05/12/1996 03/10/1956 21/12/2012 06/10/2001 21/10/1999";
		String resFecha2 = "05/12/1996 22/01/2016 21/12/2012 12/01/2005";
		String resFecha3 = "22/01/2016 03/10/1956 06/10/2001 12/01/2005 21/10/1999";
		
		System.out.println("Las fechas sin \"" +NombreFecha3+ "\"     son:\n \"" 
				+ FiltrarFecha(fecha,NombreFecha3) + "\" || "+ FiltrarFecha(fecha,NombreFecha3).equals(resFecha1));
		
		//OCTURBE//
		System.out.println("\nLas fechas sin \"" +NombreFecha1+ "\"   son:\n \"" 
				+ FiltrarFecha(fecha,NombreFecha1)  + "\" || "+ FiltrarFecha(fecha,NombreFecha1).equals(resFecha2));
		
		//DICIEMBRE//
		System.out.println("\nLas fechas sin \"" +Nombrefecha2+ "\" son:\n \"" 
				+ FiltrarFecha(fecha,Nombrefecha2)   + "\" || "+ FiltrarFecha(fecha,Nombrefecha2).equals(resFecha3));
		
		
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

		System.out.println("\nString s1: \"" + B1 + "\"");
		System.out.println("String s2: \"" + B2 + "\"");
		System.out.println("String s3: \"" + B3 + "\"");

		res1 = "ME VOY YA";
		res2 = "SI ACEPTO CONDICIONES";
		res3 = "MAS PROVECHO MEJOR RESULTADO";

		System.out.println("Las palabras mayúsculas son...");

		System.out.println("String s1: \"" + BuscarPALABRAS(B1) + "\" || " + BuscarPALABRAS(B1).equals(res1));
		System.out.println("String s2: \"" + BuscarPALABRAS(B2) + "\" || " + BuscarPALABRAS(B2).equals(res2));
		System.out.println("String s3: \"" + BuscarPALABRAS(B3) + "\" || " + BuscarPALABRAS(B3).equals(res3));
		
		
	}

}
