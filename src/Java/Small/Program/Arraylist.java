package Java.Small.Program;

import java.util.ArrayList;

public class Arraylist {

	public static void main(String[] args) {
	
        // initial size n
        ArrayList<Integer> al = new ArrayList<Integer>();
       System.out.println("changed code here by dev1");
      // Appending new elements at
        // the end of the list
        for (int i = 1; i <= 5; i++)
            al.add(i);
 
        // Printing elements
        System.out.println(al);
        al.remove(3);
 
        // Displaying the ArrayList
        // after deletion
        System.out.println(al);
 
        // Printing elements one by one
        for (int i = 0; i < al.size(); i++)
            System.out.print(al.get(i) + " ");
        
        System.out.println("Shalini");
	}
	
}
