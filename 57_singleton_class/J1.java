import java.io.*;

class User implements Serializable 
{

}

class Student extends User 
{
    private static Student st;

    private String name;
    private int age ;

    private Student(String name, int age)
    {
        this.name = name;
        this.age = age ;
    }

/// secial call back contrcut method...
    protected Object readResolve()
    {
        return st;
    }

    public static Student getInstance()
    {
        if(st==null)
        {
            st = new Student("Yamraj",1000);
        }
        return st;
    }
}

class J1 
{
    public static void main(String args[])
    {
        Student s2 = null;
        Student s1 = Student.getInstance();
        System.out.println(s1);

        try{
            new ObjectOutputStream(new FileOutputStream("anshul.txt")).writeObject(s1);
        }catch(Exception e)
        {
            e.printStackTrace();
        }

        try{
            s2 = (Student) (new ObjectInputStream(new FileInputStream("anshul.txt"))).readObject();
        }catch(Exception e)
        {
            e.printStackTrace();
        }

        System.out.println(s2);
    }
}

// D:\javaprac\57_singleton_class>javac J1.java

// D:\javaprac\57_singleton_class>java J1
// Student@7a81197d
// Student@7a81197d