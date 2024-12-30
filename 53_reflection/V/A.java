import java.lang.reflect.Method;
import java.lang.reflect.Type;

class A 
{
    public static void main(String args[])
    {
        Class k = Student.class;

        Method[] methods = k.getDeclaredMethods();

        System.out.println(methods[0].getName());

        Type[] types = methods[0].getGenericExceptionTypes();

        for(Type type : types)
        {
            System.out.println(type.getTypeName());
        }
    }
}

// D:\javaprac\53_reflection\V>javac A.java

// D:\javaprac\53_reflection\V>java A
// register
// java.lang.NullPointerException
// java.lang.ArrayIndexOutOfBoundsException
// java.lang.ArithmeticException
