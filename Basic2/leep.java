import java.util.Scanner;
class leep{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int year;
		year = sc.nextInt();
		System.out.println("enter the year");
		if((year%4==0)){
			System.out.println("its leep year");}
		
		else{
			System.out.println("its not leep year");}
	}
}
