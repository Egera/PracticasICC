//Luis Gerardo Estrada García
//No. de cuenta: 319013832

/**
 * Clase Rectangulo donde asignamos los valores de un rectángulo, como la base y
 * altura y con esas medidas sacamos el área y perímetro del rectángulo
 * @author Luis Gerardo Estrada García
 * @version 1.0
 */
public class Rectangulo{
    // La base del rectángulo
    private double base;
    // La altura del rectángulo
    private double altura;
    // El área del rectángulo
    private double area;
    // El perímetro del rectángulo
    private double perimetro;
    
    /**
     * Método que calcula el área del rectángulo
     *
     * @return area El área del rectángulo
     */
    public double Area(){
	return this.base * this.altura;
    }

    /**
     * Método que calcula el perímetro del rectángulo
     *
     * @return perimetro El perímetro del rectángulo
     */
    public double Perimetro(){
	return (this.base * 2) + (this.altura * 2);
    }

    /**
     * Constructor al que le definimos valores default del rectángulo
     */
    public Rectangulo(){
	this.base = 4;
	this.altura = 8;
	this.area = Area();
	this.perimetro = Perimetro();
    }

    /**
     * Constructor al que le definimos valores al rectángulo distintos a los 
     * de default
     * @param base La base del rectángulo
     * @param altura La altura del rectángulo
     */
    public Rectangulo(double base, double altura){
	this.base = base;
	this.altura = altura;
	this.area = Area();
	this.perimetro = Perimetro();
    }

    /**
     * Método que devuelve la base del rectángulo
     *
     * @return base
     */
    public double getBase(){
	return this.base;
    }

    /**
     * Método que cambia la base del rectángulo
     *
     * @param base La base del rectángulo
     */
    public void setBase(double base){
	this.base = base;
    }

     /**
     * Método que devuelve la altura del rectángulo
     *
     * @return altura
     */
    public double getAltura(){
	return this.altura;
    }

    /**
     * Método que cambia la altura del rectángulo
     *
     * @param altura La altura del rectángulo
     */
    public void setAltura(double altura){
	this.altura = altura;
    }

    /**
     * Método toString que imprime la base, altura, área y perímetro del 
     * rectángulo
     * @return Los datos del rectángulo
     */
    public String toString(){
	return "Altura: " + altura + "\n" + "Base: " + base + "\n" + "Area: " + area + "\n" + "Perimetro: " + perimetro;
    }
}
