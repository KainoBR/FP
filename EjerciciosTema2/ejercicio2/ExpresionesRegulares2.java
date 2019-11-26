package ejercicio2;

//importamos el Pattern y el Matcher para poder ejecutarlos
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 * (ábreme)
 * @author miki
 * 
 * Ejercicios de Expresiones Regulares2
 * Estos son los ejercicios del tema 2: Expresiones Regulares.
 * 
 * Abajo tienes el enunciado del ejercicio2 con sus 5 apartados más una pequeña plantilla del método a utilizar.
 * Tambien trae un poquito de Teoría por lo que me he extendido un poco para dejar todo claro.
 * Además tienes un Main con múltiples ejemplos a utilizar.
 * En otra página tienes los métodos ya resueltos.
 *  
 */

public class ExpresionesRegulares2 {
	/*
	 * Este ejercicio está diseñado para que veas las aplicaciones que puede tener las expresiones regulares en algo más concreto y "profesional"
	 * 
	 * Ejercicio: 
	 * 	La siguiente lista de usuarios son Strings en las que están representadas la informacion de cada uno.  
	 * ¡Atención: Las String que se te pasaran solo serán usuarios!
	 * 
	 * Todo usuario tiene un Nombre completo formado por Nombre1, Nombre2(en algunas ocasiones) Apellido1, Apellido2, 
	 * separado por espacios
	 * 
	 * Despues, separado por más espacios tenemos el DNI que son 8 digitios seguidos de un guion (-) y una letra Mayuscula
	 * 
	 * Después todos los usuarios tiene un número de indentificación que va despues del DNI
	 * 
	 * Ej: Kevin Enein Ortega	 44879587-X 	id:3
	 * 
	 * Normas: 
	 *  	1º) Dos usuarios NO PUEDEN TENER EL MISMO DNI
	 *  	2º) Dos Usuarios NO PUEDEN TENER EL MISMO nº de identificacion
	 *  	3º) Dos usuarios pueden coincidir en el nombre o en apellidos pero NO PUEDEN TENER EL MISMO NOMBRE COMPLETO
	 *  
	 *  ¡Nota importante!: Si queremos juntar dos usuarios en una String estarán separados por ", " 
	 *  	Ej:
	 *  		usuario5: Kevin Enein Ortega 44879587-X id:3
	 *  		usuario2: Miki Berciano Rodríguez 44748718-Y id:8
	 *  
	 *  	String ListaUsuario = usuario5 +  "," + usuario2; ==> Kevin Eneun Ortega 44879587-X id:3, Miki Berciano Rodríguez 44748718-Y id:8
	 *  	
	 *  Realizar los ejercicios propuesto con el uso de Expresiones regulares
	 *  
	 *  	1º) Desarrollar un método llamado TratarGrupo que estraiga solamente los nombres de cada usuario.
	 *  		Ej: //String usuario1 = "Juan José Rodríguez Cabrera 45749871-X id:10";
	 *  		 >> resultado = Juan José Rodríguez Cabrera
	 *  
	 *  	2º) Desarrollar un método llamado "Coincidencia" que muestre en pantalla las veces que se repite 
	 *  	un determinado nombre o apellido PASADO POR PARÁMETRO.
	 *  
	 *  	3º) Desarrollar un método llamado "Coincidencia2" que muestre en pantalla las veces que se repite
	 *  	un determinado SEGUNDO nombre o SEGUNDO apellido PASADO POR PARÁMETRO.
	 *  	(Es decir, que solo compruebe el segundo nombre(si lo hay) y el segundo apellido)
	 *  
	 *  	4º) Desarrollar un método llamado "NúmerodeNombres" que muestre en pantalla la cantidad
	 *  	de personas que tienen 2º Nombre
	 *  
	 *  
	 *  	5º) Desarrollar un método denominado "ListaDNI" que recibe una String con todos los nombres por parámetro
	 *    	y tiene que crear una Array de Strings que guarde tan solo los DNI en funcion del ORDEN de la ID.
	 *  	(Pista: utiliza el método s.split(", "); 
	 *  
	 *    RECUERDA QUE TODOS LOS EJERCICIOS DEBES RESOLVERLO UTILIZANDO EXPRESIONES REGULARES
	 *   
	 *  	//TODOS ESTOS EJERCICIOS ESTÁN RESUELTOS EN OTRA PÁGINA//
	 * 
	 */
	/**
	 * 
	 * @param s
	 * @return
	 */
	public static String TratarGrupo(String s){
		
		
		String palabrasConA = "";//String donde guardar el resultado.
		//Declaramos el Pattern
		Pattern p = Pattern.compile("A");
		//Asociamos a la String
		Matcher m = p.matcher(s);
		
		while (m.find()){//mientras encontremos palabras con A.
			palabrasConA += m.group() + " ";//guardo todas las palabras con A separadas por espacios
		}
		return palabrasConA; //devuelve todas las palabras que contengan al menos una A.
		
		
	}
	/**
	 * 
	 * @param s
	 * @param nombre
	 * @return
	 */
	public static int Coincidencia (String s, String nombre){
		return 0;
	}
	/**
	 * 
	 * @param s
	 * @param nombre2
	 * @return
	 */
	public static int Coincidencia2 (String s, String nombre2){
		return 0;
	}
	/**
	 * 
	 * @param s
	 * @param nombre2
	 * @return
	 */
	public static int NumerodeNombres (String s){
		return 0;
	}
	/**
	 * 
	 * @param s
	 * @return
	 */
	public static String[] ListaDNI (String s){
		return null;//¡dará error al ejecutar el main!
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
	 * Al ser pruebas visuales, no he puesto si el resultado es correcto o no, pues
	 * eso se puede comprobar a simple vista y de esta forma no saturar tanto el main. 
	 * 
	 */
	public static void main(String[] arg){
							//NOMBRE Y APELIIDO //  	      //DNI//    //ID//
		String usuario1 =  "Juan Jose Rodriguez Cabrera"  + " 	45749871-A 	id:4";
		String usuario2 =  "Celia Cruz Aleman	" 			  + " 	46785748-E 	id:9";
		String usuario3 =  "Marta Benitez Carrasco	" 	  + " 	43978482-S 	id:2";
		String usuario4 =  "Hector Acosta Perdomo	" 		  + " 	47895644-R 	id:6";
		String usuario5 =  "Roberto Gonzalez Perez	" 	  + " 	42659878-T 	id:3";
		String usuario6 =  "Manuel Gutierrez Aleman	" 	  + " 	45579878-E 	id:1";
		String usuario7 =  "Juan Manuel Acosta Cabrera"   + " 	48456798-A 	id:10";
		String usuario8 =  "Hector Jose Aleman Perez"  	  + " 	41248498-D 	id:7";
		String usuario9 =  "Juan Carlos Lopez Montenegro" + " 	45687287-O 	id:12";
		String usuario10 = "Ana Maria Acosta Perez	" 	  + " 	44457879-N 	id:8";
		String usuario11 = "Alba Maria Perez Ortega" 	  + " 	44457879-D 	id:11";
		String usuario12 = "Jose Maria Aleman Perez" 	  + " 	44457879-O 	id:5";
		
		System.out.println("PRUEBAS DEL APARTADO 1: \n");
	
	
		System.out.println(usuario1);
		System.out.print(TratarGrupo(usuario1)+"  ");
		System.out.println(TratarGrupo(usuario1).equals("Juan Jose Rodriguez Cabrera"));
		System.out.println("-------------------------------------------------------");
	
		System.out.println(usuario2);
		System.out.print(TratarGrupo(usuario2)+"  ");
		System.out.println(TratarGrupo(usuario2).equals("Celia Cruz Aleman"));
		System.out.println("-------------------------------------------------------");
	
		System.out.println(usuario3);
		System.out.print(TratarGrupo(usuario3)+"  ");
		System.out.println(TratarGrupo(usuario3).equals("Marta Benitez Carrasco"));
		System.out.println("-------------------------------------------------------");
	
		System.out.println(usuario4);
		System.out.print(TratarGrupo(usuario4)+"  ");
		System.out.println(TratarGrupo(usuario4).equals("Hector Acosta Perdomo"));
		System.out.println("-------------------------------------------------------");
	
		System.out.println(usuario5);
		System.out.print(TratarGrupo(usuario5)+"  ");
		System.out.println(TratarGrupo(usuario5).equals("Roberto Gonzalez Perez"));
		System.out.println("-------------------------------------------------------");
	
		System.out.println(usuario6);
		System.out.print(TratarGrupo(usuario6)+"  ");
		System.out.println(TratarGrupo(usuario6).equals("Manuel Gutierrez Aleman"));
		System.out.println("-------------------------------------------------------");
	
		System.out.println(usuario7);
		System.out.print(TratarGrupo(usuario7)+"  ");
		System.out.println(TratarGrupo(usuario7).equals("Juan Manuel Acosta Cabrera"));
		System.out.println("-------------------------------------------------------");
	
		System.out.println(usuario8);
		System.out.print(TratarGrupo(usuario8)+"  ");
		System.out.println(TratarGrupo(usuario8).equals("Hector Jose Aleman Perez"));
		System.out.println("-------------------------------------------------------");
	
		System.out.println(usuario9);
		System.out.print(TratarGrupo(usuario9)+"  ");
		System.out.println(TratarGrupo(usuario9).equals("Juan Carlos Lopez Montenegro"));
		System.out.println("-------------------------------------------------------");
	
		System.out.println(usuario10);
		System.out.print(TratarGrupo(usuario10)+"  ");
		System.out.println(TratarGrupo(usuario10).equals("Ana Maria Acosta Perez"));
		System.out.println("-------------------------------------------------------");
	

		System.out.println(usuario11);
		System.out.print(TratarGrupo(usuario11)+"  ");
		System.out.println(TratarGrupo(usuario11).equals("Alba Maria Perz Ortega"));
		System.out.println("-------------------------------------------------------");
	
		

		System.out.println(usuario12);
		System.out.print(TratarGrupo(usuario12)+"  ");
		System.out.println(TratarGrupo(usuario12).equals("Jose Maria Aleman Perez"));
		System.out.println("-------------------------------------------------------");
	
		
		
		System.out.println("PRUEBAS DEL APARTADO 2: \n");
		
	
		String s = (usuario1)+",  "+(usuario2)+", "+(usuario3)+", "+(usuario4)+", "+(usuario5)+", "+(usuario6)
				+", "+(usuario7)+ ", "+ (usuario8)+", "+(usuario9)+", "+(usuario10)+", "+(usuario11)+", "+(usuario12);
	
	
		System.out.println("Hay " + Coincidencia(s, "Hector") + " personas que tienen nombre Hector");
		System.out.println("Hay " + Coincidencia(s, "Acosta") + " personas que tienen el apellido Acosta");
		System.out.println("Hay " + Coincidencia(s, "Manuel") + " personas que tienen nombre Manuel");
		System.out.println("Hay " + Coincidencia(s, "Aleman") + " personas que tienen el apellido Aleman");
		
		System.out.println("\nPRUEBAS DEL APARTADO 3: \n");
		
		System.out.println("Hay " + Coincidencia(s, "Maria" ) + " personas que tienen por segundo nombre Maria");
		System.out.println("Hay " + Coincidencia(s, "Acosta") + " personas que tienen por segundo apellido Acosta");
		System.out.println("Hay " + Coincidencia(s, "Perez" ) + " personas que tienen por segundo apellido Perez");
		System.out.println("Hay " + Coincidencia(s, "Marta" ) + " personas que tienen por segundo nombre Marta");
	
		
		System.out.println("\nPRUEBAS DEL APARTADO 4: \n");
	
		System.out.println("Hay " + NumerodeNombres(s) + "personas que tienen 2º Nombre");
		
		System.out.println("\nPRUEBAS DEL APARTADO 5: \n");
		
		String[] Lista = ListaDNI(s);
	
		for(int i = 0; i < Lista.length; i ++){
			System.out.println(Lista[i]);
		}
	}
}
