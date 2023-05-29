class rectangle
{
int height;
int weight;
}

public rectangle(int h,int w)
{
h=height;
w=weight;
}

public void display()
{
System.out.println("Height:"+height);
System.out.println("Weight:"+weight);	
}

class Pr7
{
public static void main(String args [])
{
public rectangle r=new rectangle(200,300);
r.display();
}
}
