package Practice2;

/*Zifeng Wang
202515718
zifeng.wang@bellevuecollege.edu
2/16/2024
Analysis: The ArrayList remove operation is faster than the LinkedList remove operation
because ArrayList has constant time complexity O(1) for removal from the end of the list
whereas LinkedList has linear time complexity O(n) for removal from arbitrary positions,
due to the need to traverse the list to find the element to be removed.
This is reflected in the actual processing time where ArrayList performs better than LinkedList.
*/
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class CP10_ArrayListVSLinkedList {

	static int howManyTests = 5;
	static int howManyData = 60000; 
	
	static ArrayList<String> AL = new ArrayList<>();
	static LinkedList<String> LL = new LinkedList<>();
	static Random rand = new Random();
	  
	public static void remove(){
		
		double TimeRemove_ArrayList=0.0;   
		double TimeRemove_LinkedList=0.0; 
        double startTime, endTime;
		
		  for (int i=0; i<howManyData/2; i++){
			
			int index2remove = rand.nextInt(AL.size());			 
			  
		    // arrayList 
		    startTime = System.nanoTime(); 		  
		      AL.remove(index2remove);	 	     
		    endTime = System.nanoTime();		    
		    TimeRemove_ArrayList += endTime - startTime; 
		    
		    // linkedList 
		    startTime = System.nanoTime();
		       LL.remove(index2remove);
		    endTime = System.nanoTime();;	    
		    TimeRemove_LinkedList += endTime - startTime;        

		 }   
		   
		  System.out.println("\nRemoved: " + howManyData/2 );  
		  System.out.println("ArrayList: "+ TimeRemove_ArrayList / 1e9 +" Sec");
		  System.out.println("LinkedList: "+ TimeRemove_LinkedList / 1e9 +" Sec");
	
		  if (TimeRemove_LinkedList >= TimeRemove_ArrayList) {
	            double howFaster =  (TimeRemove_ArrayList / TimeRemove_LinkedList ) * 100; 
	            System.out.printf("ArrayList's processing time is %.1f%s of LinkedList", howFaster, "%");       
	        } else {
	            double howFaster = (TimeRemove_LinkedList / TimeRemove_ArrayList ) * 100;
		        System.out.printf("LinkedList processing time is %.1f%s of ArrayList", howFaster, "%");	
	        }
		   
		  System.out.println();			
	 }
	
	public static void initilization() {
		
		AL.clear();
		LL.clear();
		for (int i= 0; i<howManyData; i++) {
			AL.add("Data" + i);
			LL.add("Data" + i);
		}
	}
	
	public static void main(String[] args) {
		
	  for (int i=1; i<=howManyTests; i++) {
        initilization();
		System.out.printf("\nTest: "+i); 
		remove();
	  }
	 }
}

