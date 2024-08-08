package Java.Small.Program;

import java.util.Scanner;

public class Printpattern {

	public static void main(String[] args) {
	
		System.out.println("Enter how many rows:");
		Scanner sc = new Scanner(System.in);
		int r=sc.nextInt();
		System.out.println("Enter how many column:");
	    int c =	sc.nextInt();
		System.out.println("Enter which symbol::");
		String symbol=sc.next();
		
		for(int i=0;i<r;i++)
		{
			for (int j=i; j<c;j++)
			{
				System.out.print(symbol);
			}
			System.out.println();
		}
	}

}
