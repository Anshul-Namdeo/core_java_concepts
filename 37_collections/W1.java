import java.util.ArrayList;

class W1
{
    public static void main(String args[])
    {
        ArrayList x = new ArrayList();

        x.add(new Student("sohan"));
        x.add(new Student("rohan"));
        x.add(new Student("gohan"));
        x.add(new Student("tohan"));
        x.add(new Student("mohan"));

        System.out.println(x);

        Student a = new Student("rohan");
        // System.out.println(x.contains(a));
         System.out.println(x.remove(a));

        System.out.println(x);
    }
}
class Student 
{
    String name;
   

    Student(String name)
    {
        this.name = name ;
       
    }

    public String toString()
    {
        return name ;
    }

    public boolean equals(Object obj)
    {
        return (this.name).equals(((Student)obj).name);
    }
}


// D:\javaprac\37_collections>javac W1.java
// Note: W1.java uses unchecked or unsafe operations.
// Note: Recompile with -Xlint:unchecked for details.

// D:\javaprac\37_collections>java W1
// [sohan, rohan, gohan, tohan, mohan]
// true
// [sohan, gohan, tohan, mohan]
