package AbstractFactoryPattern;

public class RoundedShapeFactory extends AbstractFactory{
    @Override
    public Shape getShape(String ShapeType) {

        if (ShapeType.equalsIgnoreCase("Square")){
            return new RoundedSquare();
        }
        if(ShapeType.equalsIgnoreCase("Rectangle")){
            return new RoundedRectangle();
        }
        return null;
    }

}
