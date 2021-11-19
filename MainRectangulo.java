//Luis Gerardo Estrada García
//319013832

/**
 * Clase MainRectangulo es el main de la clase Rectangulo donde usamos los
 * métodos creados en ella 
 * @author Luis Gerardo Estrada García
 * @version 1.0
 */
public class MainRectangulo{
    /**
     * Método main donde se usan los métodos de la clase Rectangulo y les 
     * asignamos valores a los que lo requieren
     * @param args Los argumentos
     */
    public static void main(String[] args){

	// Llamé a la clase Rectangulo en sus métodos constructores asignandoles
	// un nombre a cada uno y al segundo le asigne los valores requeridos
	Rectangulo constructor1 = new Rectangulo();
	Rectangulo constructor2 = new Rectangulo(10, 5);

	// Imprimí el constructor1 que contiene los valores default con el
	// método toString que cree igualmente
	System.out.println(constructor1.toString());
	// Imprimí el constructor2 que contiene los valores que le asigne al
	// llamarlo con el método toString que cree igualmente
	System.out.println(constructor2.toString());

	// Llamé de nuevo a la clase Rectangulo pero usando los métodos
	// especiales que cree en ella
	Rectangulo get = new Rectangulo();

	// Le asigné los valores de base y altura a los get
	get.setBase(12);
	get.setAltura(6);

	// Imprimí lo mismo que el método toString, pero con los valores que
	// asigné en los métodos especiales get
	System.out.println("Altura: " + get.getAltura() + "\n" + "Base: " + get.getBase()+ "\n" + "Area: " + get.Area() + "\n" + "Perimetro: " + get.Perimetro());
    }
}
