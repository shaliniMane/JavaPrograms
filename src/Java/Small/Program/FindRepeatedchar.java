package Java.Small.Program;

public class FindRepeatedchar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 String str = new String("Shallllini");
         char[] chars = str.toCharArray();
         System.out.println("Duplicate characters are:");
         for (int i=0; i<str.length();i++) {
        	
                     for(int j=i+1; j<str.length();j++) 
                     {
                        if (chars[i] == chars[j]) {
                        	 
                        System.out.println(chars[j]);
                       
                        break;
                      }
                                 
                     }

         }
	}

}
