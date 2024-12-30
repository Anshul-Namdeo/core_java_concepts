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

class K2 
{
    public static void main(String args[])
    {
        Student s1 =  Student.getInstance();
        System.out.println(s1);

        Class k = Student.class;

        Constructor[] arr = k.getDeclaredConstructors();

        try{
            arr[0].setAccessible(true);
            Student y = (Student)arr[0].newInstance();
            System.out.println(y);
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        
    }
}
// note : newInstance () ke andar args nhi diye hai isliye exception aaya hai....


// D:\javaprac\57_singleton_class>javac K2.java

// D:\javaprac\57_singleton_class>java K2
// Student@36baf30c
// java.lang.IllegalArgumentException: wrong number of arguments
//         at java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)
//         at java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:77)
//         at java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)
//         at java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:499)
//         at java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:480)
//         at K2.main(K2.java:39)
