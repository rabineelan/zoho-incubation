import java.util.Scanner;
public class Addelement{
	public static void main(String args[])
	{
		int i, element;
		int[] arr=new int[11];
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the 10 value ");
		for (i=0; i<10; i++)
		arr[i]=sc.nextInt();
		System.out.println("Enter the element insert ");
		element=sc.nextInt();
		arr[i]=element;
		System.out.print("Enter the new element ");
		for (i=0; i<11; i++)
		System.out.print(arr[i]+" ");
	}
}
