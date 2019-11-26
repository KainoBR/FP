package ejerciciosResueltos;
/**
 * 
 * @author miki
 * 3) Haz una clase llamada Password que siga las siguientes condiciones:
 * 
 * Que tenga los atributos longitud y contrase�a de tipo String. Por defecto, la longitud sera de 8.
 * 
 * Los constructores ser�n los siguiente:
 * 
 * - Un constructor por defecto.
 * - Un constructor por par�metros con la longitud que nosotros le pasemos. 
 * Generara una contrase�a aleatoria con esa longitud.
 * Para ello se te proporciona el m�todo generarPassword(), que genera la contrase�a con la longitud que tenga.
 * Para llamarlo solo debes hacerlo de la siguiente forma:
 * 
 * String contrase�a;
 * contrase�a = Clave.generarPassword(longitud);
 * 
 * �Devuelve una String!
 * 
 * Los m�todos que implementa ser�n:
 * 
 * + M�todo get para contrase�a y longitud.
 * + M�todo set para longitud.(CONTRASE�A NO)
 * Nota: si cambia la longitud, debe cambiar al contrase�a 
 *
 * + esFuerte(): devuelve un booleano si es fuerte o no, para que sea fuerte debe tener mas de 2 may�sculas, mas de 1 min�scula y mas de 5 n�meros.
 *
 * Nota: hasta que no implementes los m�todos, habr� muchos errores en la clase Uso_password()
 * 
 */
public class PasswordResuelto {
	//creamos los dos atributos, contrase�a y longitud
		private int longitud;
		private String contrase�a = "";
		
		/*
		 * Como nos dicen en el enunciado, para generar una contrase�a llamamos al m�todo generarPassword();
		 * Como la contrase�a es un atributo, a la hora de generarla, utilizaremos el m�todo.
		 */
		
		//Constructor por defecto
		public PasswordResuelto(){
			longitud = 8;
			contrase�a = Clave.generarPassword(8);//generamos contrase�a
		}
		
		
		
		//Constructor por par�metros
		public PasswordResuelto(int longitud){
			this.longitud = longitud;
			contrase�a = Clave.generarPassword(longitud);//generamos contrase�a
		}
		
		//Getter//
		public String getContrase�a(){
			return contrase�a;
		}
		
		public int getLongitud(){
			return longitud;
		}
		
		//Setter//
		public void setLongitud(int l){
			longitud = l;
			contrase�a = Clave.generarPassword(l);//cambiamos la contrase�a
		}
		
		/**
		 * M�todo esFuerte(): comprueba la calidad de la contrase�a (como nos indica el enunciado)
		 * @return true si es fuerte, false si no lo es.
		 */
		public boolean esFuerte(){
			//Variables de apoyo para contar Letras y numeros
			int cuentanumeros=0; //numeros
			int cuentaminusculas=0;//minusculas
			int cuentamayusculas=0;//mayusculas
			
			//Vamos caracter a caracter y comprobamos que tipo de caracter es
			for (int i=0;i<contrase�a.length();i++){
					//si es una letra minuscula
					if (contrase�a.charAt(i)>='a' && contrase�a.charAt(i)<='z'){
						cuentaminusculas+=1;
					}else{ //si es una letra mayuscula
						if (contrase�a.charAt(i)>='A' && contrase�a.charAt(i)<='Z'){
							cuentamayusculas+=1;
						}else{ // si no es ninguna de las dos anteriores, es un numero
							cuentanumeros+=1;
						}
					}
	        	}
	        	//Si la constrase�a tiene mas de 5 numeros, mas de 1 minuscula y mas de 2 mayusculas
	        	if (cuentanumeros>=5 && cuentaminusculas>=1 && cuentamayusculas>=2){
	        		return true;
	        	}else{
	        		return false;
	        	}
		}
}
