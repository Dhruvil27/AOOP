package pack1;

public class A{
	
	
	int x = 25;
	private int x_pri=25;
	protected int x_pro=35;
	public int x_pub=45;

void  printall()

{

System.out.println("---Printing PAckage1 Class A");
System.out.println("x:"+x);
System.out.println("private x:"+x_pri);
System.out.println("protected x:"+x_pro);
System.out.println("public x:"+x_pub);

}
}