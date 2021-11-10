/**
 * Clase Cilindro donde sacamos el área y volumen de un cilindro
 * @author Luis Gerardo Estrada García
 * @version 1.0
 */
public class Cilindro {
    /**
     * Método main donde declaramos las variables y las operaciones necesarias
     * para calcular el área y volumen de un cilindro
     * @param args Los argumentos
     */
    public static void main(String[] args){

	// Decalramos las variables necesarias para sacar el área y volumen
	// del cilindro
       	int r = 10;
	int a = 20;
	double pi = 3.1416;
	int r2 = r * r;
	double area;
	double vol;

	// Definí la variable area con las operaciones que tiene que realizar
	// para sacar el área
	area = (2 * (pi * r * a)) + (2 * (pi * r2));
	// Definí la variable vol con las operaciones que tiene que realizar
	// para sacar el volumen
	vol = (pi * r2) * a;

	// Imprimí un mensaje de lo que hace el programa
	System.out.println("***Área y volumen del cilindro***");
	// Imprimí un mensaje donde da el área del cilindro a partir de los
	// valores asignados de cada dato
	System.out.println("El área del cilindro es: " + area + " cm²");
	// Imprimí un mensaje donde da el volumen del cilindro a partir de los
	// valores asignados de cada dato
	System.out.println("El volumen del cilindro es: " + vol + " cm³" );
    }
} 
//Luis Gerardo Estrada García
