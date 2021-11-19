//Luis Gerardo Estrada García
//No. de cuenta: 319013832

/**
 * Clase ParamValor aquí lo que hicimos fue ejemplificar el paso de parámetros 
 * por valor.
 * @author Luis Gerardo Estrada García
 * @version 1.0
 */
public class ParamValor {
    /**
     * Método main donde se usa una variable de tipo primitivo e intentamos con 
     * otro método cambiar el valor, pero no se puede.
     * @param args Los argumentos
     */
    public static void main(String[] args) {
         int a = 1;
	 int b = 2;
	 System.out.println("Valores de a y b: ");
	 System.out.println("a = " + a + " y b = " + b );
	 CambiarEnteros(a,b);
	 System.out.println("Valores nuevos de a y b: ");
	 System.out.println("a = " + a + " y b = " + b );
    }
 
    /**
     * Método CambiarEnteros donde le asigno nuevos valores a a y b
     * @param a El valor de a
     * @param b El valor de b
     */
    public static void CambiarEnteros(int a, int b) {
	a = 5;
	b = 10;
    }
}
