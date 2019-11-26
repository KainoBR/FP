package ejemplo;

/**
 * 
 * @author Miki
 * Clase que incorpora el main para realizar las pruebas, instancias y llamadas. 
 *
 */
public class Uso_Cuadrado {

	public static void main(String[] args) {
		
		
		
		//Creamos el Objeto "Cuadrado" 'c0' llamando al construcor por defecto
		Cuadrado c0 = new Cuadrado();
		System.out.println(c0);
				
		System.out.println(c0.getLado());
		
		//c0.lado = 5; //si descomentamos esta linea dará error porque lado es private
		c0.setLado(5);
		
		
		System.out.println(c0.getLado());
		System.out.println(c0);
		
		
		//Creamos el Objeto "Cuadrado" 'c1' llamando al construcor por parámetro

		Cuadrado c1 = new Cuadrado(3);
		//System.out.println(c1);
		
		System.out.println(c1.equals(c0));
		
		
		//Probamos el GetLado
		System.out.println("\nEl primer cuadrado tiene: " +c0.getLado()+ " cm de lado");
		System.out.println("El segundo cuadrado tiene: " +c1.getLado()+ " cm de lado\n");		
		
		//Probamos lo métodos propios (Perímetro y Area)
		System.out.println("El Perímetro del 1º es de: "+ c0.Perimetro() + " cm");
		System.out.println("El Perímetro del 2º es de: "+ c1.Perimetro() + " cm\n");
		
		System.out.println("El área del 1º es de: "+ c0.Area() + " cm^2");
		System.out.println("El área del 2º es de: "+ c1.Area() + " cm^2\n");
		
		System.out.println("Vamos a modificar el 1º cuadrado: ");
		
		//probamos el SetLado
		c0.setLado(3);
		
		System.out.println("El primer cuadrado tiene: " +c0.getLado()+ " cm de lado");
		System.out.println("El Perímetro del 1º es de: "+ c0.Perimetro() + " cm");
		System.out.println("El área del 1º es de: "+ c0.Area() + " cm^2");
		
		System.out.println("\n¿son el 1º y el 2º iguales?");

		System.out.println(c0);
		System.out.println(c1);
		
	}

}
