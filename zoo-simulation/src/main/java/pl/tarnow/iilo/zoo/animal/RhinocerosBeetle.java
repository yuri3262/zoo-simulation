package pl.tarnow.iilo.zoo.animal;

import pl.tarnow.iilo.zoo.Animal;

public class RhinocerosBeetle extends Animal {
    private String tail;

    public RhinocerosBeetle(String name, int health, String tail) {
        super(name,health);
        this.tail = tail;
    }

     public String toString(){
        return super.toString() + " Look at my tail: "+ tail;
     }

    public static RhinocerosBeetle createSpecimen(){
        return new RhinocerosBeetle("RhinocerosBeetle Default name", 100 , "Rhino default beautiful tail");
    }

}
