package it.bs.pattern.factorypattern;

/**
 * Created by Alberto on 12/03/2017.
 */
public class AnimalFactory {

    public static Animal getInstance(String animal) {
        if("dog".equals(animal)) return new Dog();
        if("cat".equals(animal)) return new Cat();
        return null;
    }
}
