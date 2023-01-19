public class Average{
	public static void main(String args[])
	{
		int []arr=new int[]{33,45,23,87,-43,-12};
		int sum=0;
		for(int i=0;i<arr.length;i++)
	        sum=sum+arr[i];
		double average=sum/arr.length;
		System.out.println("average value of the elements = "+average);
	}
}


