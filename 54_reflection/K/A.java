import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

class A
{
    public static void main(String args[])
    {
        Class k = User.class;

        Constructor[] constructors = k.getDeclaredConstructors();

        try
        {
            constructors[0].newInstance();
        }catch(InstantiationException|IllegalAccessException|InvocationTargetException e)
        {
            e.printStackTrace();
        }
    }
}


// D:\javaprac\54_reflection\K>javac A.java

// D:\javaprac\54_reflection\K>java A
// java.lang.IllegalAccessException: class A cannot access a member of class User with modifiers "private"
//         at java.base/jdk.internal.reflect.Reflection.newIllegalAccessException(Reflection.java:392)
//         at java.base/java.lang.reflect.AccessibleObject.checkAccess(AccessibleObject.java:674)
//         at java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:489)
//         at java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:480)
//         at A.main(A.java:14)