package StrategyPattern;

public class Context {
    private Stragery stragery;

    public Context(Stragery stragery){
        this.stragery=stragery;
    }
    public float executeStrategy(float num1,float num2){
        return stragery.calculation(num1,num2);
    }
}
