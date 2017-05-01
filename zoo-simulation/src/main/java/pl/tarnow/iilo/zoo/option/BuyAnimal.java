package pl.tarnow.iilo.zoo.option;

import pl.tarnow.iilo.zoo.Animal;
import pl.tarnow.iilo.zoo.Helper;
import pl.tarnow.iilo.zoo.MenuOption;
import pl.tarnow.iilo.zoo.Zoo;
import pl.tarnow.iilo.zoo.animal.Alpaca;
import pl.tarnow.iilo.zoo.animal.Cat;
import pl.tarnow.iilo.zoo.animal.RhinocerosBeetle;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class BuyAnimal implements MenuOption {
    private List<String> animalTypeList = Arrays.asList("Alpaca","Cat", "RhinocerosBeetle");;
    private Scanner scanner;

    public BuyAnimal() {
        this.scanner = new Scanner(System.in);
    }

    public String getOptionName() {
        return "Buy an animal";
    }

    public String toString(){
        return getOptionName();
    }

    public void execute(Zoo zoo) {
        Helper.printList(animalTypeList);
        final int animalTypeChoice = scanner.nextInt();
        Animal newAnimal = null;
        switch (animalTypeChoice){
            case 1:
                newAnimal = Alpaca.createSpecimen();
                break;
            case 2:
                newAnimal = Cat.createSpecimen();
                break;
            case 3:
                newAnimal = RhinocerosBeetle.createSpecimen();
                break;
            default:
                System.out.println("No such animal");
                break;
        }
        if(newAnimal!= null){
            zoo.addAnimal(newAnimal);
        }
    }
}
