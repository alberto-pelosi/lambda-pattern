package it.bs.pattern.factorypattern;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

/**
 * Created by Alberto on 12/03/2017.
 */
public class LambdaAnimalFactory {

    private static Map<String, Supplier<Animal>> animals = new HashMap<String, Supplier<Animal>>();

    static {
        animals.put("cat", Cat::new);
        animals.put("dog", Dog::new);
    }

    public static Animal getInstance(String animal) {
        return animals.get(animal).get();
    }
}
