import java.util.Scanner;

public class AbstractAndInterfaceTests {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());
            Scanner sc = new Scanner(System.in);
            String i = sc.nextLine();

            if (animal instanceof Chicken) {
                Chicken edibler = (Chicken) animal;//TODO xem lai ep kieu du lieu.
                System.out.println(edibler.howToEat());
            }
        }
    }
}