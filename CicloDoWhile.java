//Luis Gerardo Estrada García
//No. de cuenta: 319013832

/**
 * Clase CicloDoWhile aquí hicimos lo mismo que en la clase CicloFor, pero en
 * esta ocasión usamos el ciclo do while para imprimir los números primos entre
 * el 1 y el 1000
 * @author Luis Gerardo Estrada García
 * @version 1.0
 */
public class CicloDoWhile {
    /**
     * Método main donde se hace el ciclo do while para que imprima los números 
     * primos que indicamos, en este caso son del 1 al 1000
     * @param args Los argumentos
     */
    public static void main(String[] args){

	// Imprimí un mensaje de lo que hace el programa
	System.out.println("*** Números primos del 1 al 1000 con ciclo Do-While ***");
	// Imprimí un mensaje que dice que el número 2 es primo
	System.out.println("El número 2 es primo");

	// Decalre dos variables tipo integer iguales a 1 llamadas i y j y una
	// tipo boolean llamada esPrimo
	int i = 1;
	int j = 1;
	boolean esPrimo;

	// Hice el ciclo do while que tiene otro anidado para el cumplir con lo
	// que se busca hacer, imprime el número si es primo en una línea y el
	// sigueinte en otra línea
	do{
	    esPrimo = true;
	    do {
		if(i % j == 0) {
		    esPrimo = false;
		    break;
		}
	    } while(j++ < i/2);
	    if(esPrimo) {
		System.out.println("El número " + i + " es primo");
	    }
	    j = 2;
	}  while(i++ < 1000);
    }
}
