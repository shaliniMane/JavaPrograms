package Java.Small.Program;

public class Human {
	
	int age;
	String color;
	float height;
	String name;
	double weight;
	
	Human(int age,String color,float height,String name,double weight)
	{
		this.age= age;
		this.color= color;
		this.height= height;
		this.name=name;
		this.weight=weight;
	}
	
	void eat()
	{
		System.out.println(this.name+ " is eating");
	}
	void drik()
	{
		System.out.println(this.name+" is driking");
		
	}
	
	

}
