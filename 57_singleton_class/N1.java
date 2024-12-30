class User implements Cloneable 
{
    public Object clone() throws CloneNotSupportedException 
    {
        return super.clone();
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

    public Student clone() throws CloneNotSupportedException 
    {
        // return st;/

        throw new CloneNotSupportedException("singleton Object");
    }

   
}

class N1
{
    public static void main(String args[]) throws CloneNotSupportedException
    {
        Student s1 = Student.getInstance();
        Student s2 = (Student)s1.clone();

        System.out.println(s1);
        System.out.println(s2);
    }
}


// D:\javaprac\57_singleton_class>javac N1.java

// D:\javaprac\57_singleton_class>java N1
// Exception in thread "main" java.lang.CloneNotSupportedException: singleton Object
//         at Student.clone(N1.java:36)
//         at N1.main(N1.java:47)