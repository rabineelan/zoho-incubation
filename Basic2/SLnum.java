import java.util.Scanner;
public class SLnum{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
                System.out.println(" input value");
		double input=sc.nextDouble();
		if (input > 0)
	{
		if (input < 1)
	{
		System.out.println("small positive numbar");
	}
	        else
		if(input > 10000000)
	{
		System.out.println("large positive number");
	}
	        else 
	{
		System.out.println("positive number");
	}
	}
	        else
	        if(input < 0)
	{
		if(Math.abs(input)<1)
	{
		System.out.println("small negative number");
	}
	        if(Math.abs(input)<10000000)
	{
		System.out.println("large negative number");
	}
	        else
	{
		System.out.println("zero");
	}
	}
	}
}
