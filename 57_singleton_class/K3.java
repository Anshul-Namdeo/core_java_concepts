import java.lang.reflect.Constructor;

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

    public static Student getInstance()
    {
        if(st == null)
        {
            st = new Student("yamraj",1000);
        }
        return st;
    }
}

class K3 
{
    public static void main(String args[])
    {
        Student s1 =  Student.getInstance();
        System.out.println(s1);

        Class k = Student.class;

        Constructor[] arr = k.getDeclaredConstructors();

        try{
            arr[0].setAccessible(true);
            Student y = (Student)arr[0].newInstance("mohan",22);
            System.out.println(y);
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        
    }
}


// D:\javaprac\57_singleton_class>javac K3.java

// D:\javaprac\57_singleton_class>java K3
// Student@36baf30c
// Student@7a81197d