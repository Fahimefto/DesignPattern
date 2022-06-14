package FactoryPattern;

public class FactoryPattern {
    public static void main(String[] args) {
        ShapeCall shapeCall = new ShapeCall();
        Shape shape1 = shapeCall.getShape("Circle");
        shape1.draw();
        Shape shape2= shapeCall.getShape("Rectangle");
        shape2.draw();
    }
}
