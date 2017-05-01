package pl.tarnow.iilo.zoo;

import java.util.List;


public class Helper {
    public static <T> void printList(List<T> list) {
        for(int i=1; i<=list.size(); i++){
            System.out.println(i + ". " + list.get(i-1));
        }
    }
}
