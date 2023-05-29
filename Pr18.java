class car{

   String name;
   int  Topspeed;
  
	public car(String name,int Topspeed)
		{
		this.name=name;
		this.Topspeed=Topspeed;
		}
		
public String toString()
	{
	return "Name:"+name+",Topspeed:"+Topspeed;
	}
}

public class Pr18{
	public static void main(String[] args)
	{
	car car1=new car("Audi",60);
	car car2=new car("Forchuner",80);
	car car3=new car("Thar",40);
	car car4=new car("i20",100);
	car car5=new car("BMW",120);

	System.out.println(car1);
	System.out.println(car2);
	System.out.println(car3);
	System.out.println(car4);
	System.out.println(car5);

}
}