//to find sum of series 1 + 1/2! + 1/3! +......+ 1/n!
import java.util.Scanner;
class FactorialSumSeries
{
	static double fact(double n)
	{
		double res=1;
		for(double j=1;j<=n;j++)
		{
			res=res*j;
		}
		return res;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number:");
		double num=sc.nextDouble();
		double sum=0;
		System.out.println("The series as follows:");
		for(double i=1;i<=num;i++)
		{
			if(i==1)
			{
				System.out.print("1 + ");
			}
			else if(i==num)
			{
				System.out.print("1/"+num+"!");
			}
			else
			{
				System.out.print("1/"+i+"!"+" + ");
			}
			sum=sum+(1/fact(i));
		}
		System.out.println();
		System.out.println("Sum of given series is "+sum);
	}
}