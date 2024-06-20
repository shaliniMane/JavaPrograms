package Java.Small.Program;

public class RemoveWhiteSpaces1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sb="";
         int i;
		String str1 = "Shalini        is an Autom ation Engi ne      er";
		  
		
		for(i=0;i<str1.length();i++)
		{
			if(str1.charAt(i)!=' ')
		    sb=sb+str1.charAt(i);
			//sb=sb.toString();
		  
		}
		System.out.println("String is ="+sb);
	}

}
