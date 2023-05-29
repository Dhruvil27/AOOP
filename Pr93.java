//static Method


class A
{
void fun1()
{
System.out.println("This Non static method");
}

static void fun2()
{
System.out.println("This Static Method");
}
}


class Pr93
{
public static void main(String args[])
{
A A1=new A();
A1.fun1();
A.fun2();
}
}