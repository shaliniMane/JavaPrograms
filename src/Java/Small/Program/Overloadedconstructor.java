package Java.Small.Program;

public class Overloadedconstructor {

	public static void main(String[] args) {

		
		Pizza pizza= new Pizza("Thick crust", "Paneer", "Mozzerella", "Pepperoni");
		
		System.out.println("Ingredient of pizza are:");
		System.out.println(pizza.bread);
		System.out.println(pizza.cheese);
		System.out.println(pizza.sauce);
		System.out.println(pizza.topping);
		
		Pizza pizza1= new Pizza("Thick crust", "Paneer", "Mozzerella");
		System.out.println(pizza1.bread);
		System.out.println(pizza1.cheese);
		System.out.println(pizza1.sauce);
		
		Pizza pizza2= new Pizza("Thick crust", "Paneer");
		System.out.println(pizza1.bread);
		System.out.println(pizza1.cheese);
	
		
	
	}

}
