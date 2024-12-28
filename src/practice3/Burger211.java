package practice3;

public class Burger211 <T>{
	private Object burgerPrice;
	
	public void setPrice(T price) {
		burgerPrice = price;
	}
	
	public Object getPrice() {
		return burgerPrice;
	}
}
