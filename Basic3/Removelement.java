import java.util.Scanner;
public class Removelement {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter the number of elements ");
		n=sc.nextInt();
		Integer arr[]=new Integer[n];
		System.out.println("Enter the elements of Array ");
		for (int i=0;i<n;i++)
	{
		arr[i]=sc.nextInt();
	}
	        System.out.println("Enter the elements you want to remove ");
		int elm = sc.nextInt();

		for (int j=1 ; j<arr.length-1 ; j++)
	{
		arr[j]=arr[j+1];
	}
	    
	}
}

