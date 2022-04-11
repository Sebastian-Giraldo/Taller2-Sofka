package figure;

/**
 * Represents an abstract class which contains the methods to find the area and perimeter of a geometric figure.
 *
 * @author Sebastian Dario Giraldo Rodas
 */



public abstract class Figure {

    //Represents the area of a geometric figure
    protected double area;

    //Represents the perimeter of a geometric figure
    protected double perimeter;

    //constructor
    //Create an instance of the figure class
    public Figure() {
        this.area = area;
        this.perimeter = perimeter;
    }


    //It is an abstract method to calculate the area
    public abstract double calculateArea();
    //It is an abstract method to calculate the perimeter
    public abstract double calculatePerimeter();
}



