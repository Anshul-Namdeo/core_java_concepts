class User implements Cloneable 
{
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


class Student extends User
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

   
}

class N
{
    public static void main(String args[])
    {
        Student s1 = Student.getInstance();
        Student s2 = s1.clone();

        System.out.println(s1);
        System.out.println(s2);
    }
}


// D:\javaprac\57_singleton_class>javac N.java

// D:\javaprac\57_singleton_class>java N
// Student@7a81197d
// Student@5ca881b5