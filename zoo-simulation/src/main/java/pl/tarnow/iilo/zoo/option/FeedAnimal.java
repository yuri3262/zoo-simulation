package pl.tarnow.iilo.zoo.option;

import pl.tarnow.iilo.zoo.Animal;
import pl.tarnow.iilo.zoo.Helper;
import pl.tarnow.iilo.zoo.MenuOption;
import pl.tarnow.iilo.zoo.Zoo;

import java.util.List;
import java.util.Scanner;

public class FeedAnimal implements MenuOption {

    private Scanner scanner;

    public FeedAnimal() {
        this.scanner = new Scanner(System.in);
    }

    public String getOptionName() {
        return "Feed an animal";
    }

    public String toString(){
        return getOptionName();
    }

    public void execute(Zoo zoo) {
        final List<Animal> animalList = zoo.getAnimalList();
        Helper.printList(animalList);
        final int animalChoice = scanner.nextInt();
        animalList.get(animalChoice-1).feed();
    }
}
