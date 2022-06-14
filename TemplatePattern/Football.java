package TemplatePattern;

public class Football extends Game{
    @Override
    void init() {
        System.out.println("staring Football");
    }

    @Override
    void start() {
        System.out.println("Started Football");

    }

    @Override
    void end() {
        System.out.println("Ended Football");

    }
}
