package Java.Small.Program;

public class ConstructorsInJava {

	public static void main(String[] args) {
	
		Human human= new Human(30, "white", 45, "ram", 34);
		Human human1= new Human(30, "black", 65, "sham"
				+ "", 23);
		System.out.println(human.name); 
		System.out.println(human1.name); 
		
		human.eat();
		human1.drik();
	}

}
