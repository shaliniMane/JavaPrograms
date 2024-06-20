
package Java.Small.Program;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, Integer> hm= new HashMap<>();
		hm.put("Tom", 5);
		hm.put("Jerry", 2);
		hm.put("Kaya", 3);
		System.out.println("Size of the Map is=" +hm.size());
		System.out.println(hm);
		List<String> list = new ArrayList<String>(hm.keySet());
		List<Integer> list1 = new ArrayList<Integer>(hm.values());
		Collections.sort(list1);
		Collections.sort(list);
		System.out.println("Sorted  key list="+list);
		System.out.println("Soteed value list="+list1);
		if(hm.containsKey("Tom"))
		{
			int a = hm.get("Tom");
			System.out.println("Value of key Tom is "+a);
		}
	}

}
