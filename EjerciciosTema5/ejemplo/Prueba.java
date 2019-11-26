package ejemplo;
import java.util.Scanner;

public class Prueba {
	public static void main(String[] args) {
		Lista lis=new Lista();
		int x;
		
		Scanner teclado=new Scanner(System.in);
		
		
		int n = 0;
		while(n < 5){
			System.out.print("\nInserta un elemento: ");
			x = teclado.nextInt();
			lis.insertar(x);
			n++;
		}
		
		System.out.println("Lista: ");
		lis.mostrar();
		teclado.close();
	}
}