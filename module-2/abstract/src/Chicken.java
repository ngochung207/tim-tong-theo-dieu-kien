public class Chicken extends Animal implements Edible{
    @Override
    String makeSound() {
        return "Chicken: cucku";
    }

    @Override
    public String howToEat() {
        return "Ga nuoi la de thit";
    }
}
