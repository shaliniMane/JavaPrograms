package Java.Small.Program;

public class TwoDArray {
	public static void main(String args[])
	{
	String [][] cars= {{"aaa","ccc","bbb","ddd"},
			           {"eee","fff","ggg","hhh","iii"},
	                   {"rr","ttt","www","cvv"}};
	
	for(int i=0; i<cars.length;i++)
	{
		System.out.println();
		for(int j=0; j<cars[i].length;j++)
		{
		System.out.println(cars[i][j]);	
		}
	}
	}

}
