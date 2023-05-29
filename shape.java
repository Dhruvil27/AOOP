class shape{

void area(float l,float b)
{
System.out.println("Area Of rectangle is:"+l*b+"units");
}

void area(float r)

{
double ar=3.14*r*r;
System.out.println("Area Of circle is:"+ar+"units");
}

void area(int r)
{
double sq=r*r;
System.out.println("Squre  is:"+sq);
}

public static void main(String args[])
{

 shape r1 =new shape();

  r1.area(10,20);
  r1.area(10);
  r1.area(5);
}
}



