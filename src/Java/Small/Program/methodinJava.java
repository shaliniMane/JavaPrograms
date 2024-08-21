package Java.Small.Program;

public class methodinJava {
	static int sum;
	public static void main(String args[])
	{int x=3, y=7;
		printmessage();
		//Pass parameter to string
		String name= "Ram";
		printmgs(name);
		sum=addTwono(x,y);
		System.out.println("Sum="+ sum);
	}
	 static void printmgs(String name) {
		System.out.println("Name="+name);
	}
	static void printmessage()
	{
		System.out.println("Hello world");
		
	}
	static int addTwono(int a, int b)
	{
		 sum= a+b;
		return sum;
	}
	

}
