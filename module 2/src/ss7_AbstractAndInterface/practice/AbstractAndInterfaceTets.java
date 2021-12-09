package ss7_AbstractAndInterface.practice;

import ss7_AbstractAndInterface.practice.Edible.Edible;
import ss7_AbstractAndInterface.practice.animal.Animal;
import ss7_AbstractAndInterface.practice.animal.Tiger;
import ss7_AbstractAndInterface.practice.animal.Chicken;
import ss7_AbstractAndInterface.practice.Fruit.Fruit;
import ss7_AbstractAndInterface.practice.Fruit.Apple;
import ss7_AbstractAndInterface.practice.Fruit.Orange;

public class AbstractAndInterfaceTets {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());

            if (animal instanceof Chicken) {
                Edible edibler = (Chicken) animal;
                System.out.println(edibler.howToEat());
            }
        }

        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Orange();
        fruits[1] = new Apple();
        for (Fruit fruit : fruits) {
            System.out.println(fruit.howToEat());
        }
    }
}
