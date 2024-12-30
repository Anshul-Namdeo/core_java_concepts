import java.io.Serializable;

class Student implements Serializable 
{
    String name ;
    int age ;
    transient float marks = 78.57f;
    transient String contact = "111111111";
}