class Animal
{
	public void eat()
	{
	System.out.println("I Can Eat.");
	}
}


class Dog extends Animal
{

	public void bark()
	{
	System.out.println("I Can Bark.");
	}
}



class Bulldog extends Dog{
	public void guard()
	{
	System.out.println("I Can guard the House.");
	}
}




public class MultilevelIn
{
public static void main(String args[]){

Bulldog B=new Bulldog();
B.eat();
B.bark();
B.guard();
}
}
