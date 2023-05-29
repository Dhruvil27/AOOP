import java.util.*;

public class Prime 
{

public static void main(String [] args)
{
int i=0,num ,temp,temp1=1;
Scanner Sc=new Scanner(System.in);

num=Sc.nextInt();
System.out.println("Primer number are before"+num);
while(temp1<=num)
{
temp=0;

for(i=2;i<=(temp1/2);i++)
{
if(temp1%i==0)
{
        temp=1;
break;
}
}



if(temp==0)
{
System.out.println(temp1);
}
   temp1++;
}
}	
}	