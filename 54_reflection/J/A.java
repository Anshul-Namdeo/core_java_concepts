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
            methods[0].setAccessible(true);
            methods[0].invoke(user2);
        }catch(IllegalAccessException|InvocationTargetException e)
        {
            e.printStackTrace();
        }
    }
}