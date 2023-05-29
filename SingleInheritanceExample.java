class Animal{
String name;
public void eat()
{
System.out.println("I can eat.");
}
}


class Dog extends Animal
{
public void name()

{
System.out.println("My Name is:"+name);
}
}

public class SingleInheritanceExample
{
public static void main(String args[])
{
Dog myDog=new Dog(); 

myDog.name="Bella";
myDog.eat();
myDog.name();
}
}


