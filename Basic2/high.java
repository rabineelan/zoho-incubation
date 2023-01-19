import java.util.Scanner;
public class high{
	public static void main(String args[])
	{
		Scanner im=new Scanner(System.in);
		System.out.println ("enter the 1st value:");
		int a=im.nextInt();
		System.out.println("enter the 2st value:");
		int b=im.nextInt();
		System.out.println("enter the 3st value:");
		int c=im.nextInt();
	        if (a>b && a>c)
		{
			System.out.println("a is greatest");
		}
		 if (b>c)
		{
			System.out.println("b is greatest");
		}
		else{
			System.out.println("c is greatest");
		}
	}
}


