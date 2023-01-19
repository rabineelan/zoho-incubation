import java.util.Scanner;
class max{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		int num;
		int num1;
		System.out.println("please enter num:");
		num=input.nextInt();
		System.out.println("please enter num2:");
		num1=input.nextInt();
		System.out.println("add"+(num+num1));
		System.out.println("sub"+(num-num1));
		System.out.println("mul"+(num*num1));
		System.out.println("avg"+((num+num1)/2));
		System.out.println("Dis"+Math.abs(num-num1));
                System.out.println("max"+Math.max(num,num1));
                System.out.println("min"+Math.min(num,num1));

	}
}


