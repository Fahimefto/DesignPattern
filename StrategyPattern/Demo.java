package StrategyPattern;

public class Demo {
    public static void main(String[] args) {
        Context context= new Context(new Addition());
        System.out.println("addition of 5,10 :"+ context.executeStrategy(10,5));
        context= new Context(new Subtraction());
        System.out.println("sub of 10,5 : "+ context.executeStrategy(10,5));
    }
}
