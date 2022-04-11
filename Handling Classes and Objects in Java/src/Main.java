import bank.BankAccount;
import figure.Circle;
import figure.Figure;
import figure.Rectangle;
import fruit.Fruit;
import person.Person;

/**
 *
 * @author Sebastian Dario Giraldo Rodas
 */

public class Main {

    public static void main(String[] args) {

        Figure figure1 = new Rectangle(3,5);
        Figure figure2 = new Circle(3);
        Person person1 = new Person("Andres","Hurtado","Vallecilla",
                "18/04/1994",(80.3564f),28, "Masculino");
        Fruit fruit = new Fruit("Manzana", 10,"Red");
        BankAccount bankAccount1 = new BankAccount(74345345, true);

        System.out.println(figure1.calculateArea());
        System.out.println(figure2.calculateArea());
        System.out.println(figure1.calculatePerimeter());
        System.out.println(figure2.calculatePerimeter());

        System.out.println(person1.getGender());

        System.out.println(fruit.getName());

        System.out.println(bankAccount1.getAccountNumber());



    }
}
