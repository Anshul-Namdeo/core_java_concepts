class Student implements Cloneable 
{
    private static Student st;

    private String name;
    private int age;

    private Student(String name, int age)
    {
        this.name = name ;
        this.age = age ;
    }

    public static Student getInstance()
    {
        if(st == null)
        {
            st = new Student("yamraj",1000);
        }
        return st;
    }

    public Student clone()
    {
        Student x = null;

        try{
            x = (Student)super.clone();
        }catch(CloneNotSupportedException e)
        {
            e.printStackTrace();
        }

        return x;
    }
}

class M1 
{
    public static void main(String args[])
    {
        Student s1 = Student.getInstance();
        Student s2 = s1.clone();

        System.out.println(s1);
        System.out.println(s2);
    }
}

// D:\javaprac\57_singleton_class>javac M1.java

// D:\javaprac\57_singleton_class>java M1
// Student@36baf30c
// Student@7a81197d
