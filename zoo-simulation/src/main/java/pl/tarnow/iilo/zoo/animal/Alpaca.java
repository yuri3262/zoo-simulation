package pl.tarnow.iilo.zoo.animal;

import pl.tarnow.iilo.zoo.Animal;

public class Alpaca extends Animal {

    public Alpaca(String name, int health) {
        super(name, health);
    }

    public static Alpaca createSpecimen(){
        return new Alpaca("Alpaca Default name", 100);
    }
// zmiana
}
