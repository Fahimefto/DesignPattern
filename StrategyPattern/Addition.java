package StrategyPattern;

public class Addition implements Stragery{
    @Override
    public float calculation(float a, float b) {
        return  a+b;
    }
}
