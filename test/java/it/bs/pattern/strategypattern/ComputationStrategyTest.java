package it.bs.pattern.strategypattern;

import org.junit.Test;
import static org.junit.Assert.assertTrue;

/**
 * Created by Alberto on 21/05/2017.
 */
public class ComputationStrategyTest {

    @Test
    public void testAddStrategyFromComputationStrategy() {
        ComputationStrategy cs = new AddStrategy();
        assertTrue(5 == cs.compute(3, 2));
    }

    @Test
    public void testMultiplyStrategy() {
        ComputationStrategy cs = new MultiplyStrategy();
        assertTrue(6 == cs.compute(3, 2));
    }

    @Test

    public void testSubctractStrategy() {
        ComputationStrategy cs = new SubtractStrategy();
        assertTrue(1 == cs.compute(3, 2));
    }

    @Test
    public void testContext() {
        Context c = new Context(new AddStrategy());
        assertTrue(5 == c.computeWithStrategy(3, 2));
    }

    @Test
    public void testLambdaContext() {
        LambdaContext c = new LambdaContext(LambdaComputationStrategy.multiply);
        assertTrue(6 == c.computeWithLambdaStrategy(3.0, 2.0));

    }
}
