package Polymorphism;
/* method		Ham      Lamb      Yam      Spam		
 *   a        "Ham a"  "Ham a"   "Yam a"  "Yam a"
 *   	  b()["Ham b"  "Lamb b"] "Ham a"  "Ham a"
 * 								["Lamb b" "Lamb b"]b()
 *   b		  "Ham b"  "Lamb b"  "Lamb b" "Spam b"
 *toString	   "Ham"    "Ham"     "Yam"    "Yam"
 * */

class Ham{
	public void a() {
		System.out.println("Ham a");
		b();
	}
	public void b() {
		System.out.println("Ham b");
	}
	public String toString() {
		return "Ham";
	}
}
class Lamb extends Ham{
	@Override
	public void b() {
		System.out.println("Lamb b");
	}
}
class Yam extends Lamb{
	@Override
	public void a() {
		System.out.println("Yam a");
		super.a();
	}
	@Override
	public String toString() {
		return "Yam";
	}
}
class Spam extends Yam{
	@Override
	public void b() {
		System.out.println("Spam b");
	}
}

public class Poly_Problem1 {

	public static void main(String[] args) {
		Ham[] food = {new Lamb(), new Ham(), new Spam(), new Yam()};
		
		for(int i = 0; i< food.length; i++) {
			System.out.println(food[i]);
			food[i].a();
			food[i].b();
			System.out.println();
		}

	}

}
