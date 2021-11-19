//Luis Gerardo Estrada García
//No. de cuenta: 319013832

/**
 * Clase ParamRef aquí lo que hicimos fue ejemplificar el paso de parámetros 
 * por referencia.
 * @author Luis Gerardo Estrada García
 * @version 1.0
 */
public class ParamRef {
    /**
     * Método donde declaramos la variable valor de tipo integer
     */
    public int valor;
    /**
     * Método referencia donde modificamos el valor de la variable x a 3 usando
     * la variable valor anterior
     *
     * @param x Una variable x
     */
    public static void referencia(ParamRef x) {
	x.valor = 3;
    }
    /**
     * Método main donde creamos una variable x1 a la que le asignamos primero 
     * valor = 2 y luego de aplicarle el método referencia ahora vale 3, ya que 
     * ahí asignamos valor = 3
     *
     * @param args Los argumentos
     */
    public static void main(String[] args){
	ParamRef x1 = new ParamRef();
	x1.valor = 2;
	System.out.println("Valor de x1: " + x1.valor);
	referencia(x1);
	System.out.println("Nuevo valor de x1: " + x1.valor);
    }
}

