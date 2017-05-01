package pl.tarnow.iilo.zoo;

public abstract class Animal {
    private int health;
    private String name;

    public Animal(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public String getName(){
        return name;
    }

    public int getHealth() {
        return health;
    }

    public String toString(){
        return "Name: " +  name + " HP: " + health;
    }

    public void advanceDay(){
        health--;
    }

    public boolean isAlive(){
        return health>0;
    }

    public void feed(){
        health+=10;
        System.out.println("Hi her ie " +  name + " I just got fed");
    }
}
