package Java.Small.Program;

import java.util.HashMap;

public class Hashmapcountofstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String infra[]= {"Amazon","Flipcart","Amazon","Flipcart","Youtube","Amazon"};
		HashMap<String,Integer> map = new HashMap<>();
		
		for(int i=0;i<infra.length;i++)
		{
			int value = 0;
		
		//	System.out.println("map value="+map.containsKey(infra[i]));
			if (map.containsKey(infra[i])) 
			{
			
			  value= map.get(infra[i]);
			 // System.out.println("get value="+map.get(infra[i]));
			}
			value++;
			map.put(infra[i],value);
		}
		// iterate on map
		System.out.println(map);
		
		
	}

}
