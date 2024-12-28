package practice3;

/*Zifeng Wang
202515718
zifeng.wang@bellevuecollege.edu
2/22/2024
This project use generic to print the burger price. 
*/

public class Burger211Test {

	public static void main(String[] args) {
		Burger211<Object> price = new Burger211<>();

		price.setPrice("two dollars");
		System.out.println(price.getPrice());
		
		price.setPrice(2);
		System.out.println(price.getPrice());
		
		price.setPrice(2.5);
		System.out.println(price.getPrice());
	}

}
