package figure;

/**
 * Represents a circle class and with some of the calculations that can be performed
 *
 * @author Sebastian Dario Giraldo Rodas
 */
public class Circle extends Figure{

    //Represents the mathematical constant of PI
    private static final double PI = 3.14159265358979;
    //Represents the radius of the circle
    private double radius;

    //Constructor
    //Create an instance of the circle class
    public Circle (double radius) {
        this.radius = radius;
    }


    //Getters and Setters
    //Are methods to get and change the instantiated values respectively

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    //Metodos abstractos de la super clase

    /**
     *
     * @return the total area of circle
     */
    @Override
    public double calculateArea() {
        this.area = PI * (Math.pow(this.radius,2));
        return this.area;
    }


    /**
     *
     * @return the total perimeter of circle
     */
    @Override
    public double calculatePerimeter() {
        this.perimeter = 2 * PI * this.radius;
        return this.perimeter;
    }
}
