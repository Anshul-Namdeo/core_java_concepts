import java.io.*;

class Student implements Serializable 
{
    private static Student st;

    private String name;
    private int age;

    private Student(String name, int age)
    {
        this.name = name ;
        this.age = age ;
    }

    // ye ek speacial method hai....
    // is ko likhne se ek dusra naya object nhi banega...
    protected Object readResolve()
    {
        return st;
    }

    // lazy initialization
    public static Student getInstance()
    {
        if(st==null)
        st = new Student("yamraj",50);

        return st;
    }
}

class I2 
{
    public static void main(String args[])
    {
        Student s2 = null;
        Student s1 = Student.getInstance();
        System.out.println(s1);

        try{
            new ObjectOutputStream(new FileOutputStream("golu.txt")).writeObject(s1);
        }catch(Exception e)
        {
            e.printStackTrace();
        }

        try{
            s2 = (Student)(new ObjectInputStream(new FileInputStream("golu.txt"))).readObject();
        }catch(Exception e)
        {
            e.printStackTrace();
        }

        System.out.println(s2);
    }
}

// D:\javaprac\57_singleton_class>javac I2.java

// D:\javaprac\57_singleton_class>java I2
// Student@36baf30c
// Student@36baf30c