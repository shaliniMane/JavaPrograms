package Java.Small.Program;

public class StaticInJava
{
	 static  int count =0;
	  StaticInJava()
	  {
		  System.out.println("Object "+count+" is created.");
	   count++;
	  }
 public static void main(String[] args)
 {
		// TODO Auto-generated method 
	        	StaticInJava obj1 = new StaticInJava();
			    StaticInJava obj2 = new StaticInJava();
			    StaticInJava obj3 = new StaticInJava();

			    System.out.println("Number of objects created: " + StaticInJava.count);
			  
			
	}

}
