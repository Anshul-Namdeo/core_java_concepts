import java.lang.reflect.Method;

class A 
{
    public static void main(String args[])
    {
        Class k = Student.class;

        Method[] methods = k.getDeclaredMethods();

        for(Method method : methods)
        {
            System.out.println(method.getReturnType().getName() + " " + method.getName());
        }
    }
}

// D:\javaprac\53_reflection\R>javac A.java

// D:\javaprac\53_reflection\R>java A
// void aaa
// java.lang.String bbb
// java.sql.Date ccc