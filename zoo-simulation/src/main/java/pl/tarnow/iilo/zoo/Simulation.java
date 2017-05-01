package pl.tarnow.iilo.zoo;

import java.util.ArrayList;
import java.util.List;

public class Simulation {
    private Zoo zoo;

    public Simulation(Zoo zoo) {
        this.zoo = zoo;
    }

    public void advanceDay(){
        List<Animal> deadAnimals = new ArrayList();
        for (Animal animal: zoo.getAnimalList()){
            animal.advanceDay();
            if(!animal.isAlive()){
                deadAnimals.add(animal);
            }
        }
        for(Animal animal: deadAnimals) {
            System.out.println("WARNING!! \t" + animal.getName() + "\t IS DEAD!!");
            zoo.removeAnimal(animal);
        }
    }
}
