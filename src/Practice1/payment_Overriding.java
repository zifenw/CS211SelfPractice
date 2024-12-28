package Practice1;


/*Zifeng Wang
202515718
zifeng.wang@bellevuecollege.edu
1/11/2024
In this project, I create to print different kinds of tickets
The use of inheritance allows for code reuse. The RegularPassenger and SeniorPassenger classes inherit common functionality from the BusTicket superclass.
The overridden methods demonstrate polymorphism, allowing the same method names to behave differently in the context of each subclass.
*/

public class payment_Overriding {

	public static void main(String[] args) {
		SeniorPassenger ted = new SeniorPassenger();
        RegularPassenger chloe = new RegularPassenger();

        ted.printTicket(); // Ted's ticket
        chloe.printTicket(); // Chloe's ticket
	}

}
