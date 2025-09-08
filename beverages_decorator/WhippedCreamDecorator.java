package beverages_decorator;

public class WhippedCreamDecorator extends Beverage {
    private Beverage beverage;

    public WhippedCreamDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public int cost() {
        return beverage.cost() + 12;
    }
}
