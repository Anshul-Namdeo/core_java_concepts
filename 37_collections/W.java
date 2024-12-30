import java.util.ArrayList;

class W 
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

        Student a = new Student("rohan",14);
        // System.out.println(x.contains(a));
         System.out.println(x.remove(a));

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
        return name +" - " + age;
    }

    public boolean equals(Object obj)
    {
       System.out.println(this.name+"-"+this.age + " -- " +  ((Student)obj).name+"-"+((Student)obj).age); 

       return this.name.equals(((Student)obj).name) && this.age == (((Student)obj).age);
    }
}


// D:\javaprac\37_collections>javac W.java
// Note: W.java uses unchecked or unsafe operations.
// Note: Recompile with -Xlint:unchecked for details.

// D:\javaprac\37_collections>java W
// [mohan - 12, sohan - 13, rohan - 14, gohan - 15, tohan - 16]
// rohan-14 -- mohan-12
// rohan-14 -- sohan-13
// rohan-14 -- rohan-14
// true
// [mohan - 12, sohan - 13, gohan - 15, tohan - 16]