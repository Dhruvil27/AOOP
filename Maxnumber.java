import java.until.Scanner;

public class Maxnumber
{
public static void main(String args[])
{
int a,b,c,largest,temp;
Scanner sc=new Scanner(System.in);

System.out.println("Enter the value of a:");
a=sc.nextInt();
System.out.println("Enter the value of b:");
b=sc.nextInt();
System.out.println("Enter the value of c:");
c=sc.nextInt();

temp=a>b?a:b;
largest=c>temp?c:temp;

System.out.println("The Largest Value is:"+largest);
}
}