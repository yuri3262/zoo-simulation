package pl.tarnow.iilo.zoo;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private String name;
    private List<Animal> animalList;

    public Zoo(String name){
        this.name = name;
        animalList = new ArrayList<Animal>();
    }

    public String getName() {
        return name;
    }

    public List<Animal> getAnimalList() {
        return animalList;
    }

    public void addAnimal(Animal animal){
        animalList.add(animal);
    }

    public void removeAnimal(Animal animal) {
        animalList.remove(animal);
    }
}
