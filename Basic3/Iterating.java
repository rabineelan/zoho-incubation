public class Iterating {
	public static void main(String args[])
	{
		int[]arr1=new int []{1,2,3,4,5,6};
		int[]arr2=new int[arr1.length];
		for (int i=0; i<arr1.length; i++)
		{
		arr2[i]=arr1[i];
		}
		System.out.println("Original array ");
		for (int i=0; i<arr1.length; i++)
		{
		System.out.println(arr1[i]+"");
		}
		System.out.println();
		System.out.println("new array");
		for(int i=0; i<arr2.length;i++)
		{
		System.out.print(arr2[i]+"");
		}
	}
}

