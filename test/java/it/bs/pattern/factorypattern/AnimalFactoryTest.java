package it.bs.pattern.factorypattern;

import it.bs.pattern.factorypattern.AnimalFactory;
import it.bs.pattern.factorypattern.Cat;
import it.bs.pattern.factorypattern.Dog;
import it.bs.pattern.factorypattern.LambdaAnimalFactory;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Alberto on 12/03/2017.
 */
public class AnimalFactoryTest {

    @Test
    public void testGetAnInstanceOfCat() {
        assertEquals(new Cat().say(), AnimalFactory.getInstance("cat").say());

    }

    @Test
    public void testGetAnInstanceOfDog() {
        assertEquals(new Dog().say(), AnimalFactory.getInstance("dog").say());
    }

    @Test
    public void testGetAnInstanceOfCatWithLambda() {
        assertEquals(new Cat().say(), LambdaAnimalFactory.getInstance("cat").say());

    }

    @Test
    public void testGetAnInstanceOfDogWithLambda() {
        assertEquals(new Dog().say(), LambdaAnimalFactory.getInstance("dog").say());

    }
}
