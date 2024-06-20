package Java.Small.Program;

public class CircleStatic {
	static double pi= 3.14;
	double radius;
public	CircleStatic(double r)
	{
		radius= r;
	}
public double area ()
{
	return pi*radius*radius;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CircleStatic c1 = new CircleStatic(5);
		CircleStatic c2 = new CircleStatic(7);
		System.out.println("Area of circle for c1="+c1.area());
	    System.out.println("Area of circle for c2="+c2.area());

	}

}
