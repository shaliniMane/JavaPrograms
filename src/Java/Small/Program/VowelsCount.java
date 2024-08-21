package Java.Small.Program;

import java.util.HashMap;

public class VowelsCount {

	public static void main(String[] args) {

		String str= "AEAIOUGHIOUS SDSDS EWEWEWIH IHUU";

		HashMap<Character, Integer> map = new HashMap<>();
		
		map.put('A', 0);
		map.put('E', 0);
		map.put('I', 0);
		map.put('O', 0);
		map.put('U', 0);
		
		for(int i=0;i<str.length();i++)
		{
			if(map.containsKey(str.charAt(i)))
			{
				int count = map.get(str.charAt(i));
				map.put(str.charAt(i), ++count);
			}
		}
		System.out.println(map);
}

}
