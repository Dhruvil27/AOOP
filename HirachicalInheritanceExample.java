class Animal
{
	public void eat()
	{
	System.out.println("I can eat.");
	}
}



class Dog extends Animal
{
	public void bark()
	{
	System.out.println("I can bark.");
	}
}

class cat extends Animal
{
	public void meow()
	{
	System.out.println("I Can Meow");
	}
}

class HirachicalInheritanceExample
{
     public static void main(String args[])
     {
     Dog myDog=new Dog();
     myDog.eat();
     myDog.bark();


    cat mycat=new cat();
    mycat.eat();    
   mycat.meow();
    }
     }