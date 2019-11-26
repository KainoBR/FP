package ejerciciosResueltos;

/**
 * (ábreme)
 * @author miki
 * 
 * Ejercicio 4 del tema 4: "Paquetes y Clases"
 * 
 * En este ejercicio hay que desarrollar las 3 clases propuestas (Electrodomestico, Lavadora, Television)
 * El main está en la clase ya desarrollada "Uso_Electrodomestico". 
 * Cuando hayas al menos declarado todos los métodos, podrás ejecutar el main. Si lo haces antes dará fallos. 
 * Intenta que las variables, los métodos y las clases tengan el mismo nombre que lo que te indica el enunciado. Si cambias algo
 * las pruebas pueden fallar. 
 * 
 * ========================================================================================================================
 * Clase Electrodomestico:
 * Desarrolle la clase "Electrodomestico" con las siguientes características:
 * 
 * Sus atributos son:
 * 	+ precio base(int)
 *  + color(string)
 *  + consumo energético (letras entre A y F) 
 *  + peso(int)
 *  
 *  
 * Por defecto, el color sera "blanco", el consumo energético sera 'F', el precioBase es de 100 € y el peso de 5 kg. 
 * 
 * Los colores disponibles son blanco, negro, rojo, azul y gris.
 * (si quieres añadir más colores no se verán reflejados en las pruebas y podría dar error)
 * 
 * ========================================================================================================================
 * Los constructores que se implementaran serán:
 * 
 *	- Un constructor por defecto.
 * 	- Un constructor por parámetros con todos los atributos.
 *	
 * Los métodos que implementara serán:
 * 
 * Métodos get de todos los atributos.
 * 
 * comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta, si no es correcta usara la letra por defecto. Se invocara al crear el objeto y no sera visible.
 * 
 * comprobarColor(String color): comprueba que el color es correcto, sino lo es usa el color por defecto. Se invocara al crear el objeto y no sera visible.
 * ========================================================================================================================
 * 
 * precioFinal(): según el consumo energético, aumentara su precio, y según su tamaño, también. 
 * 	Esta es la lista de precios:
 * 
 *  LETRA	  PRECIO
 *  
 *    A	      100 €
 *    B	      80 €
 *    C	      60 €
 *    D	      50 €
 *    E	      30 €
 *    F	      10 €
 *    
 *  	TAMAÑO	    		PRECIO
 *  
 * Entre  0 y 19  kg		10 €
 * Entre  20 y 49 kg	 	50 €
 * Entre  50 y 79 kg		80 €
 * Mayor que 80   kg		100 €
 *
 * 
 */


public class ElectrodomesticoResuelto {
	
	    protected double precioBase;
	    protected String color;
	    protected char consumoEnergetico;
	    protected double peso;
	   
	    //Constructores
	    public ElectrodomesticoResuelto(){
	    	precioBase=100;
	    	peso=10;
	    	consumoEnergetico='F';
	    	color="blanco";
	    }
	    
	    /**
	     * Constructor con 4 parametros
	     * @param precioBase
	     * @param peso
	     * @param consumoEnergetico
	     * @param color
	     */
	    public ElectrodomesticoResuelto(double precioBase, double peso, char consumoEnergetico, String color){
	    	this.precioBase=precioBase;
	    	this.peso=peso;
	    	comprobarConsumoEnergetico(consumoEnergetico);
	    	comprobarColor(color);
	    }
	    

	    //Métodos privados
	    private void comprobarColor(String color){
	   
	        //Colores disponibles
	        String colores[]={"blanco", "negro", "rojo", "azul", "gris"};
	        boolean encontrado=false;
	  
	        for(int i=0;i<colores.length && !encontrado;i++){
	              
	            if(colores[i].equals(color)){
	                encontrado=true;
	            }
	        }
	        if(encontrado){
	            this.color=color;
	        }else{
	            this.color="blanco";
	        }
	    }
	      
	    /**
	     * Comprueba el consumo energetico
	     * Solo mayusculas, si es una 'a' no lo detecta como una 'A'
	     * @param consumoEnergetico
	     */
	    public void comprobarConsumoEnergetico(char consumoEnergetico){
	        if(consumoEnergetico>=65 && consumoEnergetico<=70){
	            this.consumoEnergetico=consumoEnergetico;
	        }else{
	            this.consumoEnergetico='F';
	        }
	          
	    }
	   
	    //Métodos publicos
	    /**
	     * Devuelve el precio base del electrodomestico
	     * @return precio base del electrodomestico
	     */
	    public double getPrecioBase() {
	        return precioBase;
	    }
	    /**
	     * Devuelve el color del electrodomestico
	     * @return color del elesctrodomestico
	     */
	    public String getColor() {
	        return color;
	    }
	     /**
	     * Devuelve el consumo energetico del electrodomestico
	     * @return consumo energetico del electrodomestico
	     */
	    public char getConsumoEnergetico() {
	        return consumoEnergetico;
	    }
	    /**
	     * Devuelve el peso del electrodomestico
	     * @return peso del electrodomestico
	     */
	    public double getPeso() {
	        return peso;
	    }
	    
	    
	    /**
	     * Precio final del electrodomestico
	     * @return hola chicos 
	     */
	    public double precioFinal(){
	        double add=0;
	        switch(consumoEnergetico){
	            case 'A':
	                add+=100;
	                break;
	            case 'B':
	                add+=80;
	                break;
	            case 'C':
	                add+=60;
	                break;
	            case 'D':
	                add+=50;
	                break;
	            case 'E':
	                add+=30;
	                break;
	            case 'F':
	                add+=10;
	                break;
	        }
	   
	        if(peso>=0 && peso<19){
	            add+=10;
	        }else if(peso>=20 && peso<49){
	            add+=50;
	        }else if(peso>=50 && peso<=79){
	            add+=80;
	        }else if(peso>=80){
	            add+=100;
	        }
	   
	        return precioBase+add;
	    }
	   
}
	
