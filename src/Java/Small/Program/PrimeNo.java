package Java.Small.Program;

import java.util.Scanner;

public class PrimeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number,count=0;
	
		System.out.println("Enter no:");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		number=	sc.nextInt();
	for (int i = 2; i <= number / 2; i++) {
        if (number % i == 0) {
            count++;
            break;
        }
    }
    if (count == 0) {
        System.out.println(number + " is a prime number");
    } else {
        System.out.println(number + " is not a prime number");
    }
		
		
	}

}
