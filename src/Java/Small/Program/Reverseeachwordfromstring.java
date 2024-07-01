package Java.Small.Program;

public class Reverseeachwordfromstring {
	/*public static String reverseWord(String str){  
	    String words[]=str.split("\\s");  
	    String reverseWord="";  
	    for(String w:words){  
	        StringBuilder sb=new StringBuilder(w);  
	        sb.reverse();  
	        reverseWord+=sb.toString()+" ";  
	    }  
	    return reverseWord.trim();  
	}  */
	
	public static String reverseWordInMyString(String str) {
	    String[] words = str.split(" ");
	    String reversedString = "";

	    for (int i = 0; i < words.length; i++) {

	        String word = words[i];
	        String reverseWord = "";

	        for (int j = word.length()-1; j >= 0; j--) {

	            reverseWord = reverseWord + word.charAt(j);
	        }

	        reversedString = reversedString + reverseWord + " ";
	    }
	   // System.out.println(reversedString);
	    return reversedString.trim();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// System.out.println(Reverseeachwordfromstring.reverseWord("my name is khan"));  
		  //  System.out.println(Reverseeachwordfromstring.reverseWord("I am sonoo jaiswal"));    
		    
		    System.out.println(Reverseeachwordfromstring.reverseWordInMyString("my name is khan"));  
		    System.out.println(Reverseeachwordfromstring.reverseWordInMyString("I am sonoo jaiswal"));    
		    
	}

}
