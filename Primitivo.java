/**
 * Clase Primitivo donde vimos los tipos primitivos de Java y vimos cuantos
 * bytes ocupa cada uno de los tipos
 * @author Luis Gerardo Estrada García
 * @version 1.0
 */
public class Primitivo {
    /**
     * Método main donde declaramos las variables y imprimimos los mensajes
     * para ver cuantos bytes ocupa cada tipo primitivo
     * @param args Los argumentos
     */
    public static void main(String[] args) {

	// Decalramos las variables de cada tipo primitivo con un valor de 1
	// y de false para el boolean
	byte a = 1;
	short b = 1;
	int c = 1;
	long d = 1;
	float e = 1.0f;
	double f = 1.0;
	boolean g = false;
	char h = '1';

	// Imprimí un mensaje de lo que hace el programa
        System.out.println("***Tipos primitivos***");
	// Imprimí un mensaje donde veo los bytes que ocupa un byte
	System.out.println("El tipo primitivo Byte ocupa: " + Byte.BYTES + " byte");
	// Imprimí un mensaje donde veo los bytes que ocupa un short
	System.out.println("El tipo primitivo Short ocupa: " + Short.BYTES + " bytes");
	// Imprimí un mensaje donde veo los bytes que ocupa un integer
	System.out.println("El tipo primitivo Integer ocupa: " + Integer.BYTES + " bytes");
	// Imprimí un mensaje donde veo los bytes que ocupa un long
	System.out.println("El tipo primitivo Long ocupa: " + Long.BYTES + " bytes");
	// Imprimí un mensaje donde veo los bytes que ocupa un float
	System.out.println("El tipo primitivo Float ocupa: " + Float.BYTES + " bytes");
	// Imprimí un mensaje donde veo los bytes que ocupa un double
	System.out.println("El tipo primitivo Double ocupa: " + Double.BYTES + " bytes");
	// Imprimí un mensaje donde veo los bytes que ocupa un boolean
	System.out.println("El tipo primitivo Boolean ocupa: 1 bytes");
	// Imprimí un mensaje donde veo los bytes que ocupa un character
	System.out.println("El tipo primitivo Character ocupa: " + Character.BYTES + " bytes");
    }
}
//Luis Gerardo Estrada García
