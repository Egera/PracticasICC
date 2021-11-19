//Luis Gerardo Estrada García
//No. de cuenta: 319013832

/**
 * Clase ParamValRef aqui hacemos el ejercicio 3 de la práctica, conseguir 
 * que se modifiquen los valores en el método main de las variables 
 * @author Luis Gerardo Estrada García
 * @version 1.0
 */
public class ParamValRef {
    /**
     * Método main donde hacemos lo que buscamos de modificar los valores en 
     * este mismo método usando un ciclo for
     * @param args Los argumentos
     */
    public static void main(String[] args) {
         int a = 1;
	 int b = 2;
	 System.out.println("Valores de a y b: ");
	 System.out.println("a = " + a + " y b = " + b );
	 for(int i = 0; i < b; i++){
	     a += 1;
	 }
	 for(int i = 0; i < a; i++){
	     b += 1;
	 }
	 System.out.println("Valores nuevos de a y b: ");
	 System.out.println("a = " + a + " y b = " + b );
    }
}
