//Luis Gerardo Estrada García
//No. de cuenta: 319013832
import java.util.Scanner;
/**
 * Clase Bisiesto donde introducimos un año y vemos si ese año es bisiesto o no
 * usando el ciclo if
 * @author Luis Gerardo Estrada García
 * @version 1.0
 */
public class Bisiesto {
    /**
     * Método main donde se pide ingresar el año del cual se quiere saber si es
     * bisiesto o no y con el ciclo if se hace una condición para saber si es
     * bisiesto, si la cumple se imprime que ese año es bisiesto y si no la 
     * cumple entonces se imprime que no lo es.
     * @param args Los argumentos
     */
    public static void main(String[] args) {
	// Imprimí un mensaje de lo que hace el programa
	System.out.println("*** Bisiesto ***");
	// Le asigne el nombre valor al Scanner
	Scanner valor = new Scanner(System.in);
	// Imprimo un mensaje para indicar que tienes que ingresar un año
	System.out.print("Ingresa el año del que deseas saber si es bisiesto o no: ");
	// Declaré una variable año la cual es de tipo integer y es igual a lo
	// que se introduzca en el scanner como año
	int año = valor.nextInt();

	// En el if escribimos la condición que sirve para saber si un año es
	// bisiesto o no
	if((año % 400 == 0) || (año % 4 == 0) && (año % 100 != 0)){
	    // Si cumple la condición se imprime que ese año es bisiesto
	    System.out.println("El año " + año + " es bisiesto");
	} else {
	    // Si no cumple la condición se imprime que el año no es bisiesto
	    System.out.println("El año " + año + " no es bisiesto");
	}
    }
}
