import java.util.Scanner;
public class cube{
	public static void main(String args[])
	{
		int i,n;
		Scanner in=new Scanner(System.in);
		System.out.println("input number of value");
		n=in.nextInt();
		for(i=1;i<=n;i++)
		{
			System.out.println("num " +i+ "cube " +i+ " then" +(i*i*i*i));
		}
	}
}

