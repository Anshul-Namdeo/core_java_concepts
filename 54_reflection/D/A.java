import java.lang.reflect.Constructor;
import java.lang.reflect.Type;

class A 
{
    public static void main(String args[])
    {
        Class k = Student.class;

        Constructor[] constructors = k.getDeclaredConstructors();

        Type[] types = constructors[0].getGenericExceptionTypes();

        System.out.println(constructors[0].getName() + "()");
        System.out.println("----------------");
        for(Type type : types) 
        {
            System.out.println(type.getTypeName());
        }

    }
}

// D:\javaprac\54_reflection\D>javac A.java

// D:\javaprac\54_reflection\D>java A
// Student()
// ----------------
// java.lang.NumberFormatException
// java.lang.ArithmeticException
// java.lang.ClassCastException
