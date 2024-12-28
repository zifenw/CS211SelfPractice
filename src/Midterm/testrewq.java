package Midterm;


abstract class  BurgerInfo { 
	private double price = 3.0;
	private String topping = "beef patty, tomato, onion, ranch sause";
	
	public double getPrice() {
		return price;
	}
	public String getTopping() {
		return topping;
	}
	abstract void printMenu();
}

class USA extends BurgerInfo{
	@Override
	public double getPrice() {
		return super.getPrice();
	}
	@Override
	public String getTopping() {
		return super.getTopping();
	}
	@Override
	public void printMenu() {
		System.out.println("price: " + getPrice() + " topping: " + getTopping());
	}
	
}

class Mexico extends BurgerInfo{
	double exchangeRate = 17.5;
	
	@Override
	public double getPrice() {
		return super.getPrice()* exchangeRate;   //exchange rate form another class? 
	}
	@Override
	public String getTopping() {
		return "beef patty, tomato, onion, ranch sause, taco sauce";
	}
	@Override
	public void printMenu() {
		System.out.println("price: " + getPrice() + " topping: " + getTopping());
	}
}
public class testrewq {

	public static void main(String[] args) {
		USA usa = new USA();
		Mexico mexico = new Mexico();
		
		BurgerInfo usaB = new USA();
		BurgerInfo mexicoB = new Mexico();
		
		usa.printMenu();
		mexico.printMenu();
		
		usaB.printMenu();
		mexicoB.printMenu();

	}

}
