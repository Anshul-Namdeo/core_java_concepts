import java.util.HashSet;

class S 
{
    public static void main(String args[])
    {
        HashSet set = new HashSet();

        set.add(new Student("karthik",15));
        set.add(new Student("ratnesh",8));
        set.add(new Student("raj",19));
        set.add(new Student("vikki",22));
        set.add(new Student("lucky",20));


        System.out.println(set);
    }
}

class Student 
{
    String name;
    int age ;

    Student(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public String toString()
    {
        return name + " - " + age ;
    }
}


// D:\javaprac\38_collections>javac S.java
// Note: S.java uses unchecked or unsafe operations.
// Note: Recompile with -Xlint:unchecked for details.

// D:\javaprac\38_collections>java S
// [vikki - 22, lucky - 20, karthik - 15, ratnesh - 8, raj - 19]
