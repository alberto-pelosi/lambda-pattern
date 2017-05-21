package it.bs.pattern.strategypattern;

import java.util.function.BinaryOperator;

/**
 * Created by Alberto on 21/05/2017.
 */
public class LambdaComputationStrategy {

    public static BinaryOperator<Double> add = (Double a, Double b) -> {
        return a + b;
    };

    public static BinaryOperator<Double> multiply = (Double a, Double b) -> {
        return a * b;
    };

    public static BinaryOperator<Double> subtract = (Double a, Double b) -> {
        return a - b;
    };
}
