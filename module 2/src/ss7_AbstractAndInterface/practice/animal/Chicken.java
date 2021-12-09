package ss7_AbstractAndInterface.practice.animal;

import ss7_AbstractAndInterface.practice.Edible.Edible;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {

        return "Chicken: cluck-cluck!";
    }
    @Override
    public String howToEat() {
        return "could be fried";
    }
}
