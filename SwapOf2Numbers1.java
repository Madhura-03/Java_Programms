public class SwapOf2Numbers1
{
	public static void main (String args [])
	{
		int num1,num2;
		num1=Integer.parseInt(args[0]);
		num2=Integer.parseInt(args[1]);
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		System.out.println("After Swap :"+num1+"\n"+num2);
	}
}