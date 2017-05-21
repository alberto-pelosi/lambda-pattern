package it.bs.pattern.strategypattern;

import java.util.function.BinaryOperator;

/**
 * Created by Alberto on 21/05/2017.
 */
public class LambdaContext {
    BinaryOperator<Double> lcs;

    public LambdaContext(BinaryOperator<Double> lcs) {
        this.lcs = lcs;
    }

    public Double computeWithLambdaStrategy(Double a, Double b) {
        return lcs.apply(a, b);
    }


}
