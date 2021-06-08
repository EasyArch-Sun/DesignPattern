package builderPattern.demo;


// 5
public class ChickenBurger extends Burger {
    @Override
    public String name() {
        return "Chicken Burgerr";
    }

    @Override
    public float price() {
        return 55.0f;
    }
}
