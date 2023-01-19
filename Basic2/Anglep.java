import java.util.Scanner;
public class Anglep{
	public static void main(String args[])
	{
		int i,j,n,R=1;
		Scanner in=new Scanner(System.in);
		System.out.print("enter the number");
		n=in.nextInt();
		for(i=1;i<=n;i++)
	{
		for(j=1;j<=i;j++)
		System.out.print(R++);
		System.out.println("");
	}
	}
}

