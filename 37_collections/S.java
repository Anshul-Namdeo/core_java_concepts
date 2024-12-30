import java.util.ArrayList;

class S 
{
    public static void main(String args[])
    {
        Student a = new Student("karthik",23);

        System.out.println(a);
        System.out.println(a.toString());
    }
}

class Student 
{
    String name ;
    int age;

    Student(String name , int age)
    {
        this.name = name ;
        this.age = age ;
    }

    // public String toString()
    // {
    //     return name +" - "+ age;
    // }
}