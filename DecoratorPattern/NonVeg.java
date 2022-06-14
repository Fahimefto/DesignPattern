package DecoratorPattern;

public class NonVeg extends FoodDecorator{
    public NonVeg(Food newFood) {
        super(newFood);
    }
    public String prepareFood(){
        return super.prepareFood()+"NonVeg";
    }
    public double foodPrice(){
        return super.foodPrice()+150;
    }
}
