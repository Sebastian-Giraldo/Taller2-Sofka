package figure;

/**
 * Represents a rectangle class and with some of the calculations that can be performed
 *
 * @author Sebastian Dario Giraldo Rodas
 */

public class Rectangle extends Figure{

    // Represents the base of a rectangle
    private int base;
    // Represents the height of a rectangle
    private int height;

    // Constructor
    // Create an instance of the rectangle class

    public Rectangle (int base, int height)
    {
        this.base = base;
        this.height = height;
    }

    //Getters and Setters

    //Are methods to get and change the instantiated values respectively
    public int getBase() {
        return this.base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getHeight() {
        return this.height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    // Metodos de la super clase.

    /**
     *
     * @return the total area of rectangle
     */
    @Override
    public double calculateArea() {
        this.area = this.base * this.height;
        return this.area;
    }

    /**
     *
     * @return the total perimeter of rectangle
     */
    @Override
    public double calculatePerimeter() {
        this.perimeter = (this.base * 2)  + (this.height * 2);
        return this.perimeter;
    }
}
