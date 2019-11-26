package ejerciciosResueltos;

public class Clave {
	 public static String generarPassword(int longitud){
		 String clave = "";
	        for (int i=0;i<longitud;i++){
	            //Generamos un numero aleatorio, segun este elige si añadir una minuscula, mayuscula o numero
	            int eleccion=((int)Math.floor(Math.random()*3+1));
	  
	            if (eleccion==1){
	                char minusculas=(char)((int)Math.floor(Math.random()*(123-97)+97));
	               clave+=minusculas;
	            }else{
	                if(eleccion==2){
	                    char mayusculas=(char)((int)Math.floor(Math.random()*(91-65)+65));
	                   clave+=mayusculas;
	                }else{
	                    char numeros=(char)((int)Math.floor(Math.random()*(58-48)+48));
	                   clave+=numeros;
	                }
	            }
	        }
	        return clave;
	    }
	 
}
