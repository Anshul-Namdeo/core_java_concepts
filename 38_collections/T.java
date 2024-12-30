import java.util.HashSet;

class T 
{
    public static void main(String args[])
    {
        HashSet set = new HashSet();

        set.add(new Student("karthik",12));
        set.add(new Student("ratnesh",18));
        set.add(new Student("raj",9));
        set.add(new Student("vikki",12));
        set.add(new Student("lucky",15));

        Student x = new Student("raj",9);
        System.out.println(set.contains(x));
    }
}

class Student 
{
    String name; 
    int age ;

    Student(String name, int age)
    {
        this.name = name ;
        this.age = age ;
    }

    public String toString()
    {
        return name + " - " + age ;
    }
}


// D:\javaprac\38_collections>javac T.java
// Note: T.java uses unchecked or unsafe operations.
// Note: Recompile with -Xlint:unchecked for details.

// D:\javaprac\38_collections>java T
// false