class MyException extends Exception
{
	
	MyException(String msg)
	{super(msg);}
	
}

class StudentAccount
{
	double balance;
	double interest;
	StudentAccount(){balance=0;interest=0;}
	
	public void deposit(double amount)
	{
		balance+=amount;
		
	}
            
	public void withdraw(double amount)
	{
		balance=balance-amount;
		
	}	
	
	public void Addinterest()
	{
		balance=balance+balance*interest;
	}
	public double getBalance(){return balance;}
}
public class Pr24
{
	public static  void main(String args[])
	{
		StudentAccount sa=new StudentAccount();
		sa.deposit(25000);
		sa.withdraw(20000);
		sa.Addinterest();
		sa.withdraw(4000);
		sa.Addinterest();
		System.out.println(sa.getBalance());
		try
		{
			sa.withdraw(2000);
			if(sa.getBalance()<0)
			{
				throw new MyException("No Suffcient Fund");
				
			}
		}
		
		catch(MyException e)
		{
			System.out.println(e.getMessage());
			System.out.println("Transaction was Fail..");
	}
    }
}
	
	
	
	