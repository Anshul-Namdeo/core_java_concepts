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
             constructors[0].setAccessible(true);
            constructors[0].newInstance();
        }catch(InstantiationException|IllegalAccessException|InvocationTargetException e)
        {
            e.printStackTrace();
        }
    }
}

// D:\javaprac\54_reflection\L>javac A.java

// D:\javaprac\54_reflection\L>java A
// hello ji
