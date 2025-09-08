package beverages_decorator;

public class ExpressoDecorator extends Beverage {
    private Beverage beverage;

    public ExpressoDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public int cost() {
        return 10 + beverage.cost();
    }
}
