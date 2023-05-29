public class Pr3
{
public static void main(String[] args)
{
int number=1234, rev=0;

while(number !=0)
{
int rem=number%10; 
rev=rev*10+rem;  
number=number/10; 
}

System.out.println("Reverced Number is:"+rev);
}
}