//Luis Gerardo Estrada García
//No. de cuenta: 319013832

/**
 * Clase CicloFor aquí lo que hicimos es que, usando el ciclo For, imprimimos 
 * los números primos que hay entre el 1 y el 1000
 * @author Luis Gerardo Estrada García
 * @version 1.0
 */
public class CicloFor {
    /**
     * Método main donde se hace el ciclo For para que imprima los números 
     * primos que indicamos, en este caso son del 1 al 1000
     * @param args Los argumentos
     */
    public static void main(String[] args){
	// Declaré una variable numero tipo integer igual a 1000
        int numero = 1000;

	// Imprimí un corchete de apertura "["
	System.out.print("[");

	// Hice el ciclo For para que imprimera los números primos del 1 al 1000
	// y que esten separados por un espacio todos ellos
	for(int x = 1; x < numero; x++) {
	    int z = 0;
	    for(int y = 1; y <= x; y++){
		if(x % y == 0) {
		    z++;
		}
	    }
	    if(z == 2){
		System.out.print(x + " ");
	    }
	}
	// Imprimí un corchete de cierre "]"
	System.out.print("]");
    }
}
