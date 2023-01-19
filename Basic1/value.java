import java.util.Scanner;
class value{
	public static void main(String args[])
	{
                Scanner input=new Scanner(System.in);
	        double inch =input.nextDouble();
		double meter=0.0254*inch;
		System.out.println(inch + " inch is " + meter + " Meters ");
	}
}


