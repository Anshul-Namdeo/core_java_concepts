import java.util.ArrayList;

class T 
{
    public static void main(String args[])
    {
        ArrayList x = new ArrayList();

        x.add(new Student("mohan",12));
        x.add(new Student("sohan",13));
        x.add(new Student("rohan",14));
        x.add(new Student("gohan",15));
        x.add(new Student("tohan",16));

        System.out.println(x);
    }
}

class Student 
{
    String name ;
    int age ;

    Student(String name, int age)
    {
        this.name = name;
        this.age = age ;
    }

    public String toString()
    {
        return name + " - " + age ;
    }
}

// D:\javaprac\37_collections>javac T.java
// Note: T.java uses unchecked or unsafe operations.
// Note: Recompile with -Xlint:unchecked for details.

// D:\javaprac\37_collections>java T
// [mohan - 12, sohan - 13, rohan - 14, gohan - 15, tohan - 16]