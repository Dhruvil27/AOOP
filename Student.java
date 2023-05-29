`class Student{
int Enrollmentno;


public Student(int Enrollmentno)
{
 this.enrollmentno=Enrollment no;
}


public void getEnrollmentno()
{
System.out.println("Enrollmentno="+Enrollment no)
}


public void display()
{
this.getEnrollmentno();
System.out.println();
}



public static void main(String args[])
{
Student s1=new Student (33);
System.out.println(s1.Enrollmentno);

}
}