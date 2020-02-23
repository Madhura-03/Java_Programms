public class InterestEarned
{
	public static void main (String []args)
	{
		int principal,term;
		double interest,tax;
		
		principal=Integer.parseInt(args [0]);
		term=Integer.parseInt(args [1]);
		interest=Double.parseDouble(args [2]);
		tax=Double.parseDouble(args [3]);		

		System.out.println("Amount : "+principal);
		System.out.println("Term : "+term);
		System.out.println("Interest rate : "+interest);
		System.out.println("Tax rate : "+tax);		
		System.out.println("Interest  post tax : "+((principal*term*interest)/tax));
	}
}