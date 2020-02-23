public class IfDemo
{
	public static void main (String []args)
	{
		int num;
		num=Integer.parseInt(args[0]);
		if(num>10)
		{
			System.out.println("Value is greater than 10 : "+num);
		}
		else
		{
			System.out.println("Value is less than 10 : "+num);
		}
		
	}
}