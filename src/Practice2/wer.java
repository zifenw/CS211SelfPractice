package Practice2;

import java.util.HashMap;

public class wer {

	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<>();
		hm.put(1, "one");
		hm.put(2, "two");
		hm.put(3, "three");
		
		hm.remove("one");
		hm.remove(2);
		
		System.out.println(hm);

	}

}
