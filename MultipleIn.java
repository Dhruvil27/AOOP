interface Animal
{
	public void eat();
}


interface sound
{
	public void makesound();
}



class Dog implements Animal,sound
{
	public void eat()
	{
		System.out.println("I can eat");
	}
	public void makesound()
	{
		System.out.println("I can MakeSound");
	}
}


public class MultipleIn
{
	public static void main(String args[])
	{
	Dog d=new Dog();
	d.eat();
	d.makesound();
	}

}