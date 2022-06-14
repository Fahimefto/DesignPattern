package AbstractFactoryPattern;

public class FactoryProducer {
    public static AbstractFactory getFactory(boolean rouneded){
        if(rouneded){
            return new RoundedShapeFactory();
        }
        else{
            return new ShapeFactory();
        }
    }
}
