import java.util.Scanner;
class AreaOfCircle
{
	public static void main(String args[])
	{
		final double PI=3.14;	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radius of circle:");
		double r=sc.nextDouble();
		System.out.println("Radius="+r);
		double area;
		area=(PI*(r*r));
		System.out.println("Area of circle is :"+area);
	}
}