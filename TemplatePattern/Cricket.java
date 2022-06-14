package TemplatePattern;

public class Cricket extends Game{
    @Override
    void init() {
        System.out.println("start PLaying Cricket");
    }

    @Override
    void start() {
        System.out.println("Started Cricket");

    }

    @Override
    void end() {
        System.out.println("ended Playing");

    }
}
