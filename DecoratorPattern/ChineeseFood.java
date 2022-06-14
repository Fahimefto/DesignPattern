package DecoratorPattern;

public class ChineeseFood extends FoodDecorator{
    public ChineeseFood(Food newFood) {
        super(newFood);
    }

    public String prepareFood(){
        return super.prepareFood()+"Chineese";
    }
    public double foodPrice(){
        return super.foodPrice()+250;
    }
}
