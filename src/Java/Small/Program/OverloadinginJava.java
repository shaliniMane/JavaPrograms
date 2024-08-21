package Java.Small.Program;

public class OverloadinginJava {
	public static void main(String args[])
	{
		
		double x= add(1.0,2.0,3.0,4.0);
		System.out.println("X="+x);
		double y= add(1.0,2.0);
		System.out.println("Y="+y);
		double z= add(1.0,2.0,3.0);
		System.out.println("Z="+z);
		double a= add(1.0,6);
		System.out.println("a="+ a);
	}

	private static double add(double d, double e, double f, double g) {
	System.out.println("This is method 1");
		return d+e+f+g;
	}
	private static double add(double i,double j)
	{
		System.out.println("This is method 2");
		return i+j;
	}
	private static double add(double s, double t, double u)
	{
		System.out.println("This is method 3 ");
		return s+t+u;
	}
	private static double add(double j, int e)
	{
		System.out.println("This is method 4");
		return j+e;
		
	}

}
