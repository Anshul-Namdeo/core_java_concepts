import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class A 
{
    public static void main(String args[])
    {
        User user1 = new User("Indumati",46);
        User user2 = new User("chutki", 45);

        Class k = user1.getClass();

        Method[] methods = k.getDeclaredMethods();

        try
        {
            methods[0].invoke(user2);
        }catch(IllegalAccessException|InvocationTargetException e)
        {
            e.printStackTrace();
        }
    }
}

// D:\javaprac\54_reflection\I>javac A.java

// D:\javaprac\54_reflection\I>java A
// java.lang.IllegalAccessException: class A cannot access a member of class User with modifiers "private"
//         at java.base/jdk.internal.reflect.Reflection.newIllegalAccessException(Reflection.java:392)
//         at java.base/java.lang.reflect.AccessibleObject.checkAccess(AccessibleObject.java:674)
//         at java.base/java.lang.reflect.Method.invoke(Method.java:560)
//         at A.main(A.java:17)
