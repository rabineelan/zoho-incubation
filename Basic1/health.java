import java.util.*;
public class health {
	public static void main(String  args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println(" my body weight");
		double weight=sc.nextDouble();
                System.out.println("my height");
		double height=sc.nextDouble();
		double BMI=weight/(height*height);
		System.out.println("body mass index(BMI) is"+ BMI);
	}
}

