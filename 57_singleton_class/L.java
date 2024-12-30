import java.lang.reflect.Constructor;

enum Student 
{
    ST("yamji",1000);

    private String name;
    private int age;

    private Student(String name, int age)
    {
        this.name = name ;
        this.age = age ;
    }

    // public static Student getInstance()
    // {
    //     if(st == null)
    //     {
    //         st = new Student("yamraj",1000);
    //     }
    //     return st;
    // }
}

class L 
{
    public static void main(String args[])
    {
        // Student s1 =  Student.getInstance();
        Student s1 = Student.ST;
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

// D:\javaprac\57_singleton_class>javac L.java

// D:\javaprac\57_singleton_class>java L
// ST
// java.lang.IllegalArgumentException: Cannot reflectively create enum objects
//         at java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:492)
//         at java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:480)
//         at L.main(L.java:40)