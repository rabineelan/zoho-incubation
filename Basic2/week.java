import java.util.Scanner;
public class week{
	public static void main (String args[])
	{
	Scanner in=new Scanner(System.in);
	System.out.println(" weekly days 1 to 7 ");
	int day=in.nextInt();
	switch(day){
		case 1 :
		       	System.out.println("monday");
		 break;
		case 2 : 
		 System.out.println("tuesday"); 
		 break;
		case 3 :
		 System.out.println("wendnesday");
		 break;
		case 4 :
		 System.out.println("thursday");
	         break;
		case 5 : 
		 System.out.println("friday");
	         break;
		case 6 : 
		 System.out.println("saturday");
	         break;
		case 7 : 
			 System.out.println("sunday");
		 break;

		default : System.out.println("invaild day range");
	}
	}
}

