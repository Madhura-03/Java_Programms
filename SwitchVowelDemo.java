public class SwitchVowelDemo
{
	public static void main (String [] args)
	{
		char vowel;
		vowel=args[0].charAt(0);
		switch(vowel)
		{
			case 'a' : System.out.println(vowel+" is a vowel");
			break;

			case 'e' : System.out.println(vowel+" is a vowel");
			break;

			case 'i' : System.out.println(vowel+" is a vowel");
			break;

			case 'o' : System.out.println(vowel+" is a vowel");
			break;

			case 'u' : System.out.println(vowel+" is a vowel");
			break;

		}
	}
}