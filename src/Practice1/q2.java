package Practice1;

class A{
	double gpa = 4.0;
	void output(){
		System.out.print("Your GPA is ");
	}
}
class B extends A{
	double gpa = 3.0;
	@Override
	void output() {
		System.out.print("My GPA is ");
	}
}


public class q2 {

	public static void main(String[] args) {
		A b = new B();
		b.output();
		System.out.println(b.gpa);

	}

}
