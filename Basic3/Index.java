public class Index{
	public static int findvalue(int[] my_array,int t)
	{
		if (my_array == null) return-1;
		int len = my_array.length;
		int i=0;
		while (i<len){
	        if(my_array[i]==t) return-1;
		else i=i+1;
	}
	        return-1;
	}
	        public static void main(String args[])
	{
		int[] my_array = {23,33,65,89,54,58,43,21,98};
		System.out.println("Index is position of 33 " + findvalue(my_array, 33));
		System.out.println("Index is position of 43 " + findvalue(my_array, 43));
	}
}
