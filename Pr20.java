abstract class shape
{
abstract double  Area();
}

class rectangle extends shape
{

double length;
double width;

rectangle(double length,double width)
{
this.length=length;
this.width=width;
}

public double Area()
{
return  length * width;
}
}


class circle extends shape
{

double radius;


circle(double radius)
{
this.radius=radius;

}

public double Area()
{
return Math.PI*radius*radius;
}
}
class Triangle extends shape
{

double hight;
double base;

Triangle(double hight,double base)
{
this.hight=hight;
this.base=base;
}

public double Area()
{
return  0.5*hight*base;
}
}

class Pr20
{

public static void main(String args[])
{
shape rectangle=new rectangle(4,5);
shape circle=new circle(3);
shape Triangle=new Triangle(4,5);

System.out.println("Rectangle Area:"+rectangle.Area());
System.out.println("Circle Area:"+circle.Area());
System.out.println("Triangle Area:"+Triangle.Area());


}
}

