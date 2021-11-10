//Luis Gerardo Estrada García
//No. de cuenta: 319013832

/**
 * Clase Cuenta aquí asignamos una cuenta a un usuario y le asignamos el dinero
 * disponible que tiene ese usuario en su cuenta
 * @author Luis Gerardo Estrada García
 * @version 1.0
 */
public class Cuenta{

    // El nombre del titular de la cuenta
    private String titular;
    // El dinero que tiene disponible en su cuenta el titular
    private double dineroDisponible;

    /**
     * Constructor al que le definimos valores default de titular y dinero 
     * disponible
     */
    public Cuenta(){
	this.titular = "Cristiano";
	this.dineroDisponible = 12352.10;
    }

    /**
     * Constructor al que le definimos el titular y el dinero disponible en 0
     * @param titular El titular de la cuenta
     */
    public Cuenta(String titular){
	this.titular = titular;
	this.dineroDisponible = 0;
    }

    /**
     * Método que devuelve el nombre del titular
     *
     * @return titular
     */
    public String getTitular(){
	return this.titular;
    }

    /**
     * Método que cambia el nombre del titular
     *
     * @param titular El nuevo nombre del titular
     */
    public void setTitular(String titular){
	this.titular = titular;
    }

    /**
     * Método que devuelve el dinero disponible de la cuenta del titular
     *
     * @return dineroDisponible
     */
    public double getDineroDisponible(){
	return this.dineroDisponible;
    }

    /**
     * Método que cambia el dinero disponible de la cuenta del titular
     *
     * @param dineroDisponible El nuevo dinero disponible de la cuenta
     */
    public void setDineroDisponible(double dineroDisponible){
	this.dineroDisponible = dineroDisponible;
    }

    /**
     * Método toString que imprime el titular y el dinero que tiene disponible
     * en la cuenta
     * @return Los datos de la cuenta
     */
    public String toString(){
	return "Titular: " + titular + "\n" + "Dinero disponible: $" + dineroDisponible;
    }
}
