package pl.tarnow.iilo.zoo.animal;

import pl.tarnow.iilo.zoo.Animal;

public class Cat extends Animal {

    public Cat(String name, int health) {
        super(name, health);
    }


    public static Cat createSpecimen(){
        return new Cat("Cat Default name", 100);
    }
}
