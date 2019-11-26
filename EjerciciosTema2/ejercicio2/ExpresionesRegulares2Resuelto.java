package ejercicio2;

//Importamos el Matcher y el Patterns para que funcionen
import java.util.regex.Matcher; 
import java.util.regex.Pattern;

public class ExpresionesRegulares2Resuelto {
	

	
	
	

		
	/**
	 *  1º) Crear una String que concatene, separando por espacios,todos los Nombres de usuario 
	 * @param s, la String a tratar
	 * 
	 * @return una String con todos los Nombres de usuario
	 */
	
	public static String TratarGrupo(String s){
		
		
		Pattern p = Pattern.compile("(([A-Z]\\w+)\\s+([A-Z]\\w+)*)\\s*([A-Z]\\w+)\\s+([A-Z]\\w+)");
		Matcher m = p.matcher(s);
		
		String res = "";
	
		while (m.find()){
			
			res += m.group();
			
		}
		return res;
	}
	/**
	 * 	2º) Muestra en pantalla las veces que se repite el parámetro "nombre"
	 * 
	 * @param s, la String a tratar
	 * @param nombre, el nombre o apellido a buscar
	 * 
	 * @return el numero de veces que se repite el nombre pasado por parámetro.
	 */
	public static int Coincidencia(String s, String nombre){
		Pattern p = Pattern.compile(nombre);
		Matcher m = p.matcher(s);
		
		int cont = 0;
	
		while (m.find()){
			cont++;
		}
		return cont;
	}
	/**
	 *  3º) muestre en pantalla las veces que se repite
	 *  	un determinado
	 * 
	 * @param s
	 * @param nombre2
	 * 
	 * @return
	 */
	public static int Coincidencia2 (String s, String nombre2){
		Pattern p1 = Pattern.compile("\\w+ "+nombre2);
		Matcher m1 = p1.matcher(s);
		
		int cont = 0;
		
		while (m1.find()){
			
			cont++;
		}
		return cont;
	}
	/**
	 * 
	 * @param s
	 * @param nombre2
	 * @return
	 */
	public static int NumerodeNombres (String s){
		Pattern p = Pattern.compile("([A-Z][a-z]+ ){4}");
		Matcher m = p.matcher(s);
		
		int cont = 0;

		while (m.find()){
			cont++;
		}
		return cont;
	}
	/**
	 * 
	 * @param s
	 * @return
	 */
	public static String[] ListaDNI (String s){
		Pattern p = Pattern.compile("(\\w+\\s+\\w*\\s*\\w+\\s+\\w+\\s+)(\\d{8}-[A-Z]\\s+id:)(\\d+)");
		Matcher m = p.matcher(s);
		
		int[] orden = new int[s.split(", ").length];
		String[] aux = s.split(", ");
		int pos = 0;
		while(m.find()){
			orden[pos] = Integer.parseInt(m.group(3));
			pos++;
		}
		
		String[] res = new String[s.split(", ").length];
		for(int i = 0; i < aux.length; i ++){
			res[orden[i]-1] = aux[i];
		}
			
		
		return res;
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
		
	
		String s = (usuario1)+", "+(usuario2)+", "+(usuario3)+", "+(usuario4)+", "+(usuario5)+", "+(usuario6)
				+", "+(usuario7)+ ", "+ (usuario8)+", "+(usuario9)+", "+(usuario10)+", "+(usuario11)+", "+(usuario12);
	
	
		System.out.println("Hay " + Coincidencia(s, "Hector") + " personas que tienen nombre Hector");
		System.out.println("Hay " + Coincidencia(s, "Acosta") + " personas que tienen el apellido Acosta");
		System.out.println("Hay " + Coincidencia(s, "Manuel") + " personas que tienen nombre Manuel");
		System.out.println("Hay " + Coincidencia(s, "Aleman") + " personas que tienen el apellido Aleman");
		
		System.out.println("\nPRUEBAS DEL APARTADO 3: \n");
		
		System.out.println("Hay " + Coincidencia2(s, "Maria" ) + " personas que tienen por segundo nombre Maria");
		System.out.println("Hay " + Coincidencia2(s, "Acosta") + " personas que tienen por segundo apellido Acosta");
		System.out.println("Hay " + Coincidencia2(s, "Perez" ) + " personas que tienen por segundo apellido Perez");
		System.out.println("Hay " + Coincidencia2(s, "Marta" ) + " personas que tienen por segundo nombre Marta");
	
		
		System.out.println("\nPRUEBAS DEL APARTADO 4: \n");
	
		System.out.println("Hay " + NumerodeNombres(s) + " personas que tienen 2º Nombre");
		
		System.out.println("\nPRUEBAS DEL APARTADO 5: \n");
		
		String[] Lista = ListaDNI(s);
	
		for(int i = 0; i < Lista.length; i ++){
			System.out.println(Lista[i]);
		}
	}

}
