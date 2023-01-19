import java.util.Scanner;
public class Equations{
	public static void main (String args[])
	{
		Scanner sc=new Scanner(System.in);
		double a = sc.nextDouble();
		System.out.println("Enter the value of A ");

		System.out.println("Enter the value of B ");
		double b = sc.nextDouble();

		System.out.println("Enter the value of C ");
		double c = sc.nextDouble();
		
		double d=b*b-4.0*a*c;
		if (d>0.0)
	{
		double r1=(-b+Math.pow(d,0.5))/(2.0*a);
		double r2=(-b-Math.pow(d,0.5))/(2.0*a);
		System.out.println("The roots "+r1+ " and " +r2);
	}
	        else if (d==0.0)
	{
                double r1=-b/(2.0*a);
		System.out.println("The roots " +r1);
	}
	        else 
	{
		System.out.println("Roots are not real");
	}
	}
}

