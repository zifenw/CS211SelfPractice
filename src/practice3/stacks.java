package practice3;
import java.util.*;
public class stacks {
	
	public static int num;
	public static String list;
	public static int[] numlist = new int[num];
	public static Stack<Integer> stack = new Stack<>();

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number between 0 and 100");
		num = input.nextInt();
		
		System.out.println("Enter an number list");
		list = input.nextLine();
		
		while( <= num) {
			for(int i= 0; i<=num; i++) {
				numlist[i] = (int)list.charAt(2 * i - 1);	
			}
		}

	}

}
