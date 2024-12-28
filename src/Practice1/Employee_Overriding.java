package Practice1;

class Employee{
	public int getHours() {
		return 40;
	}
	public double getSalary() {
		return 40000.0;
	}
	public int getVacationDays() {
		return 10;
	}
	public String getVacationForm() {
		return "yellow";
	}
}
class Secretary extends Employee{
	public void takeDivtation(String text) {
		System.out.println("Taking dication of text: " + text);
	}
}
class Lawyer extends Employee{
	@Override
	public String getVacationForm() {
		return "pink";
	}
}

public class Employee_Overriding {

	public static void main(String[] args) {
		Secretary Jesica = new Secretary();
		System.out.println(Jesica.getVacationForm());
		
		Lawyer Jenny = new Lawyer();
		System.out.println(Jenny.getVacationForm());
	}

}
