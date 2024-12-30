class Student 
{
    private static Student st;

    private String name;
    private int age;

    private Student(String name, int age)
    {
        this.name = name ;
        this.age = age ;
    }

    // lazy initialization
    public static Student getInstance()
    {
        if(st==null)
        st = new Student("yamraj",50);

        return st;
    }
}

class I 
{
    public static void main(String args[])
    {
        Student s1 = Student.getInstance();
        Student s2 = Student.getInstance();
        Student s3 = Student.getInstance();

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}


// D:\javaprac\57_singleton_class>javac I.java

// D:\javaprac\57_singleton_class>java I
// Student@36baf30c
// Student@36baf30c
// Student@36baf30c
