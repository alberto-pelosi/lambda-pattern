package it.bs.pattern.strategypattern;

/**
 * Created by Alberto on 21/05/2017.
 */
public class AddStrategy implements ComputationStrategy {
    @Override
    public double compute(double a, double b) {
        return a + b;
    }
}
