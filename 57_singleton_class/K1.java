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

class K1 
{
    public static void main(String args[])
    {
        Student s1 =  Student.getInstance();
        System.out.println(s1);

        Class k = Student.class;

        Constructor[] arr = k.getDeclaredConstructors();

        try{
            Student y = (Student)arr[0].newInstance();
            System.out.println(y);
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        
    }
}

// D:\javaprac\57_singleton_class>javac K1.java

// D:\javaprac\57_singleton_class>java K1
// Student@36baf30c
// java.lang.IllegalAccessException: class K1 cannot access a member of class Student with modifiers "private"
//         at java.base/jdk.internal.reflect.Reflection.newIllegalAccessException(Reflection.java:392)
//         at java.base/java.lang.reflect.AccessibleObject.checkAccess(AccessibleObject.java:674)
//         at java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:489)
//         at java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:480)
//         at K1.main(K1.java:38)