class Animal
{
	public void makesound()
	{
	System.out.println("Animal is Makesound");
}
}
class Dog extends Animal
{
	public void makesound(){
	System.out.println("Dog is Barking");
}}


public class Matovr
{
	public static void main(String args[])
{
	Animal a=new Animal();
	a.makesound();
	Dog d=new Dog();
	d.makesound();
}
}                                                                                  