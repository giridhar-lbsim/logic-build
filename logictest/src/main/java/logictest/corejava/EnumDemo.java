package logictest.corejava;

enum BeerPrice {

	Tuborg(75.50), Crona(90.75), Elephant(80.00), Carlsberg(105.50), KingFisher();

	private Double price;

	BeerPrice() {
		price = -1.0;
	}

	BeerPrice(Double beerPrice) {
		price = beerPrice;
	}

	public Double getPrice() {
		return price;
	}
}

public class EnumDemo {

	public static void main(String[] args) {

		BeerPrice priceList[] = BeerPrice.values();

		for (BeerPrice price : priceList) {

			System.out.println("Price of beer " + price + " is " + price.getPrice());
		}

		// Demonstrating ordinal(), compareTo() and equals()
		for (BeerPrice beerPrice : BeerPrice.values())
			System.out.println(beerPrice + " " + beerPrice.ordinal());

		BeerPrice p1, p2, p3;
		p1 = BeerPrice.Tuborg;
		p2 = BeerPrice.Crona;
		p3 = BeerPrice.Elephant;

		if (p1.compareTo(p2) < 0) {
			System.out.println("p1 is before p2");
		}
		if (p2.compareTo(p3) < 0) {
			System.out.println("p2 is before p3");
		}

		System.out.println();

		if (p1.equals(p2)) {
			System.out.println("Error!");
		}
		if (p2.equals(p3)) {
			System.out.println(p1 + " equals " + p3);
		}
		if (p2 == p3) {
			System.out.println(p2 + " == " + p3);
		}
		if (p2.equals(p2)) {
			System.out.println(p2 + " equals " + p2);
		}
	}

}
