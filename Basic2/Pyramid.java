import java.util.Scanner;
public class Pyramid{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("input number rows");
		int i,j,n,s,x;
		n=sc.nextInt();
		s=n+4-1;
		for(i=1;i<=n;i++)
	{
		for (x=s;x!=0;x--)
	{
		System.out.print(" ");
	}
	        for(j=1;j<=i;j++)
	{
		System.out.print(i+" ");
	}
	        System.out.println();
		s--;
	}
	}
}
