package beverages_decorator;

public class Client {

	public static void main(String[] args) {

		Beverage coffee = BeverageFactory.createBeverage("cappuccino");
		System.out.println(coffee.cost());

		// Creating a beverage with chocolate ;
		Beverage chocoCoffee = BeverageFactory.addChocolate(coffee);
		System.out.println(chocoCoffee.cost());

		// Creating coffee with latte and Cappuccino ..
		Beverage latteCoffee = BeverageFactory.createBeverage("latte");
		Beverage latteExpresso = new ExpressoDecorator(latteCoffee);
		System.out.println("Coffee with latte  and expresso !");
		System.out.println(latteExpresso.cost());

		/// Creating latteExpresso with whipped cream ..
		Beverage whippedLBeverage = new WhippedCreamDecorator(latteExpresso);
		System.out.println("latteExpresso with Whipped Cream ");
		System.out.println(whippedLBeverage.cost());
	}

}