package practice3;
import java.util.*;
public class hash {

	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<>();
		HashMap<Integer,Integer> hm = new HashMap<>();
										//i++ is a post-increment operator, which means it
		for(int i=0; i<4; i++) {		//increment i after using its current value in the expression.
			System.out.println(i);		//print 0; i++ 2
			hm.put(i++, i++);           //put(0,1)  now i=2; put(2,3) now i=4
			hs.add(hm.get(i-1));		//add(hm.get(1))is null, add(hm.get(3))is null
			hm.put(i, hm.get(i--));		//put(2,null) i=1; put(4,null)
		}
		System.out.println(hm);
		System.out.println(hs);

	}

}
