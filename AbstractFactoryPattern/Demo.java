package AbstractFactoryPattern;



public class Demo {
    public static void main(String[] args) {
        AbstractFactory shapeFactory = FactoryProducer.getFactory(true);
        Shape shape1= shapeFactory.getShape("Rectangle");
        shape1.draw();
        Shape shape2= shapeFactory.getShape("Square");
        shape2.draw();
        AbstractFactory shapeFactory1 = FactoryProducer.getFactory(false);
        Shape shape3= shapeFactory1.getShape("Rectangle");
        shape3.draw();
        Shape shape4= shapeFactory1.getShape("Square");
        shape4.draw();
    }
}
