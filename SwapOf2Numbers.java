public class SwapOf2Numbers
{
	public static void main (String []args)
	{
		int num1,num2,temp;
		num1=Integer.parseInt(args [0]);
		num2=Integer.parseInt(args [1]);
		
		System.out.println("Number1 : "+num1);
		System.out.println("Number2 : "+num2);
		temp=num1;
		num1=num2;
		num2=temp;
		System.out.println("After swap numbers are : "+num1+"\n"+num2);
	}
}