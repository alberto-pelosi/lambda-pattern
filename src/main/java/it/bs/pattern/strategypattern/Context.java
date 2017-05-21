package it.bs.pattern.strategypattern;

/**
 * Created by Alberto on 21/05/2017.
 */
public class Context {

    ComputationStrategy cs;

    public Context(ComputationStrategy cs) {
        this.cs = cs;
    }

    public double computeWithStrategy(double a, double b) {
        return cs.compute(a, b);
    }
}
