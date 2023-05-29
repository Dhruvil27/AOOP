class salary{
int basic;
	double hra;
  	double da;
	double sal;
salary(int basic,double hra,double da)
{
this.basic=basic;
this.hra=hra;
this.da=da;
}
salary(int basic,double hra)
{
this(basic,hra,Null);
}
salary(int basic){
this(basic,Null);
}
public static void main(String args[])
{
salary e=new salary(5000,0.20,0.10);
e.sal=e.basicte.hrate.da;
system.out.println("New salary is:+e.sal");
}
}