package FactoryPattern;

public class ShapeCall {
public Shape getShape(String shapeType){
    if(shapeType ==null){
        return null;
    }
    if(shapeType.equalsIgnoreCase( "circle")){
        return new Circle();
    }
    else if (shapeType.equalsIgnoreCase("Rectangle")){
        return new Rectangle();
    }
    return null;
}
}
