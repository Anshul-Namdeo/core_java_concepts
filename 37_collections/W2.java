import java.util.ArrayList;

class W2 
{
    public static void main(String args[])
    {
        ArrayList x = new ArrayList();

            x.add(new Student("mohan",10));
            x.add(new Student("sohan",11));
            x.add(new Student("rohan",12));
            x.add(new Student("tohan",13));
            x.add(new Student("gohan",14));

            System.out.println(x);

            Student a = new Student("rohan",12);
            // System.out.println(x.remove(a));
            System.out.println(x.contains(a));

            System.out.println(x);
    }
}

class Student
{
    String name;
    int age;

    Student(String name, int age)
    {
        this.name = name ;
        this.age = age ;
    }

    public String toString()
    {
        return name + " - " + age ;
    }

    public boolean equals(Object obj)
    {
        Student a = this ;
        Student b = (Student)obj;

        String nm1 = a.name ;
        String nm2 = b.name;

        int ag1 = a.age;
        int ag2 = b.age;

        // System.out.println(nm1+"-"+ag1 + " -- " + nm2+"-"+ag2); 

        return nm1.equals(nm2) && ag1 == ag2;
    }
}


// D:\javaprac\37_collections>javac W2.java
// Note: W2.java uses unchecked or unsafe operations.
// Note: Recompile with -Xlint:unchecked for details.

// D:\javaprac\37_collections>java W2
// [mohan - 10, sohan - 11, rohan - 12, tohan - 13, gohan - 14]
// true
// [mohan - 10, sohan - 11, tohan - 13, gohan - 14]
