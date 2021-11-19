//Luis Gerardo Estrada García
//No. de cuenta: 319013832
import java.util.Scanner;
/**
 * Clase Condicionales aquí introducimos dos números cualesquiera de tipo 
 * integer y vemos si cual es el numero mayor y si son iguales decimos que 
 * ambos números son iguales
 * @author Luis Gerardo Estrada García
 * @version 1.0
 */
public class Condicionales {
    /**
     * Método main donde pedimos 2 números a través del scanner y vemos cual es
     * el mayor entre ellos y si son iguales decimos que ambos números son 
     * iguales
     * @param args Los argumentos
     */
    public static void main(String[] args) {
	// Imprimí un mensaje de lo que hace el programa
	System.out.println("*** Condicionales ***");
	// Le asigne el nombre num al Scanner
        Scanner num = new Scanner(System.in);
	// Imprimo un mensaje para indicar que tienes que ingresar un número
	System.out.print("Dame el número 1: ");
	// Declaré una variable n1 la cual es de tipo integer y es igual a lo
	// que se introduzca en el scanner primero
	int n1 = num.nextInt();
	// Imprimo un mensaje para indicar que tienes que ingresar un número
	System.out.print("Dame el número 2: ");
	// Declaré una variable n2 la cual es de tipo integer y es igual a lo
	// que se introduzca en el scanner como segundo número
	int n2 = num.nextInt();

	// En el if escribimos la condición donde el número 1 es mayor que el
	// segundo y si lo es entonces imprimimos que el número 1 es el mayor
	if(n1 > n2) {
	    System.out.println("El número mayor es: " + n1);
	    // En el else if escribimos la condición donde el número 2 es mayor
	    // que el primero y si lo es entonces imprimimos que el número 2 es
	    // el mayor
	} else if(n2 > n1) {
	    System.out.println("El número mayor es: " + n2);
	    // En el else puse que si ambos números eran iguales entonces
	    // imprimiera que ambos números son iguales
	} else {
	    System.out.println("Ambos números son iguales: " + n1 + " y " +  n2);
	}
    }
}
