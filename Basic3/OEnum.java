import java.util.*; 
public class OEnum {
 public static void main(String[] args)
 {
    int[] nums = {5, 7, 2, 4, 9};
	int num_even = 0, num_odd = 0;
	System.out.println("Original Array: "+Arrays.toString(nums)); 
	    
    for(int i = 0; i < nums.length; i++) {
        if(nums[i] % 2 == 0)
		{         
          num_even++;
		}
		else
		   num_odd++;	
    }                 
    System.out.printf("\nNumber of even elements in the array: %d",num_even);
	System.out.printf("\nNumber of odd elements in the array: %d",num_odd);
	System.out.printf("\n");	
  }
}
