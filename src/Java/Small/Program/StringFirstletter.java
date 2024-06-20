package Java.Small.Program;

public class StringFirstletter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  /*short form
	      Input: Anand Kumar Hooda
	      Output: A.K. Hooda*/
		 String inptstr = null ;
	      String s= "Anand Kumar Hooda";
	      
	      String[] nameParts = s.split(" ");
	      String firstName = nameParts[0];
	      String middlename= nameParts[1];
	      char middlechar= middlename.charAt(0);
	      char firstNameChar = firstName.charAt(0);
	      if (nameParts.length > 1) {
	          System.out.print( firstNameChar);
	          
	          System.out.print("." + middlechar);
	          String lastName = nameParts[nameParts.length - 1];
	        //  char lastNameChar = lastName.charAt(0);
	          System.out.print(" " + lastName);
	      }
	      else {
	          System.out.println("First character name: " + firstNameChar);
	      }
	}

}
