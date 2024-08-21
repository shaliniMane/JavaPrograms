package Java.Small.Program;

import java.util.Random;

public class DiceRoller {
	Random random;
	int number;
	DiceRoller()
	{
	 random = new Random();
	 number = 0;
		roll();
	}
	
	void roll()
	{
		number = random.nextInt(6)+6;
		System.out.println(number);
	}

}
