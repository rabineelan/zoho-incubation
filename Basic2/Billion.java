import java.util.Scanner;
public class Billion{
	public static void main (String args[])
	{
		Scanner sc=new Scanner(System.in);
		int count =0;
		System.out.println("enter the value");
		int num=sc.nextInt();
		while(num!=0)
        {
		num=num/10;
		count++;
	}
	        System.out.println("number of digits the integer"+count);
	}
}


