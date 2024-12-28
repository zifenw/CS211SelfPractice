package Midterm;

import java.util.*;

//class A1{
//	double gpa = 1.0;
//	A1(){
//		System.out.print("A ");
//		gpa+=2;        //A1  3.0
//	}
//	void constructor() {
//		System.out.print("Your GPA is");
//	}
//}
//class B1 extends A1{
//	double gpa = 5.0;
//	B1(){
//		super.gpa ++;    //A1 4.0
//		gpa += super.gpa;   //B1  7.0
//		System.out.print("B");
//	}
//}

//class C1 extends B1{
//	double gpa = 3.0;
//	C1(){
//		super.gpa ++;     //B1  8.0
//		gpa += super.gpa;    //C1  11.0
//		System.out.print("G P A");
//	}
//}
public class Test2 {


	public static void main(String[] args) {
		
			
			
//		A1 b = new B1();
//		System.out.println(b.gpa);
//		
//		LinkedHashSet<String> hs = new LinkedHashSet<>();
//		//HashSet<String> hs = new HashSet<String>();
//		    hs.add("C"); hs.add("D");hs.add("A");hs.add("B");
//		Iterator hi = hs.iterator();
//		while(hi.hasNext()){
//			System.out.println(hi.next());
//			
		HashMap<Integer, String> hm = new HashMap<>();	
		
		hm.put(1, "one");
		hm.put(2, "two");
		hm.put(3, "three");
		
		hm.remove( "one");
		hm.remove(2);
		
		System.out.println(hm);
		}
}
