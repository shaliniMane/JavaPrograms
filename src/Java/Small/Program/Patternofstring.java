package Java.Small.Program;

public class Patternofstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= "Sample";
		int length= str.length();
		char[] ch=str.toCharArray();
		int i;
		for(i=0;i<=length-1;i++)
		{
			System.out.print(ch[i]);
			
			if(i==length-1)
			{
				length--;
				//System.out.println("Length="+length);
				
				System.out.println();
				
				if(length==0)break;
				i = -1;
			}
	
			
		}	
		

	}

}
