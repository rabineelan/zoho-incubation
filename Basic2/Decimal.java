import java.util.Scanner;
public class Decimal{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Input first floating point number");
		double vlu1=in.nextDouble();
		System.out.println("Input second floading point number");
		double vlu2=in.nextDouble();
		in.close();
		
		if (Math.abs(vlu1 - vlu2) <=0.01)
	{
		System.out.println("This number are same");
	}
	        else
	{
		System.out.println("This number are so different");
	}
	}
}


