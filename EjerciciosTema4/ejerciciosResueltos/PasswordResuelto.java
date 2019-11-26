package ejerciciosResueltos;
/**
 * 
 * @author miki
 * 3) Haz una clase llamada Password que siga las siguientes condiciones:
 * 
 * Que tenga los atributos longitud y contraseña de tipo String. Por defecto, la longitud sera de 8.
 * 
 * Los constructores serán los siguiente:
 * 
 * - Un constructor por defecto.
 * - Un constructor por parámetros con la longitud que nosotros le pasemos. 
 * Generara una contraseña aleatoria con esa longitud.
 * Para ello se te proporciona el método generarPassword(), que genera la contraseña con la longitud que tenga.
 * Para llamarlo solo debes hacerlo de la siguiente forma:
 * 
 * String contraseña;
 * contraseña = Clave.generarPassword(longitud);
 * 
 * ¡Devuelve una String!
 * 
 * Los métodos que implementa serán:
 * 
 * + Método get para contraseña y longitud.
 * + Método set para longitud.(CONTRASEÑA NO)
 * Nota: si cambia la longitud, debe cambiar al contraseña 
 *
 * + esFuerte(): devuelve un booleano si es fuerte o no, para que sea fuerte debe tener mas de 2 mayúsculas, mas de 1 minúscula y mas de 5 números.
 *
 * Nota: hasta que no implementes los métodos, habrá muchos errores en la clase Uso_password()
 * 
 */
public class PasswordResuelto {
	//creamos los dos atributos, contraseña y longitud
		private int longitud;
		private String contraseña = "";
		
		/*
		 * Como nos dicen en el enunciado, para generar una contraseña llamamos al método generarPassword();
		 * Como la contraseña es un atributo, a la hora de generarla, utilizaremos el método.
		 */
		
		//Constructor por defecto
		public PasswordResuelto(){
			longitud = 8;
			contraseña = Clave.generarPassword(8);//generamos contraseña
		}
		
		
		
		//Constructor por parámetros
		public PasswordResuelto(int longitud){
			this.longitud = longitud;
			contraseña = Clave.generarPassword(longitud);//generamos contraseña
		}
		
		//Getter//
		public String getContraseña(){
			return contraseña;
		}
		
		public int getLongitud(){
			return longitud;
		}
		
		//Setter//
		public void setLongitud(int l){
			longitud = l;
			contraseña = Clave.generarPassword(l);//cambiamos la contraseña
		}
		
		/**
		 * Método esFuerte(): comprueba la calidad de la contraseña (como nos indica el enunciado)
		 * @return true si es fuerte, false si no lo es.
		 */
		public boolean esFuerte(){
			//Variables de apoyo para contar Letras y numeros
			int cuentanumeros=0; //numeros
			int cuentaminusculas=0;//minusculas
			int cuentamayusculas=0;//mayusculas
			
			//Vamos caracter a caracter y comprobamos que tipo de caracter es
			for (int i=0;i<contraseña.length();i++){
					//si es una letra minuscula
					if (contraseña.charAt(i)>='a' && contraseña.charAt(i)<='z'){
						cuentaminusculas+=1;
					}else{ //si es una letra mayuscula
						if (contraseña.charAt(i)>='A' && contraseña.charAt(i)<='Z'){
							cuentamayusculas+=1;
						}else{ // si no es ninguna de las dos anteriores, es un numero
							cuentanumeros+=1;
						}
					}
	        	}
	        	//Si la constraseña tiene mas de 5 numeros, mas de 1 minuscula y mas de 2 mayusculas
	        	if (cuentanumeros>=5 && cuentaminusculas>=1 && cuentamayusculas>=2){
	        		return true;
	        	}else{
	        		return false;
	        	}
		}
}
