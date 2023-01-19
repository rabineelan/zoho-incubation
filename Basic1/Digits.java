import java.util.Scanner;
public class Digits{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		int num=input.nextInt();

		int firstDigit =num % 10;
		int reminingnumber = num / 10;
		int secondDigit = reminingnumber % 10;
                reminingnumber = reminingnumber / 10;
		int thirdDigit = reminingnumber % 10;
		int sum= firstDigit + secondDigit + thirdDigit;
		System.out.println(sum);
	}
}

