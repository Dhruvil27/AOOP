class student
{
int Enrollmentno;
char Stname;
}

public student(int en,char na)
{
en=Enrollmentno;
na=Stname;
}

public void display()
{
System.out.println("Student Enrollment number is:"+Enrollmentno);
System.out.println("Student Name:"+Stname);	
}

class Pr7-1
{
public static void main(String args [])
{
public student s=new student(33,Dhruvil);
s.display();
}
}
