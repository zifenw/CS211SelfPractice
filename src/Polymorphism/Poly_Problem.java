package Polymorphism;


class Foo{
	public void method1() {
		System.out.println("foo 1");
	}
	public void method2() {
		System.out.println("foo 2");
	}
	public String toString() {
		return "foo";
	}
}

class Bar extends Foo{
	@Override
	public void method2() {
		System.out.println("bar 2");
	}
}

class Baz extends Foo{
	@Override
	public void method1() {
		System.out.println("baz 1");
	}
	@Override
	public String toString() {
		return"baz";
	}
	
}

class Mumble extends Baz{
	@Override
	public void method2() {
		System.out.println("mumble 2");
	}
}


public class Poly_Problem {

	public static void main(String[] args) {
		Foo[] pity = new Foo[4];
		pity[0] = new Baz();
		pity[1] = new Bar();
		pity[2] = new Mumble();
		pity[3] = new Foo();
		
		for (int i = 0; i < pity.length; i++) {
			System.out.println(pity[i]);
			pity[i].method1();       
			pity[i].method2();
			System.out.println();
		}

	}

}
