package ejercicio3;

//import java.util.regex.Matcher;
//import java.util.regex.Pattern;

/**
 * @author Kaino
 * Version: 07/03/2017 beta (aun faltan por implementar m�s pruebas) 
 * 
 * En esta p�gina te dejo 9 ejercicios para resolverlos con expresiones regulares. �Podr�s resolverlos todos?
 * El main ya est� implementado. Como no he tenido mucho tiempo, no he podido poner muchos ejemplo. 
 * Algunos tienen incluso un corrector, que te indica si has realizado el ejercicio correctamente. 
 * Cualquier fallo, mandarme un mensaje a mi, o a la Delegaci�n para corregirlo. 
 *
 */
public class ExpresionesRegularesVarios {
	/**
	 * Ejercicio 1: Se pasar� una serie de correos y deber� comprobarse si son v�lidos o no. 
	 * Uno correo tiene nombre, seguido de un arroba, seguido de un nombre de domino, seguido de un punto 
	 * y seguido de otro nombre de domino. 
	 * 
	 * @param s
	 * @return
	 */
	public static boolean Formato(String s){
		return false;
	
	}
	
	/**
	 * Ejercicio2: Se pasar� una String que contiene (�entre otras cosas!) emails v�lidos. 
	 * Se deber� devolver una String donde muestre los emails v�lidos. (ojo con los espacios)
	 * Un email tiene nombre, seguido de un arroba, seguido de un nombre de domino, seguido de un punto 
	 * y seguido de otro nombre de domino. 
	 * 
	 * @param s
	 * @return
	 */
	public static String EmailsValidos (String s){
		return "";
	}
	
	/**
	 * Ejercicio 3: Se pasar� dos String que contienen carcteres. Se deber� recorrer la 1� y buscar las ocurrencia
	 * de la 2�, es decir, buscar los carteres de la 2� String que est�n tambi�n en la String 1.
	 * Ejemplo: 
	 * 	String 1 = "abMexdEFgEMNEfkjnmfNNsadMFasd"
	 * 	String 2 = "EFMN"
	 * 	Resultado = "MEFEMNENNMF"
	 * 
	 * @param s1
	 * @param s2
	 * @return
	 */
	public static String Extraccion (String s1, String s2){
		return "";
		}
	
	/**
	 * Ejercicio 4: Se pasar� una String en la que algunos de sus carcteres son n�meros.
	 * Se deber� extraer dichos n�meros y sumarlos, pero ojo, si hay dos o m�s d�gitos seguidos, se considera
	 * como un �nico n�mero. 
	 * Ejemplo: 
	 * 	String s = "asd3 sad33as@3"
	 * 	Result = 3 + 33 + 3 = 39
	 * 
	 * @param s1
	 * @return
	 */
	
	public static int Suma (String s){
		return 0;
	}
	/**
	 * Ejercicio 5: Desarrollar el m�todo Login para que valide el inicio de sesi�n de un usuario.
	 * Para ello recibe 3 par�metros: una String que contiene la informaci�n para logearse, una String con el nombre
	 * de usuario, y una String con la contrase�a.
	 * Utilizando expresiones regulares, comprobar que el 2� y 3� par�metros son correctos busc�ndolos dentro
	 * del 1�. 
	 * 
	 * @param s
	 * @return
	 */
	public static boolean  Login (String s, String nombre, String clave){
		return false;
	}
	/**
	 * Ejercicio 6: Desarrollar el m�todo Listado en el que se le pasa una String con una lista de nombres y 
	 * debe devolver otra lista con los nombres que empiecen por 'A' y los apellidos temrminen por 'a' o los 
	 * que el nombre contenga una 'e' y empiece el apellido por 'T'.
	 * Nota importante: los nombres est�n separados por ','. 
	 * @param s
	 * @return
	 */
	public static String Listado (String s){
		return "";
	}
	
	/**
	 * Ejercicio 7: El m�todo Nombres recibe una String por par�metro. Desarrollar el m�todo para
	 * que extraiga los diferentes nombres que pueda tener.
	 * Los nombres a recoger siempre ser� "Nombre Apellido1 Apellido2," que pueden estar separados entre si
	 * por muchos espacios o por 1 solo espacio. 
	 * Entre dos nombres pude haber basura, espacios, caracteres, d�gitos, otras frases... 
	 * Un nombre incompleto no se acepta. La nueva String a devolver contendr� los nombres v�lidos con 
	 * un nuevo formato: "Apellido1 Apellido2, Nombre;"
	 * El �ltimo nombre no deber� contener ';'
	 * 
	 * @param s
	 * @return
	 */
	public static String Nombres (String s){
		return "";
	}
	
	/**
	 * Ejercicio 8: Desarrollar el m�todo tokens que recoje una ristra formada por tokens separados por espacios. 
	 * Cada token ser� una subristra formada por dos d�gitos seguidos de un gui�n tres
	 * caracteres de la 'a' a la 'z' seguidos de un gui�n dos letras may�sculas seguidos de 
	 * un gui�n y un d�gito. Podr� haber cualquier n�mero de espacios separando los tokens, as� como al principio 
	 * y al final de la ristra.
	 * Devolver los tokens v�lidos separados entre barras, y adem�s deber�n estar al rev�s.
	 * 
	 * @param s
	 * @return
	 */
	public static String tokens(String s){
		return "";
	}
	
	/**
	 * Ejercicio 9: El par�metro ser� una ristra formada por tokens separados por espacios. 
	 * Cada token ser� una subristra formada por cualquier combinaci�n de caracteres que no sean espacios.
	 * Podr� haber cualquier n�mero de espacios separando los tokens, as� como al principio
	 * y al final de la ristra. La ristra podr� estar vac�a. La ristra podr� incluir nombres 
	 * que estar�n encontrados en la ristra pasada como par�metro, seguidas cada una por un punto
	 * y separadas entre si por un espacio, como en "J. S. T.". Los tr�os de iniciales en la ristra
	 * resultante estar�n separados por una barra vertical, no habr� espacios ni al principio ni al final.
	 * 
	 * @param s
	 * @return
	 */
	
	public static String buscarNombre (String s){
		return "";
	}
	
	
	
	
public static void main(String[] args) {
		
		String vacia = "";
		
		String correo1 = "algo@gmail.com";
		String correo2 = "algo@gmail";
		String correo3 = "algo @gmail. com";
		String correo4 = "|@#|~�@hotmail,es";
		String correo5 = "Correofalso@blogmail.etcetera";
				
		System.out.println("PRUEBAS DEL EJERCICIO 1: \n");
		
		System.out.println("String Vacia: ");
		System.out.println(Formato(vacia)+ "\n");
		
		System.out.println(correo1);
		System.out.println(Formato(correo1)+ "\n");
		
		System.out.println(correo2);
		System.out.println(Formato(correo2)+ "\n");
		
		System.out.println(correo3);
		System.out.println(Formato(correo3)+ "\n");
		
		System.out.println(correo4);
		System.out.println(Formato(correo4)+ "\n");
		
		System.out.println(correo5);
		System.out.println(Formato(correo5)+ "\n");
		System.out.println("________________________________________________________________");
		
		System.out.println("PRUEBAS DEL EJERCICIO 2: \n");
		
		String correo6 = "Kaino.g@gmail.com kakak.@.go.com.es ulpgc@gmail.com deiiulpgc@aulpgc102.es.ulpgc ";
		String correo7 = "Cocoro.lloro@@gmail.com lalalalalala@gmail.rome@dos Kurochu@chan.meme";
		String correo8 = "Enrique   Perez    @gmail.com     CatheliaGomez_96@email.es correo_cualquiera_96@a.rar";
		
		//String vacia
		System.out.print("String Vacia: \n--------------------------");
		System.out.println(EmailsValidos(vacia) + " ");
		System.out.println(EmailsValidos(vacia).equals("")+ "\n");
		
		//Correo 6
		System.out.println("Ristra de correos: \"" + correo6+ "\"\n--------------------------");
		System.out.print(EmailsValidos(correo6) + "    ");
		System.out.println(EmailsValidos(correo6).equals("ulpgc@gmail.com")+ "\n");

		//Correo 7
		System.out.println("Ristra de correos: \"" +correo7+ "\"\n--------------------------");
		System.out.print(EmailsValidos(correo7)+ "    ");
		System.out.println(EmailsValidos(correo7).equals("Kurochu@chan.meme")+ "\n");

		//Correo 8
		System.out.println("Ristra de correos: \"" +correo8+ "\"\n--------------------------");
		System.out.print(EmailsValidos(correo8)+ "    ");
		System.out.println(EmailsValidos(correo8).equals("CatheliaGomez_96@email.es correo_cualquiera_96@a.rar")+ "\n");

		
		System.out.println("________________________________________________________________");
		String fraseCompleta = "a�ouHsOajdLasjaAcsli98uzxgi54lgal487fwaQglfaUET998alfALaliagwesk<usygzfkuysg";
		
		String fraseCompleta2 = "abMexdEFgEMNEfkjnmfNNsadMFasd";
		
		String fraseCompleta3 = "asdnj4jnads34jsand23as12d3asdajs11jasnd8jasd0masd3d";
		
		String extr1 = "123456789";
		String extr2 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";		
		String extr3 = "EFMN";
		
		
		
		System.out.println("PRUEBAS DEL EJERCICIO 3: \n");
		
		System.out.print(Extraccion(vacia,extr1));
		//fraseCompleta + ext1
		System.out.println(Extraccion(fraseCompleta,extr1));
		if(Extraccion(fraseCompleta,extr1).equals("9854487998")){
			System.out.println(true);
		} else {
			System.out.println(false +  " Deber�a ser: \"9854487998\" y es: " + Extraccion(fraseCompleta,extr1));
		}
		
		//fraseCompleta + extr2
		System.out.println(Extraccion(fraseCompleta,extr2));
		if(Extraccion(fraseCompleta,extr2).equals("HOLAQUETAL")){
			System.out.println(true);
		} else {
			System.out.println(false +  " Deber�a ser: \"HOLAQUETAL\" y es: " + Extraccion(fraseCompleta,extr2));
		}
		
		//fraseCompleta2 + extr3
		System.out.println(Extraccion(fraseCompleta2,extr3));
		if(Extraccion(fraseCompleta2,extr3).equals("MEFEMNENNMF")){
			System.out.println(true);
		} else {
			System.out.println(false +  " Deber�a ser: \"MEFEMNENNMF\" y es: " + Extraccion(fraseCompleta2,extr3));
		}
		
		//fraseCompleta3 + extr1
		System.out.println(Extraccion(fraseCompleta3,extr1));
		if(Extraccion(fraseCompleta3,extr1).equals("434231231183")){
			System.out.println(true);
		} else {
			System.out.println(false +  " Deber�a ser: \"434231231183\" y es: " + Extraccion(fraseCompleta3,extr1));
		}
		
		System.out.println("________________________________________________________________");
		System.out.println("PRUEBAS DEL EJERCICIO 4: \n");
		
		
		System.out.println("String vacia " + Suma(vacia));
		System.out.print(Suma(fraseCompleta)+ "   ");
		if(Suma(fraseCompleta) == 1637){
			System.out.println(true);
		} else {
			System.out.println(false +  "  Deber�a ser 1637 y es " + Suma(fraseCompleta));
		}
		System.out.print(Suma(fraseCompleta3) + "   ");
		if(Suma(fraseCompleta3) == 98){
			System.out.println(true);
		} else {
			System.out.println(false +  "  Deber�a ser 98 y es " + Suma(fraseCompleta3));
		}
		
		
		System.out.println("________________________________________________________________");
		System.out.println("PRUEBAS DEL EJERCICIO 5: \n");
		
		
		String log1 = "<login> "
				+ "<nombre>Pepito</nombre>"
				+ "<user>usuario</user>"
				+ "<pass>clave</pass>"
				+ "<email>email@gmail.com</email>"
				+ "</login> ";

		String log2 = "<login> "
				+ "<nombre>MaeTaras</nombre>"
				+ "<user>usuario</user>"
				+ "<pass>esquina</pass>"
				+ "<email>email@gmail.com</email>"
				+ "</login> ";

	
		
		//Login correcto
		if(Login(log1,"Pepito","clave") == false){
			System.out.println(" Deber�a ser true y se obtiene false ");
		} else {
			System.out.println("Correcto");
		}
		
		//nombre incorrecto
		if(Login(log1,"Antonio","clave") == true){
			System.out.println(" Deber�a ser false y se obtiene true ");
		} else {
			System.out.println("Correcto");
		}
		
		//contrase�a incorrecta
		if(Login(log1,"Pepito","clave2") == true){
			System.out.println(" Deber�a ser false y se obtiene true ");
		} else {
			System.out.println("Correcto");
		}
		
		//Login correcto
		if(Login(log2,"MaeTaras","esquina") == false){
			System.out.println(" Deber�a ser true y se obtiene false ");
		} else {
			System.out.println("Correcto");
		}
		
		//Nombre incompleto
		if(Login(log2,"MaeTa","esquina") == true ){
			System.out.println(" Deber�a ser false y se obtiene true ");
		} else {
			System.out.println("Correcto");
		}
		
		//Contrase�a incompleta
		if(Login(log2,"MaeTaras","esqui") == true){
			System.out.println(" Deber�a ser false y se obtiene true ");
		} else {
			System.out.println("Correcto");
		}
		
		

		System.out.println("________________________________________________________________");
		System.out.println("PRUEBAS DEL EJERCICIO 6: \n");
		
		String Lista = "Alejandro Quintana, "
				+ "Mario Gomez, "
				+ "Roberto Torres, "
				+ "Alberto Medina, "
				+ "Patricia Segura, "
				+ "Selena Norma, "
				+ "Patrick Jane, "
				+ "Ana Santana, "
				+ "Kevin Sosa, "
				+ "Helena Tazas, "
				+ "Antonio Norway, "
				+ "Adriel Garcia, "
				+ "Leonardo Tormes";
		
		String[] Lista2 = new String[7];
		
		
		Lista2[0] = "Alejandro Quintana ";
		Lista2[1] = "Roberto Torres ";
		Lista2[2] = "Alberto Medina ";
		Lista2[3] = "Ana Santana ";
		Lista2[4] = "Helena Tazas ";
		Lista2[5] = "Adriel Garcia ";
		Lista2[6] = "Leonardo Tormes ";
		
		
		
		String[] comp = Listado(Lista).split(",");
		boolean c = true;
		
		for(int i = 0; i < Lista2.length; i ++){
			if(!comp[i].equals(Lista2[i])){
				c = false;
				break;
			}
		}
		
		
		if(c == true){
			System.out.println("Correcto ");
		} else {
			System.out.println("Hay algun fallo, deber�a ser: (recuerda los espacios al devolver la String)");
			for(int i = 0; i < Lista2.length; i++){
				System.out.println(Lista2[i]);
			}
			
			System.out.println(" \nY se obtiene: ");
			for(int i = 0; i < comp.length; i++){
				System.out.println(comp[i]);
			}
		}
		
	

		System.out.println("________________________________________________________________");
		System.out.println("PRUEBAS DEL EJERCICIO 7: \n");
		   
		System.out.println("String vacia: " + Nombres(vacia) + "\n");
		
		String nombres1 = "Mario Gomez Herrera, oajoanoawodhasdo \nasudh !� Leonardo Tormes Gonzales, ujawhdahsjhd #| HEctor Lopez Gonzales,"
				+ "\nHelena   Acosta     Gil,       asjda Anto Hernandez  xfvzdvsd Luis Herrera Montoro, ";
		String nombres2 = "Teresa Campos Diaz, Juan Rodriguez Aleman, Octavio Quevedo, \nfdsfsd Holanosoyunnombre Porquemiapellido Estamal@,";
		
		System.out.println("String con nombres 1: \"" + nombres1 + "\"");
		
		System.out.println("------------------------");
		System.out.println("Nombres obtenidos: " + Nombres(nombres1));
		
		System.out.println("\n\nString con nombres 2: \"" +nombres2 + "\"");
		System.out.println("\n------------------------");
		System.out.println("Nombres obtenidos: " + Nombres(nombres2) + "\n");
		
		

		System.out.println("________________________________________________________________");
		System.out.println("PRUEBAS DEL EJERCICIO 8: \n");
		
		
		String tokens1 = "22-aaa-AA-3 asuhdauwhds 33-abc-BD-4 auhwdah #@21-jaj-AA-6 98-Aza-BD-1 0 02 asa-CC-48 ajndw";
		
		
		System.out.println("String vacia: " +tokens(vacia) + "\n");
		
		System.out.println("Los tokens encontrados son: \"" + tokens(tokens1) + "\"");
		

		System.out.println("________________________________________________________________");
		System.out.println("PRUEBAS DEL EJERCICIO 9: \n");
		
		
		String nombres10 = "asdhajwh J. S. T. aiwdaj|@| A. B. J. adhajwha wd@J. A. G. wadjiajwdi ";
		
		System.out.println("String vacia: " +buscarNombre(vacia)+ "\n");
		System.out.println("Las iniciales encontradas son: " + buscarNombre(nombres10));
		
	}

}
