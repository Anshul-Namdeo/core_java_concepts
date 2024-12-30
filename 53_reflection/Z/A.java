import java.lang.reflect.Constructor;

class A 
{
    public static void main(String args[])
    {
        Class k = Student.class;

        Constructor[] constructors = k.getConstructors();

        for(Constructor constructor : constructors)
        {
            System.out.println(constructor.getName());
        }
    }
}

// D:\javaprac\53_reflection\Z>javac A.java

// D:\javaprac\53_reflection\Z>java A
// Student
// Student
