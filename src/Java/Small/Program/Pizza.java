package Java.Small.Program;

public class Pizza {
	String bread;
	String sauce;
	String cheese;
	String topping;
	
	Pizza(String bread,String sauce,String cheese,String topping)
	{
		this.bread= bread;
		this.sauce= sauce;
		this.topping= topping;
		this.cheese= cheese;
	}
	Pizza(String bread,String sauce,String cheese)
	{
		this.bread= bread;
		this.sauce= sauce;
		this.cheese= cheese;
	}
	public Pizza(String bread, String sauce) {
		this.bread= bread;
		this.sauce= sauce;
	}
}
