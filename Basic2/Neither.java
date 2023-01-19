import java.util.Scanner;
public class Neither{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("first input number");
		int j=sc.nextInt();
		System.out.println("second input number");
		int s=sc.nextInt();
		System.out.println("third input number");
                int w=sc.nextInt();
		
		if (j==s && j==w)
	{
		System.out.println("all numbers equal");
	}
	        else
	        if ((j==s||(j==w)||j==s))
	{
		System.out.println("neither number all equal and different");
	}
	        else
	{
		System.out.println("different all numbers");
	}
	}
}

