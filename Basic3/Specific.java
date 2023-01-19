public class Specific{
	public static void main(String args[])
	{
		int [] array={43,55,67,84,78};
		int toFind=84;
		boolean found = false;
		for (int n : array)
	{
		if (n==toFind)
	{
		found=true;
		break;
	}
	}
	        if (found)
	{
		System.out.println(toFind +"ans is found");
	}
	        else 
	        System.out.println(toFind+" ans is not found");
	
	}
}

