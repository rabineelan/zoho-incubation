import java.util.Scanner;
class years{
	public static void main(String args[])
	{
	Scanner input=new Scanner (System.in);
	int totaldaysofmonth=0;
	String monthofname =" " ;
	System.out.println("input a month number");
	int month=input.nextInt();
	System.out.println("input a year");
	int year=input.nextInt();
	switch (month){
		case 1: monthofname ="january";
			totaldaysofmonth=31;
			break;
		case 2: monthofname ="february";
			if (year%4==0){
			totaldaysofmonth=29;
			}
			else{
				totaldaysofmonth=28;
			}
			break;
		case 3: monthofname ="march";
			totaldaysofmonth=31;
			break;
		case 4: monthofname ="april";
			totaldaysofmonth=30;
			break;
		case 5:
			monthofname ="may";
			totaldaysofmonth=31;
			break;
		case 6:
			monthofname ="june";
			totaldaysofmonth=30;
			break;
		case 7:
			monthofname ="july";
			totaldaysofmonth=31;
			break;
		case 8: 
			monthofname ="august";
			totaldaysofmonth=31;
			break;
		case 9: 
			monthofname ="septemper";
			totaldaysofmonth=30;
			break;
		case 10:
			monthofname ="october";
			totaldaysofmonth=31;
			break;
		case 11:
			monthofname ="november";
			totaldaysofmonth=30;
			break;
		case 12:
			monthofname ="december";
			totaldaysofmonth=31;
			break;
	}
			System.out.println(monthofname +" "+ year +" "+ totaldaysofmonth);
}
}

