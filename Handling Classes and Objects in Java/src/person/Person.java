package person;



import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * Represents
 * @author Sebastian Dario Giraldo Rodas
 */

public class Person {

    public String name;
    public String lastName1;
    public String lastName2;
    public Date dateBirth;
    public float height;
    public int age;
    public String gender;

    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
    public String dateFormatter = formatter.format(dateBirth);


    //Constructor
    //Create an instance of the person class
    public Person (String name, String lastName1, String lastName2, String dateFormatter, float height, int age, String gender)
    {
        this.name = name;
        this.lastName1 = lastName1;
        this.lastName2 = lastName2;
        this.dateFormatter = dateFormatter;
        this.height = height;
        this.age = age;
        this.gender = gender;
    }

    // Getters and Setters
    //Are methods to get and change the instantiated values respectively

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName1() {
        return this.lastName1;
    }

    public void setLastName1(String lastName1) {
        this.lastName1 = lastName1;
    }

    public String getLastName2() {
        return this.lastName2;
    }

    public void setLastName2(String lastName2) {
        this.lastName2 = lastName2;
    }

    public Date getDateBirth() {
        return this.dateBirth;
    }

    public void setDateBirth(Date dateBirth) {
        this.dateBirth = dateBirth;
    }

    public float getHeight() {
        return this.height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return this.gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
}
