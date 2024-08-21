package Java.Small.Program;

import java.util.ArrayList;

public class ForEachdemo {
	public static void main(String[] args)
	{
		
		String[] flowers= {"Marigold", "Jasmine", "Rose","Lilly"};
		
		for(String i: flowers)
		{
			System.out.println("flower= "+i);
		}
		
		//ArrayList using collection

		ArrayList<String> animals= new ArrayList();
		animals.add("Dog");
		animals.add("Cow");
		animals.add("Bull");
		animals.add("Cat");
		for(String j: animals)
		{
			System.out.println("Animal ="+j);
		}
	}

}
