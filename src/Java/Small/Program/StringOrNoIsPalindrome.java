package Java.Small.Program;

import java.util.Scanner;

public class StringOrNoIsPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 String original, reverse = "";
	        Scanner in = new Scanner(System.in);
	        int length;
	        System.out.println("Enter the String====");
	        original = in.nextLine();
	        length = original.length();
	        for (int i =length -1; i>=0; i--) {
	            reverse = reverse + original.charAt(i);
	        }
	        System.out.println("reverse is:" +reverse);
	         
	        if(original.equals(reverse)) 
	            System.out.println("The number is palindrome");
	        else
	            System.out.println("The number is not a palindrome");
	         
	}

}
