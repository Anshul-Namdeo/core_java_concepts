import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;

class A 
{
    public static void main(String args[]) throws IllegalAccessException, InvocationTargetException
    {
        Student x = new Student();
        x.name = "yamraj";

        Student y = new Student();
        y.name = "chitragupat";
        
        Class k = Student.class;

        Method[] methods = k.getDeclaredMethods();

        methods[0].invoke(x);
    }
}


// D:\javaprac\53_reflection\W>javac A.java

// D:\javaprac\53_reflection\W>java A
// yamraj ***~~~~###