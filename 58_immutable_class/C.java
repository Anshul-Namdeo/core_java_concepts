// a mutable class 

class Student 
{
    String name ;
    int age ;

    Student(String name, int age)
    {
        this.name = name ;
        this.age = age ;
    }

    public String toString()
    {
        return name +" - "+ age;
    }
}

class C 
{
    public static void main(String args[])
    {
        Student s = new Student("raj",23);

        System.out.println(s);

        s.name = "golu";
        s.age = 45;

        System.out.println(s);

    }
}

// D:\javaprac\58_immutable_class>javac C.java

// D:\javaprac\58_immutable_class>java C
// raj - 23
// golu - 45
