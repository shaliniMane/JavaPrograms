package Java.Small.Program;

import java.util.ArrayList;

public class twoDArrayList {

	public static void main(String args[])
	{
		
		ArrayList  <String> producerList= new ArrayList();
		producerList.add("Tomato");
		producerList.add("Chillies");
		producerList.add("Onion");
		
		ArrayList<String> bakeryList = new ArrayList();
		bakeryList.add("Pizza");
		bakeryList.add("Garlic bread");
		bakeryList.add("Vada");
		
		
		ArrayList<String> drinkList= new ArrayList();
		drinkList.add("Soda");
		drinkList.add("Coffe");
		drinkList.add("juice");
		
		System.out.println(bakeryList);
		System.out.println(producerList);
		System.out.println(drinkList);
		
		//2DArrayLList
		ArrayList<ArrayList<String>>   grocerylist = new ArrayList();
		grocerylist.add(producerList);
		grocerylist.add(bakeryList);
		grocerylist.add(drinkList);
		
		System.out.println("Grocery list="+grocerylist);
		System.out.println(grocerylist.get(0).get(0));
		
	}
}
