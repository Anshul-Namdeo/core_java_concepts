import java.sql.Date;

class Student 
{
    String name ;
    int age;
    float marks;
    Date dob;

    private Student(String name, int age, Date dob)
    {
        System.out.println("####");
    }

    protected Student(int age, float marks)
    {
        System.out.println("---");
    }
}