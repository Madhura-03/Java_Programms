public class Temperature
{
	public static void main (String []args)
	{
		int celcius;
		
		celcius=Integer.parseInt(args [0]);
					
		System.out.println(" Conversion of temperature from celcius to fehrenheit is : "+(celcius*9/5+32));
	}				
}