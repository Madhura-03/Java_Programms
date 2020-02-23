public class AsciiValue
{
	public static void main (String args [])
	{
		char char1;
		char1=(args[0].charAt(0));
		
		if(char1>=97 && char1<=122)
		
			System.out.println("lowerCase");
		
		
		else
		{
			if(char1>=65 && char1<=90)
			
			System.out.println("UpperCase");
			
		}
	}
}