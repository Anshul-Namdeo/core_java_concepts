import java.lang.reflect.Constructor;

class A 
{
    public static void main(String args[])
    {
        Class k = Student.class;

        Constructor[] constructors = k.getDeclaredConstructors();

        for(Constructor constructor:constructors)
        {
            System.out.println(constructor.getName());
        }
    }
}

