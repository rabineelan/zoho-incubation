import java.util.Scanner;
public class Diamondp {
	public static void main (String args[])
	{
		Scanner sc=new Scanner(System.in);
		int row,i,j,space=1;
		System.out.print("Enter the number and rows you want to print");
		row=sc.nextInt();
		space=row-1;
		for(j=1;j<=row;j++)
	{
		for(i=1;i<=space;i++)

	{
		System.out.println("");
	}
         	space--;
		for(i=1;i<=2*j-1;i++)
	{
		System.out.print("*");
	}
	        System.out.println( );
	}
	        space++;
		for(i=1;i<=2*(row-j)-1;i++)
	{
		System.out.print("*");
	}
	        System.out.println( );
	}
	}
