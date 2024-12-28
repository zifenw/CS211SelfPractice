package Practice2;
import java.util.*;


   
public class testHashSet {
	    static HashSet<String> CS210 = new HashSet<String>();
	    static HashSet<String> CS211 = new HashSet<String>();
	    static HashSet<String> CS212 = new HashSet<String>();
	    
	    public static void Initialize() {
	        CS210.add("Bill"); CS210.add("Eva"); CS210.add("Olivia");
	        CS211.add("Eva"); CS211.add("Olivia"); CS211.add("Kim");   
	        CS212.add("Chloe"); CS212.add("Jane"); CS212.add("Olivia"); CS212.add("Bill");    
	    }
	    public static void atLeastOneClass() {
	    	HashSet<String> temp = new HashSet<>(CS210);
	    	temp.addAll(CS211);
	    	temp.addAll(CS212);
	    	System.out.println(temp);
	    }
	    public static void allClasses() {
	    	HashSet<String> temp = new HashSet<>(CS210);
	    	temp.retainAll(CS211);
	    	temp.retainAll(CS212);
	    	System.out.println(temp);
	    }
	    public static void violation() {
	    	HashSet<String> temp = new HashSet<>(CS211);
	    	temp.removeAll(CS210);
	    	System.out.println(temp);
	    }
	    public static void CS210andCS211notCS212Classes() {
	    	HashSet<String> temp = new HashSet<>(CS210);
	    	temp.retainAll(CS211);
	    	temp.removeAll(CS212);
	    	System.out.println(temp);
	    }
	public static void main(String[] args) {
		  Initialize();
	      atLeastOneClass();
	      allClasses();
	      violation();
	      CS210andCS211notCS212Classes();
	}
}
