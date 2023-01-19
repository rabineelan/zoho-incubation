import java.util.Scanner;
class vowels{
	public static void main(String args[])
	{
	 Scanner sc=new Scanner(System.in);
	 int i=0;
	 System.out.println("a character");
	 char ch=sc.next().charAt(0);
	 if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
	 {
		 System.out.println("a charater "+ch+" is vowel");
	 }
	 else if ((ch>='a'&&ch<='z')||(ch>='A'&&ch<'z'))
		 System.out.println("a character "+ch+" is consonant");
	 else
		 System.out.println("not an letter");
	}
}
	  
