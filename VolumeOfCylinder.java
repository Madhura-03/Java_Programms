public class VolumeOfCylinder
{
	public static void main(String []args)
	{
		int radius,height;
		double volume;
		radius=Integer.parseInt(args [0]);
		height=Integer.parseInt(args [1]);
		
		System.out.println("Volume of Cylinder : "+(3.14*radius*radius*height));
	}
}