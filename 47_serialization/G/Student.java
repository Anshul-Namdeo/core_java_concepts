import java.io.Serializable;

class Student implements Serializable 
{
    String name;
    int age;
    transient float marks;
    transient String contact;
}