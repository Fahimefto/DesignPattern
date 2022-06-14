package TemplatePattern;

public class Demo {
    public static void main(String[] args) {
        Game newgame= new Cricket();
        newgame.play();
        newgame= new Football();
        newgame.play();
    }
}
