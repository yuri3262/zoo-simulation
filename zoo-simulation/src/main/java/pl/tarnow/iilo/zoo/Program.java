package pl.tarnow.iilo.zoo;

import pl.tarnow.iilo.zoo.animal.Cat;
import pl.tarnow.iilo.zoo.animal.RhinocerosBeetle;
import pl.tarnow.iilo.zoo.option.BuyAnimal;
import pl.tarnow.iilo.zoo.option.ChangeAnimalName;
import pl.tarnow.iilo.zoo.option.FeedAnimal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

    private static Zoo zoo;
    private static Simulation simulation;
    private static List<MenuOption> optionList;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        initializeZoo();
        initializeOptions();

        Menu menu = new Menu(zoo, optionList);

        System.out.println("At the begining of the simulation in zoo \"" + zoo.getName() +"\" inventory is:");
        printAllAnimalsInZoo();

        for(int i=0; i<105; i++){
            menu.printMenu();
            final int choice = scanner.nextInt();
            menu.executeAction(choice);
            simulation.advanceDay();
        }

        System.out.println("At the end of the simulation in zoo" + zoo.getName() +" inventory is:");
        printAllAnimalsInZoo();

    }

    private static void initializeOptions() {
        optionList = new ArrayList<MenuOption>();
        optionList.add(new FeedAnimal());
        optionList.add(new BuyAnimal());
        optionList.add(new ChangeAnimalName());
    }

    private static void printAllAnimalsInZoo() {
        for(Animal animal : zoo.getAnimalList()){
            System.out.println(animal);
        }
    }

    private static void initializeZoo() {
        Cat catMaciek = new Cat("Maciek", 100);
        RhinocerosBeetle rhinoStephen = new RhinocerosBeetle("Stephen", 100,"My tail is amazing");
        zoo = new Zoo("My zoo");
        zoo.addAnimal(catMaciek);
        zoo.addAnimal(rhinoStephen);

        simulation = new Simulation(zoo);
    }
}
