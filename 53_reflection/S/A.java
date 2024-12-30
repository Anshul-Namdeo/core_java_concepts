import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

class A 
{
    public static void main(String args[])
    {
        Class k = Student.class;

        Method[] methods = k.getDeclaredMethods();

        for(Method method : methods)
        {
            System.out.println(Modifier.toString(method.getModifiers()) + " " + method.getReturnType().getName() + " " + method.getName());
        }
    }
}

// D:\javaprac\53_reflection\S>javac A.java

// D:\javaprac\53_reflection\S>java A
// static java.sql.Date ccc
// protected static final void eee
// abstract void aaa
// private java.lang.String bbb
// final void ddd