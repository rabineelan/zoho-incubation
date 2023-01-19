import java.util.Scanner;
public class KMPH{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		float timesec;
		float mps,kph,mph;
		
		System.out.print("Input distance meter ");
                float distance = sc.nextFloat();

		System.out.print("Input hour ");
		float hr = sc.nextFloat();

		System.out.print("Input Minutes ");
		float min = sc.nextFloat();

		System.out.print("Input seconds ");
		float sec = sc.nextFloat();

		timesec = (hr*3600) + (min*60) + sec;
		mps = distance / timesec;
		kph = (distance/1000.0f) / (timesec/3600.0f);
		mph = kph / 1.609f;

		System.out.println ("your speed in met/sec " +mps);
		System.out.println ("your speed in km/h " +kph);
		System.out.println ("your speed in mil/h " +mph);

		sc.close();
	}
}

