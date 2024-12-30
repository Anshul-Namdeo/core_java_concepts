import java.io.*;

class User implements Serializable 
{

}

class Student extends User 
{
    private static Student st ;

    private String name;
    private int age;

    private Student (String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public static Student getInstance()
    {
        if(st == null)
        {
            st = new Student("yamraj",100);
        }

        return st;
    }
}

class J 
{
    public static void main(String args[])
    {
        Student s2 = null;

        Student s1 = Student.getInstance();
        System.out.println(s1);

        try{
            new ObjectOutputStream(new FileOutputStream("monu.txt")).writeObject(s1);
        }catch(Exception e)
        {
            e.printStackTrace();
        }

        try
        {
            s2 = (Student)(new ObjectInputStream(new FileInputStream("monu.txt"))).readObject();
        }catch(Exception e)
        {
            e.printStackTrace();
        }

        System.out.println(s2);
    }
}

// D:\javaprac\57_singleton_class>javac J.java

// D:\javaprac\57_singleton_class>java J
// Student@7a81197d
// Student@6477463f