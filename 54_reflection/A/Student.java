class Student 
{
    String name;
    int age;

    public Student() 
    {
        System.out.println("Hello ji");
    }

    private Student (String name)
    {
        System.out.println(name);
    }

    protected Student(int age)
    {
        System.out.println(age);
    }
}

// D:\javaprac\54_reflection\A>javac A.java

// D:\javaprac\54_reflection\A> java A
// Student
// Student
// Student