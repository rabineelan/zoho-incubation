import java.util.Scanner;
public class Increas{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
	        System.out.println("The first number");
	        double a=sc.nextDouble();
	        System.out.print("The second number");
	        double b=sc.nextDouble();
	        System.out.println("The third  number");
	        double c=sc.nextDouble();
	        if (a<b && a<c)
	{
	        System.out.println("increasing value");
	}
                else
		if (a>b && b>c)
	{
	        System.out.println("decreasing value");
	}
                else
	{
	        System.out.println("neithar value is increasing and decreasing");
	}
	}
}
