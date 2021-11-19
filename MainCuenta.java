//Luis Gerardo Estrada García
//No. de cuenta: 319013832

/**
 * Clase MainCuenta es el main de la clase Cuenta donde usamos los
 * métodos creados en ella 
 * @author Luis Gerardo Estrada García
 * @version 1.0
 */
public class MainCuenta{
    /**
     * Método main donde se usan los métodos de la clase Cuenta y les 
     * asignamos valores a los que lo requieren
     * @param args Los argumentos
     */
    public static void main(String[] args){

	// Llamé a la clase Cuenta en sus métodos constructores asignandoles
	// un nombre a cada uno y al segundo le asigne el valor requerido
	Cuenta constructor1 = new Cuenta();
	Cuenta constructor2 = new Cuenta("Roberto");

	// Imprimí el constructor1 que contiene los valores default con el
	// método toString que cree igualmente
	System.out.println(constructor1.toString());
	// Imprimí el constructor2 que contiene el valor que le asigne al
	// llamarlo con el método toString que cree igualmente
	System.out.println(constructor2.toString());

	// Llamé de nuevo a la clase Cuenta pero usando el método especial
	// para el titular que cree en ella
	Cuenta get1 = new Cuenta();
	// Llamé de nuevo a la clase Cuenta pero usando el método especial
	// para el dinero disponible que cree en ella
	Cuenta get2 = new Cuenta();

	// Le asigné los valores de titular y dinero disponible a los get
	get1.setTitular("Armando");
	get2.setDineroDisponible(585.10);

	// Imprimí lo mismo que el método toString, pero con los valores que
	// asigné en los métodos especiales get
	System.out.println("Titular: " + get1.getTitular() + "\n" + "Dinero disponible: $" + get2.getDineroDisponible());
    }
}
