import java.util.Scanner;

public class Pr2 {
public static void main(String[] args)
{
int a,b,c,largest,temp;
Scanner sc=new Scanner(System.in);

System.out.println("Enter the First Number Of a:");
a=sc.nextInt();
System.out.println("Enter the Second Number Of b:");
b=sc.nextInt();
System.out.println("Enter the Second Number Of bc:");
c=sc.nextInt();

temp=a>b?a:b;
largest=c>temp?c:temp;

System.out.println("The Largest Value is:"+largest);
}
}
