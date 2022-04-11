package fruit;

import java.util.ArrayList;

/**
 *
 *
 * @author Sebastian Dario Giraldo Rodas
 */

public class Fruit {

    public String name;
    private  float averageWeight;
    public ArrayList<String> colors = new ArrayList<String>();
    public String color;

    // Constructor
    //Create an instance of the fruit class
    public Fruit (String name, float averageWeight, String color)
    {
        this.name = name;
        this.averageWeight = averageWeight;
        this.color = color;
        this.colors.add(color);
    }


    //Getters and Setters
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getAverageWeight() {
        return this.averageWeight;
    }

    public void setAverageWeight(float averageWeight) {
        this.averageWeight = averageWeight;
    }

    public ArrayList<String> getColors() {
        return this.colors;
    }



}
