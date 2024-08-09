package Java.Small.Program;

public class StringOperations {
	public static void main(String args[])
	{
	  String name = " Kumari ";
      boolean result=	name.equals("Kumari");
      System.out.println("Equals demo="+result);
      
      boolean result1= name.equalsIgnoreCase("kumari");
      System.out.println("equalsIgnoreCase"+result1);
      
      boolean result2=	name.equals("Kumarii");
      System.out.println("Equals="+result2);
      
      char re1= name.charAt(0);
      System.out.println("char1= "+re1);
      
      int re2= name.indexOf("m");
      System.out.println("k index is = "+re2);
      
      boolean isempty= name.isEmpty();
      System.out.println("Is empty="+isempty );
      
      boolean isblank= name.isBlank();
      System.out.println("Name is blank="+isblank );
      
      String upstr= name.toUpperCase();
      System.out.println("Uppercase str="+ upstr);
      
      String lostr= name.toLowerCase();
      System.out.println("Lower case str="+lostr );
      
      String trimsttr= name.trim();
      System.out.println("Trimmed str="+trimsttr );
      
      String repStr= name.replace("i", "o");
      System.out.println("Replaced str="+ repStr);
      
      
	}
}
