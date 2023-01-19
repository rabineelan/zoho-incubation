import java.util.*;
public class Twospcfi {
	public static void main (String args[])
	{
		int [] array_nums ={33,33,73,74,73,74,33};
		System.out.println ("orginal numbers " +Arrays.toString(array_nums));
		int num1 =33;
		int num2 =73;
		int num3 =74;
		System.out.println("Result "+result(array_nums, num1 ,num2,num3));
	}
	public static boolean result(int[] array_nums, int num1, int num2, int num3)
	{
		for (int number : array_nums)
		{
			boolean r = number !=num1 && number !=num2 && number !=num3;
			if (r) {
			return false;
			}
		}
	                return true;
}
}

