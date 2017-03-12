package it.bs.pattern.factorypattern;

import it.bs.pattern.factorypattern.Cat;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Alberto on 12/03/2017.
 */
public class CatTest {

    @Test
    public void testSay() {
        assertEquals("Miaooo", new Cat().say());
    }
}
