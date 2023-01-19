import java.util.Scanner;
public class Avd_spiral
{
public static void main(String[]args)
{
int i, j,rowStart,rowEnd,colStart,colEnd;
int n,m;
Scanner input = new Scanner(System.in);
System.out.println(" Enter the no. of rows :");
m=input.nextInt();
System.out.println("Enter the no.of columns :");
n=input.nextInt();
int arr[][]=new int [m][n];
System.out.println(" Enter the Arrays values:");
for(i=0;i<m;i++)
{
for(j=0;j<n;j++)
{
arr[i][j]=input.nextInt();
}
}
rowStart=0;
rowEnd=arr.length-1;
colStart=0;
colEnd=arr[0].length-1;
while(rowStart<rowEnd && colStart<colEnd)
{
for(i=colStart;i<=colEnd;i++)
{
System.out.print(arr[rowStart][i]+" ");
}
rowStart+=1;
for(i=rowStart;i<=rowEnd;i++)
{

System.out.print(arr[i][colEnd]+" ");
}
colEnd-=1;
for(i=colEnd;i>=colStart;i--)
{
System.out.print(arr[rowEnd][i]+" ");
}
rowEnd-=1;
for(i=rowEnd;i>=rowStart;i--)
{
System.out.print(arr[i][colStart]+" ");
}
colStart+=1;
}
}
}  

