package beverages_decorator;

public class BeverageFactory {
    public static Beverage createBeverage(String type) {
        switch (type.toLowerCase()) {
            case "cappuccino":
                return new Cappuccino();
            case "latte":
                return new Latte();
            default:
                throw new IllegalArgumentException("Unknown beverage type: " + type);
        }
    }

    public static Beverage addChocolate(Beverage beverage) {
        return new ChocolateDecorator(beverage);
    }

    public static Beverage addExpresso(Beverage beverage) {
        return new ExpressoDecorator(beverage);
    }

    public static Beverage addWhippedCream(Beverage beverage) {
        return new WhippedCreamDecorator(beverage);
    }
}
