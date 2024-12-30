import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

class A 
{
    public static void main(String args[]) throws InstantiationException, IllegalAccessException, InvocationTargetException
    {
        Class k = Student.class;

        Constructor[] constructors = k.getDeclaredConstructors();

        Student student = (Student)constructors[0].newInstance();

        System.out.println(student);
    }
}

// D:\javaprac\54_reflection\E>javac A.java

// D:\javaprac\54_reflection\E>java A
// ###~~~hello
// Student@36baf30c