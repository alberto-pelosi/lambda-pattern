package it.bs.pattern.factorypattern;

import it.bs.pattern.factorypattern.Dog;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Alberto on 12/03/2017.
 */
public class DogTest {

    @Test
    public void testSay() {
        assertEquals("Bauuu", new Dog().say());
    }
}
