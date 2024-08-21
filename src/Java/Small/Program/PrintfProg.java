package Java.Small.Program;

public class PrintfProg {

	public static void main(String[] args) {

		System.out.printf("This is a format string %d :", 623);
		System.out.println();
		System.out.printf("%d This is a format string :", 623);
		System.out.println();
		System.out.printf("This is a format string :", 623);
		System.out.println();
		
		boolean myboolean= true;
		char mychar ='#';
		String mystr = "Sham";
		int myInt= 46;
		double mydouble= 20000;
	
		
		System.out.printf("%b", myboolean);
		System.out.println();
		System.out.printf("%c", mychar);
		System.out.println();
		System.out.printf("%s",mystr);
		System.out.println();
		System.out.printf("%d", myInt);
		System.out.println();
		System.out.printf("%f",mydouble);
		System.out.println();
		
		//Width 
		System.out.printf("Hello %10s", mystr);
		System.out.println();
		//sets the no of digits of precesion  when outputting floating point value.
		System.out.printf("You have this much money %.2f", mydouble);
		System.out.println();
		//flags
		System.out.printf("You have this much money %-20f", mydouble);
		System.out.println();
		System.out.printf("You have this much money %20f", mydouble);
		System.out.println();
		System.out.printf("You have this much money %+f", mydouble);
		System.out.println();
		System.out.printf("You have this much money %020f", mydouble);
		System.out.println();
		System.out.printf("You have this much money %,f", mydouble);
	}

}
