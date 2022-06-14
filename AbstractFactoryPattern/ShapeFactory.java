package AbstractFactoryPattern;

public class ShapeFactory extends AbstractFactory{
    @Override
    public Shape getShape(String ShapeType) {
        if(ShapeType.equalsIgnoreCase("Square"))
        {
            return new Square();
        }
        if(ShapeType.equalsIgnoreCase("Rectangle")){
            return new Rectangle();
        }
        return null;
    }
}
