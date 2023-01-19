import java.util.Scanner;
public class Table{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int num=in.nextInt();
		System.out.println("type the number");
		for(int i=1;i<=20;i++)
		{
			System.out.println(num+"*"+i+"="+num*i);
		}
	}
}

